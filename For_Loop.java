public class For_Loop {

    public static void main(String args[]) {
        // Loops in java used to do repeatative works
        // first way to use for loop in java
        // for(initialization; condition; update;)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // second way to use for loop in java
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}