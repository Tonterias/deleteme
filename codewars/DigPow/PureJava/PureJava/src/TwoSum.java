// Obtain a text file from Project Gutenberg (or anywhere else).
// Using streams, create a list of all words in the text file.

// Tips:
// First read the file using the Files class.
// Split each line into an array of strings (words)
// Transform the arrays of strings into lists of strings: use Arrays.asList()
// Flatten the data structure
// Collect the final stream together into a list.

public class TwoSum {

    public static void main(String[] args) {
        // Input: nums = [2,7,11,15], target = 9
        // public static int[] twoSum(int[] numbers, int target)
        // Output: [0,1]
        System.out.println("============= Kata : two sum ======================");
        int[] nums = { 1234, 5678, 9012 };
        int target = 9;
        System.out.println(" Kata : two sum " + twoSum(nums, target));

    }

    private static int[] twoSum(int[] nums, int target) {
        // recorro y sumo cada uno con el resto y veo si da 9
        //
        int sum = 0;
        int[] result = { 0, 0 };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    sum = nums[i] + nums[j];
                    if (sum == target) {
                        result[0] = nums[i];
                        result[1] = nums[j];
                        // System.out.println(" Kata : " + result[0] + " " + result[1]);
                    }
                }
            }
        }
        return result;
    }
}
