package projects.Hungerbox;
import java.util.ArrayList;

interface Orderdable {
    double getPrice();
    String getDescription();
    void prepare();
}

interface Discounts {
    double applyDiscounts(double discount);
}

abstract class MenuItems implements Orderdable, Discounts {


    private final String name;
    private double price;
    private static int totalNumberOfOrders = 0;
    private String categories;

    public MenuItems(String name, double price, String categories) {
        this.name = name;
        this.price = price;
        this.categories = categories;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    @Override
    public String getDescription() {
        return "Item name : " + getName() + " Price : $" + getPrice();
    }

    @Override
    abstract public void prepare();

    @Override
    public double applyDiscounts(double discount) {
        return price - (price * discount / 100);
    }

    public String getName() {
        return name;
    }

    public static int getTotalNumberOfOrders() {
        return totalNumberOfOrders;
    }

    public static void setTotalNumberOfOrders(int totalNumberOfOrders) {
        MenuItems.totalNumberOfOrders = totalNumberOfOrders;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

}

class VegItems extends MenuItems {
    private boolean isJain;

    public VegItems(String name, double price) {
        super(name, price, "Veg");
        this.isJain = false;
    }

    public VegItems(String name, double price, boolean isJain) {
        super(name, price, "Veg");
        this.isJain = isJain;
    }

    @Override
    public void prepare() {
        System.out.println("Your Order of " + getName() + " of price " + getPrice() + " Is Been Prepared");
        setTotalNumberOfOrders(getTotalNumberOfOrders() + 1);
    }
}

class NonVegItems extends MenuItems {
    private String meatType;

    public NonVegItems(String name, double price, String categories, String meatType) {
        super(name, price, categories);
        this.meatType = meatType;
    }

    @Override
    public void prepare() {
        System.out.println("Your Order of " + getName() + " of price " + getPrice() + " Is Been Prepared");
        setTotalNumberOfOrders(getTotalNumberOfOrders() + 1);
    }


    @Override
    public String getDescription() {
        return super.getDescription() + this.meatType;
    }
}

class Orders {
    private final int OrderId;
    private static int orderCount = 0;

    public int getOrderId() {
        return OrderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getStatus() {
        return status;
    }

    private final String customerName;
    ArrayList<MenuItems> List;
    private String status;

    Orders(String customerName) {
        this.customerName = customerName;
        this.List = new ArrayList<>();
        this.status = "Order placed";
        this.OrderId= ++orderCount;
    }

    public void addItems(MenuItems items) {
        List.add(items);
        System.out.println("The Items Ordered is " + items.getName() + " The Price is " + items.getPrice());

    }
    public void prepareOrder(){
        this.status="Preparing Order";
        for(MenuItems items: List)
        {
            items.prepare();
        }
        this.status="Ready";
    }
    double calculatePrice()
    {
        double price=0;
        for(MenuItems items: List) {
            price+=items.getPrice();
        }
        return price;


    }
    void generateBill(double discountPercent)
    {
        double subtotal = calculatePrice();
        double discounted = subtotal - (subtotal * discountPercent / 100);
        double tax  = discounted * 0.05;
        double total = discounted + tax;

        System.out.println("  ┌────────────────────────────────────┐");
        System.out.println("  │         HungerBox — Bill           │");
        System.out.println("  ├────────────────────────────────────┤");
        System.out.println("  │  Order ID  : #" + OrderId);
        System.out.println("  │  Customer  : " + customerName);
        System.out.println("  │  Status    : " + status);
        System.out.println("  ├────────────────────────────────────┤");
        for (MenuItems item :List) {
            System.out.printf("  │  %-22s ₹%6.2f%n", item.getName(), item.getPrice());
        }
        System.out.println("  ├────────────────────────────────────┤");
        System.out.printf("  │  Subtotal              ₹%8.2f%n", subtotal);
        if (discountPercent > 0)
            System.out.printf("  │  Discount (%d%%)         -₹%7.2f%n", (int)discountPercent, subtotal - discounted);
        System.out.printf("  │  GST (5%%)              ₹%8.2f%n", tax);
        System.out.println("  ├────────────────────────────────────┤");
        System.out.printf("  │  TOTAL                 ₹%8.2f%n", total);
        System.out.println("  └────────────────────────────────────┘");
    }
}
class Res
{
    private  String name;
    ArrayList<MenuItems> menu;
    ArrayList<Orders> o;

    public  Res(String name ) {
        this.name = name;
        this.menu =new ArrayList<>();
        this.o = new ArrayList<>();
    }
    void addMenu(MenuItems items)
    {
        menu.add(items);
    }
    void showMenu()
    {
        for(int i=0;i<menu.size();i++)
        {
            System.out.println( (i+1)+":"+ menu.get(i).getDescription());
        }
    }
    Orders placeOrder(String name)
    {
        Orders order1=new Orders(name);
        o.add(order1);
        return order1;
    }
    MenuItems getItem(int index)
    {
        return menu.get(index);
    }

    void showOrder()
    {
        for(Orders order: o)
        {
            System.out.println("the order of "+ order.getCustomerName()+  " " + order.getStatus()+ menu.get(order.getOrderId()).getDescription());
        }
    }
}

public class HungerBOX {
    public static void main(String[] args) {
        System.out.println("\n╔═══════════════════════════════════╗");
        System.out.println("║       Welcome to HungerBox 🍕     ║");
        System.out.println("╚═══════════════════════════════════╝");
        Res res=new Res("Spicy Garden");

        res.addMenu(new VegItems("dosa",50));
        res.addMenu(new VegItems("idly",50));
        res.addMenu(new VegItems("butter",100));
        res.addMenu(new VegItems("fried rice",120,true));
        res.addMenu(new VegItems("curd rice",80));
        res.addMenu(new NonVegItems("butter chicken",200, "nonveg", " chicken"));

        res.showMenu();

        Orders ord=res.placeOrder("Harshitha");
        ord.addItems(res.getItem(0));
        ord.addItems(res.getItem(1));
        ord.addItems(res.getItem(2));
        ord.addItems(res.getItem(4));

        res.showOrder();
        ord.prepareOrder();
        ord.generateBill(10);





    }
}