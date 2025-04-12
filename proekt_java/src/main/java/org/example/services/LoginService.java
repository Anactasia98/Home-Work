package org.example.services;

import org.example.model.User;

import java.util.Optional;

public class LoginService {

    private static User currentUser;//текущий пользователь
    private final UserService userService;

    public LoginService() {
        this.userService = new UserService();
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
}
