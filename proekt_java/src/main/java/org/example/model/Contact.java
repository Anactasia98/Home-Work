package org.example.model;

public class Contact {
    private int id;
    private String name;
    private String secondName;
    private int phoneNumber;
    private int age;

    public Contact(int id,
                   String name,
                   String secondName,
                   int phoneNumber,
                   int age) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.age = age;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + secondName + "," + phoneNumber + "," + age;
    }

    public static Contact fromString(String line) {
        String[] parts = line.split(",");
        return new Contact(
                Integer.parseInt(parts[0]),
                parts[1],
                parts[2],
                Integer.parseInt(parts[3]),
                Integer.parseInt(parts[4])
        );
    }

    public String getFormattedString() {
        return "(№: " + id + ") Имя: " + name + " Фамилия: " + secondName + " Возраст: " + age + " Номер телефона: " + phoneNumber;
    }
}
