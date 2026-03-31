package palindrome;

public class PalindromeCheckerWithAnAsterisk implements PalindromeChecker{
    @Override
    public boolean isPalindrome(String s) {
        if (s == null) return false;

        char[] symbols = s.toLowerCase().toCharArray();
        int left = 0;
        int right = symbols.length - 1;

        while (left < right) {
            while(left < right && !Character.isLetterOrDigit(symbols[left])){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(symbols[right])){
                right--;
            }
            if (left >= right) {
                return true;
            }
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
