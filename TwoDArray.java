// Dynamically creating 2D Array in java

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter row : ");
        int row = mc.nextInt();

        System.out.println("Enter column : ");
        int col = mc.nextInt();

        int[][] array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = row + col;
            }
            System.out.println();
        }

        System.out.println();

        // Traditional for loop
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Advance for loop
        for (int n[] : array) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        mc.close();
    }
}