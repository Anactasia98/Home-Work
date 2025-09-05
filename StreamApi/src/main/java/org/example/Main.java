package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        System.out.print("Введите общее количество фильмов : ");
        int totalMovie = scanner.nextInt();//77

        for (int i = 1; i <= totalMovie; i++) {
            list.add("Фильм # " + i);
//            System.out.println("Фильм # " + i);
        }


        System.out.print("Введите количество фильмов на одной странице : ");
        int pageSize = scanner.nextInt();//15
        System.out.print("Введите номер страницы : ");
        int pageNum = scanner.nextInt();//7


        ///////////////////////////////////////
//              logic
        List<String> result = list;
        if (pageNum<0){
            System.out.println("Номер страницы не может быть отрицательным");
            return;
        }else if (pageNum*pageSize>pageSize) {
            System.out.println("Такого номера страницы нет");
            return;
        }
        list.stream().skip((pageNum-1)*pageSize).limit(pageSize).forEach(s -> System.out.println(s));
        ///////////////////////////////////////


        //Result : Dannaya stranica ne suwestvuet
        //Result : 66->77
//        for (String value: result) {
//            System.out.println(value);
//        }
    }
}