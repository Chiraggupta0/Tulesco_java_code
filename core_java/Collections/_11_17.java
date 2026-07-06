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
// list follows----
// Maintains insertion order
// Allows duplicate elements
// Supports index-based access
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



// public class Main {

//     public static void main(String[] args) {

//         List<Integer> list = new ArrayList<>();

//         // add()
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.add(40);
//         System.out.println("List after add(): " + list);

//         // get()
//         System.out.println("Element at index 1: " + list.get(1));

//         // set()
//         list.set(1, 50);
//         System.out.println("After set(): " + list);

//         // remove()
//         list.remove(2);
//         System.out.println("After remove(): " + list);

//         // size()
//         System.out.println("Size of list: " + list.size());

//         // contains()
//         System.out.println("Contains 50? " + list.contains(50));

//         // indexOf()
//         System.out.println("Index of 40: " + list.indexOf(40));

//         // isEmpty()
//         System.out.println("Is list empty? " + list.isEmpty());

//         // clear()
//         list.clear();
//         System.out.println("After clear(): " + list);

//     }
//}