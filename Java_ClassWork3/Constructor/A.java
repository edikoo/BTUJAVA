/**
 * A
 */
public class A {

    public A(int x)
    {
        System.out.println("Hello A Class");
        if(x % 2 == 0)
        {
            System.out.println("ლუწია");
        }
        else
        {
            System.out.println("კენტია");
        }
    }
    public static void main(String[] args) {
        A a = new A(5);
    }
}