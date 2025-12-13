public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Given an integer array nums, return all the triplets[nums[i], nums[j],
         * nums[k]] such that i != j, i != k and j != k and nums[i] + nums[j] + nums[k]
         * == 0.
         * 
         * Notice that the solution must not contains duplicates.
         * 
         * nums={-1,0,1,2,-1,-4}
         * output: {{-1,-1,2},{-1,0,1}}
         * Explanation:
         * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0
         * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0
         * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0
         * 
         * The distinct triplets are {-1,-1,2} and {-1,0,1}. Please note that the order
         * of the output and the order of triplets does not matter.
         * 
         * nums={0,1,1}
         * output: {}
         * Explanation: The only possible triplet does not sum up to zero.
         */
        System.out.println("Hello, World!");
    }
}
