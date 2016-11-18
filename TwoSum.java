/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author arulpeter
 */
public class TwoSum {

    /**
     * @param args the command line arguments
     */
    //O(n) runtime O(n) space using HashMaps
    int[] indicies =new int[2];
    public  int[] twoSum(int[] arrayOfNums, int target) {
        if(arrayOfNums.length <= 1) {
            return null;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< arrayOfNums.length; i++){
            map.put(arrayOfNums[i], i);
            int x = arrayOfNums[i];
            int match  = target - x;
            if(map.containsKey(match)) {
                indicies[0] = map.get(match)+1;
                indicies[1] = i+1;
                
            } 
        }
        return indicies;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] index = new int[2];
        TwoSum two = new TwoSum();
        index = two.twoSum(numbers,target);
        if (index[0] >=  index[1] ){
               System.out.println("No solution");
            } else {
            System.out.print(Arrays.toString(index));
        }
        
    }
    
}
