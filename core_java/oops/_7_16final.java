//  final-- variable,method,class

/*final*/  class calc
//  making class final means that Advcalc class can't extend calc class this is call use of final with class.
{
    /*final*/ public void show()
    //  here we had make show function final ie advcalc object can't use show function of calc class;
    {
        System.out.println("chirag");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
class Advcalc extends calc
{
    public void show()
    {
        System.out.println("aneet");
    }
}
public class _7_16final
{
    public static void main(String args[])
    {
        final int num=8;
        //num=9;
        //  here we have used final with num making it constant ie we can't change it.
        // final with variable
        System.out.println(num);




        // final with class and function

        Advcalc obj = new Advcalc();
        obj.show();
        obj.add(5,4);
    }
}