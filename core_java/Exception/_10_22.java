package core_java.Exception;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class _10_22 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num=0;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
        {
            num=Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}
