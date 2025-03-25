public class Employee extends Person{//Сотрудник(Employee) наследуется от класса Person
    Employee(String name, int age, String email, String phone) {
        super(name, age, email, phone);
    }
    //Реализуйте метод для вывода номера телефона (доступен только внутри пакета).
  public void displayPhone(){
      System.out.println(this.phone);
  }
}
