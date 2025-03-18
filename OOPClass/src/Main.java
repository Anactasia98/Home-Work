//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задание 1
        Circle circle = new Circle(10);
        System.out.println(circle.calculateArea());
        //Задание 2
        Rectangle rectangle=new Rectangle(15,48);
        System.out.println(rectangle.calculatePerimeter());
        //Задание 3
        Student student=new Student("Nasty", 26);
        student.displayInfo();
        //Задание 4
        Car car=new Car("Renaut", 120);
        System.out.println(car.accelerate(20));
        //Задание 5
        Book book= new Book("Острие бритвы", "Сoмерсет Моэм:");
        book.getBookInfo();
        //Задание 6
        Point point= new Point(5,-4);
        point.move(7,-9);
        //Задание 7
        Person person= new Person("Nasty", "Daniliva");
        person.getFullName();
        //Задание 8
        Temperature temperature= new Temperature(37.2);
        temperature.toFahrenheit();
        temperature.toKelvin();
        //Задание 9
        Counter counter=new Counter();
        System.out.println(counter.decrement());
        System.out.println(counter.increment());
        System.out.println(counter.getCount());
        //Задание 10
        Time time=new Time(12,48);
        System.out.println(time.addMinutes(3254));

    }
}
//Задание 1
//Создайте класс Circle, который имеет:
//
//Поле radius (тип double).
//Конструктор для установки радиуса.
//Метод calculateArea(), который возвращает площадь круга.
class Circle{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return 3.14 * radius * radius;
    }
}
//Задание 2
//Создайте класс Rectangle, который имеет:
//
//Поля length и width (оба типа double).
//Конструктор для установки длины и ширины.
//Метод calculatePerimeter(), который возвращает периметр прямоугольника.
class Rectangle{
    double length;
    double width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public double calculatePerimeter(){
        return (length*2) + (width*2);
    }
}
//Задание 3
//Создайте класс Student, который имеет:
//
//Поля name (тип String) и age (тип int).
//Конструктор для установки имени и возраста.
//Метод displayInfo(), который выводит имя и возраст студента в консоль.
 class Student{
    String name;
    int age;
    public Student(String name, int age){
        this.age=age;
        this.name=name;
    }
    public void displayInfo(){
        System.out.println(name+ " " + age);
    }
}
//Задание 4
//Создайте класс Car, который имеет:
//
//Поля brand (тип String) и speed (тип int).
//Конструктор для установки бренда и начальной скорости.
//Метод accelerate(int increment), который увеличивает скорость на указанное значение.
class Car{
    String brand;
    int speed;
    public Car(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }
    public int accelerate(int increment){
       speed=speed+increment;
        return speed;
    }
}
//Задание 5
//Создайте класс Book, который имеет:
//
//Поля title (тип String) и author (тип String).
//Конструктор для установки названия книги и автора.
//Метод getBookInfo(), который возвращает строку с информацией о книге.
class Book{
    String  title;
    String author;
    public Book(String  title,String author){
        this.author=author;
        this.title=title;
    }
    public void getBookInfo(){
        System.out.println(author + " " + title);
    }
}
//Задание 6
//Создайте класс Point, который имеет:
//
//Поля x и y (оба типа int).
//Конструктор для установки координат точки.
//Метод move(int dx, int dy), который изменяет координаты точки на заданное смещение.
class  Point{
    int x;
    int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void move(int dx, int dy){
       x=x+dx;
       y=y+dy;
        System.out.println("x=" + x  +  "\ny=" + y);
    }

}
//Задание 7
//Создайте класс Person, который имеет:
//
//Поля firstName и lastName (оба типа String).
//Конструктор для установки имени и фамилии.
//Метод getFullName(), который возвращает полное имя человека.
class Person{
    String firstName;
    String lastName;
    public Person( String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public void  getFullName(){
        System.out.println(firstName + " " + lastName);
    }
}
//Задание 8
//Создайте класс Temperature, который имеет:
//
//Поле celsius (тип double).
//Конструктор для установки температуры в градусах Цельсия.
//Методы toFahrenheit() и toKelvin(), которые возвращают температуру в Фаренгейтах и Кельвинах соответственно.
class Temperature{
    double celsius;
    public Temperature(double celsius){
        this.celsius=celsius;
    }
    public void toFahrenheit(){
        System.out.println("F=" + celsius*1.8+32);
    }
    public void toKelvin(){
        System.out.println("K=" + celsius+273.15);
    }
}
//Задание 9
//Создайте класс Counter, который имеет:
//
//Поле count (тип int), изначально равное 0.
//Метод increment(), который увеличивает значение поля на 1.
//Метод decrement(), который уменьшает значение поля на 1.
//Метод getCount(), который возвращает текущее значение счетчика.
class Counter{
    int count=0;
//    public Counter(int count){
//        this.count=count;
//    }
    public int increment(){
        System.out.print("increment: ");
        return count+1;
    }
    public int decrement(){
        System.out.print("decrement: ");
        return count-1;
    }
    public int getCount(){
        System.out.print("getCount: ");
        return count;
    }
}
//Задание 10
//Создайте класс Time, который имеет:
//
//Поля hours и minutes (оба типа int).
//Конструктор для установки времени.
//Метод addMinutes(int minutes), который добавляет заданное количество минут к времени и корректно обновляет часы.
class  Time{
    int hours;
    int minutes;
    public Time(int hours,int minutes){
        this.hours=hours;
        this.minutes=minutes;
    }
    public int addMinutes(int minutesAdd){
      int countHours=0;
        int newMinutes=minutes+minutesAdd;
        if (newMinutes>59){
            countHours=newMinutes/60;
            hours=hours+countHours;
            minutes= newMinutes-60*countHours;
            if (hours>23){
                hours=hours/24;
            }
        }
        System.out.print(hours + ":");
        return minutes;
    }
}