package com.ourcompany.product.notes.dto;

import com.ourcompany.product.notes.domain.Note;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Valid
@Builder
public class NotesServiceRequest {
    private List<Note> notes = new ArrayList<>();
}
