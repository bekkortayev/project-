package com.example.alahub_back.controller;

import com.example.alahub_back.entity.SellerCategory;
import com.example.alahub_back.service.SellerCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sellerCategories")
@RequiredArgsConstructor
public class SellerCategoryController {

    private final SellerCategoryService sellerCategoryService;

    @GetMapping
    public List<SellerCategory> getAllSellerCategories() {
        return sellerCategoryService.getAllSellerCategories();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SellerCategory> getSellerCategoryById(@PathVariable Long id) {
        return sellerCategoryService.getSellerCategoryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public SellerCategory createSellerCategory(@RequestBody SellerCategory sellerCategory) {
        return sellerCategoryService.createSellerCategory(sellerCategory);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSellerCategory(@PathVariable Long id) {
        sellerCategoryService.deleteSellerCategory(id);
        return ResponseEntity.noContent().build();
    }
}