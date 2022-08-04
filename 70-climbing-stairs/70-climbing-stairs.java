class Solution {
    public int climbStairs(int n) {
        int index1=1;
        int index2=1;
        for(int i=0;i<n-1;i++){
            int temp=index1;
            index1=index1+index2;
            index2=temp;
        }
        return index1;
    }
}