import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Создайте обобщённый метод для вывода элементов.
//
//1.Напишите метод printElement, который принимает
// один параметр любого типа (T) и выводит его значение в консоль.
//Создайте обобщённый метод для работы с массивами.
//
    public static <T> void printElement(T num){
        System.out.println("Задание 1: " + num);
    }
//2.Напишите метод getFirstElement, который
// принимает массив любого типа (T[]) и возвращает его первый элемент.
//
    public static <T> T getFirstElement(T[]arr){
        return arr[0];
    }
 //3. Напишите метод для проверки равенства.
 //Реализуйте метод isEqual, который принимает
// два параметра одного типа (T) и возвращает true, если они равны.

public static <T> boolean isEqual (T num1,T num2){
        if (num1!=num2){
            return false;
        }
        return true;
}
//4.Создайте обобщённый класс для хранения пары.
//Напишите класс Pair<T1, T2>, который хранит два значения (T1 и T2).
// Реализуйте методы getFirst() и getSecond().
//
static class  Pair <T1 , T2 >{
    private T1 first;
    private T2 second;

    public Pair(T1 first , T2 second) {
        this.first=first;
        this.second=second;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }
}
//5.Обобщённый метод для реверса массива.
//Напишите метод reverseArray, который принимает массив любого типа
// (T[]) и возвращает новый массив с элементами в обратном порядке.
public static <T> void reverseArray (T[]array){
    for (int i = array.length-1; i >=0 ; i--) {
        System.out.print(array[i] + " ");
    }
}
//6. Сравнение элементов.
//Реализуйте метод compareElements, который принимает два элемента одного типа (T) и возвращает строку:
//"Элементы равны" — если они равны.
//"Элементы не равны" — если они различны.
    public static <T> String compareElements(T one,T two){
      if (one==two){
          return "Элементы  равны";
      }
       return  "Элементы не равны";
    }

//7. Создайте обобщённый метод для поиска элемента.
//Напишите метод findIndex, который принимает массив (T[]) и элемент
// (T) и возвращает индекс первого вхождения элемента в массив (или -1, если элемент не найден).
public static <T> int findIndex (T[]array,T element){
    for (int i = 0; i < array.length; i++) {
        if (array[i]==element){
            return i;
        }
    }
    return -1;
}
//8. Обобщённый метод для создания списка.
//Реализуйте метод toList, который принимает массив любого типа
// (T[]) и возвращает список (List<T>), содержащий те же элементы.
public static <T> List<T> toList(T[]arr){
return Arrays.asList(arr);
}
//9. Метод для копирования массива.
//Напишите метод copyArray, который принимает
// массив любого типа (T[]) и возвращает его копию.
public static <T> T[] copyArray(T[] arr){
    if (arr == null) {
        return null;
    }
    return Arrays.copyOf(arr, arr.length);
}
//10. Создайте класс для хранения трёх объектов.
//Реализуйте класс Triple<T1, T2, T3>, который содержит три поля разных типов
// (T1, T2, T3). Добавьте методы для установки и получения значений.
static class Triple<T1, T2, T3>{
                T1 num1;
                T2 num2;
                T3 num3;

    public Triple(T1 num1, T2 num2, T3 num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public T1 getNum1() {
        return num1;
    }

    public T2 getNum2() {
        return num2;
    }

    public T3 getNum3() {
        return num3;
    }
}

    public static void main(String[] args) {
        //1.
        printElement("Nasty");
        printElement(26);
        printElement('G');
        //2.
        Integer[]ints = new Integer[]{4,5,6,8,45};
        System.out.println("Задание 2: " + getFirstElement(ints));
        //3.
        System.out.println("Задание 3: "+isEqual(5,5));
        System.out.println("Задание 3: "+isEqual(5,7));
        //4.
        Pair pair=new Pair<>(5,6);
        System.out.println("Задание 4: "+pair.getFirst());
        System.out.println("Задание 4: "+pair.getSecond());
        //5.
        System.out.print("Задание 5: ");reverseArray(ints);
        System.out.println();
        //6.
        System.out.println("Задание 6: "+compareElements(5,5.4));
        //7.
        System.out.println("Задание 7: " + findIndex(ints,1245));
        //8.
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"apple", "banana", "cherry"};

        // Преобразование массива целых чисел в список
        List<Integer> integerList = toList(intArray);
        System.out.println("Задание 8: Integer list: " + integerList);

        // Преобразование массива строк в список
        List<String> stringList = toList(stringArray);
        System.out.println("Задание 8: String list: " + stringList);
        //9.
        System.out.println("Задание 9: " + Arrays.toString(copyArray(ints)));
        //10.
        Triple triple=new Triple(1,"Hello!", 'H');
        System.out.println("Задание 10: " +triple.getNum1());
        System.out.println("Задание 10: " +triple.getNum2());
        System.out.println("Задание 10: " +triple.getNum3());

    }
}
