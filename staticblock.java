// here as you can see we have defined a static block which assigns the variable their value globally ie we can use this value anywhere and this can not be changed
// static block is run only once and it is first thing to run in the program
class Mobile
{
    String brand;
    int price;
    static String name;
    static
    {
        name="chirag";
        System.out.println("hi");
    }
    public void show()
    {
        System.out.println(brand + " : " +price +" : "+ name );

    }
}
public class staticblock
{
    public static void main(String args[])
    {
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1700;
        

       




        obj1.show();
        obj2.show();

    }
}