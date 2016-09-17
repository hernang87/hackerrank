import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.next();
        }

        int q = in.nextInt();

        for(int i = 0; i < q; i++) {
            String query = in.next();
            int counter = 0;
            for(int j = 0; j < n; j++) {
                if(arr[j].equals(query)) {
                    counter++;
                }
            }

            System.out.println(counter);
        }

    }
}
