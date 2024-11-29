package com.example.alahub_back.controller;

import com.example.alahub_back.entity.Contacts;
import com.example.alahub_back.service.ContactsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
@RequiredArgsConstructor
public class ContactsController {

    private final ContactsService contactsService;

    @GetMapping
    public List<Contacts> getAllContacts() {
        return contactsService.getAllContacts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contacts> getContactsById(@PathVariable Long id) {
        return contactsService.getContactsById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Contacts createContacts(@RequestBody Contacts contacts) {
        return contactsService.createContacts(contacts);
    }
    @PutMapping
    public Contacts updateContacts(@RequestBody Contacts contacts) {
        return contactsService.updateContacts(contacts);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContacts(@PathVariable Long id) {
        contactsService.deleteContacts(id);
        return ResponseEntity.noContent().build();
    }
}
