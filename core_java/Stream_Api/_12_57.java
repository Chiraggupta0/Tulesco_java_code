package core_java.Stream_Api;
//  record class
record alien(int id,String name)
{

}
public class _12_57 {
    public static void main(String[] args) {
        alien a1 = new alien(0,"chirag");
        alien a2=new alien(1, "gupta");

        System.out.println(a1);
        System.out.println(a2);
    }
    
}
