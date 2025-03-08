public class JaggedArray {

    public static void main(String[] args) {
        // Jagged array - row is defined but column is noty

        int[][] array = new int[4][];

        array[0] = new int[5];
        array[1] = new int[10];
        array[2] = new int[15];
        array[3] = new int[20];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((Math.random() + 1) * 10);
            }
            System.out.println();
        }

        for (int n[] : array) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}