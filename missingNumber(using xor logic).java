class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int result = n; 
        int i = 0;
        while(i < n){
            result ^= i ^ nums[i];
            i++;
        }
        return result;
    }
}