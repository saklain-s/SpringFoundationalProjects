package com.example.practice.controller;


import com.example.practice.model.Note;
import com.example.practice.service.NoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
@CrossOrigin(origins = "http://localhost:3000") // React frontend
public class NoteController {

    private final NoteService service;

    public NoteController(NoteService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Note> create(@RequestBody Note note) {
        Note savedNoted = service.save(note);
        return ResponseEntity.status(201).body(savedNoted);
    }

    @GetMapping
    public ResponseEntity<List<Note>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Note> update(@PathVariable Long id,@RequestBody Note note){
        Note updatedNote = service.update(id,note);
        return ResponseEntity.ok(updatedNote);
    }
}
