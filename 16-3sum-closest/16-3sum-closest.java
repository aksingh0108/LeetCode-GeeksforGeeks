class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int size=nums.length;
        int diff=Integer.MAX_VALUE;
        int result=0;
        Arrays.sort(nums);
        for(int i=0;i<size;i++){
            int left=i+1;
            int right=size-1;
            int first=nums[i];
            while(left<right){
                    int sum3=nums[left]+nums[right]+first;
                    if(sum3==target)return sum3;
                    else if(Math.abs(sum3-target)<diff){
                        diff=Math.abs(sum3-target);
                        result=sum3;
                    }
                if(sum3>target)right--;
                else left++;
            }
        }
        return result;
    }
}