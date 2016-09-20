import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            String s = in.next();
            char[] c = s.toCharArray();
            int j = 0;
            int counter = 0;
            while(j < c.length-1) {
                if(c[j] == c[j+1]) {
                    counter++;
                }
                j++;
            }
            System.out.println(counter);
        }
    }
}
