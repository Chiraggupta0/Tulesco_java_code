// ducking exception
package core_java.Exception;
class A{
    public void show() throws ClassNotFoundException
    {
        // Class.forName("calc");  use to check if class is present or not
    }
}
public class _9_54 {
    static
    {
        System.out.println("class loaded");
    }
    public static void main(String a[])
    {
        A obj = new A();
        try{
            obj.show();

        }
        catch(ClassNotFoundException e)
        {
            System.out.println("class does not exist" +e);
        }
    }
}
