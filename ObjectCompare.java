// Comparing the numbers are same or not throgh object

class Object1
{
    int number1;
    Object1(int num1)
    {
        this.number1 = num1;
    }
}
class Object2
{
    int number2;
    Object2(int num2)
    {
        this.number2 = num2;
    }
}
public class ObjectCompare
{
    public static void main(String a[])
    {
        Object1 obj1 = new Object1(25);
        Object2 obj2 = new Object2(25);

        System.out.println(obj1.number1 == obj2.number2);
    }
}
