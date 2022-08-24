class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       List<Integer> a = new ArrayList();
        for (int n = left; n <= right; ++n) {
            if (selfDividing(n)) a.add(n);
        }
        return a;
    }
    public boolean selfDividing(int n) {
        for (char c: String.valueOf(n).toCharArray()) {
            if (c == '0' || (n % (c - '0') > 0))
                return false;
        }
        return true;
    }
 }