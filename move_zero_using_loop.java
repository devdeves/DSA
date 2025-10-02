class Solution {
    public void moveZeroes(int[] nums) {
        int counter = 0;
        int n = nums.length;
        int i = 0;
        while(i < n){
            if(nums[i] != 0){
                nums[counter] = nums[i];
                counter++;
            }
            i++;
        }

        while(counter < n){
            nums[counter] = 0;
            counter++;
        }
    }
}