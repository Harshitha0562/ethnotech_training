package projects.generics;

public class Content<T extends Number> //when we extend to number then we can given any type of number type like int,double,long,float,short,byte//
{
    T name;
    public void setName(T name)
    {
        this.name=name;
    }
    public T getName()
    {
        return name;
    }
}
