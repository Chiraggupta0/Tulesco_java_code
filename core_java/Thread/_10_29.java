// initializing and using thread 
//  thread will always have a function name as run and will always be called by start
package core_java.Thread;
class A extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("hi");
        }
    }
}

class B extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("hello");
        }
    }
}
public class _10_29 {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        obj1.start();
        obj2.start();

    }
}
