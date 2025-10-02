class Solution {
    public int missingNumber(int[] nums) {
        int i = 0 ;
       
        int n = nums.length ;
        int actualSum = 0;
        int expectedSum = (n * (n+ 1)) / 2 ;

        while(i < n){
            actualSum += nums[i];
            i++;
        }
        return expectedSum - actualSum;
    }
}