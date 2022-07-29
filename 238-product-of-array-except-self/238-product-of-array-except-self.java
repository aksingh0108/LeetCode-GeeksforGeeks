class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size=nums.length;
        int array[]=new int[size];
        int productOfAll=1;
        int zeroIndexCount=0;
        int index=-1;
        for(int i=0;i<size;i++){
            if(nums[i]==0){
                zeroIndexCount++;
                index=i;
                continue;
            }else{
                productOfAll*=nums[i];
            }
        }
        if(zeroIndexCount>1){
            return array;
        }
        else if(zeroIndexCount==1){
            array[index]=productOfAll;
        }else{
            for(int i=0;i<size;i++){
                if(nums[i]!=0)array[i]=productOfAll/nums[i];
                else array[i]=productOfAll;
            }
        }
        return array;
    }
}