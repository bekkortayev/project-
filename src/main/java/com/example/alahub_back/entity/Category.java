package com.example.alahub_back.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(schema = "public", name = "category")
public class Category {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "parent_id")
    private String parentId;
}
