package com.training;
/*
public class day3 {
        public static void main(String[] args){
            int arr1[]={1,2,3,4,5,6};
            int arr2[]={2,4,6,8,10};
            int arr3[]={2,3,6,9,12};
            int i=0,j=0,k=0;
            while(i<arr1.length&&j<arr2.length&&k<arr3.length)
            {
                if((arr1[i]==arr2[j]&& arr2[j]==arr3[k]))
                {
                    System.out.println(arr1[i]);
                    i++;
                    j++;
                    k++;
                }
                else if(arr1[i]<arr2[j]){
                    i++;
                }
                else if(arr2[j]<arr3[k])
                {
                    j++;
                }
                else
                {
                    k++;
                }
            }

        }
    }
}
*/


/*
public class day3{
    public static void main(String[] args) {
        System.out.println(binary_operation("1C0C1C1A0B1"));
    }
    public static int binary_operation(String str){

        if(str.isEmpty()){
            return -1;
        }
        int res=str.charAt(0)-'0';
        for (int i = 0; i < str.length()-1; i+=2) {
            char ch=str.charAt(i);
            int val=str.charAt(i+1);
            if(ch=='C'){
                res^=val;
            }
            else if(ch=='A'){
                res&=val;
            }
            else if(ch=='B') {
                res |= val;
            }
        }
        return res;
    }
}
 */


/*
import java.util.*;

public class day3 {

    public static int CheckPassword(String str, int n) {

        // Condition 1: Length should be at least 4
        if (n < 4)
            return 0;
        // Condition 2: First character should not be a digit
        if (Character.isDigit(str.charAt(0)))
            return 0;
        boolean hasDigit = false;
        boolean hasCapital = false;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch == ' ' || ch == '/')
                return 0;

            if (Character.isDigit(ch))
                hasDigit = true;

            if (Character.isUpperCase(ch))
                hasCapital = true;

        }

        if (hasDigit && hasCapital)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String str = sc.nextLine();
        int result = CheckPassword(str, str.length());
        System.out.println("Output: " + result);

        sc.close();
    }
}
*/


import java.util.Scanner;
public class day3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        int count=0;int max=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' ')
            {
                count++;
            }
            else{
                if(count>max){
                    max=count;
                }
                count=0;
            }
        }
        if(count>max)
        {
            max=count;
        }
        System.out.print(max);
    }
}