
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//1. Простое наследование
//Создайте базовый класс Animal с атрибутом name. Создайте дочерний класс
// Dog, унаследуйте от Animal, и создайте объект класса Dog, передав ему имя.
//
class  Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName();
    }
}
//2. Добавление нового атрибута
//Создайте класс Vehicle с атрибутом brand. Создайте класс Car, который
// наследует Vehicle, и добавьте атрибут model. Создайте объект Car и установите оба атрибута.
//
class Vehicle{
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Vehicle(String brand) {
        this.brand = brand;
    }
}
class Car extends Vehicle{
     private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public Car(String brand) {
        super(brand);
    }

    @Override
    public String toString() {
        return "model: " + model + "\nbrand: " + getBrand();
    }
}
//3. Наследование с использованием метода базового класса
//Создайте класс Person с методом introduce(), который выводит строку
// "I am a person". Создайте класс Student, который наследует Person, и создайте объект Student.
// Вызовите метод introduce().
//
class  Person{
    public void introduce(){
        System.out.println("I am a person");
    }
}
class  Student extends Person{
    private String Stident;

}
//4. Добавление метода в дочерний класс
//Создайте класс Bird с атрибутом species(разновидность). Создайте класс Penguin,
// который наследует Bird, и добавьте метод swim(), который выводит "I can swim".
//
class  Bird{
    private String  species;

}
class Penguin extends Bird{
    public void swim(){
        System.out.println("I can swim");
    }
}
//5. Наследование с использованием конструктора
//Создайте класс Shape с атрибутом color, который задается через
// конструктор. Создайте класс Rectangle, который наследует Shape, и создайте объект Rectangle с указанием цвета.
//
class  Shape{
    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(String color) {
        this.color = color;
    }
}
class Rectangle extends  Shape{

    public Rectangle(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return color;
    }
}
//6. Создание нескольких дочерних классов
//Создайте класс Animal. Затем создайте два дочерних класса:
// Dog и Cat. В каждом из них добавьте уникальный атрибут, например, breed для собак и color для кошек.
//
class Animal1{
}
class Dog1 extends Animal1{
    private String breed;
}
class Cat extends Animal1{
    private String color;
}
//7. Наследование с передачей значений в конструктор
//Создайте класс Appliance с атрибутом brand. Создайте класс
// WashingMachine, который наследует Appliance, и установите
// значение для атрибута brand при создании объекта.
//
class Appliance{
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Appliance(String brand) {
        this.brand = brand;
    }
}
class WashingMachine extends Appliance{

    public WashingMachine(String brand) {
        super(brand);
    }
}
//8. Создание цепочки наследования
//Создайте класс LivingBeing с атрибутом type (например, "Living").
// Создайте класс Animal, наследующий LivingBeing, и добавьте атрибут species. Создайте класс Mammal,
// который наследует Animal, и добавьте атрибут name.
//
class  LivingBeing{
    private  String type;

}
class Animal3 extends LivingBeing{
    private  String species;
}
class Mammal extends Animal3{
    private  String name;
}
//9. Дочерний класс с дополнительным методом
//Создайте класс Device с атрибутом name. Создайте класс Phone,
// который наследует Device, и добавьте метод make_call(), который выводит "Calling...".
class  Device{
    private  String name;
}
class Phone extends Device{
    public void make_call(){
        System.out.println("Calling subscriber mom");
    }
}
public class Main {
    public static void main(String[] args) {
        //1.
        Dog dog=new Dog("Lagerta");
        System.out.println("class Dog: "+ dog);
        //2.
        Car car=new Car("Renaut", "Logan");
        System.out.println(car);
        //3.
        Student student=new Student();
        student.introduce();
        //4.
        Penguin penguin=new Penguin();
        penguin.swim();
        //5.
        Rectangle rectangle= new Rectangle("red");
        System.out.println(rectangle);
        //9.
        Phone phone=new Phone();
        phone.make_call();
    }
}