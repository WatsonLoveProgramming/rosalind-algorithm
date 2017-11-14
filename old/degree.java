import java.util.*;
import java.io.*;

public class test {

    public static void main(String[] args) {
        try  {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String[] nums = reader.readLine().split(" ");
            int V = Integer.parseInt(nums[0]);
            int E = Integer.parseInt(nums[1]);

            int[] degree = new int[V];

            while (reader.ready()) {
                String str[] = reader.readLine().split(" ");
                int a = Integer.parseInt(str[0]);
                int b = Integer.parseInt(str[1]);
                degree[a-1]++;
                degree[b-1]++;
            }


            for (int i = 0; i < V; i++) {
                System.out.println(degree[i]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}