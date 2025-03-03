public class While_loop {

    public static void main(String args[]) {

        // while loop

        int i = 1;

        while (i <= 5) {
            System.out.println("Hello " + i);

            int j = 1;
            while (j <= 3) {
                System.out.println("Hi " + j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}