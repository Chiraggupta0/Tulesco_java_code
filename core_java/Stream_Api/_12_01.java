// stream api

package core_java.Stream_Api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _12_01 {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,5,7,3,2,6);
        // printing values


        // for(int i=0;i<nums.size();i++)
        // {
        //     System.out.println(nums.get(i));
        // }
        // for(int n:nums)
        // {
        //     System.out.println(n);
        // }

        
        // function to print each value in list 
        nums.forEach(n -> System.out.println(n));



        // i want to take only even values, double it , add both and print it
        // int sum=0;
        // for(int n:nums)
        // {
        //     if(n%2==0)
        //     {
        //         n=n*2;
        //         sum+=n;
        //     }

        // }
        // System.out.println(sum);
    }
}
