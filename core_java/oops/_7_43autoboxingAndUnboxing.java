public class _7_43autoboxingAndUnboxing
{
    public static void main(String args[])
    {
        int num=7;
        Integer num1=num; //autoboxing
        int num2=num1; //autounboxing

        System.out.println(num2);


    //  function on Integer class

    String str="12";
    int num3=Integer.parseInt(str);
    System.out.println(num3*2);
    }
}