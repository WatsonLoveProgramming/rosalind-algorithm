import java.util.*;
import java.io.*;

public class test {
    public test(){}

    public void binarySearch(int n, int m, int list[], int itemList[]){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int first = 0;
            int last = n - 1;
            boolean found = false;
            int midpoint = 0;
            while ((first <= last) && !found){
                midpoint = (first + last) / 2;
                if (list[midpoint] == itemList[i]){
                    found = true;
                }
                else{
                    if (itemList[i] < list[midpoint])
                        last = midpoint - 1;
                    else
                        first = midpoint + 1;
                }
            }
            if (found)
                result.add(midpoint + 1);
            else
                result.add(-1);

        System.out.println(result.get(i));
        }
    }

    public static void main (String[] args) {
        test test1 = new test();
        try {
            BufferedReader inputStream = new BufferedReader(new FileReader("input.txt"));

            int m, n;
            m = Integer.parseInt(inputStream.readLine());
            n = Integer.parseInt(inputStream.readLine());
            int[] list = new int[m];
            int[] itemList = new int[n];

            String[] sList = inputStream.readLine().split(" ");
            for (int i = 0; i < m; i++)
                list[i] = Integer.parseInt(sList[i]);

            String[] sItemList = inputStream.readLine().split(" ");
            for (int i = 0; i < n; i++)
                itemList[i] = Integer.parseInt(sItemList[i]);

            test1.binarySearch(m, n, list, itemList);

        } catch (FileNotFoundException e) {
            System.out.println("File opening problem.");
        } catch (IOException e) {
            System.out.println("Error reading from txt file");
        }
    }
}
