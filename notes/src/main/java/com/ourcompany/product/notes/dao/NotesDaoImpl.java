package com.ourcompany.product.notes.dao;

import com.ourcompany.product.notes.dao.repository.NotesRepository;
import com.ourcompany.product.notes.domain.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesDaoImpl implements NotesDao{
    @Autowired
    private NotesRepository notesRepository;

    @Override
    public Note save(Note note) {
        return notesRepository.save(note);
    }

    @Override
    public List<Note> saveAll(List<Note> notes) {
        return (List<Note>) notesRepository.saveAll(notes);
    }

    @Override
    public List<Note> getNotesByUserId(String userId) {
        return notesRepository.getAllByUserId(userId);
    }

    @Override
    public List<Note> getNotesByKeyword(String keyword) {
        return notesRepository.getAllByKeyword(keyword);
    }
}
