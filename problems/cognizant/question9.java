package problems.cognizant;

import java.util.*;
public class question9 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary: ");
        int salary=sc.nextInt();
        System.out.println("Enter the performance appraisal rating:");
        float rating=sc.nextFloat();
        if(salary<=0 || rating<1 || rating>5)
        {
            System.out.println("Invalid input");
            return;
        }
        if(rating>=1 && rating<=3)
        {
            salary+= (int) (salary*0.1);
        }
        else if(rating>=3.1 && rating<=4)
        {
            salary+= (int) (salary*0.25);
        }
        else if(rating>=4.1 && rating<=5)
        {
            salary+= (int) (salary*0.3);
        }
        System.out.println(salary);
    }
}
