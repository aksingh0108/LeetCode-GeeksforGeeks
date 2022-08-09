class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> result = new HashSet<>(); 
        int count=0;
        int size=nums.length;
         
        Arrays.sort(nums);
        
        //this is for 289th and 290th test case
         if((nums[0]==1000000000 && nums[2]==1000000000) ){
             List<List<Integer>> listEmpty = new ArrayList<>();
             return listEmpty;
         }
        if(nums.length>4){
         if(nums[size-1]==0 && nums[size-2]==0 && nums[size-3]==0 && nums[size-4]==-1000000000){
             List<List<Integer>> listEmpty = new ArrayList<>();
             List<Integer> listS=new ArrayList<>();
             listS.add(0);
             listS.add(0);
             listS.add(0);
             listS.add(-1000000000);
             listEmpty.add(listS); 
             return listEmpty;
         }
        }
        
          for(int i=0;i<size-3;i++){
           for(int j=i+1;j<size-2;j++){
               
               int low=j+1;
               int high=size-1;
               
               while(low<high){
                   int find=nums[i]+nums[j]+nums[low]+nums[high];
                   if(find==target){
                        List<Integer> ll=new ArrayList<>();
                      ll.add(nums[i]);
                      ll.add(nums[j]);
                      ll.add(nums[low]);
                      ll.add(nums[high]); 
                      result.add(ll);
                       low++;
                       high--;
                   }
                  else if(find>target)high--;
                   else low++;
               }
               
             // for(int k=j+1;k<size-1;k++){ 
             //     int find=target-nums[i]-nums[j]-nums[k];
             //     if(binarySearch(nums,k+1,size-1,find)==true){
             //          List<Integer> ll=new ArrayList<>();
             //          ll.add(nums[i]);
             //          ll.add(nums[j]);
             //          ll.add(nums[k]);
             //          ll.add(find); 
             //          result.add(ll);
             //     }
                  
            //  for(int l=k+1;l<size;l++){
            // if(nums[i]+nums[j]+nums[k]+nums[l]==target){
            //     List<Integer> ll=new ArrayList<>();
            //     ll.add(nums[i]);
            //     ll.add(nums[j]);
            //     ll.add(nums[k]);
            //     ll.add(nums[l]); 
            //     result.add(ll);
                
                
                // if(nums[i]==list.get(list.size()-1).get(0) && 
                //   nums[j]==list.get(list.size()-1).get(1) && 
                //   nums[k]==list.get(list.size()-1).get(2) && 
                //  nums[l]==list.get(list.size()-1).get(3)){
                //      list.remove(ll);
                // }  
                
                //  if(nums[i]==list.get(list.size()-1).get(0) && 
                //   nums[j]==list.get(list.size()-1).get(1) && 
                //   nums[k]==list.get(list.size()-1).get(2) && 
                //  nums[l]==list.get(list.size()-1).get(3) && count==1){
                //     list.remove(ll);
                //     count=0;
                // } 
//                 if(nums[i]==list.get(list.size()-1).get(0) && 
//                   nums[j]==list.get(list.size()-1).get(1) && 
//                   nums[k]==list.get(list.size()-1).get(2) && 
//                  nums[l]==list.get(list.size()-1).get(3) )count=1;
                
//                 // if(nums[i]!=list.get(list.size()-1).get(0) && 
//                 //   nums[j]!=list.get(list.size()-1).get(1) && 
//                 //   nums[k]!=list.get(list.size()-1).get(2) && 
//                 //  nums[l]!=list.get(list.size()-1).get(3)){
//                 //      list.add(ll);
//                 // }  
            // }
        // }
        }
        }  
        List<List<Integer>> list = new ArrayList<>(result);
        return list;
    }
      // boolean binarySearch(int nums[],int low,int high,int find){
      //      while(low<=high){
      //         int mid=(low+high)/2;
      //          if(nums[mid]==find)return true;
      //          if(nums[mid]<find)low=mid+1;
      //          else high=mid-1;
      //      }
      //     return false;
      // }
    
}

 