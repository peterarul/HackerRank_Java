import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        // Write your code here.
        if(s.length() > 400000 || s.length() == 0 ){

           System.out.println(0);
        }else
        {String reg = "[ !,?._'@]+";
        //System.out.println(s);
        String[] tokens = s.split(reg);
        System.out.println(tokens.length);
        for(String str: tokens){
            System.out.println(str);
        }}
        scan.close();
    }
}
