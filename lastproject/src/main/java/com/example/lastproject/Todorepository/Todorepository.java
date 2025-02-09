package com.example.lastproject.Todorepository;



import com.example.lastproject.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Todorepository extends JpaRepository<Todo, Long> {
}
