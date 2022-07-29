class Solution {
    public void nextPermutation(int[] nums) {
       int j=nums.length-1,i=j-1;
        if(j<1)return;
        while(i>=0 && nums[i]>=nums[i+1])i--;
        if(i>=0){
            while(nums[j]<=nums[i])j--;
            nums[i]=nums[i]+nums[j]-(nums[j]=nums[i]);
        }
        j=nums.length-1;
        while(++i<j)
            nums[i]=(nums[i]+nums[j]-(nums[j]=nums[i]))+j-j--;
    }
}