// set
// 
// can not have duplicate element
// does not have indexes
package core_java.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class _11_30 {
    public static void main(String[] args) {
        // Set<Integer> nums= new HashSet<>();
        //  to have sorted values
        Set<Integer> nums= new TreeSet<>();
        //  we can also use  Collections<Integer> nums= new TreeSet<>();
        nums.add(6);
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(6);

        for(int n:nums)
        {
            System.out.println(n);
        }



        // we can also use iterator 
        Iterator<Integer> values = nums.iterator();
        while(values.hasNext())
            System.out.println(values.next());
    
    }  
}
