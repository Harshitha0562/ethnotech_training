package com.OOPS;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Set {
    public static void main(String args[])
    {
        HashSet<Integer> set=new HashSet<>();//order doesnot matters
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(1);
        System.out.println(set);


        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();//maintains order
        lhs.add(1);
        lhs.add(2);
        lhs.add(4);
        lhs.add(3);
        lhs.add(1);
        System.out.println(lhs);
    }
}
