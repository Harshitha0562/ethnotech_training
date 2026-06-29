package problems.cognizant;

import java.util.*;
public class GenCPro_Q1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
        }
        long sum=0;
        long min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
          sum+=arr[i];
          min=Math.min(sum,min);
        }
        System.out.println(min);
    }
}
