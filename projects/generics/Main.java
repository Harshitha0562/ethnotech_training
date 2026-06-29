package projects.generics;

public class Main {
    public static void main(String args[])
    {
        Content <Double> c=new Content<>();
        c.setName(23.34);
        System.out.println(c.getName());

        Content <Integer> c1=new Content<>();
        c1.setName(62);
        System.out.println(c1.getName());

        Items<String,Double,Boolean> i=new Items("Banana",10.23,"Good");
        System.out.println(i.getName()+" "+i.getPrice()+" "+i.getIsGood());
    }
}
