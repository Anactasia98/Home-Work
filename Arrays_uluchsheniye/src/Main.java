//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Создаем один массив arr и работаем с ним

                int []arr={1,2,3,4,5,6,7,8,9,10};

        //        1) Создайте массив из 10 целых чисел и заполните его числами от 1 до 10. Выведите массив на экран.
//        8) Выведите все элементы массива в обратном порядке.
//        10)Поменяйте местами первый и последний элементы массива.
        System.out.print("Выведите массив на экран: ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.print("Выведите массив на экран в обратном порядке: ");
        for (int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Поменяла местами первый и последний элементы массива: " );
        int k=arr[0];
        for (int i=0;i< arr.length;i++){
            arr[0]= arr[arr.length-1];
           arr[arr.length-1]=k;
            System.out.print( + arr[i] + " ");
        }
        System.out.println();

//        2) Найдите сумму элементов массива. Создайте массив из 5 элементов и вычислите сумму всех чисел в массиве.
//        7) Посчитайте среднее арифметическое всех элементов массива.
//        12)Посчитайте количество элементов, больше среднего арифметического.
       int sum=0;
        int arifmetic=0;
        int count=0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
            arifmetic=sum/ arr.length;
        }
        for (int i = 0; i < arr.length ; i++) {
            if (arifmetic<arr[i]){
                count++;
            }
        }
        System.out.print("сумма всех чисел в массиве " + sum + "\n");
        System.out.print("среднее арифметическое " + arifmetic + "\n");
        System.out.println("количество элементов, больше среднего арифметического: " + count);

//        3) Найдите максимальный элемент массива. Создайте массив из 10 целых чисел и найдите максимальное значение.
//        4) Найдите минимальный элемент массива. Создайте массив из 10 целых чисел и найдите минимальное значение.
//        11)Найдите разницу между максимальным и минимальным элементами массива.
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max=" + max);
        System.out.print("Min=" + min + "\n");
        System.out.print("разницу между максимальным и минимальным=" + (max-min)+ "\n");

//        5) Посчитайте количество чётных чисел в массиве
//        6) Посчитайте количество нечётных чисел в массиве.
        int countcht=0;
        int countnecht=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]%2==0){
                countcht++;
            }
            if (arr[i]%2!=0){
                countnecht++;
            }
        }
        System.out.print("Количество чётных чисел " + countcht +"\n" );
        System.out.print("Количество чётных чисел " + countnecht + "\n");

//        9) Заполните массив случайными числами от 1 до 100 и выведите его на экран.
//        int []arr=new int[20];
//        Random random=new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= random.nextInt(1,101);
//            System.out.print(arr[i] + " ");
//        }


//        13)Создайте массив и заполните его квадратами чисел от 1 до 10.
        System.out.print("заполните массив квадратами чисел : ");
        for (int i=0;i< arr.length;i++){
           arr[i]=arr[i]*arr[i];
            System.out.print(arr[i] + " ");
        }
    }
}