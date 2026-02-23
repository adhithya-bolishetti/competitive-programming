class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int n = arr.length;
        int totalSum = 0;
        
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        
        int currMin = 0;
        int currMax = 0;
        
        for(int i=0;i<n;i++) {
            totalSum += arr[i];
            
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSum = Math.max(maxSum, currMax);
            
            currMin = Math.min(arr[i], currMin + arr[i]);
            minSum = Math.min(minSum, currMin);
        }
        
        if(maxSum < 0) return maxSum;
        
        return Math.max(maxSum, totalSum - minSum);
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)