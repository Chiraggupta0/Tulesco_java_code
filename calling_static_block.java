class Mobile
{
    String brand;
    int price;
    static String name;
    static
    {
        name="chirag";
        System.out.println("inside static");
    }
    public void show()
    {
        System.out.println(brand + " : " +price +" : "+ name );

    }
}
public class calling_static_block
{
    public static void main(String args[]) throws ClassNotFoundException
    {
        Class.forName("Mobile");
        // Mobile obj1=new Mobile();
        // obj1.brand="Apple";
        // obj1.price=1500;
        

        // Mobile obj2=new Mobile();
        // obj2.brand="Samsung";
        // obj2.price=1700;
        // obj1.show();
        // obj2.show();

    }
}