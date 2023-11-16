
import java.io.*;
        import java.util.*;

public class java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if(s.trim().length() == 0){
            System.out.println(0);
        }else{
            String[] result = s.trim().split("[ .,?!'@_]+");

            System.out.println(result.length);
            for (String token : result)
                System.out.println(token);
        }

        scan.close();
    }
}


