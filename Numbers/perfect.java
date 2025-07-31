class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int number = 28; // You can change this number for testing
        boolean isPerfect = solution.checkPerfectNumber(number);

        if (isPerfect) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
