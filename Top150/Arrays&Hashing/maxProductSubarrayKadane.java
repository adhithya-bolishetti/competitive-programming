class Solution {
    int maxProduct(int[] arr) {
        // code here
        int currMax = arr[0];
        int currMin = arr[0];
        int maxProduct = arr[0];
        
        for(int i=1;i<arr.length;i++) {
            if(arr[i] < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
            
            currMax = Math.max(arr[i], arr[i] * currMax);
            currMin = Math.min(arr[i], arr[i] * currMin);
            
            maxProduct = Math.max(maxProduct, currMax);
        }
        
        return maxProduct;
        
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)