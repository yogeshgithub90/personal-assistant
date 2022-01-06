package com.ourcompany.product.notes.service;

import com.ourcompany.product.notes.dao.NotesDao;
import com.ourcompany.product.notes.domain.Note;
import com.ourcompany.product.notes.dto.NotesServiceRequest;
import com.ourcompany.product.notes.helper.NotesHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesServiceImpl implements NotesService{
    @Autowired
    private NotesDao notesDao;


    @Override
    public Note saveNote(NotesServiceRequest request) {
        return notesDao.save(NotesHelper.createNoteFromRequest(request));
    }

    @Override
    public List<Note> saveAllNotes(NotesServiceRequest request) {
        return null;
    }

    @Override
    public List<Note> fetchNotesForUserId(Long userId) {
        return notesDao.getNotesByUserId(userId);
    }

    @Override
    public List<Note> fetchNotesForKeyword(String keyword) {
        return notesDao.getNotesByKeyword(keyword);
    }
}
