package com.training;
//finding the longest word in the string
/*
using split();
import java.util.*;
public class day4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split(" ");
        String longest=str[0];
        for(String word:str)
        {
            if(word.length()>longest.length())
            {
                longest=word;
            }
        }
        System.out.println("Longest word: "+longest);
    }
}
*/



//without using split()
/*
import java.util.*;
class day4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String current="";
        String longest="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                current+=ch;
            }
            else {
                if(current.length()>longest.length())
                {
                    longest=current;
                }
                current="";

            }
        }
        if (current.length() > longest.length())
        {
            longest=current;
        }
        System.out.println("Longest word is: "+longest);
    }
}
*/

//checkpassword question
/*
import java.util.*;
public class day4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);

        String s=sc.nextLine();
        System.out.print(day4.checkPassword(s.toCharArray(),s.length()));
    }
    public static int checkPassword(char str[],int n)
    {
        for(int i=0;i<str.length;i++) {
            if (str.length < 4 || (str[i]==' ' || str[i]=='/') || Character.isDigit(str[0]) )
            {
                return 0;
            }
        }
        return 1;
    }
}
*/

//OPERATIONSBINARYSTRING

//input: 1C0C1C1A0B1
//output: 1

//input:
//ouput: -1
/*
import java.util.*;
class day4
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(day4.OperationsBinaryString(s));
    }
        static int OperationsBinaryString(String str) {
            if(str.isEmpty()) {
                return -1;
            }
            int result = str.charAt(0) - '0';
            for (int i = 1; i < str.length(); i += 2) {
                int value = str.charAt(i + 1) - '0';
                char ch = str.charAt(i);
                if (ch == 'C') {
                    result = result ^ value;
                } else if (ch == 'A') {
                    result = result & value;
                } else if (ch == 'B') {
                    result = result | value;
                }
            }
            return result;
        }
}
*/

//printing common elements in three arrays
/*
import java.util.*;
class day4
 {
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         List<Integer> l1=new ArrayList<>();
         List<Integer> l2=new ArrayList<>();
         // contains() in ArrayList takes: O(n) time And you are calling it inside a loop:O(n) * O(n)
         //So total complexity becomes:O(n²)  Better Approach Using HashSet
         //HashSet.contains() works in approximately:O(1) So total complexity becomes:O(n)
         List<Integer> l3=new ArrayList<>();
         for(int i=0;i<n;i++)
         {
             l1.add(sc.nextInt());
         }
         for(int i=0;i<n;i++)
         {
             l2.add(sc.nextInt());
         }
         for(int i=0;i<n;i++)
         {
             l3.add(sc.nextInt());
         }
         for(int i=0;i<l1.size();i++)
         {
             if(l2.contains(l1.get(i)) && l3.contains(l1.get(i)))
             {
                 System.out.println(l1.get(i));
             }
         }
     }
 }
*/

/*
import java.util.*;
class day4
{
    public static void main(String args[])
    {
        int a1[]={1,2,3,4,5,6};
        int a2[]={2,3,4,6,8};
        int a3[]={2,5,6,9,10};
        day4.FindCommonElements(a1,a2,a3);
    }
    public static void FindCommonElements(int arr1[],int arr2[],int arr3[])
    {
        int x=0,y=0,z=0;
        if(arr1.length==0 ||arr2.length==0||arr3.length==0)
        {
            throw new NullPointerException("Empty arrays");
        }
        while(x<arr1.length && y<arr2.length && z<arr3.length)
        {
            if(arr1[x]==arr2[y] && arr1[x]==arr3[z])
            {
                System.out.println("Equals numbers are: "+arr1[x]);
                x++;
                y++;
                z++;
            }
            else if(arr1[x]<arr2[y])
            {
                x++;
            }
            else if(arr2[y]<arr3[z])
            {
                y++;
            }
            else {
                z++;
            }
        }
    }
}
*/

/*
//find the maximum sum of subarray
class day4
{
    public static void main(String args[])
    {
        int arr[]={2,-5,1,7,-3,4,-6};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int sum=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                sum+=arr[j];
                max=Math.max(sum,max);
            }
        }
        System.out.println("MAX SUM: "+max);
    }
}
*/


import java.util.*;
class day4
{
    public static void main(String args[])
    {
        int arr[]={5,4,3,8,5,1,0,2,8};
        List<Integer> list=new ArrayList<>();
            for(int i=0;i<arr.length;i++) {
                list.add(arr[i]);
            }
        for(int i=0;i<arr.length;i++) {
            if (i % 2 != 0) {
                list.add(arr[i]);
            }
        }
            for(int i=0;i<arr.length;i++) {
                if (list.size() > arr.length - 1 && i % 2 == 0) {
                    list.add(arr[i]);
                }
            }
        System.out.print(list);
    }
}


