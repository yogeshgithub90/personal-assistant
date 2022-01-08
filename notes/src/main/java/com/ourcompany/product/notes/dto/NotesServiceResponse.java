package com.ourcompany.product.notes.dto;

import com.ourcompany.product.notes.domain.Note;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Valid
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotesServiceResponse {
	@NotNull
	private long transactionId;
	@NotNull
	private HttpStatus statusCode;
	private String resultDescription;
	private List<Note> notes;
}
