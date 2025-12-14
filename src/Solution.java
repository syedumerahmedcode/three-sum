
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /**
         * We sort the array.
         */
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        /**
         * Run a foor loop across given input nums. Please note that we only runs the
         * loop until nums[i]<0 as after that point, all successive numbers in the loop
         * are positive (due to sorting applied above) and there sum can never be zero
         * (one condition for determin the triplets).
         */
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            /**
             * If nums[i] == nums[i - 1], we ignore it.
             */
            if (i == 0 && nums[i] != nums[i - 1]) {
                /**
                 * calling twoSum()
                 */
            }
        }
        return result;

    }

    void twoSum(int[] nums, int i, List<List<Integer>> result) {
        /**
         * initializing left and right pointers
         */
        int left = 0;
        int right = nums.length - 1;

        /**
         * run until left is less than right
         */
        while (left < right) {
            /**
             * This variable calculates the total sum
             */
            int sum = nums[i] + nums[left] + nums[right];
            /**
             * if sum <0, increase the value of left pointer
             */
            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                /**
                 * if sum >0, decrease the value of right pointer
                 */
                right--;
            } else {
                // here the sum is 0
                /**
                 * Add it to the result
                 */
                result.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                /**
                 * update the left pointer until the two adjacent values of left are same or not
                 */
                while (left < right && nums[left] != nums[left - 1]) {
                    left++;
                }
            }

        }

    }
}