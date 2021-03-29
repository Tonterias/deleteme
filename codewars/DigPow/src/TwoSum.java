public class TwoSum {

    public static void main(String[] args) {
        // Input: nums = [2,7,11,15], target = 9
        // public static int[] twoSum(int[] numbers, int target)
        // Output: [0,1]
        System.out.println(
                "============= Kata TwoSum : https://www.codewars.com/kata/52c31f8e6605bcc646000082/discuss  ======================");
        int[] nums = { 2, 7, 11, 15 };
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

        for (int i : result) {
            System.out.println("I: " + i);
        }
        return result;
    }
}
