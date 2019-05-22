package Lesson6;

public class Main4 {

    public static void main(String[] args) {
        /*line();
        System.out.println();
        triange();
        System.out.println();
        triangle2();
        System.out.println();
        pyramid();
        */
        Krug();


    }

    // Печатаем пирамидку

    public static void pyramid() {
        int num[][] = new int[5][9];
        int count1 = 4;
        int count2 = 5;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                if ((j >= count1) && (j < count2)) {
                    System.out.print(num[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            count1--;
            count2++;
        }
    }

    public static void Krug(){
        int[][] mas = new int[9][9];
        int k1 = mas[0].length / 2;
        int k2 = mas.length / 2;
        int c1 = k1++;
        int c2 = k1--;

        for(int i = 0; i < mas.length; i++){
            for (int j = 0; j < mas[i].length; j++){
                if(i == 0 || i == mas.length-1) {
                    if (j == k1){
                        System.out.print(" " + mas[i][j]);
                    } else {
                        System.out.print("  ");
                    }
                } else if ((c1 <= mas[i].length-1 && c2 >= 0) && (j == c1 || j == c2)){
                    System.out.print(mas[c1][c2] + " ");

                } else {
                    System.out.print("  ");
                }
            }
            c1++;
            c2--;

            System.out.println();
        }



    }

    // Задание 1. Печатаем линию по диагонали

    public static void line() {

        // Создание массива и заполенение его единицами

        int[][] num = new int[4][4];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = 1;
            }
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (i == j) {
                    System.out.print(num[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Задание 2

    public static void triange() {

        int[][] num = new int[4][4];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = 1;
            }
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (j >= i) {
                    System.out.print(num[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
    // Задание 3

    public static void triangle2() {
        int[][] num = new int[4][4];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (j >= i) {
                    num[i][j] = 1;
                } else num[i][j] = 0;
            }
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }


}


