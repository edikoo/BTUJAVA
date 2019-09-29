import java.util.Scanner;

public class B {
    int a,b,c;

    public void Insert(){
        Scanner MyObjectBtu = new Scanner(System.in);
        a = MyObjectBtu.nextInt();
        b = MyObjectBtu.nextInt();
        c = MyObjectBtu.nextInt();
    }

    public void meore()
    {
        // 2 ,4 ,3
        int temp = Math.max(a, b);
        System.out.println(Math.max(temp, c)); 
    }

    public int mesame(){
        int temp = Math.min(a, b);
        return Math.min(temp, c); 
    }

    public static void main(String[] args) {
        B b = new B();
        b.Insert();
        b.meore();
        System.out.println(b.mesame());
    }


}