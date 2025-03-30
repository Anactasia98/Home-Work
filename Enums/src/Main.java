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
enum Difficulty{
    EASY, MEDIUM, HARD
}
//4. Перечисление для направлений:
//Создайте enum Direction с константами NORTH, EAST, SOUTH, WEST.
//Напишите метод, который принимает направление и возвращает сообщение:
// "Вы движетесь на [направление]".
//
enum Direction{
    NORTH, EAST, SOUTH, WEST
}
//5. Использование метода valueOf:
//Создайте enum Status с константами START, PROCESSING, FINISHED.
//Напишите программу, которая принимает строку из консоли и преобразует её
// в значение перечисления с помощью valueOf.
//
enum Status{
    START, PROCESSING, FINISHED
}
//6. Работа с ordinal:
//Создайте enum Priority с уровнями LOW, MEDIUM, HIGH.
//Напишите метод, который возвращает номер каждого уровня, используя метод ordinal().
//
enum Priority{
    LOW, MEDIUM, HIGH
}
//7. Перебор значений с values:
//Создайте enum Months с названиями месяцев.
//Используйте метод values() для вывода всех месяцев на экран.
//
enum Months{
    JANUARY, FEBRUARY, MARCH, APPIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NUVEMDER, DECEMDER
}
//8. Добавление описания к временам года:
//Создайте enum Season с константами WINTER, SPRING, SUMMER, FALL.
//Добавьте поле description (строка) для каждого сезона (например, "Cold", "Warm").
//Напишите метод getDescription, который возвращает описание сезона.
//example: System.out.println(Season.WINTER.getDescription());
//

enum Season1{
    WINTER( "Cold"), SPRING("streams"), SUMMER("hot"), FALL("leaf fall");

    String description;
    Season1 (String description){
        this.description=description;
    }

    public  String getDescription(){
        return description;
    }
}

//9. Добавление полей и методов для категорий товаров:
//Создайте enum ProductCategory с константами ELECTRONICS, FOOD, CLOTHING.
//Для каждой категории добавьте поле taxRate (процент налога).
//Напишите метод calculateTax, который принимает цену товара и возвращает налог на него.
//example: double tax = ProductCategory.ELECTRONICS.calculateTax(1000);
//         System.out.println("Tax: " + tax);
//
enum ProductCategory{
    ELECTRONICS(13, 2500), FOOD(7, 500), CLOTHING(10, 1500);

    int taxRate;
    int prise;
    ProductCategory(int taxRate, int prise){
        this.taxRate=taxRate;
        this.prise=prise;
    }
    public int calculateTax(){
        return prise*taxRate/100;
    }
}
//10. Определение рабочего времени по дням недели:
//Создайте enum Day с константами для всех дней недели.
//Добавьте поле isWorkingDay (логическое значение).
//Реализуйте метод isWorkingDay, который возвращает true для будних дней и false для выходных.
//example: System.out.println(Day.MONDAY.isWorkingDay()); // true
//         System.out.println(Day.SUNDAY.isWorkingDay()); // false
enum Day1{
    MONDAY(true),
    TUESDAY(true),
    WENDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);
    boolean isWorkingDay;

    Day1(boolean isWorkingDay){
        this.isWorkingDay=isWorkingDay;
}
public  boolean isWorkingDay(){
        return isWorkingDay;
}
}
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
    //4.
    public  static void  path(Direction direction){
        System.out.println("Вы движетесь на " + direction);
    }
    //5.
    public static void  acceptsString(Status status){

    }




    public static void main(String[] args) {
        //1.
        printDay(Day.MONDAY);
        //2.
        System.out.println(sezon(Season.SUMMER));
        //3.
        for (Difficulty complexity:Difficulty.values() ) {
            System.out.println(complexity + " ");
        }
        //4.
        path(Direction.EAST);
        //5.
        String startString ="PROcESSING";
        Status status=Status.valueOf(startString.toUpperCase());
        System.out.println(status);
        //6.
        Priority a1,a2,a3;
        a1=Priority.MEDIUM;
        a2=Priority.LOW;
        a3=Priority.HIGH;
        System.out.println(a1.ordinal());
        System.out.println(a2.ordinal());
        System.out.println(a3.ordinal());
        System.out.println();
        //7.
        for (Months  bust: Months.values()){
            System.out.println(bust);
        }
        //8.
        Season1 season1=Season1.FALL;
//        System.out.print(season1.toString()+ " ");
        System.out.println(season1.name() + " " + season1.getDescription());
        //9.
        ProductCategory productCategory=ProductCategory.CLOTHING;
        System.out.println(productCategory.name() + " налог соствил " + productCategory.calculateTax());
        //10.
        Day1 day1=Day1.SATURDAY;
        System.out.println(day1.name() + " " + day1.isWorkingDay);
    }
}