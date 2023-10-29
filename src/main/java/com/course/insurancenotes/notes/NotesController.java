package com.course.insurancenotes.notes;

import com.course.insurancenotes.notes.data.NoteEntity;
import com.course.insurancenotes.notes.data.NoteRepository;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/")
public class NotesController {

    private static final Logger logger = Logger.getLogger(NotesController.class.getName());
    private  final NoteRepository repository;

    public NotesController(NoteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("notes")
    public ModelAndView getNote(@RequestParam("userId") Long userId){
        final List<Note> notes = repository.findByUserId(userId).stream()
                .map(it->new Note(it.getUserId(),it.getNote()))
                .toList();
        ModelAndView modelAndView = new ModelAndView("notes/index.html");
        modelAndView.addObject("userId",userId);
        modelAndView.addObject("notes",notes);
        modelAndView.addObject("newNote", new Note());
        return modelAndView;
    }

    @PostMapping("notes")
    @Transactional
    public ModelAndView postNote(@ModelAttribute("newNote") Note newNotenote){
        logger.info("Note received: " + newNotenote );
        final var noteToSave = new NoteEntity();
        noteToSave.setUserId(newNotenote.getUserId());
        noteToSave.setNote(newNotenote.getNote());
        repository.save(noteToSave);
        return new ModelAndView("notes/done.html","note", newNotenote);
    }

    private static Note getNotes(Long userId) {
        return new Note(userId, "A random note");
    }
}
