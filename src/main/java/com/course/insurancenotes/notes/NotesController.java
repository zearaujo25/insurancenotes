package com.course.insurancenotes.notes;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

@RestController
@RequestMapping("/")
public class NotesController {

    private static final Logger logger = Logger.getLogger(NotesController.class.getName());

    @GetMapping("notes")
    public ModelAndView getNote(@RequestParam("userId") Integer userId){
        Note note = new Note();
        note.setUserId(userId);
        return new ModelAndView("notes/index.html","note", note);
    }

    @PostMapping("notes")
    public ModelAndView postNote(@ModelAttribute Note note){
        logger.info("Note received: " + note );
        return new ModelAndView("notes/done.html","note", note);
    }



    private static Note getNotes(Integer userId) {
        return new Note(userId, "A random note");
    }
}
