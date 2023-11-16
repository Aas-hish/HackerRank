
import java.io.*;
        import java.util.*;

public class Java_String_Introduction  {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Read both the strings `a and b` from the user.
            String a = input.nextLine();
            String b = input.nextLine();

            // Print the total length of strings `a` and `b`.
            System.out.println(a.length() + b.length());

            // Compare strings `a` and `b` lexicographically and print `Yes` if a > b, else print "No".
            System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");

            // Capitalize the first letter of `a` and `b` and display them with a space in between.
            System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase() + b.substring(1));
        }
    }









