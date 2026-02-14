package com.rhit.learning_1.controller;

import com.rhit.learning_1.model.Note;
import com.rhit.learning_1.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/notes")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @PostMapping
    public Note createNote(@RequestBody Note note){
        return noteService.saveNote(note);
    }

    @GetMapping
    public List<Note> getAllNote(){
        return noteService.getAllNotes();
    }

    @PutMapping("/{id}")
    public Note updateNote(@PathVariable Long id,
                           @RequestBody Note note){
        return noteService.updateNote(id, note);
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id){
        return noteService.getNoteById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable Long id) {
        noteService.deleteNote(id);
    }


}
