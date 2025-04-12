package org.example.userInterface;

import org.example.services.LoginService;
import org.example.services.UserService;
import org.example.utils.ConsoleMessage;

import java.util.Scanner;

public class ConsoleInterface {

    private final LoginService loginService;

    private final Scanner scanner;

    private final UserService userService;

    public ConsoleInterface() {
        this.userService = new UserService();
        this.loginService = new LoginService();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println(ConsoleMessage.WELCOME_MESSAGE);
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
        System.out.print(ConsoleMessage.SIGN_IN_USERNAME_MESSAGE);
        String username = scanner.nextLine();
        System.out.print(ConsoleMessage.SIGN_IN_PASSWORD_MESSAGE);
        String password = scanner.nextLine();

        loginService.login(username, password);
    }

    private void register() {
        System.out.print(ConsoleMessage.SIGN_UP_NAME_MESSAGE);
        String name = scanner.nextLine();
        System.out.print(ConsoleMessage.SIGN_UP_SECOND_NAME_MESSAGE);
        String secondName = scanner.nextLine();
        System.out.print(ConsoleMessage.SIGN_IN_USERNAME_MESSAGE);
        String username = scanner.nextLine();
        System.out.print(ConsoleMessage.SIGN_IN_PASSWORD_MESSAGE);
        String password = scanner.nextLine();
        System.out.print(ConsoleMessage.SIGN_UP_REPEAT_PASSWORD_MESSAGE);
        String repeatPassword = scanner.nextLine();
        if (!password.equals(repeatPassword)) {
            System.out.println("Пароли не совпадают");//добавить цикл который будет запрашивать повторно ввесли пароль. до тех пор пока пароли не совпадут
        } else {
            userService.register(name, secondName, username, password);
        }
    }

    private void logOut(){
        loginService.logOut();
    }

}
