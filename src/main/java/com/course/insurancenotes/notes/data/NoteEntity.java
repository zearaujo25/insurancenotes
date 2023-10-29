package com.course.insurancenotes.notes.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class NoteEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public NoteEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public NoteEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
