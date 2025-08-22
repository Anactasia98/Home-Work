package org.example;
//Реализовать Объект Person с полями (name , surname, age,email)
//Реализовать CRUD operations
//C - create
//R - read
//U - update
//D - delete
//
//
//Чтоб все изменение фиксировались в файле
//
//
//
//
//1 - Add
//2 - Remove
//3 - Update
//4 - Print All
//5 - Exit

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Person readPerson(Scanner scanner) {   // <— без подчёркивания
    System.out.print("Имя: ");
    String name = scanner.nextLine().trim();

    System.out.print("surname: ");
    String surname = scanner.nextLine().trim();

    System.out.print("Возраст (целое число): ");
    int age = Integer.parseInt(scanner.nextLine().trim());

    System.out.print("Email: ");
    String email = scanner.nextLine().trim();

    return new Person(name, surname, age, email);
}
    public static List<Person> generationPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Hasty", "Danilova", 27, "www999@gmail.com"));
        return people;
    }

    public static void main(String[] args) throws IOException {

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите команду : ");
            String command = scanner.nextLine();

            if (command.equals("Exit")) {
                System.out.println("Выход из программы");
                break;

            } else if (command.startsWith("create-file")) {
                System.out.println("Введите путь файла");
                String pathFile = scanner.nextLine();
                File file = new File(pathFile);
                if (file.createNewFile()) {
                    System.out.println("File bil sozdan");
                } else {
                    System.out.println("File ne bil sozdan");
                }

            } // добавление
            else if (command.startsWith("Add")) {

                        Person p = readPerson(scanner);
                        System.out.println("Создан: " + p);
//
            } //Удаление
            else if (command.startsWith("Remove")) {


            } //Обновление
            else if (command.startsWith("Update")) {


            } //Распечатать все
            else if (command.startsWith("Print All")) {


            } else {
                System.out.println("not found command");
            }
            System.out.println(command);
        } while (true);
    }
}