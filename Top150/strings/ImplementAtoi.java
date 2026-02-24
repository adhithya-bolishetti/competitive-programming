class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        
        while(i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        if(i == n) return 0;
        
        int sign = 1;
        if(s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if(s.charAt(i) == '+') {
            i++;
        }

        long res = 0;
        while(i < n && Character.isDigit(s.charAt(i))) {
            long digit = s.charAt(i) - '0';
            res = res * 10 + digit;
            
            if(sign == 1 && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign == -1 && -res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
            i++;
        }
        
        return (int) res * sign;
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)