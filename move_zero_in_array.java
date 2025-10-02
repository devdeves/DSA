class Solution {
    public void moveZeroes(int[] nums) {
        int x = 0; // pointer for placing non-zero 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != x) { 
                    int temp = nums[i]; nums[i] = nums[x]; 
                    nums[x] = temp; 
                } 
                x++; 
            }
        }
    }
}