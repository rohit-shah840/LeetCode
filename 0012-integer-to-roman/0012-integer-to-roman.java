class Solution {
    public String intToRoman(int n) {
        int[] a = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] s = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            while (n >= a[i]) {
                str.append(s[i]);
                n -= a[i];
            }
        }
        return str.toString();
    }
}