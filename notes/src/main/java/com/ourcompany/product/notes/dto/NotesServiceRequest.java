package com.ourcompany.product.notes.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Valid
@Builder
public class NotesServiceRequest {
    private String noteTitle;
    @NotNull
    private String note;
    private String noteKeyWords;
    @NotNull
    private Long userId;
}
