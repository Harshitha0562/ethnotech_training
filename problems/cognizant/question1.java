package problems.cognizant;

import java.util.*;
public class question1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of litres to fill the tank: ");
        int l=sc.nextInt();
        System.out.println("Enter the distance covered: ");
        int d=sc.nextInt();
        if(l<=0 || d<=0)
        {
            System.out.println("Invalid input ");
            return;
        }
        System.out.println("Litres/100KM");
        double fuel_europe=((double) l /d)*100;
        System.out.printf("%.2f",fuel_europe);
        System.out.println();
        System.out.println("Miles/gallons");
        double fuel_usa=(d*0.6214)/(0.2642*l);
        System.out.printf("%.2f",fuel_usa);
    }
}
