// annotation
class a{
        
    public void show()
        {
            System.out.println("in a");
        }
        
    }

    class b extends a{
        //  override is an annotation which tels our compiler that this method in overridden
        @Override
        public void show(){
            System.out.println("in b");
        }
    }
public class _8_53 {
    public static void main(String[] args) {
        b obj = new b();
        obj.show();
    }
}
