package problems.cognizant;

import java.util.*;
public class question8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int rev=0;
        if(num>-1) {
            while (num > 0) {
                int digit = num % 10;
                rev = rev * 10 + digit;
                num /= 10;
            }
            if (rev == original) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a palindrome");
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }
}


/*
public class question8 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        char[] n=String.valueOf(num).toCharArray();
        int left=0;
        int right=n.length-1;
        int flag=1;
        while(left<right)
        {
            if(n[left]!=n[right])
            {
                flag=0;
                System.out.println("Not a Palindrome");
                return;
            }
            left++;
            right--;
        }
        if(flag==1)
        {
            System.out.println("Palindrome");
        }
    }
}
*/