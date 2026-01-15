// Class - Class ->extends
// Class - interface ->implements
// interface - interface ->extends
interface A  // here interface is abstract and its funcions are also abstract so we have declared them as interface as interface is public abstract
{
    int age=21;
    String area="gurgoan";  // variable in interfae are always final and static
    void show();
    void config();
}
interface X
{
    void run();
}
interface Y extends X
{

}
class B implements A,Y
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
    public void run()
    {
        System.out.println("running");
    }

}
public class _8_24
{
    public static void main(String args[])
    {
        A obj = new B();
        // here we have created object of B as we can't create object of interface
        obj.show();
        obj.config();
        Y obj1 = new B();
        obj1.run();
        System.out.println(A.age);
        System.out.println(A.area);
    }
}