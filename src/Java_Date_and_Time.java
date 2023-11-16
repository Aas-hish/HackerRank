
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        String result = "";
        switch (dayOfWeek){
            case 2: result = "MONDAY";break;
            case 3: result =  "TUESDAY";break;
            case 4: result =  "WEDNESDAY";break;
            case 5: result =  "THURSDAY";break;
            case 6: result =  "FRIDAY";break;
            case 7: result =  "SATURDAY";break;
            case 1: result =  "SUNDAY";break;
        }

        return result;
    }

}

public class Java_Date_and_Time {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
