package com.ourcompany.product.notes.service;

import com.ourcompany.product.notes.domain.Note;
import com.ourcompany.product.notes.dto.NotesServiceRequest;

import java.util.List;

public interface NotesService {
    Note saveNote(NotesServiceRequest request);
    List<Note> saveAllNotes(NotesServiceRequest request);

    List<Note> fetchNotesForUserId(Long userId);
    List<Note> fetchNotesForKeyword(String keyword);
}
