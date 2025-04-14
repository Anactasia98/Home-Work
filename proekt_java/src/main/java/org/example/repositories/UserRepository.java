package org.example.repositories;

import org.example.model.Contact;
import org.example.model.User;
import org.example.services.AuthorizationService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private static final String path = "main/resources/users.txt";

    public UserRepository() {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void create(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.write(user.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                users.add(User.fromString(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    public void update(User updatedUser) {
        List<User> users = getAll();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (User user : users) {
                if (user.getId() ==  updatedUser.getId()) {
                    writer.write( updatedUser.toString());
                } else {
                    writer.write(user.toString());
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        List<User> users = getAll();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (User user : users) {
                if (user.getId() != id) {
                    writer.write(user.toString());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


