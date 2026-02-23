class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++) {
            int currSum = 0;
            for(int j=0;j<n;j++) {
                currSum += arr[(i + j) % n];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        
        return maxSum;
    }
}
//Time Complexity: O(n^2)
//Space Complexity: O(1)