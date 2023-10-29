package com.course.insurancenotes.notes.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<NoteEntity,Long> {
    List<NoteEntity> findByUserId(Long userId);
}
