import java.util.*;
class Davaleba3 {
    public void pirveli()
    {
        List arr = new ArrayList();
        Random R = new Random();
        for(int i=0;i<12;i++)
        {
            arr.add(R.nextInt(100));
        }

        List l2 = new ArrayList(arr);
        Collections.sort(l2);
        Collections.sort(arr);

        int x = 0;
        for (Iterator it = l2.iterator(); it.hasNext(); )
        {
            it.next();
            if (x % 2 == 0)
            {
                it.remove();
            }
            x++;
        }
        

        System.out.println("თავდაპირველი" + arr);
        System.out.println("ლუწების გარეშე" + l2);
    }

    public void meore()
    {
        List arr = new ArrayList();
        Random R = new Random();
        for(int i=0;i<12;i++)
        {
            arr.add(R.nextInt(6) + 5);
        }
        List l2 = new ArrayList(arr);

        for (int x = 3; x < l2.size(); x+=4)
        {
            l2.add(x+1, R.nextInt((25 - 20) + 1) + 20);
        }
        System.out.println("თავდაპირველი  "+ arr);
        System.out.println("შეცვლილი  " + l2);
    }
}
