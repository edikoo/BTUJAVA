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
        Iterator itr = l2.iterator();
        while (itr.hasNext())
        {
            int x = (Integer)itr.next();
            if (x % 2 != 0)
                itr.remove();
        }

        Collections.sort(l2);
        Collections.sort(arr);
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
        for(int x=0;x<=l2.size();x++)
        {
            if(x%3 == 0 && x!=0)
            {
                l2.add(x, R.nextInt((25 - 20) + 1) + 20);
            }
        }
        System.out.println("თავდაპირველი  "+ arr);
        System.out.println("შეცვლილი  " + l2);
    }
}