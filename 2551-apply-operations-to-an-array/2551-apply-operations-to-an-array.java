class Solution {
    public int[] applyOperations(int[] nums) {
        int size = nums.length;
        int pointer1 = 0;
 
        while (pointer1 < size - 1) {
            if (nums[pointer1] == nums[pointer1 + 1]) {
                nums[pointer1] *= 2;
                nums[pointer1 + 1] = 0;
            }
            pointer1++;
        }
 
        int pointer2 = 0; 

        for (int i = 0; i < size; i++) {
            if (nums[i] != 0) {
                nums[pointer2++] = nums[i];
            }
        }

         
        for (int i = pointer2; i < size; i++) {
            nums[i] = 0;
        }

        return nums;
    }
}
