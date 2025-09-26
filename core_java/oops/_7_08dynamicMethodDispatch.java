class A
{
    public void show()
    {
        System.out.println(" in A show");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println(" in B show");
    }
}
class C extends A
{
    public void show()
    {
        System.out.println(" in C show");
    }
}
public class _7_08dynamicMethodDispatch
{
    public static void main(String args[])
    {
        A obj = new B();
        //  here we have created reference of A class ie parent class and created an instance of b class
        // we can do this as b extends a 
        //  can have child object for parent variable
        obj.show();

        obj=new A();
        obj.show();

        obj=new C();
        obj.show();
    }
}


//  this is an example of run time polymorphism as only at run time we will know which class's show will be called