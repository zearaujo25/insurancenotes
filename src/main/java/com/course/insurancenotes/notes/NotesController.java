package com.course.insurancenotes.notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NotesController {

    @GetMapping("notes")
    public Note note(@RequestParam("userId") Integer userId){
        return new Note(userId,"A random note");
    }
}
