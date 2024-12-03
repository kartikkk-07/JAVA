public class RemoveDuplicates {
    public static void main(String[] args) {
        int num[] = {1, 2, 2, 3, 4, 5, 5, 6};
        Solution solution = new Solution();
        int newLength = solution.removeDuplicates(num);

        // Print the array up to the new length
        for (int i = 0; i < newLength; i++) {
            System.out.print(num[i] + " ");
        }
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;  // Edge case: empty array

        int j = 0;
        for (int i = 1; i < nums.length; i++) {  // Start from 1 instead of 0
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}
