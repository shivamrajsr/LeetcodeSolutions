package leetcode;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {2,3,7,11,15,-2,-5,-13};
        int target = 0;
        boolean contains = threeSum(arr,target);
        if(contains) System.out.println("there are three number that sum to 0");
        else{
            System.out.println("there arent any three numbers that sums to 0");
        }
    }
    public  static boolean threeSum(int[] arr,int target){
        int len  = arr.length;
        Arrays.sort(arr);
        int j = 0, k = len-1;

        for(int i=0;i<len-2;i++){
            if(arr[i]>0) break;
            j = i+1;
            k = len-1;
            int sum = -arr[i];
            while(j<k){
                if(arr[j]+arr[k]==sum){
                    System.out.println("mil gyaa");
                    System.out.println("indexes are : "+ i +" "+ j+ " "+ k);
                    System.out.println("numbers are :"+ arr[i] + " " +arr[j] + " "+arr[k]);
                    while(j<k && arr[j]==arr[j+1]){j++;};
                    while(j<k && arr[k]==arr[k-1]){k--;};
                    return true;
                }
                else if(arr[j]+arr[k]< sum) {
                    j++;
                }
                else k--;
            }
        }
        return false;
    }
}
