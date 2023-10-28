package com.course.insurancenotes.notes;


public class Note{

    private Integer userId;
    private String note;

    public Note(Integer userId, String note) {
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
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
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

