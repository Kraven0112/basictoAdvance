import java.util.Scanner;

public class SingleD_Array {

    public static void main(String[] args) {
        // creating dynamic 1D array in java

        System.out.println("Enter size of array : ");
        Scanner mc = new Scanner(System.in);

        int[] array = new int[mc.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() + 1) * 10);
        }

        // Traditional for loop
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

        System.out.println();

        // Advance for loop
        for (int number : array) {
            System.out.print(number + " ");
        }

        mc.close();
    }
}