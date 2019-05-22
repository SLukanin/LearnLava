package Lesson6;

public class Main3 {
    public static void main(String[] args) {
        int num[][] = new int[4][4];
        for(int i = 0; i < num.length; i++)
            for (int j = 0; j < num[0].length; j++){
                num[i][j] = 1;
            }

        for(int i = 0; i < num.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println(" ");
        }

        /*
        System.out.print(num[0][0]);

        System.out.println();

        System.out.print(num[1][0]);
        System.out.print(num[1][1]);

        System.out.println();

        System.out.print(num[2][0]);
        System.out.print(num[2][1]);
        System.out.print(num[2][2]);

        System.out.println();

        System.out.print(num[3][0]);
        System.out.print(num[3][1]);
        System.out.print(num[3][2]);
        System.out.print(num[3][3]);

*/
    }
}
