// stream api
// filter,map,reduce
// it  does not changes the original list while performing some operations on it

// once you use the stream you can not reuse it
package core_java.Stream_Api;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;

public class _12_14 {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
        Stream<Integer> s1= nums.stream();
        //  we have to store value of s1 in s2 as stream can only be used once and we have used it while using filter version 
        //  use once means we can not even print s1 two times. we can only use it once.
        Stream<Integer> s2=s1.filter(n-> n%2==0);  //filtering even number from list

        Stream<Integer> s3= s2.map(n->n*2);
        // s3.forEach(n->System.out.println(n));

        //  we want to add those values also
        //  we use reduce 
        int result=s3.reduce(0,(c,e)->c+e);
        System.out.println(result);;
        
    }
}
