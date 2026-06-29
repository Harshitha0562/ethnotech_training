package problems.cognizant;

import java.util.*;
public class question5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of tickets:");
        int tickets=sc.nextInt();
        if(tickets<5 || tickets>40)
        {
            System.out.println("Minimum of 5 and Maximum of 40 tickets");
            return;
        }
        System.out.print("Do you want refreshment:");
        char refreshment=sc.next().charAt(0);
        System.out.print("Do you have coupon code:");
        char coupon=sc.next().charAt(0);
        System.out.print("Enter the circle:");
        char circle=sc.next().charAt(0);
        double total=0;
        if(circle!='k' && circle!='q' )
        {
            System.out.println("Invalid input");
            return;
        }
        if(circle=='k')
        {
            total = 75 * tickets;
        }
        else if(circle=='q')
        {
            total=150*tickets;
        }
           total=total-total*0.1;
           if(coupon=='y')
           {
               total=total-total*0.02;
           }
           if(refreshment=='y')
           {
               total+=tickets*50;
           }

        System.out.println("Ticket cost:"+total);
    }
}
