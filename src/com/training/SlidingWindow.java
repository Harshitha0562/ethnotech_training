package com.training;
import java.util.*;
/*
//fixed  window
class SlidingWindow
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int maxSum=sum;
        for(int i=k;i<arr.length;i++)
        {
            sum=sum-arr[i-k]+arr[i];
            maxSum=Math.max(maxSum,sum);
        }
        System.out.println("Maximum sum of k length subarray: "+maxSum);
    }
}*/

//dynamic window
public class SlidingWindow {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(longestLen("ttfft"));
    }
    public static int longestLen(String s)
    {
        int k=2;
        HashMap<Character,Integer> map=new HashMap<>();
        int maxlen=0,left=0,maxfreq=0;
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,map.get(ch));
            while(right-left+1-maxfreq>k)
            {
                char leftchar=s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0)
                {
                    map.remove(leftchar);
                }
                left++;
            }
            int len=right-left+1;
            maxlen=Math.max(maxlen,len);

        }
        return maxlen;
    }
}
