class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int currentP=m+n-1;
        int num1P=m-1;
        int num2P=n-1;
        while(num1P>=0 && num2P>=0){
            if(nums1[num1P]>nums2[num2P]){
                nums1[currentP]=nums1[num1P];
                num1P--;
                currentP--;
            }
            else{
                 nums1[currentP]=nums2[num2P];
                num2P--;
                currentP--;
            }  
        }
    while(num2P>=0){
    nums1[currentP]=nums2[num2P];
        currentP--;
        num2P--;
    } 
    }
    
}
