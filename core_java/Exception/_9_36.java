package core_java.Exception;

public class _9_36 {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0)
            {
                throw new ArithmeticException("i don't want o");
            }
        }
        catch(ArithmeticException e)
        {
            j=18/1;
            System.out.println("that is the default output "+ e);
        }
        catch(Exception e)
        {
            System.out.println("something went wrong");

        }
        System.out.println(j);
    }
}
