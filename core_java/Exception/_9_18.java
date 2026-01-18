package core_java.Exception;

public class _9_18 {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        
        try{
            j=18/i;
        }
        catch(Exception a)
        {
            System.out.println("something went wrong");
        }

        System.out.println("bye");
        System.out.println(j);
    }
}
