
import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class java_list  {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan =new Scanner(System.in);
        List<Integer> intlist=new ArrayList<>();
        int n =scan.nextInt();
        for(int i=0;i<n;i++){
            int elem=scan.nextInt();
            intlist.add(elem);
        }
        n=scan.nextInt();
        for(int i=0;i<n;i++){
            if(scan.next().equals("Insert"))
                intlist.add(scan.nextInt(),scan.nextInt());
            else
                intlist.remove(scan.nextInt());
        }
        scan.close();

        for (int value : intlist) {
            System.out.print(value +" ");

        }

    }
}
