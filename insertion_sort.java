
/*
# 🔑 Insertion Sort

Insertion Sort is a **simple and intuitive sorting algorithm** that builds the final sorted array one element at a time.  
It works by taking each element from the input and **inserting it into its correct position** in the already sorted part of the array.  

✨ **Key Idea**:  
- Start from the second element  
- Compare with previous elements  
- Shift larger elements one position ahead  
- Insert the current element in the correct place  

---

## 🛠️ Approach

1️⃣ Start from the **second element (index 1)** since the first element is trivially “sorted”.  
2️⃣ Store the current element (`curr`) and compare it with all previous elements.  
3️⃣ **Shift** the previous elements one position forward if they are greater than the current element.  
4️⃣ **Insert** the current element (`curr`) at its correct sorted position.  
5️⃣ Repeat until the **whole array is sorted**.  

---

## 📝 Dry Run (on `[4, 5, 1, 3, 9]`)

### Initial Array:


### Pass 1 (i = 1):
- `curr = 5`, `prev = 0`  
- ✅ 5 > 4 → no shifting  
- Array → `[4, 5, 1, 3, 9]`

---

### Pass 2 (i = 2):
- `curr = 1`, `prev = 1`  
- 1 < 5 → shift 5 → `[4, 5, 5, 3, 9]`  
- 1 < 4 → shift 4 → `[4, 4, 5, 3, 9]`  
- Insert 1 → `[1, 4, 5, 3, 9]`

---

### Pass 3 (i = 3):
- `curr = 3`, `prev = 2`  
- 3 < 5 → shift 5 → `[1, 4, 5, 5, 9]`  
- 3 < 4 → shift 4 → `[1, 4, 4, 5, 9]`  
- Insert 3 → `[1, 3, 4, 5, 9]`

---

### Pass 4 (i = 4):
- `curr = 9`, `prev = 3`  
- ✅ 9 > 5 → no shifting  
- Array → `[1, 3, 4, 5, 9]`

---

### 🎉 Final Sorted Array:


*/

class Main {
    public static void main(String[] args) {
       // [2,3,1,6,3];
       int nums[] = {2,3,1,6,3};
       int currVal = 0;
       int prevIndex = 0;
       for(int i=1 ; i < nums.length-1; i++){
           currVal = nums[i];
           prevIndex = i - 1;
           while(prevIndex >= 0 && currVal < nums[prevIndex]){
               nums[prevIndex + 1] = nums[prevIndex];
               prevIndex--;
           }
           nums[prevIndex + 1] = currVal ;
       }
      for(int num : nums){
          System.out.print(num + " ");
      }    
    }
}