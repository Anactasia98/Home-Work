import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Описание: Метод возвращает длину массива символов arr.
//Считает количество символов в массиве arr и возвращает это значение.
    public static int length(char[] arr){
int count=0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }
    //

//Описание:
//Метод возвращает символ, находящийся по указанному индексу в массиве.
//Берет массив символов и индекс index, проверяет, существует ли символ на этом месте. Если индекс корректен, возвращает символ.
    public static char charAt(char[]arr,int index){
        return arr[index];
    }
//
//
//Описание:
//Метод возвращает индекс первого вхождения символа simvol в массиве. Если символ не найден, возвращает -1.
//Проходит по массиву слева направо, ищет первый символ, совпадающий с simvol. Если символ найден, возвращает его индекс. Если нет, возвращает -1.
      public static int indexOf(char simvol, char[]arr){
          for (int i = 0; i <arr.length ; i++) {
              if (arr[i]==simvol){
                  return i;
              }
          }
        return -1;
      }
//
//
//
//Описание:
//Метод возвращает индекс последнего вхождения символа simvol в массиве. Если символ не найден, возвращает -1.
//Проходит по массиву справа налево, ищет последний символ, совпадающий с simvol. Если символ найден, возвращает его индекс. Если нет, возвращает -1.
public static int lastIndexOf(char simvol, char[]arr){
    for (int i = arr.length-1; i >=0 ; i--) {
        if (arr[i]==simvol){
            return i;
        }
    }
        return -1;
}
//
//
//
//Описание:
//Метод возвращает новый массив символов, где все буквы преобразованы в верхний регистр.
//Для каждой буквы в массиве проверяет, является ли она строчной (например, a-z). Если да, то заменяет её на соответствующую заглавную (например, A-Z).
//Если символ не является буквой, он остается неизменным.
public static char[] toUpperCase(char[] arr){
    for (int i = 0; i < arr.length; i++) {
         if (97<=arr[i] && arr[i]<=122){
             arr[i]-=32;

         }
    }
        return arr;
}

//Описание:
//Метод возвращает новый массив символов, где все буквы преобразованы в нижний регистр.
//Для каждой буквы в массиве проверяет, является ли она заглавной (например, A-Z). Если да, то заменяет её на соответствующую строчную (например, a-z).
//Если символ не является буквой, он остается неизменным.
public static char[] toLowerCase(char[] arr){
    for (int i = 0; i < arr.length; i++) {
        if (65<=arr[i] && arr[i]<=90){
            arr[i]+=32;
        }
    }
    return arr;
}
//
//
//;
//Метод возвращает новый массив символов, из которого удалены начальные и конечные пробелы.
//Удаляет все пробелы (символы ' ') с начала и конца массива.
//Пробелы внутри строки остаются неизменными.
public static char[] trim(char[] arr ){
//    String str = new String(new char[]{arr});
    int countL=0;
    int countR=0;
    for (int i = 0; i < arr.length; i++) {
       if (arr[i]==' '){
           countL++;
       } else {
           break;
       }
    }
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == ' ') {
                countR++;
            } else {
                break;
            }
        }

    char [] arr2= new char[arr.length-countL-countR];

    for (int i = countL,j=0; i < arr.length-countR; i++, j++) {
arr2[j]=arr[i];
    }
    return arr2;
}
    public static void main(String[] args) {
        String original="Nasty";
        char[]arr={'N','a','s','t','y'};
        System.out.println("Метод возвращает длину массива: " + length(arr));
        System.out.println("Метод возвращает символ: " + charAt(arr,4));
        System.out.println("Метод возвращает индекс первого вхождения: " + indexOf('s',arr));
        System.out.println("Метод возвращает индекс последнего вхождения: " + lastIndexOf('t',arr));
        arr=toUpperCase(arr);
        System.out.print("Метод возвращает новый массив символов, где все буквы преобразованы в верхний регистр :  " );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.print("Метод возвращает новый массив символов, где все буквы преобразованы в нижний регистр: " );
        arr=toLowerCase(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.print("Метод возвращает новый массив символов, из которого удалены начальные и конечные пробелы: ");
        String str="        Nasty Danilova         ";
        char[] array=str.toCharArray();
        char[]rezalt=trim(array);
        System.out.print(rezalt);




    }
}