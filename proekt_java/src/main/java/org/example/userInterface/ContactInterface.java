package org.example.userInterface;

import org.example.model.Contact;
import org.example.services.AuthorizationService;
import org.example.services.ContactService;
import org.example.services.Logger;
import org.example.utils.ConsoleMessage;
import org.example.utils.LogMessage;

import java.util.List;
import java.util.Scanner;

public class ContactInterface {
    private final Scanner scanner;
    private final ContactService contactService;

    public ContactInterface(Scanner scanner) {
        this.scanner = scanner;
        this.contactService = new ContactService();
    }

    public void start() {
        while (true) {
            System.out.printf(ConsoleMessage.COMMAND_INTERFACE_MESSAGE);
            String userCommand = scanner.nextLine();
            switch (userCommand) {
                case "1":
                    addNew();
                    break;
                case "2":
                    remove();
                    break;
                case "3":
                    update();
                    break;
                case "4":
                    viewAll();
                    break;
                case "5":
                    return;
                default:
                    break;
            }
        }
    }

    private void viewAll() {
        List<Contact> all = contactService.getAll();
        for (Contact contact : all) {
            System.out.println(contact.getFormattedString());
        }
    }

    private void update() {
        System.out.println(ConsoleMessage.COMMAND_INTERFACE_UPDATE_ID_MESSAGE);
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print(ConsoleMessage.SIGN_UP_NAME_MESSAGE);
        String name = scanner.nextLine();
        System.out.print(ConsoleMessage.SIGN_UP_SECOND_NAME_MESSAGE);
        String secondName = scanner.nextLine();
        System.out.print(ConsoleMessage.SIGN_IN_AGE_MESSAGE);
        int age = scanner.nextInt();
        System.out.print(ConsoleMessage.SIGN_IN_PHONE_NUMBER_MESSAGE);
        int phoneNumber = scanner.nextInt();
        contactService.update(id, name, secondName, age, phoneNumber);
    }

    private void remove() {
        System.out.println(ConsoleMessage.COMMAND_INTERFACE_REMOVE_MESSAGE);
        int id = scanner.nextInt();
        System.out.println(ConsoleMessage.COMMAND_INTERFACE_REMOVE_CONFIRMATION_MESSAGE);
        int confirmation = scanner.nextInt();

        if (confirmation == 1) {
            contactService.remove(id);
        }
    }

    private void addNew() {
        System.out.print(ConsoleMessage.SIGN_UP_NAME_MESSAGE);
        String name = scanner.nextLine();
        System.out.print(ConsoleMessage.SIGN_UP_SECOND_NAME_MESSAGE);
        String secondName = scanner.nextLine();
        System.out.print(ConsoleMessage.SIGN_IN_AGE_MESSAGE);
        int age = scanner.nextInt();
        System.out.print(ConsoleMessage.SIGN_IN_PHONE_NUMBER_MESSAGE);
        int phoneNumber = scanner.nextInt();

        contactService.addNew(name, secondName, age, phoneNumber);
    }
}
