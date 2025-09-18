package org.example;
//Задание 1: Сравнение последовательного и параллельного выполнения
//Создайте программу, которая демонстрирует разницу между последовательным и параллельным выполнением двух задач:
//
//Первая задача: подсчет и вывод чисел от 0 до 10000
//Вторая задача: вывод 5000 символов "*"
//
//Измерьте и выведите время выполнения для обоих подходов (последовательного и с использованием потоков).
//
//
//Задание 2: Использование разных способов создания потоков
//Напишите программу, которая выполняет одну и ту же задачу (например, вывод чисел от 1 до 100) тремя разными способами:
//
//Используя наследование от класса Thread (как MyThread в примере)
//Используя интерфейс Runnable (как MyRunnable в примере)
//Используя лямбда-выражение
//
//Для каждого способа выведите имя потока и его приоритет.
//
//
//Задание 3: Взаимодействие между потоками
//Создайте два потока:
//
//Первый поток генерирует и печатает случайные числа (от 1 до 100) каждую секунду
//Второй поток ожидает, когда будет сгенерировано число больше 90, и останавливает оба потока
//
//Используйте методы join(), sleep() и interrupt() для управления потоками,
//а также продемонстрируйте различные состояния жизненного цикла потока (NEW, RUNNABLE, TERMINATED и т.д.).

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}