class Solution {
    public int[][] merge(int[][] intervals) {
        
         Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        Stack<int[]> stack=new Stack();
        
        stack.add(intervals[0]);
        
        for(int i=1;i<intervals.length;i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];
            
            int []popArray=stack.pop();
            int start1=popArray[0];
            int end1=popArray[1];
            
            int maxEnd=Math.max(end1,end2);
            
            if(end1>=start2){
                int [] merge=new int[] {start1,maxEnd};
                stack.add(merge);
            }else{
              stack.add(popArray);
              stack.add(intervals[i]);
            }
        }
        int output[][]=new int[stack.size()][2];
        for(int i=output.length-1;i>=0;i--){
            int[] poparray=stack.pop();
            output[i][0]=poparray[0];
            output[i][1]=poparray[1];
        }
        return output;
    }
}