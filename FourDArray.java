import java.util.Scanner;

public class FourDArray {
    public static void main(String[] args) {
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter layer : ");
        int layer = mc.nextInt();

        System.out.println("Enter row : ");
        int row = mc.nextInt();

        System.out.println("Enter column : ");
        int col = mc.nextInt();

        System.out.println("Enter depth : ");
        int depth = mc.nextInt();

        int[][][][] array = new int[layer][row][col][depth];

        // Traditional for loop
        for (int i = 0; i < layer; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    for (int l = 0; l < depth; l++) {
                        array[i][j][k][l] = layer + row + col + depth;
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }

        // Traditional for loop
        for (int i = 0; i < layer; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    for (int l = 0; l < depth; l++) {
                        System.out.print(array[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }

        // Advance for loop
        for (int n[][][] : array) {
            for (int m[][] : n) {
                for (int o[] : m) {
                    for (int p : o) {
                        System.out.print(p + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
        mc.close();
    }
}