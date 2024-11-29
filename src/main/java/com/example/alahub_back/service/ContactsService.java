package com.example.alahub_back.service;

import com.example.alahub_back.entity.Contacts;
import com.example.alahub_back.repository.ContactsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactsService {
    private final ContactsRepository contactsRepository;

    public ContactsService(ContactsRepository contactsRepository) {
        this.contactsRepository = contactsRepository;
    }

    public List<Contacts> getAllContacts() {
        return contactsRepository.findAll();
    }

    public Optional<Contacts> getContactsById(Long id) {
        return contactsRepository.findById(id);
    }

    public Contacts createContacts(Contacts contacts) {
        return contactsRepository.save(contacts);
    }

    public void deleteContacts(Long id) {
        contactsRepository.deleteById(id);
    }

    public Contacts updateContacts(Contacts contacts) {
        return contactsRepository.update(contacts);}
}