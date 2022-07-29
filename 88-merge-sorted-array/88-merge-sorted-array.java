class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for (int i=m-1;i<nums1.length-1;i++){
            nums1[i+1]=nums2[j];
            j++;
        }
        Arrays.sort(nums1); 
          System.out.println(nums1);
    }
}