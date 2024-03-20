package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2,3,7,11,15};
        int target = 9;
        boolean contains = twoSum(arr,target);
        if(contains) System.out.println("there are two number that sum to target");
        else{
            System.out.println("there arent any numbers that sums to target");
        }
    }
    public static boolean twoSum(int[] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i< arr.length;i++){
            map.put(arr[i],i);
        }

        for(int j=0;j<arr.length;j++){
            if(map.containsKey(target - arr[j] ) && map.get(target -arr[j])!= j ){
                return true;
            }
        }
        return false;
    }
}
