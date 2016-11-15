import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {
    private static final String IPADDRESS_PATTERN = "(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])";
    public String pattern = String.format("%s.%s.%s.%s", IPADDRESS_PATTERN, IPADDRESS_PATTERN, IPADDRESS_PATTERN, IPADDRESS_PATTERN);
}