//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//1)public static  int add(int a, int b);
//Условие: Вернуть сумму двух чисел a и b.
public static int add(int a,int b){
    return a+b;
}
//2)public static  void printMessage(String message);
//Условие: Вывести строку message в консоль.
public static  void printMessage(String message){
    System.out.println(message);
    }
//3)public static int subtract(int a, int b);
//Условие: Вернуть разность чисел a и b.
public static int subtract(int a, int b){
    return a-b;
}
//4)public static  void greet();
//Условие: Напечатать в консоли стандартное приветствие, например, "Hello, world!".
public static  void greet(){
    System.out.println("Hello, world!");
}
//5)public static  int square(int number);
//Условие: Вернуть квадрат числа number.
public static  int square(int number){
    return number*number;
}
//6)public static int kub(int number);
//Условие: Вернуть kub числа number.
public static int kub(int number){
    return number*number*number;
}
//7)public static  boolean isEven(int number);
//Условие: Вернуть true, если число number чётное, иначе false.
public static  boolean isEven(int number){
    if (number%2==0){
        return true;
    }
    return false;
}
//8)public static boolean isNeqativ(int number);
//Условие: Вернуть true, если число number отрицательное иначе false.
public static boolean isNeqativ(int number){
    if (number<0){
        return true;
    }
    return false;
}
//9)public static void printNumber(int number);
//Условие: Вывести число number в консоль.
public static void printNumber(int number){
    System.out.println(number);
}
//10)public static boolean areEqual(int a, int b);
//Условие: Вернуть true, если числа a и b равны, иначе false.
public static boolean areEqual(int a, int b){
    if (a==b){
        return true;
    }
    return false;
}
//11)public static int multiply(int a, int b);
//Условие: Вернуть произведение чисел a и b.
public static int multiply(int a, int b){
    return a*b;
}

    public static void main(String[] args) {
        System.out.println("add=" + add(10,51));
        System.out.print("printMessage=");printMessage("Nasty");
        System.out.println("subtract=" + subtract(5,7));
        System.out.print("greet=");greet();
        System.out.println("square=" + square(20));
        System.out.println("kub="+ kub(5));
        System.out.println("isEven=" + isEven(3));
        System.out.println("isNeqativ=" + isNeqativ(-8));
        System.out.print("printNumber=");printNumber(5);
        System.out.println("areEqual=" + areEqual(5,57));
        System.out.println("multiply=" + multiply(5,6));
    }
}