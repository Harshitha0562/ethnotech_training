package ComparableAndComparator;

import java.util.*;
public class CC_example {
    public static void main(String[] args)
    {
        List<Students> list=new ArrayList<>();
        Students obj1=new Students(101,"harshitha");
        list.add(obj1);
        list.add(new Students(110,"mahitha"));
        list.add(new Students(111,"trisha"));
        list.add(new Students(100,"bindu"));
        Comparator <Students> com=(a,b)->(a.id>b.id)?1:-1;
        Collections.sort(list,com);
        for(Students s:list)
        {
            System.out.println(s.id+" "+s.name);
        }
    }
}
class Students
{
    int id;
    String name;
    public Students(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
