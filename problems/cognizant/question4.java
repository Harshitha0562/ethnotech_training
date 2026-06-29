package problems.cognizant;

import java.util.*;
public class question4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter teh no.of students placed in CSE:");
        int cse_count=sc.nextInt();
        System.out.print("Enter teh no.of students placed in ECE:");
        int ece_count=sc.nextInt();
        System.out.print("Enter teh no.of students placed in MECH:");
        int mech_count=sc.nextInt();
        if(cse_count<0 || ece_count<0 || mech_count<0)
        {
            System.out.println("Input is invalid");
            return;
        }
        System.out.println("Highest placement");
        if(cse_count>ece_count && cse_count>mech_count)
        {
            System.out.println("CSE");
        }
        else if(ece_count>mech_count)
        {
            System.out.println("ECE");
        }
        else if(cse_count==ece_count && ece_count==mech_count)
        {
            System.out.println("None of the department has got the highest placement");
        }
        else if(cse_count==ece_count && cse_count>mech_count)
        {
            System.out.println("CSE");
            System.out.println("ECE");
        }
        else if(cse_count==mech_count && cse_count>ece_count)
        {
            System.out.println("CSE");
            System.out.println("MECH");
        }
        else if(ece_count==mech_count && ece_count>cse_count)
        {
            System.out.println("ECE");
            System.out.println("MECH");
        }
        else
        {
            System.out.println("MECH");
        }
    }
}
