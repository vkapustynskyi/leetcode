public class JumpGame {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 1, 4};

        boolean result = Solution.canJump(nums);

        System.out.println(result);
    }

    private static class Solution {
        public static boolean canJump(int[] nums) {
            int indexToReach = nums.length - 1;
            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i] + i >= indexToReach) {
                    indexToReach = i;
                }
            }
            return indexToReach == 0;
        }
    }

}
