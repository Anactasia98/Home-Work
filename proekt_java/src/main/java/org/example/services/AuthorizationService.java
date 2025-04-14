package org.example.services;

import org.example.model.User;

import java.util.Optional;

public class AuthorizationService {

    public static User currentUser;//текущий пользователь
    private final UserService userService;

    public AuthorizationService() {
        this.userService = new UserService();
    }

    public static boolean isAuthorized() {
        return currentUser != null;
    }

    public void login(String username, String password) {
        Optional<User> userOptional = userService.findByUsername(username);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (password.equals(user.getPassword())) {
                currentUser = user;
            }
        }
    }

    public void logOut() {
        currentUser = null;
    }

    public static String getFilePathForCurrentUser() {
        return "main/resources/contacts/user_id_" + currentUser.getId() + ".txt";
    }

}
