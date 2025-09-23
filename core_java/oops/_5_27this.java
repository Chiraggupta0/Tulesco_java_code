class Human
{
    private int age;
    private String name;

    public void setage(int age)
    {
        this.age=age;
        //  here age is parameter which takes value and then gives that value to the local variable ie age of the class defined above
        // this keyword helps to call the object of the class
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
class _5_27this
{
    public static void main(String args[])
    {
        Human obj= new Human();
        obj.setage(25);
        obj.setname("gupta");
        System.out.print(obj.getname()+":"+obj.getage());
    }
}