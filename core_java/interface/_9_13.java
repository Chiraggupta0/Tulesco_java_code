// continuation of _9_01 to explain lambda function
// lambda function are always used with functional interfaces
@FunctionalInterface
interface a{
    void show(int i);
}

interface b{
    int sum(int i,int j);
}
public class _9_13 {
    public static void main(String[] args) {
        // a obj = new a()
        // {
        //     public void show(int i)
        //     {
        //         System.out.println("in show"+i);
        //     }
        // };
        // obj.show(5);

        // using lambda function (->)we remove the part of code which compiler already knows in advance and is obvious


        a obj=i -> System.out.println("in lambda show" + i);
        obj.show(5);
        // in this if there are two parameters like i and j then we will use (i,j)-> like this




        b obj1=(i,j)->i+j;
        System.out.println(obj1.sum(2,3));
    }
    
}
