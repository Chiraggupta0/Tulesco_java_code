class A
{
    public void show1()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("in B show");
    }
}

class _7_34upcastAndDowncast
{
    public static void main(String args[])
    {
        A obj=(A)new B();
        obj.show1();
        //  upcasting ie object is of B but we are upcasting it to A . we call it upcasting because we are upcasting B (child) to A(parent)

        B obj1=(B) obj;
        obj1.show2();
        //  downcasting ie reference is of A but we are downcasting it to B . we call it downcasting because we are downcasting A(parent) to B (child) 

    }
}