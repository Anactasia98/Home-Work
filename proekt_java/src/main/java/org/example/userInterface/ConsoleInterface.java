package org.example.userInterface;

import org.example.utils.ConsoleMessage;

import java.util.Scanner;

public class ConsoleInterface {
    private Scanner scanner;
    public  void start(){
        scanner = new Scanner(System.in);
        System.out.println(ConsoleMessage.WELCOME_MASSAGE);
        String userCommand = scanner.nextLine();
        switch (userCommand) {
            case "1":
                logIn();
                break;
            case "2":
                register();
                break;
            case "3":
                break;
            default:
                break;//доделать: не выходить из приложения а писать что команда не поддлерживется и просить пользователя ввести команду заново
        }
    }

    private void logIn() {

    }

    private void register() {

    }

}
