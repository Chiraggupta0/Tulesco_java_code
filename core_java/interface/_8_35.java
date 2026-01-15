enum Status{
    Running, Failed, Pending, Success;
    //no-0,1,2,3; 
}
public class _8_35 {
    public static void main(String args[])
    {
        Status s= Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] ss=Status.values();
        System.out.println(ss[3]);
        
        for(Status g:ss)
        {
            System.out.println(g +" : " + g.ordinal());
        }
    }
}
