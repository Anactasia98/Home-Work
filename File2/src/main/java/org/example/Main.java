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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static List<Person> generationPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Hasty","Danilova",27,"www999@gmail.com"));
        return people;
    }

    public static void main(String[] args) {

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите команду : ");
            String command = scanner.nextLine();

            if (command.equals("Exit")) {
                System.out.println("Выход из программы");
                break;

            } // добавление
            else if (command.startsWith("Add")) {


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