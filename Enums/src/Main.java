//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Простые задания:
//1. Создание и использование enum для дней недели:
//Создайте перечисление Day с константами для всех дней недели.
//Напишите метод, который принимает Day в качестве аргумента и выводит сообщение: "Сегодня [день]".
//
enum Day{
    MONDAY,TUESDAY,WENDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

//2. Создание enum для времён года:
//Создайте перечисление Season с константами WINTER, SPRING, SUMMER, FALL.
//Напишите метод, который принимает сезон и возвращает логическое значение: true, если это лето.
//
enum Season{
    WINTER, SPRING, SUMMER, FALL
}
//3. Перечисление для уровней сложности:
//Создайте enum Difficulty с уровнями EASY, MEDIUM, HARD.
//Используйте цикл для перебора всех значений перечисления и выведите их на экран.
//
//4. Перечисление для направлений:
//Создайте enum Direction с константами NORTH, EAST, SOUTH, WEST.
//Напишите метод, который принимает направление и возвращает сообщение: "Вы движетесь на [направление]".
//
//5. Использование метода valueOf:
//Создайте enum Status с константами START, PROCESSING, FINISHED.
//Напишите программу, которая принимает строку из консоли и преобразует её в значение перечисления с помощью valueOf.
//
//6. Работа с ordinal:
//Создайте enum Priority с уровнями LOW, MEDIUM, HIGH.
//Напишите метод, который возвращает номер каждого уровня, используя метод ordinal().
//
//7. Перебор значений с values:
//Создайте enum Months с названиями месяцев.
//Используйте метод values() для вывода всех месяцев на экран.
//
//8. Добавление описания к временам года:
//Создайте enum Season с константами WINTER, SPRING, SUMMER, FALL.
//Добавьте поле description (строка) для каждого сезона (например, "Cold", "Warm").
//Напишите метод getDescription, который возвращает описание сезона.
//example: System.out.println(Season.WINTER.getDescription());
//
//9. Добавление полей и методов для категорий товаров:
//Создайте enum ProductCategory с константами ELECTRONICS, FOOD, CLOTHING.
//Для каждой категории добавьте поле taxRate (процент налога).
//Напишите метод calculateTax, который принимает цену товара и возвращает налог на него.
//example: double tax = ProductCategory.ELECTRONICS.calculateTax(1000);
//         System.out.println("Tax: " + tax);
//
//10. Определение рабочего времени по дням недели:
//Создайте enum Day с константами для всех дней недели.
//Добавьте поле isWorkingDay (логическое значение).
//Реализуйте метод isWorkingDay, который возвращает true для будних дней и false для выходных.
//example: System.out.println(Day.MONDAY.isWorkingDay()); // true
//         System.out.println(Day.SUNDAY.isWorkingDay()); // false
public class Main {
    //1.
    public static void printDay(Day day){
        System.out.println("Today " + day);
    }
    //2.
    public  static  boolean sezon(Season season){
        if (season==season.SUMMER){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        //1.
        printDay(Day.MONDAY);
        //2.
        System.out.println(sezon(Season.SUMMER));
    }
}