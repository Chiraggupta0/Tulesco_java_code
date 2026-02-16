// collection interface
// collection have 
// 1- List
// it has :
//     1-ArrayList
//     2-LinkedList

// 2- Queue
// it has:
//     1-DeQueue

// 3- Set
// it has:
//     1-HashSet
//     2-Linked HAshSet

// list and collection object
package core_java.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class _11_17 {
    public static void main(String[] args) {
        
        // Collection<Integer> nums= new ArrayList<>();


        // by using collections we can use indexes of our values like nums(2) so we generally does not use that 


        List<Integer>nums = new ArrayList<>(); //can have duplicate values
        nums.add(6);
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(6);
        nums.add(62);
        System.out.println(nums.indexOf(62));
        System.out.println(nums.get(1));

        for(int n:nums)
        {
            System.out.println(n);
        }
        


    }
}
