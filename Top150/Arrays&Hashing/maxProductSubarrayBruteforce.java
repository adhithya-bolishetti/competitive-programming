class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        long maxProduct = Long.MIN_VALUE;
        
        for(int i=0;i<n;i++) {
            int currProduct = 1;
            for(int j=i;j<n;j++) {
                currProduct *= arr[j];
                maxProduct = Math.max(maxProduct, currProduct);
            }
        }
        
        return maxProduct;
    }
}
//Time Complexity: O(n^2)
//Space Complexity: O(1)