public class Literals {

    public static void main(String args[]){
        Addition a = new Addition();
       int total =  a.add(122,122,122);
       System.out.println("Total "+ total);

       
        // Literals in java programming
        System.out.println(0b101); //5 binary of 5 in java
        System.out.println(0b1000);//8 binary of 8 in java
        System.out.println(0xE); //hexadecimal of 14 in java
        System.out.println(010); //8 octal of 8 in java
        System.out.println(0b1000000000);

        double num = 100_000;
        System.out.println(num);
        System.out.println(12703e100);
    }
}