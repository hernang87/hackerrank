import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static void nextMove(int n, int r, int c, String [] grid) {
        int princessX = -1;
        int princessY = -1;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i].charAt(j) == 'p') {
                    princessX = j;
                    princessY = i;
                }
            }
        }

        int difX = princessX - c;
        int difY = princessY - r;

        if(difY > 0) {
            System.out.println("DOWN");
            return;
        } else if(difY < 0) {
            System.out.println("UP");
            return;
        }

        if(difX > 0) {
            System.out.println("RIGHT");
            return;
        } else if(difX < 0) {
            System.out.println("LEFT");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,r,c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];


        for(int i = 0; i < n; i++) {
            grid[i] = in.next();
        }

        nextMove(n,r,c,grid);

    }
}

