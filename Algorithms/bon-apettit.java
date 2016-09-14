import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int annaPayed = in.nextInt();
        int shared = 0;
        for(int j = 0; j < n; j++) {
            if(j != k) {
                shared += arr[j];
            }
        }

        int diff = annaPayed - shared/2;
        if(diff == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(diff);
        }
    }
}
