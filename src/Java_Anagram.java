
import java.util.Scanner;

public class Java_Anagram  {

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int res = 0;
        for (int i = 0; i < a.length(); i++) {
            res ^= a.charAt(i);
            res ^= b.charAt(i);
        }

        return res == 0;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
