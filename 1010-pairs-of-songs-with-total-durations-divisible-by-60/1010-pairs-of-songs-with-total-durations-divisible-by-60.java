class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int count=0; 
        for(int i=0;i<time.length;i++){ 
            if(time[i]%60==0)count+=map.getOrDefault(0,0);
            else count+=map.getOrDefault(60-time[i] % 60,0);
            map.put(time[i]%60,map.getOrDefault(time[i]%60,0)+1);
            }
         return count;
    }
}