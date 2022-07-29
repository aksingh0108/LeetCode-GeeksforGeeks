class Solution {
    public void moveZeroes(int[] nums) {
         int right=0;
        int left=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)right++;
            else{
           int temp = nums[left];
           nums[left] = nums[right];
              nums[right] = temp;
                right++;
                left++;
            }
        }
        
    }
}