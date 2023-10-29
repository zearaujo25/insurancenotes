package com.course.insurancenotes.notes;


public class Note{

    private Long userId;
    private String note;

    public Note(Long userId, String note) {
        this.userId = userId;
        this.note = note;
    }

    public Note() {

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

    @Override
    public String toString() {
        return "Note{" +
                "userId=" + userId +
                ", note='" + note + '\'' +
                '}';
    }
}

