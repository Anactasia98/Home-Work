//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


//1. Базовое задание: Абстрактный класс
//Создайте абстрактный класс Shape с методом calculateArea().
// Реализуйте два наследника: Circle и Rectangle. В классе Circle метод должен вычислять
// площадь круга, а в Rectangle — площадь прямоугольника.
//
abstract class Shape{
   public abstract void calculateArea();
}
class Circle extends Shape{
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void calculateArea() {
        System.out.println("площадь круга: "+ 3.14*r*r);
    }
}
class Rectangle extends Shape{
    int num1;
    int num2;

    public Rectangle(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void calculateArea() {
        System.out.println("площадь прямоугольника: " + num1*num2);
    }
}
//2. Интерфейс для животных
//Создайте интерфейс Animal с методами:
//
//makeSound()сделать звук
//move()двигаться
//Создайте классы Dog и Bird, которые реализуют этот интерфейс.
// Реализуйте методы так, чтобы собака лаяла, а птица пела.
//
interface Animal{
    void makeSound();
    void move();
}
class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Dod gaw gaw");
    }

    @Override
    public void move() {
        System.out.println("Dod run");
    }
}
class Bird implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Bird chiric chiric");
    }

    @Override
    public void move() {
        System.out.println("Bird fly");
    }
}
//3. Абстрактный класс + интерфейс
//Создайте абстрактный класс Vehicle с методом startEngine().
// Добавьте интерфейс Flyable с методом fly(). Реализуйте два класса:
//
//Car (наследует Vehicle)
//Plane (наследует Vehicle и реализует Flyable).
abstract class Vehicle{
     private void startEngine() {
    }
}
interface  Flyable{
    void fly();
}
class Car extends Vehicle{
}
class  Plane implements Flyable {
    public void fly(){
        System.out.println("Fly");
    }
}
//4. Список сотрудников
//Создайте абстрактный класс Employee с методами
// getSalary()получение зарплаты
// и getRole() получить роль
// Реализуйте два класса:
//Manager менеджер
//Developer разработчик
//Каждый класс должен возвращать свою зарплату и роль.
//
abstract  class Employee{
  void getSalary(){

  }
  void getRole(){

  }
}
class Manager extends Employee{
    @Override
    void getRole() {
        System.out.println("Manager: Управление организацией");
    }

    @Override
    void getSalary() {
        System.out.println("Manager: зарплата 45,000");
    }
}
class Developer extends Employee{
    @Override
    void getRole() {
        System.out.println("Developer: Разработка программ");
    }

    @Override
    void getSalary() {
        System.out.println("Developer: зарплата 150,000");
    }
}
//5. Управление устройствами
//Создайте интерфейс Switchable с методами turnOn() и turnOff(). Реализуйте классы:
//
//LightBulb Лампочка
//Fan
//Каждый класс должен менять свое состояние (включено/выключено).
//
interface Switchable{
    void turnOn();
    void turnOff();
}
class LightBulb implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Лампочка включена");
    }

    @Override
    public void turnOff() {
        System.out.println("Лампочка выключена");
    }
}
class Fan implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Вентилятор включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Вентилятор выключен");
    }
}
//6. Геометрические фигуры
//Создайте интерфейс Drawable с методом draw(). Реализуйте классы:
//
//Circle
//Square
//Метод draw() должен выводить текстовое описание фигуры (например, "Рисуем круг").
//
interface Drawable{
    void draw();
}
class Circle1 implements Drawable{

    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }
}
class Square implements Drawable{

    @Override
    public void draw() {
        System.out.println("Рисуем kвадрат");
    }
}
//7. Работа с базой данных
//Создайте интерфейс Database с методами:
//
//connect()
//disconnect()
//Реализуйте классы:
//
//MySQLDatabase
//PostgreSQLDatabase
//Каждый класс должен выводить сообщения о подключении и отключении.
//
interface Database{
    void connect();
    void disconnect();
}
class MySQLDatabase implements Database{

    @Override
    public void connect() {
        System.out.println("MySQLDatabase подключено");
    }

    @Override
    public void disconnect() {
        System.out.println("MySQLDatabase отключено");
    }
}
class PostgreSQLDatabase implements Database{

    @Override
    public void connect() {
        System.out.println("PostgreSQLDatabase подключено");
    }

    @Override
    public void disconnect() {
        System.out.println("PostgreSQLDatabase отключено");
    }
}
//8. Спортивные соревнования
//Создайте интерфейс Athlete с методами:
//
//run()
//jump()
//Реализуйте классы:
//
//Runner
//Jumper
//Каждый класс должен реализовать соответствующие методы.
//
interface Athlet{
    void run();
    void  jump();
}
class Runner implements Athlet{

    @Override
    public void run() {
        System.out.println("Runner бежит");
    }

    @Override
    public void jump() {

    }
}
class Jumper implements Athlet{

    @Override
    public void run() {

    }

    @Override
    public void jump() {
        System.out.println("Jumper прыгает");
    }
}
//9. Магазин
//Создайте абстрактный класс Product с методами:
//
// создать два абстарактных метода не птать с гетои сетом getPrice()
//getName()
//Создайте классы Electronics и Clothing, которые наследуют Product и реализуют методы.
//
abstract class Product{
    abstract void getPrice();
    abstract void getName();
}
class Electronics extends Product{
    @Override
    void getName() {
        System.out.println("Стиральная машина: ");
    }
    @Override
    void getPrice() {
        System.out.println("54,000");
    }
}
class Clothing extends Product{
    @Override
    void getName() {
        System.out.println("Юбка: ");
    }
    @Override
    void getPrice() {
        System.out.println("4500");
    }
}
//10. Зоопарк
//Создайте абстрактный класс Animal с методами:
//
//eat()
//sleep()
//Добавьте интерфейс SoundMaker с методом makeSound(). Реализуйте классы:
//
//Lion
//Elephant
//Каждое животное должно реализовать свои звуки, приемы пищи и сон.
abstract class  Animal1{
    void eat(){

    }
    void sleep(){

    }

}
interface SoundMaker{
void makeSound();
}
class Lion extends Animal1 implements SoundMaker{

    @Override
    public void makeSound() {
        System.out.println("rrr rrr");
    }
    @Override
    public void eat() {
        System.out.println("Meat");
    }
    @Override
    public void sleep() {
        System.out.println("Lion sleeps");
    }
}
class Elephant extends Animal1 implements SoundMaker{

    @Override
    public void makeSound() {
        System.out.println("uuuu uuuu");
    }
    @Override
    public void eat() {
        System.out.println("Fruits");
    }
    @Override
    public void sleep() {
        System.out.println("Elephant sleeps");
    }
}
public class Main {
    public static void main(String[] args) {
        //1.
        Circle circle = new Circle(25);
        circle.calculateArea();
        Rectangle rectangle = new Rectangle(48, 2);
        rectangle.calculateArea();
        //2.
        Dog dog=new Dog();
        dog.makeSound();
        dog.move();
        Bird bird=new Bird();
        bird.makeSound();
        bird.move();
        //3.
        Plane plane=new Plane();
        plane.fly();
        //4.
       Manager manager=new Manager();
       manager.getRole();
       manager.getSalary();
        Developer developer=new Developer();
        developer.getRole();
        developer.getSalary();
        //5.
        LightBulb lightBulb=new LightBulb();
        lightBulb.turnOff();
        lightBulb.turnOn();
        Fan fan=new Fan();
        fan.turnOff();
        fan.turnOn();
        //6.
        Circle1 circle1=new Circle1();
        circle1.draw();
        Square square=new Square();
        square.draw();
        //7.
        MySQLDatabase mySQLDatabase=new MySQLDatabase();
        mySQLDatabase.connect();
        mySQLDatabase.disconnect();
        PostgreSQLDatabase postgreSQLDatabase=new PostgreSQLDatabase();
        postgreSQLDatabase.connect();
        postgreSQLDatabase.disconnect();
        //8.
        Runner runner=new Runner();
        runner.run();
        Jumper jumper=new Jumper();
        jumper.jump();
        //9.
        Electronics electronics=new  Electronics();
        electronics.getName();
        electronics.getPrice();
        Clothing clothing=new Clothing();
        clothing.getName();
        clothing.getPrice();
        //10.
        Lion lion= new Lion();
        lion.eat();
        lion.sleep();
        lion.makeSound();
        Elephant elephant =new Elephant();
        elephant.eat();
        elephant.sleep();
        elephant.makeSound();

    }
}