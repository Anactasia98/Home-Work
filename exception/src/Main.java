import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //1. Деление на ноль
//Попросите пользователя ввести два числа (делимое и делитель). Если пользователь
// пытается выполнить деление на ноль, обработайте эту ситуацию, выведя сообщение об ошибке.
public static int delenie(int a, int b) throws Exception {
   if (b==0){
       throw new Exception("Делить на ноль нельзя, поменяйте число b.");
   }
    return a/b;
}
//2. Неверный формат числа
//Запросите у пользователя ввод числа. Если пользователь ввёл строку,
// не являющуюся числом, выбросьте исключение и выведите сообщение об ошибке.
public static int vvodNum(int num) throws Exception {
//    for (int i = 0; i <num.length ; i++) {
//    if (num[i]>'0' && '9'<num[i]){
//        throw new Exception("Вы ввели не число поменяйте значение");
//    }
//    }
//    return num[0];
//}
        if (!(-999 < num && num < 999)){
            throw new Exception("Вы ввели не число поменяйте значение");
        }
    return  num;
}
//3. Обращение к элементу массива
//Создайте массив из 5 элементов. Запросите у пользователя индекс и
// выведите элемент массива по этому индексу. Обработайте ситуацию, когда индекс выходит за границы массива.
public static int ObrashcheniyeMassivu (int[]arr ,int index) throws Exception {
    if (index>= arr.length){
        throw new Exception("Вы ввели большой индекс. Введите от 0 до 4");
    }
    return arr[index];
}
//4. Нахождение минимального числа
//Запросите у пользователя несколько чисел (например, 5). Если одно из
// введённых значений не является числом, выбросьте исключение и выведите сообщение об ошибке.
public static int neskolkocisel(int one,int two) throws Exception {
   if (true){
       throw new Exception("Вы ввели не число.");
   }
    return 0;
}
//5. Чтение строки с ограничением длины
//Запросите у пользователя ввод строки. Если длина строки превышает
// 10 символов, выбросьте исключение с сообщением, что строка слишком длинная.
public static String ChteniyeStrok(String text) throws Exception{
    if (text.length()>10) {
        throw new Exception("Строка слишком длинная");
    }
    return text;
}
//6. Поиск подстроки
//Запросите у пользователя строку и символ. Если строка не содержит
// указанный символ, выбросьте исключение и выведите сообщение об ошибке.
public static boolean PoiskPodstroki(char[] text, char[] smvol) throws Exception {
    for (int i = 0; i < text.length; i++) {
        int count=0;
        for (int j = 0; j < smvol.length; j++) {
            if (i<text.length && text[i]==smvol[j]){
                count++;
            }else {
                break;
            }
            i++;
        }
        if (count==smvol.length){
            return true;
        }
    }

    throw new Exception("Строка не содержит указанный символ");
}
//7. Число в диапазоне
//Попросите пользователя ввести число. Если введённое число меньше
// 1 или больше 100, выбросьте исключение с сообщением о некорректном диапазоне.
public static boolean ChisloDiapazone(int num) throws Exception {
   if (1<num && num<100){
       return true;
   }
    throw new Exception("введённое число меньше 1 или больше 100");
}
//8. Парсинг массива
//Создайте массив строк. Попробуйте преобразовать каждую строку в
//целое число. Если преобразование невозможно, выбросьте исключение и выведите сообщение о некорректном значении.
//
//9. Проверка делимости
//Попросите пользователя ввести два числа. Если второе число не является
//делителем первого, выбросьте исключение с сообщением: "Число не делится без остатка".
public static boolean ProverkaDelimosti(int num1,int num2) throws Exception {
    if (num1%num2==0){
        return true;
    }
    throw new Exception("Число не делится без остатка");
}
//10. Индексы и значение
//Создайте массив из 10 элементов. Попросите пользователя ввести индекс
//и значение для записи в массив. Обработайте ситуации, когда индекс выходит за пределы массива или значение некорректно.
    public static int IndeksyZnacheniye(int[]arr, int index) throws Exception {
if (index>=arr.length){
    throw new Exception("индекс выходит за пределы массива");
}
    return arr[index];
    }
    public static void main(String[] args) {
//1. Деление на ноль
//Попросите пользователя ввести два числа (делимое и делитель). Если пользователь
// пытается выполнить деление на ноль, обработайте эту ситуацию, выведя сообщение об ошибке.
        Scanner scanner=new Scanner(System.in);
//        System.out.print("Введите число a:");
//        int a=scanner.nextInt();
//        System.out.print("Введите число b:");
//        int b=scanner.nextInt();
//        try {
//            System.out.println("Ответ: " + delenie(a,b));
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }
//2. Неверный формат числа
//Запросите у пользователя ввод числа. Если пользователь ввёл строку,
// не являющуюся числом, выбросьте исключение и выведите сообщение об ошибке.
//        System.out.print("Введите число: ");
//        try {
//        int num= scanner.nextInt();
//        System.out.println(vvodNum(num));
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }
//3. Обращение к элементу массива
//Создайте массив из 5 элементов. Запросите у пользователя индекс и
// выведите элемент массива по этому индексу. Обработайте ситуацию, когда индекс выходит за границы массива.
//        int [] arr= new int[5];
//        System.out.println("Введите  элементы");
//        try {
//        for (int i = 0; i < 5; i++) {
//            arr[i] = scanner.nextInt();
//        }
//            System.out.println("Введите индекс");
//        int index=scanner.nextInt();
//            System.out.println(ObrashcheniyeMassivu(arr,index));
//        }catch (Exception ex){
//                System.out.println(ex.getMessage());
//
//        }
//4. Нахождение минимального числа
//Запросите у пользователя несколько чисел (например, 5). Если одно из
// введённых значений не является числом, выбросьте исключение и выведите сообщение об ошибке.
//        System.out.println("Введите первое число: ");
//        try {
//        int oneNum=scanner.nextInt();
//        System.out.println("Введите второе число: ");
//        int twoNum=scanner.nextInt();
//            System.out.println(neskolkocisel(oneNum,twoNum));
//        }catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//5. Чтение строки с ограничением длины
//Запросите у пользователя ввод строки. Если длина строки превышает
// 10 символов, выбросьте исключение с сообщением, что строка слишком длинная.
//        System.out.println("Введите строку");
//        try {
//            String text=scanner.nextLine();
//            System.out.println(ChteniyeStrok(text));
//        }catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//6. Поиск подстроки
//Запросите у пользователя строку и символ. Если строка не содержит
// указанный символ, выбросьте исключение и выведите сообщение об ошибке.
//        System.out.println("Введите строку");
//        try {
//            String text=scanner.nextLine();
//            char[] text1=text.toCharArray();
//            System.out.println("Введите символ");
//            String smvol=scanner.next();
//            char[] smvol1=smvol.toCharArray();
//            System.out.println(PoiskPodstroki(text1,smvol1));
//        }catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//7. Число в диапазоне
//Попросите пользователя ввести число. Если введённое число меньше
// 1 или больше 100, выбросьте исключение с сообщением о некорректном диапазоне.
//        System.out.println("Введите число");
//        try {
//            int num=scanner.nextInt();
//            System.out.println(ChisloDiapazone(num));
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//8. Парсинг массива
//Создайте массив строк. Попробуйте преобразовать каждую строку в
//целое число. Если преобразование невозможно, выбросьте исключение и выведите сообщение о некорректном значении.
//
//9. Проверка делимости
//Попросите пользователя ввести два числа. Если второе число не является
//делителем первого, выбросьте исключение с сообщением: "Число не делится без остатка".
//        System.out.print("Введите первое число:");
//        int num1=scanner.nextInt();
//        System.out.print("Введите второе число :");
//        int num2=scanner.nextInt();
//        try {
//            System.out.println("Ответ: " + ProverkaDelimosti(num1,num2));
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }

//10. Индексы и значение
//Создайте массив из 10 элементов. Попросите пользователя ввести индекс
//и значение для записи в массив. Обработайте ситуации, когда индекс выходит за пределы массива или значение некорректно.
        int [] arr= new int[10];
        System.out.println("Введите  элементы");
        try {
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
            System.out.println("Введите индекс");
        int index=scanner.nextInt();
            System.out.println(IndeksyZnacheniye(arr,index));
        }catch (Exception ex){
                System.out.println(ex.getMessage());

        }
    }
}