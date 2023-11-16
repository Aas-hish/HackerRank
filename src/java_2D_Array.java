
import java.io.*;
import java.util.*;


public class java_2D_Array  {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        int sum=-100;//use this cuz there are minus values also.
        for(int i=0; i<=3; ++i){
            for(int j=0; j<=3; ++j){
                int p = arr.get(i).get(j)+arr.get(i).get(j + 1)+arr.get(i).get(j + 2)+arr.get(i + 1).get(j + 1)+arr.get(i + 2).get(j)+arr.get(i + 2).get(j + 1)+arr.get(i + 2).get(j + 2);

                if(sum<p){
                    sum=p;
                }
            }
        }
        System.out.println(sum);

        bufferedReader.close();
    }
}

