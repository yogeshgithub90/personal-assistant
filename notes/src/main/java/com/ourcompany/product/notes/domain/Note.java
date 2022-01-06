package com.ourcompany.product.notes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Note {
    @Id
    @SequenceGenerator(name = "note_seq", sequenceName = "note_seq", initialValue = 100)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "note_seq")
    private long id;
    private long userId;
    private String note;
    private String title;
    private String keyword;
}
