@FunctionalInterface
interface a{
    void show(int i);
}
public class _9_01 {
    public static void main(String[] args) {
        a obj = new a()
        // use of anoynomous inner class
        // there are two ways to call show 
        // 1-> using anoynomous inner class
        // 2-> by defining a class which implements our interface A and then making object of that class and calling it.
        {
            public void show(int i)
            {
                System.out.println("in show" + i);
            }
        };
        obj.show(5);
    }
    
}
//  we have coded this to understand lambda expression