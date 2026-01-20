interface Computer
{
    void code();
}   
class Laptop implements Computer 
{
    public void code()
    {
        System.out.println("code, compile, run");

    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run : faster");

    }
}
class Developer
{
    public void devApp(Computer x)
    {
        x.code();
    }
}

public class _8_15interface
{
    public static void main(String args[])
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer chirag = new Developer();
        chirag.devApp(desk);
        chirag.devApp(lap);
    }
}