package org.example.utils;

public class ConsoleMessage {
    public static final String SEARCH_INTERFACE_MESSAGE = """
                        Меню поиска:
              ----------------------------------
             |                                  |
             |        1   -   Найти             |
             |                                  |
             |        _ -> 1 символ             |
             |        % -> 0 или N символов     |
             |                                  |
             |        5   -   Назад             |
             |                                  |
              ----------------------------------
            """;
    public static final String COMMAND_INTERFACE_MESSAGE = """
                     Меню контактов:
              ----------------------------------
             |                                  |
             |        1   -   Добавить          |
             |        2   -   Удалить           |
             |        3   -   Редактировать     |
             |        4   -   Отобразить        |
             |        5   -   Назад             |
             |                                  |
              ----------------------------------
            """;
    public static final String LOGIN_USER_INTERFACE_MESSAGE = """              
                          Добро пожаловать %s!
                  ----------------------------------
                 |                                  |
                 |        1   -   Контакты          |
                 |        2   -   Поиск             |
                 |        5   -   Logger            |
                 |        6   -   Выход             |
                 |                                  |
                  ----------------------------------
            """;
    public static final String WELCOME_MESSAGE = """
            Добро пожаловать в телефонную книгу!
                 Пожалуйста, авторизуйтесь.
              -----------------------------------
             |                                  |
             |        1   -   Войти             |
             |        2   -   Регистрация       |
             |        3   -   Выйти             |
             |        4   -   Завершить         |
             |                                  |
              -----------------------------------
            """;

    public static final String SEARCH_STRING_MESSAGE = "Искать: ";
    public static final String SORTING_STRING_MESSAGE = """
                        Отсортировать
              -----------------------------------
             |                                  |
             |        1   -   А-Я имя           |
             |        2   -   Я-А имя           |
             |        3   -   А-Я фамилия       |
             |        4   -   Телефон           |
             |        5   -   Без сортировки    |
             |                                  |
              -----------------------------------
            """;
    public static final String SIGN_IN_USERNAME_MESSAGE = "Enter username: ";
    public static final String SIGN_IN_PASSWORD_MESSAGE = "Enter password: ";
    public static final String SIGN_UP_NAME_MESSAGE = "Enter Name: ";
    public static final String SIGN_UP_SECOND_NAME_MESSAGE = "Enter Second Name: ";
    public static final String SIGN_UP_REPEAT_PASSWORD_MESSAGE = "Enter repeat password: ";
    public static final String PASSWORDS_NOT_EQUALS_MESSAGE = "Пароли не совпадают";
    public static final String SIGN_IN_AGE_MESSAGE = "Enter age: ";
    public static final String SIGN_IN_PHONE_NUMBER_MESSAGE = "Enter phone numder: ";
    public static final String COMMAND_INTERFACE_REMOVE_MESSAGE = "Введите id пользователя для удаления";
    public static final String COMMAND_INTERFACE_UPDATE_ID_MESSAGE = "Введите id";
    public static final String COMMAND_INTERFACE_REMOVE_CONFIRMATION_MESSAGE = """
               Вы уверены что хотите удалить
                           контакт?
              -----------------------------------
             |                                  |
             |          1   -   Да              |
             |          2   -   Нет             |
             |                                  |
              -----------------------------------
            """;

}
