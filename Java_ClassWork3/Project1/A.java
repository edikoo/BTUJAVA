import java.util.Scanner;
/**
 * A
 */
public class A {

    int a,b;

    public void Insert(){
        Scanner MyObjectBtu = new Scanner(System.in);
        a = MyObjectBtu.nextInt();
        b = MyObjectBtu.nextInt();
    }

    public void meore(){
        System.out.println(a + b);
    }

    public int mesame(){
        return a * b;
    }

    public static void main(String[] args) {
        A a = new A();
        a.Insert();
        a.meore();
        System.out.println(a.mesame());

    }
}