import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static   char[] board= {' ',' ',' ',
                                  ' ',' ',' ',
                                  ' ',' ',' '};
    static void pechetayetArr(){ //метод печатает доску
        for (int i = 0; i < board.length; i++) {
            if (i==3 || i==6){
                System.out.print("\n------");
            }
            if (i==3 || i==6 ) {
                System.out.println();
            }
            System.out.print(board[i] + "|");
        }
        System.out.println();
    }

    public static boolean curentPlayerTurn(char player){ //текущий ход игрока
        System.out.println("Ваш ход  . Выберите позицию от (1-9) : ");
        int position = scanner.nextInt() - 1;

        if (position<0 || position >= 9 || board[position] != ' '){
            System.out.println("Вы сделали не верный ход попробуйте снова.");
            return curentPlayerTurn(player);
        }

        board[position] = player;


        if (victory(player)){
            pechetayetArr();
            System.out.println("Вы  выиграл!!!!!");
            return true;
        }

        return false;
    }


    public static boolean computerTurn(char computer){ //ход компьютера
        int bestMove = findBestMove(computer);


        board[bestMove] = computer;
        System.out.println("Компьютер сделал ход на позицию . " + (bestMove+1));


        if (victory(computer)){
            pechetayetArr();
            System.out.println("Компьютер  выиграл!!!!!");
            return true;
        }

        return false;
    }



    public static int findBestMove(char computer){//найдет лучший ход
        for (int i = 0; i < board.length; i++) {
            if (board[i] == ' '){
                board[i] = computer;
                if (victory(computer)){
                    board[i] = ' ';
                    return i;
                }
                board[i] = ' ';
            }
        }


        for (int i = 0; i < board.length; i++) {
            if (board[i] == ' '){
                board[i] = 'X';
                if (victory('X')){
                    board[i] = ' ';
                    return i;
                }
                board[i] = ' ';
            }
        }


        int[] steps = {4,0,2,3,1,5,6,7,8}; //порядок хода компьютера

        for (int i = 0; i < steps.length; i++) {
            if (board[steps[i]]==' ') return steps[i];
        }

        return -1;
    }

    public static void peopleVscomputer() { //игра человек против компьютера
        char player = 'X';
        char computer = '0';


        while (true){
            pechetayetArr();

            if (isBoardFull()){
                System.out.println("Ничья!");
                break;
            }


            if (curentPlayerTurn(player))return;
            if (isBoardFull()){
                pechetayetArr();
                System.out.println("Ничья!");
                break;
            }

            if (computerTurn(computer))return;
        }
    }


    public static void peopleVspeople(){ // игра человек против человека
        char currentPlayer = 'X';
        while (true) {
            pechetayetArr();
            System.out.println("Ход игрока " + currentPlayer + " . Выберите позицию от (1-9) : ");
            int position = scanner.nextInt() - 1;
            if (position < 0 || position >= 9) {
                System.out.println("Вы сделали не верный ход попробуйте снова.");
                continue;
            } else if (position < 0 || position >= 9 || board[position] != ' ') {
                System.out.println("Данная позиция занята , попробуйте снова.");
                continue;
            }

            board[position] = currentPlayer;


            if (victory(currentPlayer)){
                pechetayetArr();
                System.out.println("Игрок " + currentPlayer +" выиграл!!!!!");
                break;
            }

            if (isBoardFull()){
                pechetayetArr();
                System.out.println("Ничья!");
                break;
            }
            if (currentPlayer == 'X'){
                currentPlayer = 'O';
            }else{
                currentPlayer = 'X';
            }


        }
    }


    public static boolean victory(char play){ //проверка на победителя
        return ((board[0]==play && board[1]==play && board[2]==play) ||
                (board[3]==play && board[4]==play && board[5]==play) ||
                (board[6]==play && board[7]==play && board[8]==play) ||
                (board[0]==play && board[3]==play && board[6]==play) ||
                (board[1]==play && board[4]==play && board[7]==play) ||
                (board[2]==play && board[5]==play && board[8]==play) ||
                (board[0]==play && board[4]==play && board[8]==play) ||
                (board[6]==play && board[4]==play && board[2]==play));
    }

    static boolean isBoardFull(){ //проверяет остались ли пустые клетки
        for (int i = 0; i < board.length; i++) {
            if (board[i] == ' ') return false;
        }

        return true;
    }


    public static void main(String[] args) {
//Задание: Реализация игры "Крестики-нолики"
//
//Цель: Создать программу на выбранном вами языке программирования для игры в "Крестики-нолики" с использованием статического массива, циклов и условных операторов (if),методов и т.д.
// Игра должна быть оформлена в консоли с красивым выводом игрового поля.
//
//Требования и условия:
//
//1. Человек против человека
//Создайте игровое поле в виде статического двумерного массива размером 3x3 , либо оспользовать одномерный массив на 9 элементов.
//Каждый ход игрока:
//Выводите текущее состояние игрового поля.
//Запрашивайте у пользователя координаты для хода (номер строки и столбца) (в одномерном массиве номер квадратика).
//Проверьте корректность хода:
//Если ячейка занята, запросите ввод заново.
//Если координаты вне игрового поля, запросите ввод заново.
//Определите условия победы:
//Проверка наличия трех одинаковых символов (X или O) по строкам, столбцам или диагоналям.
//Если никто не победил, а поле заполнено, игра заканчивается ничьей.
//Оформите вывод в консоли так, чтобы игровое поле отображалось красиво.
//
//
//2. Человек против компьютера
//Реализуйте логику игрового поля так же, как в первом варианте.
//Добавьте возможность игры против компьютера:
//Игрок делает ход первым (за X).
//После хода игрока компьютер выбирает случайную свободную клетку для своего хода (за O).
//После каждого хода:
//Проверяйте условия победы.
//Если поле заполнено, игра заканчивается ничьей.
//Убедитесь, что компьютер не делает ход в занятую клетку.
//
//
//
//
//3. Человек против компьютера (Hard Mode)
//Реализуйте игровую логику аналогично предыдущему пункту.
//Внесите улучшения для компьютера:
//Приоритетное блокирование: Если у игрока есть возможность выиграть на следующем ходу, компьютер должен занять соответствующую клетку, чтобы заблокировать победу.
//Умный ход: Если у компьютера есть возможность выиграть на своем ходу, он должен использовать эту возможность.
//Если выигрышных или блокирующих ходов нет, компьютер ходит в первую свободную клетку (или случайным образом).
//Общие требования:
//Для хранения игрового поля используйте статический массив размером 3x3.
//Логику ходов реализуйте с помощью циклов и условных операторов (if).
//Красиво оформите консольный вывод:
//Игровое поле должно быть наглядным и обновляться после каждого хода.
//Например:
//markdown
//
//
//Отображение в случаи двумерного массива
//    0   1   2
//
// 0  1 | X | O
//    ---------
// 1  O | X |
//    ---------
// 2    |   | X
//Программа должна проверять ввод пользователя на корректность (например, не позволять ставить символ в занятую клетку или вводить некорректные координаты).
//
//
// Отображение в случаи одномерного массива
//1 | 2 | 3
//---------
//4 | 5 | 6
//---------
//7 | 8 | 9
//Программа должна проверять ввод пользователя на корректность (например, не позволять ставить символ в занятую клетку или вводить некорректные координаты).
//
//
//Критерии оценки:
//Корректная реализация логики игры.
//Выполнение всех трех режимов.
//Понятный и красивый вывод на консоль.
//Проверка на ошибки ввода (например, ввод за пределами поля или ход в занятую клетку)
//        char[] arr= {'1','|','2','|','3',
//                     '4','|','5','|','6',
//                     '7','|','8','|','9'};
//        char[] arr= {'1','2','3',
//                     '4','5','6',
//                     '7','8','9'};
      pechetayetArr(); //вызываем метод который печатает доску
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]=='4'||arr[i]=='7'){
//                System.out.print("\n-----");
//            }
//            if (arr[i]=='4' || arr[i]=='7' ) {
//                System.out.println();
//            }
//            System.out.print(arr[i] + "|");
//        }
//        Scanner scanner=new Scanner(System.in);

        System.out.println("Выберите режим игры: " +
                "\n1-человек против человека " + "\n2-человек против компьютера");
        int rejim=scanner.nextInt();
        if (rejim==1){
            System.out.println("человек против человека");
            peopleVspeople();
        }else if(rejim==2){
            System.out.println("человек против компьютера");
            peopleVscomputer();
        }else {
            System.out.println("Выбран не верный режим");
        }


//        System.out.println();
//        System.out.println("Введите номер квадрата");
//        char num = scanner.next().charAt(0);

//        for (int i = 0; i < arr.length; i++) {
//            char num = scanner.next().charAt(0);
//            if (arr[i]==num){
//                arr[i]='X';
//            }
//            pechetayetArr(arr);
//        }


































































    }
}