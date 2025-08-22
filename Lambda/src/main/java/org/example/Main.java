package org.example;
interface  Exercise1{
    int sum(int a, int b);
}
interface  Exercise2{
    boolean isEmptyt(String text);
}
interface  Exercise3{
    int lengen(String text);
}
interface  Exercise4{
    int max(int a, int b);
}
interface  Exercise5{
boolean isEven(int a);
}
interface  Exercise6{
    int numKvadro(int a);
}interface  Exercise7{
    String text(String text);
}
interface  Exercise8{
    String text(String text);
}
interface  Exercise9{
    boolean text(String text1, String text2);
}
interface  Exercise10{
    int num(String text);
}
interface  Exercise11{
    int ymnij(int a, int b);
}
interface  Exercise12{
    boolean num(int a);
}
interface  Exercise13{

}
interface  Exercise14{
    int sum(int a, int b);
}
interface  Exercise15{
    int sum(int a, int b);
}
interface  Exercise16{
    int sum(int a, int b);
}
interface  Exercise17{
    int sum(int a, int b);
}
interface  Exercise18{
    int sum(int a, int b);
}
interface  Exercise19{
    int sum(int a, int b);
}
interface  Exercise20{
    int sum(int a, int b);
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//1) Напишите лямбда-выражение, которое принимает два целых числа и возвращает их сумму.
        Exercise1 exercise1=(a,b)->a+b;
        System.out.println(exercise1.sum(10,50));
//2) Создайте лямбда-выражение, которое проверяет, является ли строка пустой.
        Exercise2 exercise2=(text)->text.isEmpty();
        System.out.println(exercise2.isEmptyt("Nasty"));
//3) Напишите лямбда-выражение, которое принимает строку и возвращает её длину.
        Exercise3 exercise3=(text)->text.length();
        System.out.println(exercise3.lengen("Hello!"));
//4) Создайте лямбда-выражение, которое возвращает максимальное из двух чисел.
        Exercise4 exercise4=(a,b)->{
            if(a>b){
                return a;
            }return b;
        };
        System.out.println(exercise4.max(5,8));
//5) Напишите лямбда-выражение для проверки, является ли число четным.
        Exercise5 exercise5=a-> a % 2 == 0;
        System.out.println(exercise5.isEven(4));
//6) Напишите лямбда-выражение, которое возводит число в квадрат.
        Exercise6 exercise6=a -> a*a;
        System.out.println(exercise6.numKvadro(5));
//7) Создайте лямбда-выражение, которое выводит на экран строку.
        Exercise7 exercise7=text -> text.toString();
        System.out.println(exercise7.text("Привет меня зовут Настя!"));
//8) Напишите лямбда-выражение, которое принимает строку и возвращает её в верхнем регистре.
        Exercise8 exercise8=text -> text.toUpperCase();
        System.out.println(exercise8.text("Привет меня зовут Настя!"));
//9) Напишите лямбда-выражение, которое проверяет, содержит ли строка подстроку.
        Exercise9 exercise9=((text1, text2) -> text1.contains(text2));
        System.out.println(exercise9.text("Привет меня зовут Настя!", "зовут"));
//10) Напишите лямбда-выражение, которое преобразует строку в число.
        Exercise10 exercise10=text ->  Integer.parseInt(text);
        System.out.println(exercise10.num("54584"));
//11) Создайте лямбда-выражение, которое умножает два числа и возвращает результат.
        Exercise11 exercise11=((a, b) -> a*b);
        System.out.println(exercise11.ymnij(4,4));
//12) Напишите лямбда-выражение, которое проверяет, является ли число положительным.
        Exercise12 exercise12=(a -> a>0);
        System.out.println(exercise12.num(5));
//13) Напишите лямбда-выражение для фильтрации всех чётных чисел из списка.
        System.out.println("Exercise13 в разраотке");
//14) Напишите лямбда-выражение, которое находит наибольший элемент в списке чисел.
//15) Напишите лямбда-выражение, которое сортирует список строк по длине.
//16) Создайте лямбда-выражение, которое возвращает строку без пробелов в начале и в конце.
//17) Напишите лямбда-выражение, которое объединяет два списка в один.
//18) Напишите лямбда-выражение, которое возвращает строку с первой буквой в верхнем регистре.
//19) Напишите лямбда-выражение, которое находит разницу между двумя датами.
//20) Напишите лямбда-выражение, которое проверяет, является ли строка числом.
    }
}