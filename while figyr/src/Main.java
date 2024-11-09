//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Прямоугольник");
        int star=7;
        for (int i = 0; i <star ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" *" );
            }
            System.out.println();
        }
        System.out.println("Треугольик с прямым углом");

        for (int i = 0; i < star; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("Перевернутый треугольик с прямым углом");


        for (int i = 0; i < star; i++) {
            for (int j = 0; j <star-i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("косая линия вниз");


        for (int i = 0; i < star; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.println("косая линия вверх");


        for (int i = 0; i < star; i++) {
            for (int j = 0; j <star-i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        System.out.println("треугольник");

        for (int i = 0; i < star; i++) {
            for (int j = 0; j <star-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j<i+1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("Ромб");

        for (int i = 0; i < star; i++) {
            for (int j = 0; j <star-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j<i+1; j++) {
                System.out.print(" *");
            }
            System.out.println();

        }
        for (int i =0; i<star-1; i++) {
            for (int j = 0; j <i+2 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(star-1)-i ; j++) {
                System.out.print(" *");
            }
            System.out.println();

        }
    }
}