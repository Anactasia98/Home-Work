package org.example.services;

import org.example.model.Contact;
import org.example.model.User;
import org.example.repositories.IdGeneratorRepository;
import org.example.repositories.UserRepository;
import org.example.utils.ConsoleMessage;

import java.util.List;
import java.util.Optional;

public class UserService {

    private final UserRepository userRepository;

    private final IdGeneratorRepository idGeneratorRepository;

    public UserService() {
        this.idGeneratorRepository = new IdGeneratorRepository();
        this.userRepository = new UserRepository();
    }


    public Optional<User> findByUsername(String username) {
        if (username == null || username.isEmpty()) {
            return Optional.empty();
        }

        List<User> all = userRepository.getAll();

        for (User user : all) {
            String userName = user.getUserName();
            if (username.equals(userName)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    public void register(String name,
                         String secondName,
                         String username,
                         String password) {
        User user = new User(
                name,
                secondName,
                username,
                password,
                idGeneratorRepository.getNextUserId()
        );
        userRepository.create(user);
    }
}
