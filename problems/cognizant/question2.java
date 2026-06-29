package problems.cognizant;

import java.util.*;
import java.util.function.DoubleToIntFunction;

public class question2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of pizzas bought: ");
        int pizzas=sc.nextInt();
        System.out.print("Enter the no.of puffs bought: ");
        int puffs=sc.nextInt();
        System.out.print("Enter the no.of drinks bought: ");
        int drinks=sc.nextInt();
        System.out.println("Bill Details");
        System.out.println("No.of pizzas:"+pizzas);
        System.out.println("No.of puffs:"+puffs);
        System.out.println("No.of cooldrinks:"+drinks);
        int total=100*pizzas+20*puffs+10*drinks;
        System.out.println("Total price="+total);
        System.out.println("ENJOY THE SHOW!!!");
    }
}
