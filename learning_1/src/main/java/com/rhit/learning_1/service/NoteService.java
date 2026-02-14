package com.rhit.learning_1.service;


import com.rhit.learning_1.model.Note;
import com.rhit.learning_1.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Note saveNote(Note note){
        return noteRepository.save(note);

    }
    public Note updateNote(Long id, Note updatedNote) {

        Note existingNote = noteRepository.findById(id).orElse(null);

        if (existingNote != null) {
            existingNote.setTitle(updatedNote.getTitle());
            existingNote.setContent(updatedNote.getContent());

            return noteRepository.save(existingNote);
        }

        return null;
    }

    public List<Note> getAllNotes(){
        return noteRepository.findAll();
    }

    public Note getNoteById(Long id){
        return noteRepository.findById(id).orElse(null);

    }

    public void deleteNotebyId(Long id){
        noteRepository.deleteById(id);
    }

    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }



}
