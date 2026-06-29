package problems.cognizant;

import java.util.*;
public class question10 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<=999)
        {
            System.out.println(num+"is not a valid car number");
        }
        else
        {
            int sum=0;
            while(num>0)
            {
                sum+=num%10;
                num/=10;
            }
            if(sum%3==0 || sum%5==0 || sum%7==0)
            {
                System.out.println("Lucky number");
            }
            else {
                System.out.println("Sorry it is Not my lucky number");
            }
        }
    }
}
