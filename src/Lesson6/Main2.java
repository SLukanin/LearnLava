package Lesson6;

public class Main2 {
    public static void main(String[] args) {
        int[][] numbers = new int[4][3];
        int startNum = 2;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = startNum;
                startNum += 2;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(numbers[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
