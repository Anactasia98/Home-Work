package org.example.userInterface;

import org.example.model.Contact;
import org.example.model.Log;
import org.example.services.AuthorizationService;
import org.example.services.Logger;
import org.example.services.UserService;
import org.example.utils.ConsoleMessage;
import org.example.utils.LogMessage;

import java.util.List;
import java.util.Scanner;
import java.util.logging.LogManager;

public class ConsoleInterface {

    private final AuthorizationService authorizationService;

    private final Scanner scanner;

    private final UserService userService;

    private final Logger logger;

    public ConsoleInterface() {
        this.logger = new Logger();
        this.userService = new UserService();
        this.authorizationService = new AuthorizationService();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            while (!AuthorizationService.isAuthorized()) {
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
                        logOut();
                        break;
                    case "4":
                        scanner.close();
                        return;
                    default:
                        break;
                }
            }
            while (AuthorizationService.isAuthorized()) {
                System.out.printf(ConsoleMessage.LOGIN_USER_INTERFACE_MESSAGE, AuthorizationService.currentUser.getName());
                String userCommand = scanner.nextLine();
                switch (userCommand) {
                    case "1":
                        new ContactInterface(scanner).start();
                        break;
                    case "2":
                        new SearchInterface(scanner).start();
                        break;
                    case "5":
                        printLog();
                        break;
                    case "6":
                        scanner.close();
                        return;
                    default:
                        break;
                }
            }
        }
    }


    private void printLog() {
        List<Log> all = logger.getAll();
        for (Log log : all) {
            System.out.println(log.getFormattedString());
        }
    }

    private void logIn() {
        System.out.print(ConsoleMessage.SIGN_IN_USERNAME_MESSAGE);
        String username = scanner.nextLine();
        System.out.print(ConsoleMessage.SIGN_IN_PASSWORD_MESSAGE);
        String password = scanner.nextLine();

        authorizationService.login(username, password);

        if (AuthorizationService.isAuthorized()) {
            logger.create(String.format(LogMessage.LOGIN_MESSAGE, AuthorizationService.currentUser.getId()));
        }
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
        while (!repeatPassword.equals(password)) {
            System.out.println(ConsoleMessage.PASSWORDS_NOT_EQUALS_MESSAGE);
            System.out.print(ConsoleMessage.SIGN_UP_REPEAT_PASSWORD_MESSAGE);
            repeatPassword = scanner.nextLine();
        }
        userService.register(name, secondName, username, password);
    }

    private void logOut() {
        if (AuthorizationService.isAuthorized()) {
            System.out.printf(LogMessage.LOGOUT_MESSAGE, AuthorizationService.currentUser.getId());
        }
        authorizationService.logOut();
    }

}
