// custom exception

package core_java.Exception;
class ChiragException extends RuntimeException
{
    public ChiragException(String string)
    {
        super(string);
    }
}
public class _9_50 {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try
        {
            j=18/i;
            if(j==0)
            {
                throw new ChiragException("this exception is created by me or custom exception");

            }
            
        }
        catch(ChiragException e)
        {
            System.out.println("custom exception hit "+e);
        }
        
        System.out.println(j);
    }
}
