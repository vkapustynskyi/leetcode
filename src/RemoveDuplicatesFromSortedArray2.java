import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray2 {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        int[] expectedNums = new int[]{0, 0, 1, 1, 2, 3, 3};

        int k = removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }


    public static int removeDuplicates(int[] nums) {
        int counter = 2;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] == nums[i + 1]) {
                nums[i + 1] = ++nums[i];
                counter++;
            }
        }
        return counter;
    }

}
