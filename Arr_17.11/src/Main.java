import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//        1) Найдите и выведите количество положительных и отрицательных чисел в массиве.
//        int []arr = {4,6,-5,8,66,-84,35};
//         int countPoloj=0;
//         int countOtrich=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]<0){
//                countOtrich++;
//            }else
//                countPoloj++;
//        }
//        System.out.println("количество положительных: " + countPoloj);
//        System.out.println("количество отрицательных: " + countOtrich);

//        2) Подсчет нулей: Создайте массив из 20 чисел, заполните его случайными числами , и подсчитайте, сколько в нем нулей.
//        int []arr=new int[20];
//        Random random=new Random();
//        int countNul=0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= random.nextInt(-10,10);
//            System.out.print(arr[i] + " ");
//            if (arr[i]==0){
//                countNul++;
//            }
//        }System.out.println();
//        System.out.print("Количество нулей: " + countNul);

//         3) Поиск элементов, равных индексу: Найдите все элементы массива, значения которых равны их индексам.
//        int[]arr={1,-2, 2,4,3,-9,6,85,-55,65};
//        int countIndex=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==i){
//                countIndex++;
//            }
//        }
//        System.out.print("значения элементов массива равных их индексам: " + countIndex);

//        4) Удаление элементов: Создайте массив из 15 чисел, замените все отрицательные числа на нули.
//        int[]arr={1,-2, 2,4,3,-9,6,85,-55,65, 48,35,49,-5,88};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]<0){
//                arr[i]=0;
//            }
//            System.out.print(arr[i] + " ");
//        }

//        5) Дублирование массива: Создайте массив из 15 чисел,а потом каждый элемент удвойти.
//        int[]arr={1,-2, 2,4,3,-9,6,85,-55,65, 48,35,49,-5,88};
//        for (int i = 0; i < arr.length; i++) {
//           arr[i]+=arr[i];
//            System.out.print(arr[i] + " ");
//        }

//        6) Подсчет элементов, больших предыдущих: Определите количество элементов массива, которые больше предыдущего элемента.
//        int[]arr={1,-2, 2,4,3,-9,6,85};
//        int countBolch=0;
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i]<arr[i+1]){
//                countBolch++;
//            }
//        }
//        System.out.println("количество элементов больше предыдущего элемента: " + countBolch);

//        7) Произведение элементов: Найдите произведение всех элементов массива, кроме нулевых.
//        int[]arr={-1,-2, 2,0,4};
//        int proizved=1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]!=0){
//                proizved=arr[i]*proizved;
//            }
//        }
//        System.out.println("произведение всех элементов массива: " + proizved);


//        8) Сравнение крайних элементов: Определите, больше ли сумма первых пяти элементов массива, чем сумма последних пяти.
//        int[]arr={-12,82, 2,0,4,456,8,2,4,7,58,4,65,1,3};
//        int sum1=0;
//        int sum2=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (i<5){
//                sum1+=arr[i];
//            }
//            if (arr.length-5<= i){
//                sum2+=arr[i];
//            }
//        }
//        System.out.println(sum1 + ">" + sum2 + "?");
//        boolean cpavnenie = true;
//        if (sum1>sum2){
//            System.out.println(cpavnenie);
//        }else
//            System.out.println(!cpavnenie);

//        9) Поиск двух наименьших элементов: Найдите два наименьших элемента в массиве из 10 чисел.
//        int[]arr={-12,82, 2,0,4,456,8,2,4,7};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i]<arr[j]){
//                    int tmp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=tmp;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        System.out.print("два наименьших элемента в массиве " + arr[0] + " " + arr[1]);

//        10) Проверка на упорядоченность: Определите, отсортирован ли массив по возрастанию.
//        int[] arr ={45, 220, 251, 995};
//        boolean isOk = true;
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i]>arr[i+1]){
//               isOk=!isOk;
//               break;
//            }
//        }
//        System.out.println("Массив упорядочен : " + isOk);

//        11) Проверка на упорядоченность: Определите, отсортирован ли массив по убыванию
//        int[] arr ={544, 500, 290, 250 , 150 ,60 ,36, 22};
//        boolean isOk = true;
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i]<arr[i+1]){
//                isOk=!isOk;
//                break;
//            }
//        }
//        System.out.println("Массив упорядочен : " + isOk);

////////////////        12) Частота элементов: Подсчитайте, сколько раз каждое число встречается в массиве.ПОДУМАТЬ!
//           int []arr={5,4,5,8,9,51,3,5,5};

//        13) Инвертирование знаков: Замените все положительные числа в массиве на отрицательные, и наоборот.
//        int[] arr ={544, 500, -290, 250 , -150 ,60 ,36, -22};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]<0){
//                arr[i]=arr[i]* (-1);
//            }else if (arr[i]>0) {
//                arr[i]=arr[i]* (-1);
//            }
//            System.out.print(arr[i] + " ");
//        }
//        14) Замена элементов на чётные индексы: Замените все элементы на чётных индексах на их квадрат.

//        int[] arr ={4, 5, 9, 20 , 50 ,60 ,3, 2};
//        for (int i = 0; i < arr.length; i++) {
//            if (i%2==0 && i!=0){
//                arr[i]*=arr[i];
//            }
//            System.out.print(arr[i] + " ");
//        }
//        15) Сумма элементов на чётных индексах: Найдите сумму элементов, расположенных на чётных индексах массива.

//        int[] arr ={4, 5, 9, 20 , 50 ,60 ,3, 2};
//       int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (i%2==0 && i!=0){
//                sum+=arr[i];
//            }
//        }
//        System.out.print(sum + " ");

//        16) Замена минимального элемента на 100: Замените минимальный элемент из массива.
//        int[] arr = {4, 5, 9, 20, 50, 0, 3, 2};
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//                arr[i] = 100;
//            }
//            System.out.print(arr[i] + " ");
//        }

//        17) Обратный порядок массива: Распечатайте массив наоборот
//        int[] arr = {4, 5, 9, 20, 50, 0, 3, 2};
//        for (int i = arr.length-1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//            }


//        18) Замена элементов на индекс: Замените все элементы массива на их индекс.
//        int[] arr = {4, 5, 9, 20, 50, 0, 3, 2};
//        for (int i = 0; i < arr.length; i++) {
//                arr[i] = i;
//            System.out.print(arr[i] + " ");
//        }
//        19) Сумма положительных элементов: Найдите сумму всех положительных элементов массива.
//        int[] arr = {4, -5, 9, -20, 50, 0, -3, 2};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>0) {
//              sum+=arr[i];
//            }
//        }
//        System.out.print(sum + " ");
//
//        20) Поиск последнего отрицательного элемента: Найдите последний отрицательный элемент в массиве и замените его на 0.
//        int[]arr={-12,-82, 2,0,4,456,8,2,4,7};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i]<arr[j]){
//                    int tmp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=tmp;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[0]<0 ) {
//                arr[0] = 0;
//            }
//            System.out.print(arr[i] + " ");
//        }

//        21) Удвоение элементов на нечётных индексах: Умножьте все элементы на нечётных индексах на 2.
//        int[] arr = {4, -5, 9, -20, 50, 0, -3, 2};
//        for (int i = 0; i < arr.length; i++) {
//            if (i%2!=0) {
//              arr[i]=arr[i]*2;
//            }
//            System.out.print(arr[i] + " ");
//        }


//        22) Замена максимального элемента на минимальный: Найдите максимальный элемент массива и замените его на минимальный.
//        int[] arr = {45, 0, 21, 995, 4, 85};
//        int max = arr[0];
//        int min = arr[0];
//        int maxIndex=0;
//        int minIndex=0;
//        int tmp = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                maxIndex=i;
//            }
//            if (arr[i] < min) {
//                min = arr[i];
//                minIndex=i;
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);
//          if(max==min){
//              System.out.print(Arrays.toString(arr));
//          }else {
//            tmp = arr[maxIndex];
//              arr[maxIndex] = arr[minIndex];
//        System.out.print(Arrays.toString(arr));
//    }

//        23) Замена элементов, делящихся на 2 и 3: Замените в массива все элементы, которые делятся на 2 и на 3 на число 100.
//        int[] arr = {45, 0, 21, 995, 6, 85};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]%2==0 && arr[i]%3==0 ){
//                arr[i]=100;
//            }
//            System.out.print(arr[i]+ " ");
//        }
//        24) Количество элементов, больших среднего арифметического: Подсчитайте количество элементов, которые больше среднего арифметического массива.
//        int[] arr ={45, 220, 251, 95, 297, 85};
//          int sum=0;
//          int arithmetic=0;
//          int countArifm=0;
//          for (int i=0; i<arr.length;i++){
//              sum+=arr[i];
//          }
//          arithmetic=sum/arr.length;
//          System.out.println("Среднее арифметическое " + arithmetic);
//          for (int i=0; i<arr.length;i++){
//              if (arr[i]>arithmetic){
//                 countArifm++;
//              }
//          }
//          System.out.println("Больше среднего арифметического " + countArifm);

//        25) Нахождение индекса максимального элемента: Найдите индекс максимального элемента в массиве.
//        int[] arr = {45, 0, 21, 995, 4, 85};
//        int max = arr[0];
//        int maxIndex=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                maxIndex=i;
//            }
//        }
//        System.out.println("максимальный элемент: " + max);
//        System.out.println("индекс максимального элемента в массиве: " + maxIndex);

    }
}