public class LowestNum {
    public static int Find(int[] nums) {
        int lowest = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < lowest) {
                lowest = nums[i];
            } 
        }
        return lowest;
    }
}
