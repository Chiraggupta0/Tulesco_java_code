//  toString is a function which is automatically called when an object is called without any variable or function name
class laptop
{
    String model;
    int price;
    public String toString()
    {
        return model+" "+price;
    }
}


public class _7_26tostring
{
    public static void main(String args[])
    {
        laptop obj = new laptop();
        obj.model="lenovo";
        obj.price=1000;
        System.out.println(obj);
        //  to prove that tostring is called with obj we will define a function naming toString() which should be automatically called by obj in line 16.
    }
}