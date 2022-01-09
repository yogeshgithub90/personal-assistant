package com.ourcompany.product.notes.dao;

import com.ourcompany.product.notes.domain.Note;

import java.util.List;

public interface NotesDao {
    Note save(Note note);
    List<Note> saveAll(List<Note> note);
    List<Note> getNotesByUserId(String userId);
    List<Note> getNotesByKeyword(String keyword);
}
