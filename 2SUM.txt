import java.util.*;
import java.io.*;

public class test {

    public static void main(String[] args) {
        try  {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

            String[] nums = reader.readLine().split(" ");
            int m = Integer.parseInt(nums[0]);
            int size = Integer.parseInt(nums[1]);
            int[] arr = new int[size];


            while (reader.ready()) {
                String pp[] = reader.readLine().split(" ");
                for (int i = 0; i < size; i++)
                    arr[i] = Integer.parseInt(pp[i]);
                System.out.println(sumzero(arr, size));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    static String sumzero(int arr[], int size) {
        boolean found = false;
        String tmp = "";
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if(arr[i] * (-1) == arr[j] && i < j){
                    found = true;
                    tmp = (i+1) + " " + (j+1);
                }
            }
        }
        if(found)
            return tmp;
        else
            return "-1";
    }

}