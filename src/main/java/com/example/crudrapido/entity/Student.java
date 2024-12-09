package com.example.crudrapido.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Data
@Entity
@Table(name = "tbl_student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long studentId;

    private String firtsName;

    private String lastName;

    @Column(name = "email_address", unique = true, nullable = false)
    private String email;
}
