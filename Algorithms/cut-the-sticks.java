import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int arr_i=0; arr_i < n; arr_i++){
            list.add(in.nextInt());
        }

        Collections.sort(list);

        while(!list.isEmpty()) {
            int min = list.get(0);
            int cut = 0;
            for(int i = 0; i < list.size(); i++) {
                if(list.get(i) >= min) {
                    cut++;
                    list.set(i, list.get(i) - min);
                }
            }

            System.out.println(cut);

            int j = 0;
            while(list.contains(0)) {
                list.remove((Integer) 0);
            }
        }

    }
}
