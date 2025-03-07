// Dyncamically creating 3D Array in java

import java.util.Scanner;

public class ThreeDArray {

    public static void main(String[] args) {
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter layers : ");
        int layer = mc.nextInt();

        System.out.println("Enter row : ");
        int row = mc.nextInt();

        System.out.println("Enter column : ");
        int col = mc.nextInt();

        int[][][] array = new int[layer][row][col];

        // Traditional for loop
        for (int i = 0; i < layer; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    array[i][j][k] = layer + row + col;
                }
                System.out.println();
            }
            System.out.println();
        }
        // Traditional for loop
        for (int i = 0; i < layer; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Advance for loop

        mc.close();
    }
}