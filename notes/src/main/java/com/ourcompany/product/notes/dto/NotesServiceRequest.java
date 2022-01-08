package com.ourcompany.product.notes.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.ourcompany.product.notes.domain.Note;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Valid
@Builder
public class NotesServiceRequest {
    private List<Note> notes = new ArrayList<>();
}
