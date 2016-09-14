import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static void displayPathtoPrincess(int n, String [] grid){
        int robotX = -1;
        int robotY = -1;
        int princessX = -1;
        int princessY = -1;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i].charAt(j) == 'm') {
                    robotX = j;
                    robotY = i;
                } else if(grid[i].charAt(j) == 'p') {
                    princessX = j;
                    princessY = i;
                }
            }
        }

        int difX = robotX - princessX;
        if(difX > 0) {
            while(robotX > princessX) {
                System.out.println("LEFT");
                robotX--;
            }
        } else if(difX < 0) {
            while(robotX < princessX) {
                System.out.println("RIGHT");
                robotX++;
            }
        }

        int difY = robotY - princessY;
        if(difY > 0) {
            while(robotY > princessY) {
                System.out.println("UP");
                robotY--;
            }
        } else if(difY < 0) {
            while(robotY < princessY) {
                System.out.println("DOWN");
                robotY++;
            }
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

	displayPathtoPrincess(m,grid);
    }
}

