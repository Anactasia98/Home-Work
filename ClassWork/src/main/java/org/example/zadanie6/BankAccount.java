package org.example.zadanie6;
//Задание 6: Банковский счет
//Создайте класс BankAccount, который содержит:
//
//Поля: balance (баланс), owner (владелец счета).
//Метод deposit(double amount), который увеличивает баланс.
//Метод withdraw(double amount), который уменьшает баланс, но не позволяет уйти в минус.
//Конструктор, который принимает начальный баланс и имя владельца.
//Напишите программу, которая создает объект BankAccount, выполняет несколько операций пополнения и снятия и выводит
// итоговый баланс.
//
public class BankAccount {
    private String owner;
    private double balance;


    public BankAccount( String owner, double balance) {
        this.owner = owner;
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            balance += sum;
            System.out.println(" Вы пополнили баланс на :" + sum);
            System.out.println("Ваш баланс составляет: " + balance);
        } else {
            System.out.println("Ошибка, Числа не могут быть орицательны");

        }
    }

    public void withdraw(double amount) {
        if (amount > 0) { // Проверка на положительность
            // 5 - (-2) = 7
            if (balance >= amount) { // Проверка, что выбранное число не больше баланса
                balance -= amount; // вычитание из текущего баланса
                System.out.println("Снятие " + amount + " руб. Успешно!");
                System.out.println("Новый баланс: " + balance + " руб.");// вывод- сколько осталось
            } else {
                System.out.println("Неверная сумма");
                System.out.println("Текущая сумма: " + balance + " руб.");
            }

        }

    }

    public void DisplayBalance(){
        System.out.println("=============================");
        System.out.println("Владелец счёта: " + owner);
        System.out.println("Баланс: " + balance + "руб.");
        System.out.println("=============================");
    }
}
