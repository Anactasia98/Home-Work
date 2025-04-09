//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


//Realizovat Dynamic Array

// +  1 add(T value)
// +  2 add(int index , T value)
// +  3 size()
// +  4 get(int index)
// +  5 clear()
// +  6 remove(T value)
// -  7 remove(int index)

class MyList {
    String[] arr;

    public MyList() {
        arr = new String[0];
    }

    public void add(String value) {
        String[] tmp = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        tmp[arr.length] = value;
        arr = tmp;
    }

    public void addIndex(int index, String value){
        String[] tmp = new String[arr.length + 1];
        for (int i = 0, j=0; i < arr.length; i++,j++) {
            if (i<index){
                tmp[j] = arr[i];
            } else if (i==index) {
                tmp[j]=value;
                j++;
            }
                tmp[j] = arr[i];

        }
        arr = tmp;
    }

    public  int size(){
        return arr.length;
    }

    public String get(int index){
        for (int i = 0; i < arr.length; i++) {
            if (i==index){
                return arr[i];
            }
        }
        return "Индекс указан не верно";
    }
    public void clear(){
        String[] tmp = new String[0];
        for (int i = 0; i < arr.length; i++) {
            arr=tmp;
        }
    }
public boolean removeIndex(int index){
    boolean searchIndex=false;
    for (int i = 0; i < arr.length; i++) {
        if (i==index){
            searchIndex=true;
        }
    }
    if (searchIndex){
        String[] tmp = new String[arr.length - 1];
        for (int i = 0, j = 0; i < tmp.length; j++) {
            if (j == index) {
                continue;
            } else {
                tmp[i] = arr[j];
                i++;
            }
        }
        arr = tmp;
        return true;
    }
        return false;
}
    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }


    public boolean remove(String value) {
    int index = -1;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i].equals(value)) {
            index = i;
            break;
        }
    }
    if (index != -1) {
        String[] tmp = new String[arr.length - 1];
        for (int i = 0, j = 0; i < tmp.length; j++) {
            if (j == index) {
                continue;
            } else {
                tmp[i] = arr[j];
                i++;
            }
        }
        arr = tmp;
        return true;
    }
    return false;
}
}


public class Main {
    public static void main(String[] args) {

        MyList myList = new MyList();
        myList.add("Nasty");
        myList.add("Oleca");
        myList.add("Tany");
        myList.add("Lev");
//        System.out.println("Udalil? ->" + (myList.remove("Oleca")));
       myList.addIndex(1,"Cergei");
        myList.print();
        System.out.println("Длинна MyList:  " + myList.size());
        System.out.println(myList.get(20));
//        myList.clear();
//        myList.print();
        System.out.println("Udalil? ->" + (myList.removeIndex(10)));
        myList.print();
    }
}