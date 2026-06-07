package com.OOPS;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
        public static void main(String args[])
        {
            ArrayList<String> list=new ArrayList<>();
            list.add("temper");
            list.add("darling");
            list.add("mr perfect");
            list.add("magadheera");
            System.out.println(list);
            list.remove("temper");
            System.out.println("removed temper movie");
            System.out.println(list);
            System.out.println(list.size()+"  is the soze of aa list");
            list.set(0,"magadheera");
            System.out.println("magadheera is placed at zeroth index");
            System.out.println(list);
            System.out.println("Checking whether list is empty or not: "+list.isEmpty());
            System.out.println("checking whether the list contains the element or not: "+list.contains("temper"));
            System.out.println("getting the indexof the element: "+list.indexOf("temper"));
            Collections.sort(list);
            System.out.println("Sorting the list: "+list);

            ArrayList <String> list2=new ArrayList<>();
            list2.addAll(list); //copies to another list
            System.out.println("Copied list:"+list2);
            list2.add("temper");
            list2.add("naa peru shiva");
            list2.retainAll(list);
            System.out.println("Presents the common elements: "+list2);
        }
}
