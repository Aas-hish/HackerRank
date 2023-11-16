
import java.util.regex.Matcher;
        import java.util.regex.Pattern;
        import java.util.Scanner;

public class Java_Regex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {

    // Regular expression pattern for validating an IPv4 address
    String pattern = "(([0-9]|[0-9][0-9]|[01][0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[0-9][0-9]|[01][0-9][0-9]|2[0-4][0-9]|25[0-5])";
}
