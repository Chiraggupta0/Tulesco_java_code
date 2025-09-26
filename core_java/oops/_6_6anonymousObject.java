class A
{
    public A()
    {
        System.out.println("object created");
    }
    public void show()
    {
        System.out.println("in a show");
    }
}
public class _6_10anonymousObject
{
    public static void main(String args[])
    {
        new A();    //anonymoue object created
        new A().show();   //here another object is created calling show function also
        new A().show();  // each time we call , new object is created
         //we can't use same anonymous fuction every time .
         //every time an object is called a new one is created


    }
}