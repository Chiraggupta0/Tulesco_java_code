// printing exception
//  different exception has different catch block based on theirr exception 
// explained in notes so refer that 
package core_java.Exception;

public class _9_30 {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int nums[]=new int[5]; 
        String str=null;
        try{
            j=18/i;
            System.out.println(str.length());
            System.out.println(nums[5]);

        }
        catch(ArithmeticException e)
        {
            System.out.println("can't divide by zero");

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("accessing invalid element");
        }
        catch(Exception a)
        {
            System.out.println("something went wrong");
        }

        System.out.println("bye");
        System.out.println(j);
    }
    
}
