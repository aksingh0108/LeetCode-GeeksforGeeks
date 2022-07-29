class Solution {
    public int pivotIndex(int[] nums) {
         int rightSum=0,leftSum=0;
        for(int i=0;i<nums.length;i++){
            rightSum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            rightSum-=nums[i];
            if(rightSum==leftSum)return i;
            else leftSum+=nums[i];
        }
        return -1;
    }
}