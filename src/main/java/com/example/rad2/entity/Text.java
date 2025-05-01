package com.example.rad2.entity;
import jakarta.persistence.*;


@Entity
@Table(name = "texts")
public class Text {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "text", columnDefinition = "TEXT")
    private String text;

    // Пустой конструктор по умолчанию
    public Text() {}

    // Конструктор с параметрами
    public Text(String text) {
        this.text = text;
    }

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

