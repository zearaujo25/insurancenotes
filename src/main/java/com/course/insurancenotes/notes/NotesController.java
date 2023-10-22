package com.course.insurancenotes.notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class NotesController {

    @GetMapping("notes")
    public ModelAndView note(@RequestParam("userId") Integer userId){
        return new ModelAndView("notes/notes.html","notes", getNotes(userId));
    }

    private static Note getNotes(Integer userId) {
        return new Note(userId, "A random note");
    }
}
