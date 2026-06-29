package problems.ibm;

import java.util.*;
public class parking {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int initial_parking=-1;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if (arr[i] == 1) {
                if (initial_parking == -1)
                {
                    max = i;
                }
                else
                {
                    max = Math.max(max, (i - initial_parking) / 2);
                }
                initial_parking = i;
            }
        }
        max=Math.max(max,(n-1-initial_parking));
        System.out.println(max);
    }
}
