public class PrintNumber {

    public static void main(String[] args) {
        // using for loop
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        // uding while loop
        int i = 1;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }

        // using do-while loop
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 100);
    }
}