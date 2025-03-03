public class Pattern1 {
    public static void main(String args[]) {
        // Pattern - 1
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern - 2
        for (int i = 5; i >= 1; i--) {
            // for space
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }

            // for star
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}