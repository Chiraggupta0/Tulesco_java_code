// for  each
package core_java.Stream_Api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _12_08 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n)
        //     {
        //         System.out.println(n);
        //     }
        // };


        // the above code takes values which are given by forEach and then it accept it using accept function and in that function we can perform any task on the number 

        //  converted consumer into lambda function

        Consumer<Integer> con=n ->
            {
                System.out.println(n);
            };

        nums.forEach(con);
        // we can use   nums.forEach(n-> System.out.println(n)); 
        // so instead of con we can above this statement which we have already used in file _!2_01.java
    }
}
