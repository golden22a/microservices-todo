package com.example.todosapi.repositories;

import com.example.todosapi.models.Todos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TodoRepository extends CrudRepository<Todos, Long> {
@Query("SELECT t FROM Todos t WHERE LOWER(t.title) LIKE LOWER(CONCAT('%',:title,'%'))")
Iterable<Todos> findSongsBytitle(@Param("title") String title);

}