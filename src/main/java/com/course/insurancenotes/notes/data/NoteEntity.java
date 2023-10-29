package com.course.insurancenotes.notes.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "NOTE")
public class NoteEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String note;

    private Long userId;

    public NoteEntity(Long id, String note, Long userId) {
        this.id = id;
        this.note = note;
        this.userId = userId;
    }

    public NoteEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
