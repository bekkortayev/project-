package com.example.alahub_back.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(schema = "public", name = "seller_category")
public class SellerCategory {
    @Id
    @Column(name = "id")
    private Long id;

    @OneToOne
    private Category category;

    @OneToOne
    private Contacts contacts;
}
