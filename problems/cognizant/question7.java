package problems.cognizant;

import java.util.*;
public class question7 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b || a<=0 || b<=0)
        {
            System.out.println("Provide valid input");
            return;
        }
        for(int i=a;i<=b;i++)
        {
            if(i<2)
            {
                continue;
            }
            boolean isPrime=true;
            int j=2;
            while(j<i)
           {
               if (i % j == 0)
               {
                   isPrime=false;
                   break;
               }
               j++;
           }
            if(isPrime)
            {
                System.out.print(i+" ");
            }
        }
    }
}
