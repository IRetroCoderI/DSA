package LeetCode;

import java.util.HashMap;

@SuppressWarnings("unused")
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        //find nums that, when added together, equal to target
        //return index of the two nums
        //in above: returns nums[0], nums[1]
    }

    
    public static int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        
        for(int i = 0; i<nums.length; i++){ //store numbers, and their indexes
        //    hashMap.put(nums[i], i); //element, element index
            int num = nums[i]; 
            int complement = target - num; //calculate complement of num be subtracting it from target

            if (hashMap.containsKey(complement)) { //if hashmap contains the complement...
                return new int[] { hashMap.get(complement), i }; //return complement's index, and nums index (i)
            }

            hashMap.put(num, i); //if it doesnt exist, put the current number and its index in hashmap
        }
        
        
        return new int[0]; //if no solution, return empty array/throw error
        
    }
    
}
