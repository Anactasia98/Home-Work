package org.example.services;

import org.example.model.Contact;
import org.example.repositories.ContactRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContactService {
    private final ContactRepository contactRepository;

    public ContactService() {
        this.contactRepository = new ContactRepository();
    }

    public List<Contact> find(String name,
                              String secondName,
                              int phoneNumber) {
        if ((name == null || name.isEmpty())
                && (secondName == null || secondName.isEmpty())
                && (phoneNumber == 0)) {
            return Collections.emptyList();
        }
        List<Contact> all = contactRepository.getAll();//получили список контактов из базы данных

        List<Contact> result = new ArrayList<>();
        for (Contact contact : all) {
            boolean match = false;
            if (name != null && !name.isEmpty()) {
                match = contact.getName().equals(name);
            }
            if (secondName != null && !secondName.isEmpty()) {
                match = contact.getSecondName().equals(secondName);
            }
            if (phoneNumber != 0) {
                match = contact.getPhoneNumber() == phoneNumber;
            }
            if (match) {
                result.add(contact);
            }
        }
        return result;
    }


}
