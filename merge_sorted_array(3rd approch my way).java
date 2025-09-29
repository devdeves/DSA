class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;          // last valid element in nums1
        int p2 = n - 1;          // last element in nums2
        int i = m + n - 1;       // last index of nums1

        // Compare from the back until one of the arrays is done
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1];
                p1--;
            } else {
                nums1[i] = nums2[p2];
                p2--;
            }
            i--;
        }

        // If nums2 still has leftover elements, copy them
        while (p2 >= 0) {
            nums1[i] = nums2[p2];
            p2--;
            i--;
        }
    }
}