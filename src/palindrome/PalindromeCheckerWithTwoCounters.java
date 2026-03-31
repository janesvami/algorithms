package palindrome;

public class PalindromeCheckerWithTwoCounters implements PalindromeChecker {
    @Override
    public boolean isPalindrome(String s) {
        if (s == null) return false;

        char[] symbols = s.toCharArray();
        int left = 0;
        int right = symbols.length - 1;

        while (left < right) {
            if (symbols[left] == symbols[right]) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}