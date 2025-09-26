class A extends Object
{
    public A()
    {
        this(10);
        System.out.println("in A");
    }
    public A(int n)
    {
        
        System.out.println("in A int");
    }

}
class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
    }
    public B(int n)
    {
        super();
        
        System.out.println("in B int");
    }
}
class _5_49thisandsuper
{
    public static void main(String args[])
    {
        B obj = new B(5);

        //  how this will work :--
        // super() is used to call the constructor of class which it extends while
        // this() is used to call the default constructor of the same class
        
        //  here an parameterised object of class B is made this will call parameterised constructor of class B ie public B(5);
        // then it will execute super(5); which will call parameterised constructor of class A ie public A(5) then this will call this() function which will call default constructor of class A ie public A().

        //  to call default of any class just use functions like this() and super()
        //  to call parameterised of any class just use functions like this(5) and superr(56);

        
    }
}