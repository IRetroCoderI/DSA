public class Array {
    public static void main(String[] args) {
        int[] nums = new int[5]; //array of ints with 5 elements
        int[] moreNums = {1, 2, 3, 4, 5}; //array of ints, initialized with 5 values

        //Accessing Elements
        int firstNum = moreNums[0]; //accesses first element (1)

        //Updating Elements
        nums[2] = 10;

        //Array Traversal

        for (int i = 0; i<moreNums.length; i++) {
            System.out.println(moreNums[i]); //Prints each element
        }


        //ASSIGNMENT PORTION
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) { //prints all numbers/ finds sum of all ints in array
            System.out.println(numbers[i]);
            sum+=numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) { //find max
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) { //find min
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


        // CODING PROBLEM
        //given an array of integers, write a function that reutrns the indices of the two numbers that add up to a specific target.

        
    }
}
