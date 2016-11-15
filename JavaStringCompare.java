import java.io.*;
import java.util.*;

public class Solution {
      
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        ArrayList<String> al = new ArrayList<String>();
        for(int i =0; i <=s.length()-k;i++){
            al.add(s.substring(i,i+k));
        }
        //System.out.println(">>"+al);
        Collections.sort(al);
        //System.out.println("<<"+al);
        System.out.println(al.get(0));
        System.out.println(al.get(al.size()-1));
        
        
        
         
    }
}