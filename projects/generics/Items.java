package projects.generics;

public class Items <T,U,V>{
    T name;
    U price;
    V isGood;
    Items(T name,U price,V isGood)
    {
        this.name=name;
        this.price=price;
        this.isGood=isGood;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public U getPrice() {
        return price;
    }

    public void setPrice(U price) {
        this.price = price;
    }

    public V getIsGood() {
        return isGood;
    }

    public void setIsGood(V isGood) {
        this.isGood = isGood;
    }
}
