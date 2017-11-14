import java.util.*;
import java.io.*;

public class test {

    public static void main(String[] args) {
        try  {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

            int m = Integer.parseInt(reader.readLine());
            int[] a = new int[m];
            String ap[] = reader.readLine().split(" ");
            for (int i = 0; i < m; i++)
                a[i] = Integer.parseInt(ap[i]);

            int n = Integer.parseInt(reader.readLine());
            int[] b = new int[n];
            String bp[] = reader.readLine().split(" ");
            for (int i = 0; i < n; i++)
                b[i] = Integer.parseInt(bp[i]);

            merge(a,b,m,n);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void merge(int a[],int b[], int m, int n){

        int c[] = new int[m + n];
        int i = 0, j = 0;
        for (int k = 0; k < m + n; k++){
            if(k == m + n - 1){
                if(a[i] < b[j]){
                    c[k] = b[j];
                } else {
                    c[k] = a[i];
                }
            }else {
                if(a[i] < b[j]){
                    c[k] = a[i];
                    if(i != m-1)
                        i++;
                } else {
                    c[k] = b[j];
                    if(j != n-1)
                         j++;
                }
            }


            System.out.print(c[k] + " ");
        }
    }

}