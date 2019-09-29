/**
 * A
 */
public class A {

    int x,y,z;

    public int pirveli(){
        return 2*x-7;
    }

    public int meore(){
        return 3*y+z;
    }

    public int mesame(){
        return 12*y-x+z;
    }
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.pirveli());
        System.out.println(a.meore());
        System.out.println(a.mesame());
    }
}