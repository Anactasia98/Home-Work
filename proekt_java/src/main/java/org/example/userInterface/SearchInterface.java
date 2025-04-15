package org.example.userInterface;

import org.example.model.Contact;
import org.example.services.ContactService;
import org.example.utils.ConsoleMessage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SearchInterface {
    private final Scanner scanner;
    private final ContactService contactService;

    public SearchInterface(Scanner scanner) {
        this.scanner = scanner;
        this.contactService = new ContactService();
    }

    public void start() {
        while (true) {
            System.out.println(ConsoleMessage.SEARCH_INTERFACE_MESSAGE);
            String userCommand = scanner.nextLine();
            switch (userCommand) {
                case "1":
                    searchContacts();
                    break;
                case "5":
                    return;
                default:
                    break;
            }
        }
    }

    public void searchContacts() {
        System.out.println(ConsoleMessage.SEARCH_STRING_MESSAGE);
        String query = scanner.nextLine();
        String regex = convertQueryToRegex(query);
        System.out.println(ConsoleMessage.SORTING_STRING_MESSAGE);
        String sortingQuery = scanner.nextLine();

        List<Contact> result = new ArrayList<>();
        for (Contact contact : contactService.getAll()) {
            if (contact.getName().matches(regex)
                    || contact.getSecondName().matches(regex)
                    || String.valueOf(contact.getPhoneNumber()).matches(regex)) {
                result.add(contact);
            }
        }
        switch (sortingQuery) {
            case "1":
                result = sortContacts(sortByNameASC(), result);
                break;
            case "2":
                result = sortContacts(sortByNameDESC(), result);
                break;
            case "3":
                result = sortContacts(sortBySecondNameASC(), result);
                break;
            case "4":
                result = sortContacts(sortByPhoneASC(), result);
                break;
            default:
                break;
        }

        for (Contact contact : result) {
            System.out.println(contact);
        }
    }

    private String convertQueryToRegex(String query) {
        String regex = query
                .replace("_", ".")
                .replace("%", ".*")
                .toLowerCase();
        return "^.*" + regex + ".*$";
    }

    public List<Contact> sortContacts(Comparator<Contact> comparator,
                                      List<Contact> contacts) {
        List<Contact> list = new ArrayList<>(contacts);
        list.sort(comparator);
        return list;
    }

    public static Comparator<Contact> sortByNameASC() {
        return Comparator.comparing(Contact::getName);
    }

    public static Comparator<Contact> sortByNameDESC() {
        return Comparator.comparing(Contact::getName).reversed();
    }

    public static Comparator<Contact> sortBySecondNameASC() {
        return Comparator.comparing(Contact::getSecondName);
    }

    public static Comparator<Contact> sortByPhoneASC() {
        return Comparator.comparing(Contact::getPhoneNumber);
    }
}
