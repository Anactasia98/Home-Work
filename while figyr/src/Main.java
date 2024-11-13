import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int star=7;
//        System.out.println("Прямоугольник while");
//      int i = 0;
//      while (i <star ){
//          i++;
//          int j = 0;
//            while ( j < 5) {
//                j++;
//                System.out.print(" *" );
//            }
//            System.out.println();
//        }

//        System.out.println("Прямоугольник  do while");

//        int i = 0;
//        do {
//            int j = 0;
//            do {
//                System.out.print(" *");
//            }
//            while (j++ < 5);
//            System.out.println();
//        }
//        while (i++ < star);
//
//        System.out.println("Прямоугольник контур");
//
//        for (int i = 0; i <star ; i++) {
//            for (int j = 0; j < 5; j++) {
//              if (i==0 || i==star-1 || j==0 || j==5-1) {
//                  System.out.print(" *");
//              }else
//                  System.out.print("  ");
//            }
//            System.out.println();
//        }

//        System.out.println("Треугольик с прямым углом");
//
//        for (int i = 0; i < star; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//
//        System.out.println("Треугольик с прямым углом While ");
//        int i = 0;
//        while (i < star)  {
//
//            int j = 0;
//            while (j < i+1)   {
//                j++;
//                System.out.print(" *");
//            }
//                System.out.println();
//            i++;
//        }


//        System.out.println("Треугольик с прямым углом  do While ");
//        int i = 0;
//        do {
//            int j = 0;
//            do {
//                System.out.print(" *");
//            }
//            while (j++ < i);
//            System.out.println();
//        }
//        while (i++ < star);


        //        System.out.println("Треугольик с прямым углом контур ");
//     int i = 0;
//     while (i < star)  {
//           int j = 0;
//          while (j < i+1)  {
//                if (i==0 || i==star-1 || j==0 || j==i) {
//                    System.out.print(" *");
//                }else
//                    System.out.print("  ");
//             j++;
//                }
//
//            System.out.println();
//            i++;
//        }

//        System.out.println("Перевернутый треугольик с прямым углом while");
//
//        int i=0;
//        while (i<star){
//          int j=0;
//          while (j<star-i){
//              System.out.print(" *");
//              j++;
//          }
//            System.out.println(" ");
//            i++;
//        }

//        System.out.println("Перевернутый треугольик с прямым углом  do while");
//        int i=0;
//        do {
//            int j=0;
//            do {
//                System.out.print(" *");
//            }while (j++<star-i);
//            System.out.println(" ");
//        }while (i++<star);

//        System.out.println("Перевернутый треугольик с прямым углом  контур");
//
//        for (int i = 0; i < star; i++) {
//            for (int j = 0; j <star-i; j++) {
//                if (i == 0 || i == star - 1 || j == 0 || j==star-i-1) {
//                    System.out.print(" *");
//                }else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }


//        System.out.println("косая линия вниз while");
//        int i=0;
//        while (i<star){
//            int j=0;
//            while (j<i+1){
//                System.out.print(" ");
//                j++;
//            }
//            System.out.println("*");
//            i++;
//        }

//        System.out.println("косая линия вниз  do while");
//        int i=0;
//        do {
//            int j=0;
//            do {
//                System.out.print(" ");
//            }while (j++<i+1);
//            System.out.println("*");
//        }while (i++<star);




//        System.out.println("косая линия вверх while");
//        int i=0;
//        while (i < star) {
//            int j=0;
//            while (j <star-i){
//                System.out.print(" ");
//                j++;
//            }
//            System.out.println("*");
//            i++;
//        }

//        System.out.println("косая линия вверх  do while");
//        int i=0;
//        do {
//            int j=0;
//            do {
//                System.out.print(" ");
//            }while (j++<star-i);
//            System.out.println("*");
//        }while (i++<star);
//

//        System.out.println("треугольник while");
//        int i=0;
//        while (i<star){
//            int j=0;
//            while (j<star-i){
//                System.out.print(" ");
//                j++;
//            }
//            int k=0;
//            while (k<i+1){
//                System.out.print(" *");
//                k++;
//            }
//            System.out.println();
//            i++;
//        }

//        System.out.println("треугольник do while");
//        int i=0;
//        do {
//
//            int j=0;
//            do {
//                System.out.print(" ");
//            }while (j++<star-i);
//
//            int k=0;
//            do {
//                System.out.print(" *");
//            }while (k++<i);
//
//
//            System.out.println();
//        }while (i++<star);


//        System.out.println("треугольник do while контур");
//        int i=0;
//        do {
//
//            int j=0;
//            do {
//                System.out.print(" ");
//            }while (j++<star-i);
//
//            int k=0;
//            do {
//                if (i==0 || i== star || k==0 || k==i){
//                    System.out.print(" *");
//                }else
//                    System.out.print("  ");
//            }while (k++<i);
//
//
//            System.out.println();
//        }while (i++<star);



        System.out.println("Ромб while контур");
        int i=0;
        while (i<star){
            int j=0;
            while (j<star-i){
                System.out.print(" ");
                j++;
            }
            int k=0;
            while (k<i+1){
                if (i==0 || k==0 || k==i){
                    System.out.print(" *");
                }else
                    System.out.print("  ");
                k++;
            }
            System.out.println();
            i++;
        }
        int i1=0;
        while (i1<star-1){
            int j1=0;
            while (j1<i1+2){
                System.out.print(" ");
                j1++;
            }

            int k1=0;
            while (k1<(star-1)-i1){
                if (  k1==0 || k1==(star-1)-i1-1){
                    System.out.print(" *");
                }else
                    System.out.print("  ");
                k1++;
            }
            System.out.println();
            i1++;
        }

//

//        System.out.println("Ромб do while");
//
//        int i=0;
//        do {
//
//            int j=0;
//            do {
//                System.out.print(" ");
//            }while (j++<star-i);
//
//            int k=0;
//            do {
//                System.out.print(" *");
//            }while (k++<i);
//
//
//            System.out.println();
//        }while (i++<star);
//
//        int i1=0;
//        do {
//            int j1=0;
//            do {
//                System.out.print(" ");
//            }while (j1++<i1+1);
//            int k1=0;
//            do {
//                System.out.print(" *");
//            }while (k1++<(star-1)-i1);
//
//            System.out.println();
//        }while (i1++<star-1);


    }
}