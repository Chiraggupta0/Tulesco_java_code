// enum class
enum laptop{
    macbook(2000),XPS(2200),surface,thinkpad(1800);
    
    private int price;

    // default constructor
    // it is made as each type of laptop uses parameterised constructor but surface don't have any price so it will give error so we have made a default constructor that each computer will have a minimum price of 500 
    private laptop()
    {
        price=500;
    }

    // parameterised constructor
    private laptop(int price)
    {
        this.price=price;
    }

    // to set the price of any laptop in main we can't do that because out constructor is private so we will use getter and setter

    public int getprice()
    {
        return price;
    }
    public void setprice(int price)
    {
        this.price=price;
    }
}
public class _8_46 {
    public static void main(String[] args) {
        // laptop lap=laptop.macbook;
        // System.out.println(lap.getprice());
        for(laptop lap : laptop.values())
        {
            System.out.println(lap+" : "+lap.getprice());
        }
    }
}
