package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//Читаем файл и анализируем символы через ASCII  .
//
//Нужно посчитать:
//
//🔤 Количество слов
//
//🔢 Количество чисел
//
//📝 Количество предложений
//
//🅰️ Количество гласных
//
//🅱️ Количество согласных
//
//➕ Количество знаков препинания (точка, запятая, !, ?, ;, : )
//
//⏱ Время выполнения
//
//Использовать потоки
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int wordCount = 0;
    static int numberCount = 0;
    static int sentenceCount = 0;
    static String text = "";

    public static void main(String[] args) throws IOException, InterruptedException {

        long startTime = System.currentTimeMillis();

        Thread readerThread = new Thread(() -> {
            try {
                text = new String(Files.readAllBytes(Paths.get("text.txt")));
                System.out.println("Фаил считан");
            } catch (Exception ex) {

            }
        });

        readerThread.start();
        readerThread.join();


        Thread wordThread = new Thread(() -> {
            wordCount = text.split("\\s+").length;
            System.out.println("Количество слов     : " + wordCount);
        });

        Thread numberThread = new Thread(() -> {
            numberCount = text.split("\\b\\d+\\b").length;
            System.out.println("Количество чисел    : " + numberCount);
        });


        Thread sentenceThread = new Thread(() -> {
            sentenceCount = text.split("[.?!]").length;
            System.out.println("Количество предложений : " + sentenceCount);
        });

        numberThread.start();
        sentenceThread.start();
        wordThread.start();

        sentenceThread.join();
        numberThread.join();
        wordThread.join();


        long endTime = System.currentTimeMillis();

        System.out.println("Много потоков за : " + (endTime - startTime) + " ms");


//
    }
}