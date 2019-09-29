import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    davaleba1();
  }

  public static void davaleba1()
  {
    String[] cars = {"C++", "C#", "java", "pascal","PHP","PYTHON","JAVASCRIPT"};
    for (String i : cars) {
      System.out.println(i);
    }
  }

  public static void davaleba2()
  {

    Scanner MyObjectBtu = new Scanner(System.in);
    int first = MyObjectBtu.nextInt();
    int second = MyObjectBtu.nextInt();

    System.out.println("მთელი - "+ first/second);
    System.out.println("ნაშთი - "+ first%second);

    
  }

  public static void davaleba3()
  {

    Scanner MyObjectBtu = new Scanner(System.in);  
    int first = MyObjectBtu.nextInt();
    int second = MyObjectBtu.nextInt();
    int third = MyObjectBtu.nextInt();

    System.out.println("ჯამი - "+ (first+second+third));
    System.out.println("ნაშთი - "+ first*second*third);

    
  }

  public static void davaleba4()
  {

    Scanner MyObjectBtu = new Scanner(System.in); 
   
    String first = MyObjectBtu.nextLine();

    for (int i=0; i<first.length(); i++) {
        System.out.println(first.charAt(i));
    }

    
  }

  public static void davaleba5()
  {

    Scanner MyObjectBtu = new Scanner(System.in); 
    
    int first = MyObjectBtu.nextInt();

    int n, sum = 0;

    while(first > 0)
    {
        n = first % 10;
        sum = sum + n;
        first = first / 10;
    }
    System.out.println("ჯამი:"+sum);
  }

  //davaleba6 იგივეა რაც დავალება 5 "მგონი"

  public static void davaleba7()
  {

    Scanner MyObjectBtu = new Scanner(System.in);
    int first = MyObjectBtu.nextInt();
    int second = MyObjectBtu.nextInt();



    while (first != second) {
      if(first > second)
            first = first - second;
        else
            second = second - first;
    }

    System.out.println("GCD - " + second);

  }

  public static void davaleba8()
  {
    Scanner MyObjectBtu = new Scanner(System.in);
    int M = MyObjectBtu.nextInt();
    int N = MyObjectBtu.nextInt();

    for(int i = M;i<=N-1;i++)
    {
      System.out.println(i);
    }

  }
  //merve aq

  public static void davaleba9()
  {
    int [] myArray = {10,20,30,40,50,60,70};
    
    int temp;
    for (int i = 1; i < myArray.length; i++) {
      for (int j = i; j > 0; j--) {
        if (myArray[j] < myArray [j - 1]) 
        {
          temp = myArray[j];
          myArray[j] = myArray[j - 1];
          myArray[j - 1] = temp;
        }
      }
    }

    System.out.println("მაქსიმალური - " + myArray[myArray.length-1]);
    System.out.println("მინიმალური - " + myArray[0]);

  }
  public static void davaleba10()
  {
    int [] myArray = {10,20,30,40,50,60,70};

    int temp;
    for (int i = 1; i < myArray.length; i++) {
      for (int j = i; j > 0; j--) {
        if (myArray[j] < myArray [j - 1]) {
          temp = myArray[j];
          myArray[j] = myArray[j - 1];
          myArray[j - 1] = temp;
        }
      }
    }

  for (int i = 0; i < myArray.length; i++) {
     System.out.println(myArray[i]);
   }

  }

  public static void davaleba11()
  {
    int[] myArray = new int[8];
    for (int i = 0; i < myArray.length; i++) {
        myArray[i] = (int) (Math.random() * 10);
    }
    for (int i = 0; i < myArray.length; i++) {
        System.out.println(myArray[i]);
    }
  }

  public static void davaleba12()
  {
    int[] myArray = new int[8];
    int temp;
    for (int i = 0; i < myArray.length; i++) {
        myArray[i] = (int) (Math.random() * 10);
    }
    //3,2,6,4
    //2,3,6,4
    for (int x = 0; x < myArray.length-1; x++) 
    {
        int min = x;
        for(int j = x+1;j < myArray.length;j++)
        {
          if (myArray[j] < myArray[min]) min = j;
          temp = myArray[x];
          myArray[x] = myArray[min];
          myArray[min] = temp;
        }
    }
    for (int i = 0; i < myArray.length; i++) {
        System.out.println(myArray[i]);
    }
  }


}