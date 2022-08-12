class Solution {
    public int findDuplicate(int[] nums) {
        
        //brute force
        //  for(int i=0;i<nums.length-1;i++){
        //      for(int j=i+1;j<nums.length;j++){
        //     if(nums[i]==nums[j])return nums[i];
        //      }
        // }
        
        //by sorting
    //     Arrays.sort(nums);
    //     for(int i=0;i<nums.length-1;i++){
    //         if(nums[i]==nums[i+1])return nums[i];
    //     }
         
        //  //by hashMap
        //  Map<Integer,Integer> map=new HashMap();
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i]))return nums[i];
        //     else map.put(nums[i],1);
        
        
         //by HashSet
        //  Set<Integer> set=new HashSet();
        // for(int i=0;i<nums.length;i++){
        //     if(set.contains(nums[i]))return nums[i];
        //     else set.add(nums[i]); 
        // }
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])return nums[i];
        }
        
         
        return 0;
    }
}