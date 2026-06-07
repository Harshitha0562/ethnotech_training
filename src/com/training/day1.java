package com.training;
/*import java.util.Arrays;
public class day1 {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i+1]=arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}*/


/*
import java.util.*;
class day1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int targetIndex=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==target) {
                targetIndex=i;
            }
        }
        for(int i=targetIndex+1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        System.out.print(Arrays.toString(arr));
    }
}
*/

import java.util.*;
class day1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int prices[]=new int[size];
        for(int i=0;i<size;i++)
        {
            prices[i]=sc.nextInt();
        }
        int buyDay=0,profit=0;
        for(int i=1;i<size;i++)
        {
            if(prices[i-1]>prices[i] ) {
                profit += prices[i - 1] - prices[buyDay];
                buyDay = i;
            }
            else if(i==prices.length-1)
            {
                profit+=prices[i]-prices[buyDay];
            }
        }
        System.out.print("Profit= "+profit);
    }
}