class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        s = s.trim();
        if (s.length() == 0) return 0;

        int i = 0;
        int n = s.length();
        int sign = 1;

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        String num = "";

        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num + s.charAt(i);
            i++;
        }

        if (num.length() == 0) return 0;

        long result = 0;

        for (int j = 0; j < num.length(); j++) {
            int digit = num.charAt(j) - '0';
            result = result * 10 + digit;
        }

        result = result * sign;

        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) result;
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n)