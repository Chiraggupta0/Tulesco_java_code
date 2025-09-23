class Human
{
    private int age=11;
    private String name="chirag";
    public int getage()
    {
        return age;
    }
    public String getname()
    {
        return name;
    }
}
public class _5_13encapsulation
{
    public static void main(String args[])
    {
        Human obj = new Human();
        // obj.age=11;
        // obj.name="chirag";
        System.out.println(obj.getage()+":"+obj.getname());
    }
}