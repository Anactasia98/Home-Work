package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Задание: Разработка файлового менеджера на Java
//Цель:
//Разработать консольное приложение – файловый менеджер, который позволяет выполнять основные операции с файлами и папками:
//✅ Создание (файлов и папок)
//✅ Удаление (файлов и папок, включая рекурсивное удаление)
//✅ Переименование
//✅ Перемещение
//✅ Вывод информации (размер файла, содержимое папки, сортировка)
//
//Функциональные требования:
//Файловый менеджер должен поддерживать следующие команды:
//
//create-folder <путь> – создать папку
//create-file <путь> – создать пустой файл
//delete <путь> – удалить файл или папку
//delete r <путь> – удалить файл или папку (содержимое папки удаляется рекурсивно)
//rename <старое_имя> <новое_имя> – переименовать файл или папку
//move <откуда> <куда> – переместить файл или папку
//list <путь> – вывести содержимое папки (файлы и папки)
//size <путь> – вывести размер файла или папки (считая размер всех вложенных файлов)
//sort <путь> [name|size] – вывести содержимое папки с сортировкой по имени или размеру
//exit – выход из программы
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        String path;

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter command : ");
            String command = scanner.nextLine();

            if (command.equals("exit")) {
                System.out.println("Выход из программы");
                break;
                //create-folder <путь> – создать папку
            } else if (command.startsWith("create-folder")) {
                path = command.split(" ")[1];
                File file = new File(path);
                if (file.mkdir()) {
                    System.out.println("Papka bila uspesna sozdana  " + file.getName());
                } else {
                    System.out.println("Sozdat papku ne vozmojno");
                }
                //create-file <путь> – создать пустой файл
            } else if (command.startsWith("create-file")) {
                System.out.println("Введите путь файла");
                String pathFile = scanner.nextLine();
                File file = new File(pathFile);
                if (file.createNewFile()) {
                    System.out.println("File bil sozdan");
                } else {
                    System.out.println("File ne bil sozdan");
                }
                //delete <путь> – удалить файл или папку
            } else if (command.startsWith("delete")) {
                System.out.println("Что вы хотите удалить File или Folder");
                command = scanner.nextLine();

                if (command.startsWith("File")) {
                    System.out.println("Введите файл в нужном формате что бы удалить");
                    command = scanner.nextLine();
                    File file = new File(command);
                    if (file.delete()) {
                        System.out.println("File bil udalen");
                    } else {
                        System.out.println("File ne bil udalen");
                    }
                }

                if (command.startsWith("Folder")) {
                    System.out.println("Введите папку что бы удалить");
                    command = scanner.nextLine();
                    File folder = new File(command);
                    if (folder.delete()) {
                        System.out.println("folder bil udalen");
                    } else {
                        System.out.println("folder ne bil udalen");
                    }
                }

                //delete r <путь> – удалить файл или папку (содержимое папки удаляется рекурсивно)
            } else if (command.startsWith("delete r")) {
                System.out.println("Еще в разработке");

                //rename <старое_имя> <новое_имя> – переименовать файл или папку
            } else if (command.startsWith("rename")) {
                System.out.println("Введите старое имя");
                command = scanner.nextLine();
                File fileOld = new File(command);
                System.out.println("Введите новое имя");
                command = scanner.nextLine();
                File fileNew = new File(command);
                if (fileOld.renameTo(fileNew)) {
                    System.out.println("File bil pereimenovan");
                } else {
                    System.out.println("File ne bil pereimenovan");
                }
                //move <откуда> <куда> – переместить файл или папку
            } else if (command.startsWith("move")) {
                System.out.println("Введите какую папку хотите переместить");
                command = scanner.nextLine();
                File file = new File(command);
                System.out.println("Введите новый путь папки");
                String newPath = scanner.nextLine();
        File file1 = new File(newPath,file.getName());
        System.out.println(file.renameTo(file1));
                //list <путь> – вывести содержимое папки (файлы и папки)
            } else if (command.startsWith("list")) {
                System.out.println("Еще в разработке");

//size <путь> – вывести размер файла или папки (считая размер всех вложенных файлов)
            } else if (command.startsWith("size")) {
                System.out.println("Введите в какой папке хотите вывести размер");
                command = scanner.nextLine();
                File file = new File(command);
        System.out.println("File size : " + file.length());
//sort <путь> [name|size] – вывести содержимое папки с сортировкой по имени или размеру
            } else if (command.startsWith("sort")) {
                System.out.println("Еще в разработке");
            } else {
                System.out.println("not found command");
            }
            System.out.println(command);

        } while (true);
    }
}