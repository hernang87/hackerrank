import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = Integer.parseInt(in.nextLine());
        String s = in.nextLine();
        String beautiful = s.replaceAll("010", "b");
        int changes = beautiful.replaceAll("[01]", "").length();
        System.out.println(changes);
        in.close();
    }
}
