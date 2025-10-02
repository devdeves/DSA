class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int counter = 0 ; int maxOnes = 0 ;
      int i = 0 ; int n = nums.length;
      while(i < n){

            if(nums[i] == 1){
                counter++;
            }else{
                counter = 0;
            }
            
            if(maxOnes < counter){
                maxOnes = counter ;
            }

        i++;
      }  
      return maxOnes;
    }
}