package ComparableAndComparator;

import java.util.*;
public class CC {
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(52);
        list.add(30);
        list.add(24);
        /*
        Collections.sort(list);
        System.out.println(list);
         */

        //comparator is used for custom implementation
        //always comparator returns int(1 or -1) not boolean
        /*Comparator<Integer> com=new Comparator<>()
        {
            public int compare(Integer a,Integer b)//in comparator method we have to use wrapper classes instead of primiive
            {
                if(a%10 > b%10)
                {
                    return 1;
                }
                return -1;
            }
        };
        */

        //Comparator<Integer> com=(a,b)->a%10> b%10? 1: -1;

        //both are correct
        Comparator<Integer> com=(a,b)->(a%10) - (b%10);
        Collections.sort(list,com); //collections do actual sorting not comparator
        System.out.println(list);

    }
}
