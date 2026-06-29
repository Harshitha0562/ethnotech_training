package problems.cognizant;

import java.util.*;
public class question11 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of courses");
        int n=sc.nextInt();
        if(n<=0)
        {
            System.out.println("Invalid range");
            return;
        }
        String[] arr=new String[n];
        System.out.println("Enter course names");
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        System.out.println("Enter course name to be searched");
        String target=sc.nextLine();
        for(int i=0;i<n;i++)
        {
            if(arr[i].equals(target))
            {
                System.out.println(target+" course is available");
                return;
            }
        }
        System.out.println(target+" course is not available");

    }

}
