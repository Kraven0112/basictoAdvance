public class ArraySum {

    public static void main(String a[]){
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;

        for(int i = 0; i<array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("Total sum of array elements : "+sum);
    }
}