class Human
{
    private int age;
    private String name;

    public void setage(int a)
    {
        age=a;
    }
    public int getage()
    {
        return age;
    }
    public void setname(String n)
    {
        name=n;
    }
    public String getname()
    {
        return name;
    }
}
class _5_25gettersetter
{
    public static void main(String args[])
    {
        Human obj= new Human();
        obj.setage(25);
        obj.setname("gupta");
        System.out.print(obj.getname()+":"+obj.getage());
    }
}