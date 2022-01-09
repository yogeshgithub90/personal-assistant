package com.ourcompany.product.notes.dao.repository;

import com.ourcompany.product.notes.domain.Note;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesRepository extends MongoRepository<Note, String> {
    List<Note> getAllByUserId(String userId);
    List<Note> getAllByKeyword(String keyword);
}
