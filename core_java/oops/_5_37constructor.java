class Human
{
    private int age;
    private String name;

    public Human()  // default constructor
    {
         age=12;
         name="human";
    }

    public Human(int a,String n)  // parameterised constructor
    {
         age=a;
         name=n;
    }


    public void setage(int age)
    {
        this.age=age;
    }
    public int getage()
    {
        return age;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
}
class _5_37constructor
{
    public static void main(String args[])
    {
        Human obj= new Human();
        System.out.println(obj.getname()+":"+obj.getage());
        //  here after creating a object default constructor is called so the value we defined in human() constructor are called while in the last three lines we are changing the values of age and name so the new age and name values will be printed
        Human obj1 = new Human(10,"navin");
        //  above is a parameterised constructor in which we are passing values and that values are being given to the parameterised constructor in human class
        System.out.println(obj1.getname()+":"+obj1.getage());
        obj.setage(25);
        obj.setname("gupta");
        System.out.println(obj.getname()+":"+obj.getage());
    }
}