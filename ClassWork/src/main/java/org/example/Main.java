package org.example;

import org.example.zadanie6.BankAccount;

import java.io.*;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

//Задания для самостоятельной работы (Java, средний уровень)
//1-2. Задания на if
//Задание 1: Классификация углов
//Напишите программу, которая запрашивает у пользователя угол в градусах (целое число от 0 до 360)
// и классифицирует его следующим образом:
//
//Острый угол (меньше 90 градусов)
//Прямой угол (ровно 90 градусов)
//Тупой угол (от 91 до 179 градусов)
//Развернутый угол (ровно 180 градусов)
//Невалидный угол (больше 180 градусов, но не более 360)
//Выведите соответствующее сообщение.
//Если введенное число выходит за пределы 0-360, программа должна выводить сообщение об ошибке.
//
//        System.out.print("Введите угол в градусах : ");
//        int gradus = scanner.nextInt();
//        if (gradus<90 && gradus>0){
//            System.out.println("Острый угол");
//        } else if (gradus==90) {
//            System.out.println("Прямой угол");
//        } else if (gradus<=91 && gradus>=179) {
//            System.out.println("Тупой угол");
//        } else if (gradus==180) {
//            System.out.println("Развернутый угол");
//        } else if (gradus>180 && gradus<=360) {
//            System.out.println("Невалидный угол");
//        } else if (gradus<0 || gradus>360) {
//            System.out.println("Тут должна быть ошибка try catch");
//        }


//Задание 2: Оценка кредита
//Напишите программу, которая запрашивает у пользователя его возраст, ежемесячный доход и сумму кредита, который он хочет взять.
// Программа должна проверять следующие условия:
//
//Возраст должен быть от 18 до 65 лет.
//Доход должен быть не менее 50 000 рублей.
//Сумма кредита не должна превышать 10-кратный размер ежемесячного дохода.
//Если все условия выполняются, программа должна сообщить, что кредит одобрен.
//В противном случае программа должна объяснить причину отказа.
//
//        System.out.print("Введите возраст : ");
//        int age = scanner.nextInt();
//        System.out.print("Введите ежемесячный доход : ");
//        int income = scanner.nextInt();
//        System.out.print("Введите сумму кредита : ");
//        int credit = scanner.nextInt();
//        if (age>18 && age<65 && income>50000 && credit<10*income){
//            System.out.println("Кредит одобрен");
//        }else if (age<18 || age>65){
//            System.out.println("Ваш возраст не подходит для обобрения кредита");
//        } else if (income<50000) {
//            System.out.println("Ваш доход меньше 50.000 рублей");
//        } else if (credit>10*income) {
//            System.out.println("Сумма кредита слишком большая");
//        }

//3. Задание на switch
//Задание 3: Калькулятор простых операций
//Напишите консольную программу, которая запрашивает у пользователя два числа (целые) и оператор (+, -, *, /).
//Используйте switch для выполнения соответствующей арифметической операции.
//
//Обработайте следующие случаи:
//
//Деление на ноль (вывести сообщение об ошибке).
//Ввод некорректного оператора (вывести сообщение об ошибке).
//Корректный вывод результата.
//
//
//        System.out.println(" Введите первое число");
//        int a = scanner.nextInt();
//
//        scanner = new Scanner(System.in);
//        System.out.println("введи действие");
//        String oper = scanner.nextLine();
//
//        System.out.println("Введите второе число");
//        int b = scanner.nextInt();
//
//        switch (oper){
//            case "+":
//                System.out.println("Сумма = " + sum(a,b));
//                break;
//            case "-":
//                System.out.println("Вычитание = " + subtraction(a,b));
//                break;
//            case "*":
//                System.out.println("Умножение = " + multiplication(a,b));
//                break;
//            case "/":
//                System.out.println("Деление = " + division(a,b));
//                break;
//            default:
//                System.out.println("E");
//        }
//4-5. Задания на while
//Задание 4: Поиск числа Фибоначчи
//Пользователь вводит целое положительное число n. Программа должна вывести n-й элемент последовательности Фибоначчи,
// используя цикл while.
//(Последовательность: 0, 1, 1, 2, 3, 5, 8, 13, …)
//
//        System.out.println("введите число n");
//            int n = scanner.nextInt();
//            if (n == 0) {
//                System.out.println("0");
//            }
//            if (n == 1) {
//                System.out.println("1");
//            }
//            int prev1 = 0;
//            int prev2 = 1;
//            int carent = 0;
//
//            int i = 2;
//            while (i <= n){
//                carent = prev1 + prev2;
//
//                prev1 = prev2;
//                prev2 = carent;
//                i++;
//            }
//
//        System.out.println(carent);


//Задание 5: Проверка на палиндром
//Напишите программу, которая запрашивает у пользователя строку и проверяет, является ли она палиндромом
// (читается одинаково слева направо и справа налево). Используйте цикл while для проверки.
//
//Пример работы:
//
//Введите строку: level
//Это палиндром!
//
//Введите строку: hello
//Это не палиндром.
//
//        System.out.println("Введите слово для проверки");
//        String text=scanner.nextLine();
//        char [] charArray= text.toCharArray();
//       String a1 ="level";
//        int i = 0;
//        while (i < text.length()) {
//            if (charArray[charArray.length - i - 1] != charArray[i]){
//                a1="hello";
//                break;
//            }
//            i++;
//        }
//        System.out.println("this is pilindpom :" + a1);
//
//6-7. Задания на ООП
//Задание 6: Банковский счет
//Создайте класс BankAccount, который содержит:
//
//Поля: balance (баланс), owner (владелец счета).
//Метод deposit(double amount), который увеличивает баланс.
//Метод withdraw(double amount), который уменьшает баланс, но не позволяет уйти в минус.
//Конструктор, который принимает начальный баланс и имя владельца.
//Напишите программу, которая создает объект BankAccount, выполняет несколько операций пополнения и снятия и выводит итоговый баланс.
//
//        System.out.println("╔══════════════════════════════╗");
//        System.out.println("║    ДОБРО ПОЖАЛОВАТЬ В БАНК   ║");
//        System.out.println("╚══════════════════════════════╝");
//
//        System.out.println("Имя владельца счета: ");
//        String owner = scanner.nextLine();
//        System.out.println("Пополнение на начальный старт: ");
//        Double balance = scanner.nextDouble();
//        scanner.nextLine();
//
//        BankAccount account = new BankAccount(owner,balance );
//        boolean run = true;
//        while (run) {
//        String comand = scanner.nextLine().trim();
//        switch (comand) {
//            case "Пополнение":
//                System.out.println("На сколько хотите пополнить");
//                double sum = scanner.nextDouble();
//                scanner.nextLine();
//                account.deposit(sum);
//                break;
//            case "Снять":
//                System.out.println("На сколько хотите снять");
//                double num = scanner.nextDouble();
//                scanner.nextLine();
//                account.withdraw(num);
//                break;
//            case "Баланс":
//                account.DisplayBalance();
//                break;
//            case "Завершение":
//                System.out.println("Завершение работы программы.");
//                run = false;
//
//            default:
//                System.out.println("Неверный выбор");
//        }
//
//        }
//Задание 7: Управление заказами
//Создайте классы Product (товар) и Order (заказ).
//
//Product должен содержать поля: name (название), price (цена).
//Order должен содержать список товаров (List<Product>) и метод getTotalPrice(), который вычисляет общую стоимость заказа.
//Создайте несколько товаров, добавьте их в заказ, посчитайте итоговую сумму и выведите результат.
//
//8-9. Задания на Stream API
//Задание 8: Фильтрация чисел
//Даsн список чисел List<Integer>. Используйте Stream API, чтобы:
//
//Оставить только четные числа.
//Упорядочить их по убыванию.
//Вывести их на экран.
//Пример входных данных: [5, 12, 7, 3, 14, 18, 6]
//Выход: [18, 14, 12, 6]
//

//        List<Integer> list = List.of(14, 54, 54, 34, 50, 57, 0, 1, 2, 5, 556);
//        List<Integer> result = list.stream().filter(s -> s % 2 == 0).
//Задание 9: Поиск самого длинного слова
//Дан список строк List<String>. Используйте Stream API, чтобы:
//
//Найти самое длинное слово.
//Если есть несколько слов одинаковой длины, выбрать первое.
//Вывести его на экран.
//Пример входных данных: ["кот", "слон", "крокодил", "тигр", "леопард"]
//Выход: "крокодил"
//
//10. Задание на IO File
//Задание 10: Чтение и обработка данных из файла
//Напишите программу, которая:
//
//Читает файл input.txt, содержащий числа (по одному числу в строке).
//Суммирует все числа из файла.
//Записывает результат в файл output.txt.
//Пример input.txt:
//
//10
//20
//30
//40
//Результат в output.txt:
//
//Сумма чисел: 100
//
//
        FileReader fileReader = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int sum = 0;
        String line;

        while ((line = bufferedReader.readLine()) != null){
            sum += Integer.parseInt(line);
            //10 - строка -> число
        }
        fileReader.close();


        FileWriter fileWriter = new FileWriter("output.txt");
        fileWriter.write("Сумма чисел этой задачи: " + sum);
        fileWriter.close();



//Дополнительно
//Все задания требуют обработки ошибок (например, если ввод некорректен) и должны быть решены
//без использования break и continue, если это не критично.
    }
}