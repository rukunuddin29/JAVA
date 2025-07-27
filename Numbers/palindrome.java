class Solution {
    public static void main(String[] args) {
        int num = 5555;
        System.out.println(isPalindrome(num));  // print the returned value
    }

    public static boolean isPalindrome(int n) {
        int original = n;
        int res = 0;

        while (n > 0) {
            int x = n % 10;
            n = n / 10;
            res = res * 10 + x;
        }

        return res == original;
    }
}
