import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // Arrays.sort(arr);
        // if(arr.length <=  2){
        //     return true;
        // }

        // int val = Math.abs(arr[0] - arr[1]);
        // for(int i = 0; i<arr.length - 1 ; i++){
        //     if(Math.abs(arr[i] - arr[i+1]) != val){
        //         return false;
        //     }
        // }
        // return true;
        if(arr.length <= 2){ return true ; }

        Arrays.sort(arr);
        int diff = arr[0] - arr[1];

        for(int i = 2 ; i < arr.length  ; i++){
            if(diff != (arr[i-1] - arr[i])){
                return false;
            }
        }
        return true;
       
    }
}