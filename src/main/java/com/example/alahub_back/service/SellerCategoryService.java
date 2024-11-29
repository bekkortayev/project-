package com.example.alahub_back.service;

import com.example.alahub_back.entity.SellerCategory;
import com.example.alahub_back.repository.SellerCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SellerCategoryService {
    private final SellerCategoryRepository sellerCategoryRepository;

    public SellerCategoryService(SellerCategoryRepository sellerCategoryRepository) {
        this.sellerCategoryRepository = sellerCategoryRepository;
    }

    public List<SellerCategory> getAllSellerCategories() {
        return sellerCategoryRepository.findAll();
    }

    public Optional<SellerCategory> getSellerCategoryById(Long id) {
        return sellerCategoryRepository.findById(id);
    }

    public SellerCategory createSellerCategory(SellerCategory sellerCategory) {
        return sellerCategoryRepository.save(sellerCategory);
    }

    public void deleteSellerCategory(Long id) {
        sellerCategoryRepository.deleteById(id);
    }
}