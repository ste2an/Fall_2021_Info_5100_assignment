package midTerm;

import java.util.HashMap;
import java.util.Map;

public class question3 {
    public static void main(String[] args) {
        int[] arr =  {1,3,-1,3,4,-1};
        int[] nums = {1,1};
        System.out.println(sumOfRepeatedNum(arr));
        System.out.println(sumOfRepeatedNum(nums));
    }

    /**
     *
     * Question 3) For the given array, return the sum of all the numbers which are repeated.
     * Ex: Input : array = {1,3,-1,3,4,-1}
     *       Output : 3 + (-1) = 2
     */

    public static int sumOfRepeatedNum(int[] arr){
        int len = arr.length;

        if(len < 2){
            return Integer.MIN_VALUE;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
        }
        int res = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() != 1){
                res += entry.getKey();
            }
        }

        return res;
    }
}
