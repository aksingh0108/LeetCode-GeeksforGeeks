class Solution {
    public String largestNumber(int[] nums) {
        
         // Convert the integer array to a string array
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }

        // Sort the string array based on custom comparator
        Arrays.sort(numStrs, (a, b) -> (b + a).compareTo(a + b));

        // If after sorting, the largest number is "0", return "0"
        if (numStrs[0].equals("0")) {
            return "0";
        }

        // Join the sorted array into a single string
        StringBuilder result = new StringBuilder();
        for (String num : numStrs) {
            result.append(num);
        }

        return result.toString();
    }
 
}