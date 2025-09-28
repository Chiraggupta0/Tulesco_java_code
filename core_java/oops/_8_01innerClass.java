class A
{
    int age;

    public void show()
    {
        System.out.println("in show");
    }

    class B
    // static class B -- if class is static refer line 27    
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}
public class _8_01innerClass
{
    public static void main(String args[])
    {
        A obj=new A();
        obj.show();

        A.B obj1= obj.new B();
        // if declared static then code would be
        // A.B obj1=new A.B();
        obj1.config();
    }
}