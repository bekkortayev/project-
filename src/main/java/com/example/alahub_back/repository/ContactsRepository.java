package com.example.alahub_back.repository;

import com.example.alahub_back.entity.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsRepository extends JpaRepository<Contacts, Long> {
    Contacts update(Contacts contacts);
}

