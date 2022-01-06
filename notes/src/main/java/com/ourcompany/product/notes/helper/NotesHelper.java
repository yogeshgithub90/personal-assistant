package com.ourcompany.product.notes.helper;

import com.ourcompany.product.notes.domain.Note;
import com.ourcompany.product.notes.dto.NotesServiceRequest;
import com.ourcompany.product.notes.dto.NotesServiceResponse;
import org.springframework.http.HttpStatus;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface NotesHelper {
    static Note createNoteFromRequest(@NotNull NotesServiceRequest request){
        return Note.builder().note(request.getNote()).userId(request.getUserId()).keyword(request.getNoteKeyWords()).title(request.getNoteTitle()).build();
    }

    static NotesServiceResponse createNoteResponseFromNote(@NotNull Note note){
        return NotesServiceResponse.builder().statusCode(HttpStatus.ACCEPTED).resultDescription("Success").notes(List.of(note)).build();
    }

    static NotesServiceResponse createNoteResponseFromNotes(@NotNull List<Note> notes){
        return NotesServiceResponse.builder().statusCode(HttpStatus.ACCEPTED).resultDescription("Success").notes(notes).build();
    }
}
