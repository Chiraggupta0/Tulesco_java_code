class calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}
class advcal extends calc
{
    public int add(int n1, int n2)
    {
        return n1+n2+1;
    }
}
public class _6_36method_Overriding
{
    public static void main(String args[])
    {
        advcal obj = new advcal();
        int r1=obj.add(5,10);
        System.out.println(r1);
    }
}

// here both classes have same function name with same parameters but we are making object of advcal class so it will call the function of advcal class rather than cal class