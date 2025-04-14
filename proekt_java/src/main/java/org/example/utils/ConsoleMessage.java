package org.example.utils;

public class ConsoleMessage {
    public static final String COMMAND_INTERFACE_MESSAGE= """
                     Меню контактов:
                  
              ----------------------------------
             |                                  |
             |        1   -   Добавить          |
             |                                  |
             |        2   -   Удалить           |
             |                                  |
             |        3   -   Редактировать     |
             |                                  |
             |        4   -   Отобразить        |
             |                                  |
             |        5   -   Назад             |
             |                                  |
              ----------------------------------
            """;
    public static final String LOGIN_USER_INTERFACE_MESSAGE = """              
                      Добро пожаловать %s!
                  
              ----------------------------------
             |                                  |
             |        1   -   Контакты          |
             |                                  |
             |        2   -   Поиск             |
             |                                  |
             |        3   -   Фильтрация        |
             |                                  |
             |        4   -   Сортировка        |
             |                                  |
             |        5   -   Logger            |
             |                                  |
             |        6   -   Выход             |
             |                                  |
              ----------------------------------
        """;
    public static final String WELCOME_MESSAGE = """
            Добро пожаловать в телефонную книгу!
                 Пожалуйста, авторизуйтесь.
                 
              -----------------------------------
             |                                  |
             |                                  |
             |        1   -   Sign in           |
             |                                  |
             |        2   -   Sign up           |
             |                                  |
             |        3   -   Sign out          |
             |                                  |
             |        4   -   Exit              |
             |                                  |
             |                                  |
              -----------------------------------
            """;

    public static final  String SIGN_IN_USERNAME_MESSAGE= "Enter username: ";
    public static final  String SIGN_IN_PASSWORD_MESSAGE= "Enter password: ";
    public static final  String SIGN_UP_NAME_MESSAGE= "Enter Name: ";
    public static final  String SIGN_UP_SECOND_NAME_MESSAGE= "Enter Second Name: ";
    public static final  String SIGN_UP_REPEAT_PASSWORD_MESSAGE= "Enter repeat password: ";
    public static final String PASSWORDS_NOT_EQUALS_MESSAGE = "Пароли не совпадают";
    public static final  String SIGN_IN_AGE_MESSAGE= "Enter age: ";
    public static final  String SIGN_IN_PHONE_NUMBER_MESSAGE= "Enter phone numder: ";
}
