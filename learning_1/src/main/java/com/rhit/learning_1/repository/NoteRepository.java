package com.rhit.learning_1.repository;

import com.rhit.learning_1.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {

}
