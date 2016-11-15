import java.io.*;
import java.util.*;

public class Solution {
   static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        a = a.toLowerCase();
        b = b.toLowerCase();
        if((a.length() != b.length())&& (a.trim()!=null && b.trim()!=null) ) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<a.length(); i++) {
            if(map.containsKey(a.charAt(i))){
                Integer counter = map.get(a.charAt(i));
                map.put(a.charAt(i),++counter);
                //System.out.println(">>> "+counter);
            }
            else{
                map.put(a.charAt(i),1);
            }
        }
        for(int k = 0; k <b.length(); k++){
            if(!map.containsKey(b.charAt(k))) return false;
            Integer counter = map.get(b.charAt(k));
            if( counter == 0 ) return false;
            else map.put( b.charAt(k), --counter);
            //System.out.println("<<< "+counter);
        }
        return true;
    }
public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
