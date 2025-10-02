import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){return;}
        if(m==0){ 
            int i = 0;
            while(i < n){
                nums1[i] = nums2[i];
                i++;
            }
            return ;
        }

        int [] copyNums = Arrays.copyOf(nums1 , m);
        int p1 = 0 ; int p2 = 0;
        int i = 0 ;

        while(p1 < m && p2 < n){
            if(copyNums[p1] < nums2[p2]){
                nums1[i] = copyNums[p1];
                p1++;
            }else{
                nums1[i] = nums2[p2];
                p2++;
            }
            i++;
        }

        while(p1 < m){
            nums1[i] = copyNums[p1];
            p1++;
            i++;
        }

        while(p2 < n){
            nums1[i] = nums2[p2];
            p2++;
            i++;
        }
    }
}