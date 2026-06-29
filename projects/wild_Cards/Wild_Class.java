package projects.wild_Cards;

import java.util.List;
public class Wild_Class {
    public static void displayList(List<?> l)//here ? accpets any kind of datatype
    {
        System.out.println(l);
    }
    public static void main(String []args)
    {
        displayList(List.of(1,2,3,4,5,6,7,8,9));
        displayList(List.of("Harshitha","Sonnapareddy"));
    }
}
