package org.example.services;

import org.example.model.Contact;
import org.example.model.IdGenerator;
import org.example.model.User;
import org.example.repositories.ContactRepository;
import org.example.repositories.IdGeneratorRepository;
import org.example.utils.LogMessage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContactService {
    private final IdGeneratorRepository idGeneratorRepository;
    private final ContactRepository contactRepository;
    private final Logger logger;

    public ContactService() {
        this.logger = new Logger();
        this.idGeneratorRepository = new IdGeneratorRepository();
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

    public void addNew(String name,
                       String secondName,
                       int age,
                       int phone) {
        Contact contact = new Contact(
                idGeneratorRepository.getNextContactId(),
                name,
                secondName,
                phone,
                age
        );
        contactRepository.create(contact);

        logger.create(String.format(LogMessage.CREATE_CONTACT_MESSAGE, contact.getId(), AuthorizationService.currentUser.getId()));
    }


    public List<Contact> getAll() {
        return contactRepository.getAll();
    }

    public void remove(int id) {
        contactRepository.deleteContactById(id);
    }

    public void update(int id,
                       String name,
                       String secondName,
                       int age,
                       int phone) {
        Contact contact = new Contact(
                id,
                name,
                secondName,
                phone,
                age
        );
        contactRepository.updateContact(contact);
    }
}
