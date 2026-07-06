// taking input

package core_java.Exception;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;

public class _10_3 {
    public static void main(String[] args) throws IOException { 
        System.out.println("enter a number");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(in);

        // it gives number in a string format so we use Integer.parseInt to convert that into integer
        int num=Integer.parseInt(bf.readLine());
        System.out.println(num);
        

        Scanner sc = new Scanner(System.in);
        int num2=sc.nextInt();
        System.out.println(num2);
        sc.close();
        bf.close();
    }
}
