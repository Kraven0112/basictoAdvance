class Object1{
    int number1;
    Object1(int num1){
        num1 = this.number1;
    }
}
class Object2{
    int number2;
    Object2(int num2){
        num2 = this.number2;
    }
}
public class ObjectCompare {
    public static void main(String a[]){
        Object1 obj1 = new Object1(25);
        Object2 obj2 = new Object2(25);

        if(obj1.number1 == obj2.number2){
            System.out.println("equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
