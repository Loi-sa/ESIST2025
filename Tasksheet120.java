public class Tasksheet120 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 10};
        int totalSum = sumAndCumulativeSum(nums);
        System.out.println("Total Sum: " + totalSum);
    }

    public static int sumAndCumulativeSum(int... nums) {
        int totalSum = 0;

        for (int x = 0; x < nums.length; x++) {
            int currentNum = nums[x];
            int cumulativeSum = 0;

            for (int y = 1; y <= currentNum; y++) {
                cumulativeSum += y;
            }
            totalSum += cumulativeSum;
            System.out.println("Number: " + currentNum + ", Cumulative Sum: " + cumulativeSum);
        }
        return totalSum;
    }
}
