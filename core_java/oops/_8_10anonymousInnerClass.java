class A
{
    public void show()
    {
        System.out.println("in A show");
    }
}

public class _8_10anonymousInnerClass
{
    public static void main(String args[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
//  suppose we don't want to redefine the method and don't want to do method overriding then we can simply define class method just after object creation this is called as anonymous inner class as there is no name to the class .