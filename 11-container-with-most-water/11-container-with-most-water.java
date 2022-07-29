class Solution {
    public int maxArea(int[] height) {
        int areaMax=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        while(left<right){
                int minHeight=Math.min(height[left],height[right]);
                int breath=right-left;
                int area=minHeight*breath;
                areaMax=Math.max(areaMax,area);
            if(height[left]>height[right])right--;
            else left++;
            }
        return areaMax;
    }
}