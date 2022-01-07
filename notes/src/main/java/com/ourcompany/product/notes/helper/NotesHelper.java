package com.ourcompany.product.notes.helper;

import com.ourcompany.product.notes.domain.Note;
import com.ourcompany.product.notes.dto.NotesServiceRequest;
import com.ourcompany.product.notes.dto.NotesServiceResponse;
import org.springframework.http.HttpStatus;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;

public interface NotesHelper {
    static List<Note> createNotesFromRequest(@NotNull NotesServiceRequest request){
        return request.getNotes().stream().map(note -> Note.builder().userId(note.getUserId()).title(note.getTitle()).note(note.getNote()).keyword(note.getKeyword()).build()).collect(Collectors.toList());
    }

    static NotesServiceResponse createNoteResponseFromNote(@NotNull Note note){
        return NotesServiceResponse.builder().statusCode(HttpStatus.ACCEPTED).resultDescription("Success").notes(List.of(note)).build();
    }

    static NotesServiceResponse createNoteResponseFromNotes(@NotNull List<Note> notes){
        return NotesServiceResponse.builder().statusCode(HttpStatus.ACCEPTED).resultDescription("Success").notes(notes).build();
    }
}
