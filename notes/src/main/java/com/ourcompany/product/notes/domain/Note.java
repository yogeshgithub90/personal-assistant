package com.ourcompany.product.notes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Note {
    @Id
    private String id;
    private String userId;
    private String note;
    private String title;
    private String keyword;
}
