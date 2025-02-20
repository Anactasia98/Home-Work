//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Написать метод, который возвращает факториал заданного числа.
    public static int factorial(int num) {
       if (num<0){
           return 0;
       }
        if (num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
//Написать метод, который возвращает среднее арифметическое массива чисел.
    public static int SredArifmetic(int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum/ arr.length;
    }
//Написать метод, который возвращает сумму элементов массива.
public static int SumArr(int[]arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
    }
    return sum;
}
//Написать метод, который возвращает произведение элементов массива.
public static int ProizvedArr(int[]arr) {
    int proizved = 1;
    for (int i = 0; i < arr.length; i++) {
        proizved = proizved * arr[i];
    }
    return proizved;
}
//Написать метод, который возвращает наибольшее число из массива.
    public static int getMax(int[]arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]>max){
               max=arr[i];
           }
        }
        return max;
    }
//Написать метод, который возвращает наименьшее число из массива.
public static int getMin(int[]arr){
    int min=arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]<min){
            min=arr[i];
        }
    }
    return min;
}
//Написать метод, который возвращает разницу между максимальным и минимальным элементом массива.
public static int razdnisaMinAndMax(int[]arr){
    int min=arr[0];
    int max=arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]<min){
            min=arr[i];
        }
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max-min;
}
//Написать метод, который возвращает сумму квадратов элементов массива.
public static int SumKvadr(int[]arr){
        int sum=0;
    for (int i = 0; i < arr.length; i++) {
        sum=sum+(arr[i]*arr[i]);
    }
    return sum;
}
//Написать метод, который находит объем цилиндра по радиусу и высоте.
public static double obemSelindra(int rad, int h){
        double p=3.14;
        double odem=p*rad*2*h;
        return odem;
}
//Написать метод, который вычисляет гипотенузу прямоугольного треугольника по двум катетам.
public static int gipotenyza(int catet1, int catet2){
        int gipotenez;
       gipotenez=(catet1*catet1)+(catet2*catet2);
        return gipotenez;
}
//Написать метод, который возвращает сумму чисел от 1 до заданного числа без использования циклов и условий.
public static int sumNum(int num) {
    if (num==1){
        return 1;
    }
    return num+sumNum(num-1);
}
//Написать метод, который проверяет, является ли число степенью двойки.
public static int stepDva(double num) {

    if (num == 1) {
        return 1;
    }
    else if (num > 1 && num < 2) {
        return 0;
    }
    else {
        return stepDva(num / 2);
    }
}
//Написать метод, который вычисляет сумму чисел, кратных 3 или 5, в заданном диапазоне.
    public static int kratno3i5(int nachalo, int kones, int sum){
       if (nachalo==kones+1){
           return sum;
       }
        if (nachalo%3==0 || nachalo%5==0){
            sum=sum+nachalo;
        }
        return kratno3i5(nachalo+1, kones, sum);
    }
//Написать метод, который возвращает сумму цифр числа.
public static int sumChsla(int num, int sum){

        int rezalt1=num/100;
        int rezalt2=(num-rezalt1*100)/10;
        int rezalt3=num -rezalt1*100-rezalt2*10;
        sum=rezalt1+rezalt2+rezalt3;
        return sum;
}
//Написать метод, который возвращает произведение цифр числа.
public static int proizvChsla(int num, int proizv){

    int rezalt1=num/100;
    int rezalt2=(num-rezalt1*100)/10;
    int rezalt3=num -rezalt1*100-rezalt2*10;
    proizv=rezalt1*rezalt2*rezalt3;
    return proizv;
}
//Написать метод, который возвращает количество цифр в числе.
//Написать метод, который возвращает число, полученное в результате зеркального отображения (реверса) заданного числа.
//Написать метод, который возвращает значение числа Фибоначчи с заданным номером.
//Написать метод, который возвращает длину окружности по заданному радиусу.
//Написать метод, который проверяет, является ли треугольник прямоугольным по трём сторонам.

    public static void main(String[] args) {
        System.out.println( factorial(5));
        int []arr= {2,3,10};
        System.out.println(SredArifmetic(arr));
        System.out.println(SumArr(arr));
        System.out.println(ProizvedArr(arr));
        System.out.println(getMax(arr));
        System.out.println(getMin(arr));
        System.out.println(razdnisaMinAndMax(arr));
        System.out.println(SumKvadr(arr));
        System.out.println(obemSelindra(5,4));
        System.out.println(gipotenyza(4,5));
        System.out.println(sumNum(2));
        double num = 15;
        if (stepDva(num) == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(kratno3i5(10,20 ,0));
        System.out.println(sumChsla(356,0));
        System.out.println(proizvChsla(356,0));

    }
}