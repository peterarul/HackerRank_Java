import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static String startEnd(int start, int end, String S) {
        if(start>=0 && end<=S.length()){
            String s = S.substring(start,end);
            return s;
        }
        else {
            return "ERR";
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.print(startEnd(start,end,S));
        
    }
}
