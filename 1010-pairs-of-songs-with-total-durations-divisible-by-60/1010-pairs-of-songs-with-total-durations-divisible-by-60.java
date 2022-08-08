class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        // Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int array[]=new int[60];
        int count=0; 
        for(int i=0;i<time.length;i++){ 
            if(time[i]%60==0)count+=array[0];
            else count+=array[60-time[i]%60];
            array[time[i]%60]++;
            }
         return count;
    }
}