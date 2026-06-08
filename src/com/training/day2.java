package com.training;
/*
public class day2 {
        public static void main(String[] args) {
            int arr[]={100,130,260,310,40,535,695};
            // int arr[]={4,2,1};
            int p=0;
            int buy=arr[0];
            for (int i = 1; i < arr.length; i++) {
                if(buy>arr[i]){
                    p+=arr[i-1]-buy;
                    buy=arr[i];
                }
                if(i==arr.length-1){
                    p+=arr[i]-buy;
                }
            }
            System.out.println(p);
        }
    }
*/


/*
import java.util.Arrays;

// ip: 1 2 3 4
// op: 1 3 6 10
// prefix sum : adding previous sum
public class day2 {
    public static void main(String[] args){
        int arr[]={1,2,3,4};
        // Method-1 using var sum
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i]; // sum=0+1, 1+2 ,3+3 , 6+4
            arr[i]=sum;// 0-> 1,1->3, 2->6 , 3-> 10
        }
        System.out.println(Arrays.toString(arr));
        // method -2 adding prev val
        int nums[]={1,2,3,4};
        // we are storing nums of 0 as it is and adding prev element to current
        for (int i = 1; i < nums.length; i++) {
            nums[i]+=nums[i-1];
        }
        System.out.println(Arrays.toString(nums));
    }
}
*/



/*
import java.util.Arrays;
public class day2 {
    public static void main(String args[]){
        System.out.println(Arrays.toString(remove(new int[]{10,6,0,18,11,7,24,0,5},11)));
    }
    public static int[] remove(int[] arr,int key){
        int in=-1;
        for (int i = 0; i < arr.length; i++) {
            if(key==arr[i]){
                in=i;
                break;
            }
        }
        for (int i = in+1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        // arrays.copyrange is used to create a new array from given range like 0 t0 n
        return Arrays.copyOfRange(arr,0,arr.length-1);
    }
}
*/






import java.util.*;

public class day2 {
    public static void main(String args[]){
        // method -1
        // time o(n) space o(n)
        int nums[]={10,4,8,3};
        int n=nums.length;
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        int ans[]=new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            left[i]=left[i-1]+nums[i-1];
        }
        for (int i =n-2 ; i >=0 ; i--) {
            right[i]=right[i+1]+nums[i+1];
        }
        for (int i = 0; i < n; i++) {
            ans[i]=Math.abs(left[i]-right[i]);
        }

        System.out.println(Arrays.toString(ans));
    }
}