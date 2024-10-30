package com.example.UDG.Models;

import jakarta.persistence.*;
@Entity
@Table(name = "students")

public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)

    private long id;
    private String name;
    private String degree;
    private String email;
    private Double Score;
    private String code;
    public StudentModel() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Double getScore() {
        return Score;
    }
    public void setScore(Double score) {
        Score = score;
    }
    public String getCode() {
        return code;

    }
    public void setCode(String code) {
        this.code = code;
    }
    public StudentModel(String name, String degree,String email, Double score, String code) {
        this.name = name;
        this.degree = degree;
        this.email = email;
        this.Score = score;
        this.code = code;
    }
}
