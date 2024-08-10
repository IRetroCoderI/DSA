package Two_Pointer_Technique;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 6, 8, 10, 13};
        int target = 13;

        for(int i = 0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("Two Sum: ");
        int[] answer = twoSum(nums, target);
        System.out.println(answer[0] + " " +  answer[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            int sum = nums[left] + nums[right];
            if (sum == target) {
                // return true, or indexes/ elements
                return new int[]{left, right}; 
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1,-1};

    }
}
