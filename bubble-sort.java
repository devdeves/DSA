class Solution {
    public void sortColors(int[] nums) {

        // this bubble sort // 
        int temp = 0;
        int n = nums.length;
        boolean isSwapped = false;

      //   [2,0,2,1,1,0]
        for(int i = 0 ; i< n-1 ; i++){
            for(int j = 0 ; j < n-1 ; j++){

                // if nums[i] > nums[i-1] then swap //
                if(nums[i] > nums[j]){
                     isSwapped = true;
                     temp = nums[i];
                     nums[i] = nums[j];
                     nums[j] = temp;
                }
            }
            if (!isSwapped) break;
            else continue;
        }
    }
}