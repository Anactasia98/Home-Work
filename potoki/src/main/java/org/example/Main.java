package org.example;


import java.sql.Time;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class MyThread1 extends Thread{
    public void run(){
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
}

class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
}
public class Main {
    public static void main(String[] args) {
//Задание 1: Сравнение последовательного и параллельного выполнения
//Создайте программу, которая демонстрирует разницу между последовательным и параллельным выполнением двух задач:
//
//Первая задача: подсчет и вывод чисел от 0 до 10000
//Вторая задача: вывод 5000 символов "*"
//
//Измерьте и выведите время выполнения для обоих подходов (последовательного и с использованием потоков).
//
//        System.out.println("последовательнo");
//        long startTime1= System.currentTimeMillis();
//        for (int i = 0; i <= 10000; i++) {
//            System.out.print( i + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < 5000; i++) {
//            System.out.print( "*");
//        }
//        System.out.println();
//        long endTime1= System.currentTimeMillis();
//        long duration1= endTime1-startTime1;
//        System.out.println("duration1: " + duration1);
//
//        System.out.println("параллельнo");
//        Thread thread=  new Thread(()->{
//            for (int i = 0; i <= 10000; i++) {
//                System.out.print( i + " ");
//            }
//            System.out.println();
//        });
//        Thread thread1=  new Thread(()->{
//            for (int i = 0; i < 5000; i++) {
//                System.out.print( "*");
//            }
//            System.out.println();
//        });
//        long startTime= System.currentTimeMillis();
//        thread.start();
//        long endTime= System.currentTimeMillis();
//        long duration= endTime-startTime;
//        System.out.println("duration: " + duration);
//        thread1.start();


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
//        MyThread1 myThread1 = new MyThread1();
//        myThread1.start();
//        myThread1.setName("Первый поток");
//        System.out.println(myThread1.getName());
//        myThread1.setPriority(1);
//
//        MyRunnable1 myRunnable1 = new MyRunnable1();
//        Thread thread = new Thread(myRunnable1);
//        myRunnable1.run();
//        thread.setName("Второй поток");
//        System.out.println(thread.getName());
//        thread.setPriority(2);
//
//        Thread threadLambda = new Thread(() -> {
//            for (int i = 1; i <= 100; i++) {
//                System.out.print(i + " ");
//            }
//        });
//        threadLambda.start();
//        threadLambda.setName("Третий поток");
//        System.out.println(threadLambda.getName());
//        threadLambda.setPriority(3);
//
//Задание 3: Взаимодействие между потоками
//Создайте два потока:
//
//Первый поток генерирует и печатает случайные числа (от 1 до 100) каждую секунду
//Второй поток ожидает, когда будет сгенерировано число больше 90, и останавливает оба потока
//
//Используйте методы join(), sleep() и interrupt() для управления потоками,
//а также продемонстрируйте различные состояния жизненного цикла потока (NEW, RUNNABLE, TERMINATED и т.д.).

        Thread oneThread=new Thread(()->{
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;
            for (int i = 0; i <randomNumber ; ) {
                System.out.println(randomNumber + " ");
            }


        });
        oneThread.start();










    }
}