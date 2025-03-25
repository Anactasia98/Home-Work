public class Person {
    //////////////////////////////////////////////////////////////////////////////
    private  String name;
    public void setName(String userName){
        if (isHasNum(userName)) {
            System.out.println("Обшибка! Имя может содержать только буквы.");
        } else if (userName.isEmpty()) {
            System.out.println("Обшибка! Вы не ввели имя.");
        } else {
            name = userName;
        }
    }
    public String getName(){
        return name;
    }

    //////////////////////////////////////////////////////////////////////////////
    int age;//default

    public void setAge(int userAge){
        if (age<0){
            System.out.println("Обшибка! Некорректный ввод данных");
        }
        age=userAge;
    }
    public int getAge(){
        return age;
    }


    //////////////////////////////////////////////////////////////////////////////
    public String email;

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }



    //////////////////////////////////////////////////////////////////////////////
    protected String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    //////////////////////////////////////////////////////////////////////////////

    private static boolean isHasNum(String string) {
        return !string.chars().allMatch(Character::isLetter);
    }
      Person(){

   }
    Person(String name,int age,String email,String phone){
        this.name=name;
        this.age=age;
        this.email=email;
        this.phone=phone;
    }
    public void displayInfo(){
        System.out.println("name:  " + name + "\nage:" +  age + "\nemail: " +email+ "\nphone:" + phone);
    }


}


