package org.example.model;

public class User {
    private int id;
    private String name;
    private String secondName;

    private String userName;
    private String password;

    public User(String name,
                String secondName,
                String userName,
                String password,
                int id) {
        this.name = name;
        this.secondName = secondName;
        this.userName = userName;
        this.password = password;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + secondName + "," + userName + "," + password;
    }

    public static User fromString(String line) {
        String[] parts = line.split(",");
        return new User(
                parts[1],
                parts[2],
                parts[3],
                parts[4],
                Integer.parseInt(parts[0])
        );
    }
}


