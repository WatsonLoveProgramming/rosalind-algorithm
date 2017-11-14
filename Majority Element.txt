import java.util.*;
import java.io.*;

public class test {

    public static void main(String[] args) {
        try  {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String[] nums = reader.readLine().split(" ");
            int k = Integer.parseInt(nums[0]);
            int n = Integer.parseInt(nums[1]);
            int[] current = new int[n];
            int result[] = new int[k];
            int j = 0;

            while (reader.ready()) {
                String pcurrent[] = reader.readLine().split(" ");
                for (int i = 0; i < n; i++)
                    current[i] = Integer.parseInt(pcurrent[i]);
                result[j] = majority(current);
                j++;
            }
            for (int i = 0; i < k; i++)
                System.out.println(result[i]);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static int majority(int[] a){
        int counter=0;
        int candidate=0;

        for(int i=0;i<a.length;i++){
            if(a[i]==a[candidate]){
                counter++;
            }else{
                counter--;
            }
            if(counter==0){
                candidate=i+1;
            }
        }

        if(candidate==a.length){
            return -1;
        }
        counter=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==a[candidate]){
                counter++;
            }
        }
        if(counter>a.length/2){
            return a[candidate];
        }else{
            return -1;
        }
    }


}