package org.example.repositories;

import org.example.model.Contact;
import org.example.model.User;
import org.example.services.AuthorizationService;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ContactRepository {
    public ContactRepository() {
        var dir = Path.of("main/resources/contacts");
        if (!Files.isDirectory(dir)) {
            try {
                Files.createDirectories(dir);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void create(Contact contact) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(AuthorizationService.getFilePathForCurrentUser(), true))) {
            writer.write(contact.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Contact> getAll() {
        List<Contact> contacts = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(AuthorizationService.getFilePathForCurrentUser()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contacts.add(Contact.fromString(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contacts;
    }

    public void updateContact(Contact updatedContact) {
        List<Contact> contacts = getAll();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(AuthorizationService.getFilePathForCurrentUser()))) {
            for (Contact contact : contacts) {
                if (contact.getId() == updatedContact.getId()) {
                    writer.write(updatedContact.toString());
                } else {
                    writer.write(contact.toString());
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteContactById(int id) {
        List<Contact> contacts = getAll();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(AuthorizationService.getFilePathForCurrentUser()))) {
            for (Contact contact : contacts) {
                if (contact.getId() != id) {
                    writer.write(contact.toString());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
