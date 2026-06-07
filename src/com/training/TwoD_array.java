package com.training;
import java.util.*;

/*
//printing the sum of all elements present in each row and maxsum and it's position
public class TwoD_array {
    public static void main(String args[])
    {
        Array();
    }
    public static void Array()
    {
        Scanner sc=new Scanner(System.in);
        int[][]arr=new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int maxSum=Integer.MIN_VLUE,row=-1;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=0;j<arr[i].length;j++)
            {
                sum+=arr[i][j];
            }
            if(sum>maxSum) {
                maxSum =sum;
                row =i;
            }
            System.out.println(sum);
        }
        System.out.println("Maxsum is: "+maxSum+" and it is in "+row+"th row");
    }
}
*/


/*
//printing the sum of column elements
class TwoD_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int maxsum=Integer.MIN_VALUE,col=-1;
        for(int j=0;j<arr[0].length;j++)
        {
            int sum=0;
            for(int i=0;i<arr.length;i++)
            {
                sum+=arr[i][j];
            }
            if(sum>maxsum)
            {
                col=j;
                maxsum=sum;
            }
            System.out.println(sum);
        }
        System.out.println("Max sum of "+col+"th col is "+maxsum );
    }
}
*/

/*
//searching an element in a 2d array
class TwoD_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        boolean found=false;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(arr[i][j]==target)
                {
                    found=true;
                    System.out.println("The element is presnt at "+i+"th row and "+j+"th col");
                }
            }
        }
        if(!found)
        {
            System.out.println("element does not exist in the 2d array");
        }
    }
}
*/


//count the occurence of a number
class TwoD_array
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == target) {
                    count++;
                    System.out.println("present at " + i + "," + j);
                }
            }
        }
        if (count == 0) {
            System.out.println("target doesnot exist");
        } else {
            System.out.println("the target value is appeared " + count + " times");
        }
    }
}



/*
//printing the max and min element in the given 2d array and printing it's position
class TwoD_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int row=0,col=0;
        int max=arr[0][0];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                    row=i;
                    col=j;
                }
                else if(arr[i][j]<min)
                {
                    min=Math.min(min,arr[i][j]);

                }
            }
        }
        System.out.println("Largest element in the 2d array is: "+max+" and it's position is: "+row+" "+col);
        System.out.println("Smallest element in the 2d array is: "+min);
    }
}
 */

/*
//printing the diagonal elements
public class TwoD_array {
    public static void main(String args[])
    {
        Array();
    }
    public static void Array()
    {
        Scanner sc=new Scanner(System.in);
        int[][]arr=new int[3][3];
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("diagonal elements are: ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                //condition for printing normal diagonal
                 if(i==j)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
        System.out.println("Reverse diagonal elements are: ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                //condition for printing the reverse diagonal
                if (i+j==arr.length-1)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
*/



/*
class twoD_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[j][i] = arr[arr.length - 1 - i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
*/