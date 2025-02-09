package com.example.lastproject.model;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "todos")

@NoArgsConstructor
@AllArgsConstructor

@Data
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(nullable = false)
    private String title;

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    @Column(nullable = false)
    private String description;



}
