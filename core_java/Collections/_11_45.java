// sorting 
// comparator
package core_java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _11_45 {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i , Integer j)
            {
                if(i%10 > j%10)
                    return 1;
                else return -1;
            }
        };

        List<Integer> nums= new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);
        //  compare the last digit of each number and sort then on the basis of the last digit using comparator
        Collections.sort(nums,com);

        System.out.println(nums);


        // comparator to sort string on the basis of their length

        List<String> num= new ArrayList<>();
        Comparator<String> len = new Comparator<String>() {
            public int compare(String i,String j)
            {
                if(i.length()>j.length()) return 1;
                else return -1;
            }
        };
        num.add("chirag");
        num.add("anuj");
        num.add("shourya");
        num.add("kavya");
        Collections.sort(num,len);
        System.out.println(num);

    }
    
}
