package com.ourcompany.product.notes.dao.repository;

import com.ourcompany.product.notes.domain.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesRepository extends CrudRepository<Note, Long> {
    List<Note> getAllByUserId(long userId);
    
    List<Note> getAllByKeyword(String keyword);
}
