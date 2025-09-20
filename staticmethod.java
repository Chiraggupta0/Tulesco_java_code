// static method is always called with the class name and not with object name
// we can't use not static variables in static method
// to use non static variable in static method we have to call it by passing parameter to static method of the ibject we want to use 
class Mobile
{
    String brand;
    int price;
    static String name;
    public void show()
    {
        System.out.println(brand + " : " +price +" : "+ name );

    }
    public static void show1(Mobile obj)
    {
         System.out.println(obj.brand + " : " +obj.price +" : "+ name );
    }
}
public class staticmethod
{
    public static void main(String args[])
    {
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1700;
        Mobile.name="phone";
        

        obj1.show();
        obj2.show();
        Mobile.show1(obj1);
    }
}