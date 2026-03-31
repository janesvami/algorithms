package palindrome;

public class PalindromeCheckerWithInvertedString implements PalindromeChecker {
    @Override
    public boolean isPalindrome(String s) {
        if (s == null) return false;

        final StringBuilder reversed = new StringBuilder(s).reverse();
        final String reversedS = reversed.toString();

        return reversedS.equals(s);
    }
}