import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.LocalDate;

public class Solution {
    public static String whatDay(String month, String day, String year){
        int mm = Integer.parseInt(month);
        int dd = Integer.parseInt(day);
        int yyyy = Integer.parseInt(year);
        LocalDate d = LocalDate.of(yyyy, mm, dd);
        return d.getDayOfWeek().toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        System.out.print(whatDay(month,day,year));
    }
}
