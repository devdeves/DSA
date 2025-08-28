public int[] mergeAndSortHelper(int[] left , int[] right){
    int[] res = new int[left.length + right.length];
    int i = 0 ; j = 0 ; k = 0;

    while(i < left.length && j < right.length)
            res[k++] = (left[i] < right[j]) ? left[i++] : right[j++];
    while(i < left.length) res[k++] = left[i++];
    while(j < left.length) res[k++] = left[j++];

    return res; 

}https://www.linkedin.com/in/devesh-maurya-webdev/