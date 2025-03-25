//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

//Задание: Работа с модификаторами доступа в Java
//
//Создайте класс Person с полями: +
//
//name (строка, доступ к полю только внутри класса),private+
//age (целое число, доступ только из пакета),default+
//email (строка, доступ из любого места), public+
//phone (строка, доступ только наследникам класса).protected+
//Реализуйте в классе Person:+
//
//Конструктор, который инициализирует все поля.+
//Методы для получения значений всех полей (геттеры) с соблюдением их модификаторов доступа.+
//Метод displayInfo(), который выводит имя, возраст и email (может вызываться из любого места).+
//Создайте второй класс Employee, который наследуется от класса Person. В этом классе:
//
//Реализуйте метод для вывода номера телефона (доступен только внутри пакета).
//Напишите основной класс Main с методом main, в котором:
//
//Создайте объект класса Person.
//Попробуйте обратиться к каждому из полей напрямую и через методы (проверьте соблюдение модификаторов доступа).
//Создайте объект класса Employee и вызовите все доступные методы для проверки наследования и работы с полями.
        Person person=new Person();
        person.setName("Nasty");
        person.setAge(26);
        person.setEmail("@gmil.com");
        person.setPhone("89672523001");
        person.displayInfo();
        Employee employee=new Employee("Tany",46,"@yandex.ru","89602345001");
        employee.displayPhone();
        System.out.println(employee.getAge());

    }
}





