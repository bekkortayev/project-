package com.example.alahub_back.repository;

import com.example.alahub_back.entity.SellerCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerCategoryRepository extends JpaRepository<SellerCategory, Long> {
}
