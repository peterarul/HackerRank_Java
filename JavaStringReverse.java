import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String s = new StringBuilder(A).reverse().toString();
        System.out.println(((A.compareTo(s) == 0)) ? "Yes" : "No");
    }
}
