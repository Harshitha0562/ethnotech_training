package com.OOPS;
import java.util.HashMap;
import java.util.Map;
public class Maps {
    public static void main(String args[])
    {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("House1",1);
        map.put("House2",3);
        map.put("House3",1);
        map.put("House4",4);
        map.put("House5",0);

        /*for(String key:map.keySet())
        {
            System.out.println(key+" : "+map.get(key));
        }*/

        for(Map.Entry<String,Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println(map.putIfAbsent("House0",100));
        for(Map.Entry<String,Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println(map.putIfAbsent("House0",100));
    }
}
