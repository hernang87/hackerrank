import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int index = 0; index < t; index++) {
            int m = in.nextInt();
            int n = in.nextInt();
            int[] costs = new int[n];

            for(int i = 0; i < n; i++) {
                costs[i] = in.nextInt();
            }

            int i = 0;
            int j = 0;
            boolean found = false;
            while(i < costs.length - 1 && !found) {
                j = i + 1;

                while(j < costs.length && !found) {
                    int currentSum = costs[i] + costs[j];

                    if(currentSum == m) {
                        found = true;
                    }

                    j++;
                }

                i++;
            }

            if(i < j) {
                System.out.print(i);
                System.out.print(" ");
                System.out.print(j);
            } else {
                System.out.print(j);
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
