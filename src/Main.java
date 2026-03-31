import anagram.AnagramChecker;
import anagram.AnagramCheckerWithCharCounting;
import anagram.AnagramCheckerWithHashMap;
import anagram.AnagramCheckerWithSorting;
import brackets.BracketChecker;
import brackets.BracketsCheckerWithStack;
import fizzbuzz.FizzBuzzPrinter;
import fizzbuzz.FizzBuzzWithIfChain;
import fizzbuzz.FizzBuzzWithStreamApi;
import fizzbuzz.FizzBuzzWithSwitch;
import palindrome.PalindromeChecker;
import palindrome.PalindromeCheckerWithAnAsterisk;
import palindrome.PalindromeCheckerWithInvertedString;
import palindrome.PalindromeCheckerWithTwoCounters;
import twosum.TwoSumHunter;
import twosum.TwoSumHunterWithBruteForce;
import twosum.TwoSumHunterWithHashMap;
import twosum.TwoSumHunterWithTwoCounters;

public class Main {
    public static void main(String[] args) {

        System.out.println("Anagram with sorting O(n log n): ");
        String a1 = "object";
        String a2 = "jectobK";
        AnagramChecker anagramCheckerWithSorting = new AnagramCheckerWithSorting();
        boolean isAnagram1 = anagramCheckerWithSorting.isAnagram(a1, a2);
        System.out.println(isAnagram1);
        System.out.println("=======================");

        System.out.println("Anagram with char counting O(n), only the Latin alphabet:");
        AnagramChecker anagramCheckerWithCharCounting = new AnagramCheckerWithCharCounting();
        boolean isAnagram2 = anagramCheckerWithCharCounting.isAnagram(a1, a2);
        System.out.println(isAnagram2);

        System.out.println("=======================");

        System.out.println("Anagram with HashMap O(n):");
        AnagramChecker anagramCheckerWithHashMap = new AnagramCheckerWithHashMap();
        boolean isAnagram3 = anagramCheckerWithHashMap.isAnagram(a1, a2);
        System.out.println(isAnagram3);
        System.out.println("=======================");
        System.out.println("=======================");


        System.out.println("Palindrome with inverted string:");
        String simplePalindrome = "racecar";
        String complicatedPalindrome = "A man, a plan, a canal: Panama";
        PalindromeChecker palindromeCheckerWithInvertedString = new PalindromeCheckerWithInvertedString();
        boolean isPalindrome1 = palindromeCheckerWithInvertedString.isPalindrome(simplePalindrome);
        System.out.println(isPalindrome1);
        System.out.println("=======================");

        System.out.println("Palindrome with two counters:");
        PalindromeChecker palindromeCheckerWithTwoCounters = new PalindromeCheckerWithTwoCounters();
        boolean isPalindrome2 = palindromeCheckerWithTwoCounters.isPalindrome(simplePalindrome);
        System.out.println(isPalindrome2);
        System.out.println("=======================");

        System.out.println("Palindrome with an asterisk:");
        PalindromeChecker palindromeCheckerWithAnAsterisk = new PalindromeCheckerWithAnAsterisk();
        boolean isPalindrome3 = palindromeCheckerWithAnAsterisk.isPalindrome(complicatedPalindrome);
        System.out.println(isPalindrome3);
        System.out.println("=======================");
        System.out.println("=======================");




        System.out.println("Brackets with stack:");
        String s = "({})";
        BracketChecker bracketChecker = new BracketsCheckerWithStack();
        boolean b = bracketChecker.bracketsCheck(s);
        System.out.println(b);
        System.out.println("=======================");
        System.out.println("=======================");


        System.out.println("TwoSum with brute force O(n²):");
        TwoSumHunter twoSum1 = new TwoSumHunterWithBruteForce();
        int[] arr = {3, 45, 6, 100, 8, 9};
        int[] arr2 = {2, 2};
        int[] twoSumResult1 = twoSum1.findTwoSum(arr2, 4);
        printArr(twoSumResult1);
        System.out.println("=======================");

        System.out.println("TwoSum with two counters O(n), only for sorted arrays:");
        TwoSumHunter twoSum2 = new TwoSumHunterWithTwoCounters();
        int[] sortedArr = {3, 4, 6, 8, 9, 45};
        int[] twoSumResult2 = twoSum2.findTwoSum(sortedArr, 11);
        printArr(twoSumResult2);
        System.out.println("=======================");

        System.out.println("TwoSum with HashMap O(n):");
        TwoSumHunter twoSum3 = new TwoSumHunterWithHashMap();
        int[] twoSumResult3 = twoSum3.findTwoSum(arr, 9);
        printArr(twoSumResult3);
        System.out.println("=======================");
        System.out.println("=======================");


        System.out.println("FizzBuzz with cycle ():");
        FizzBuzzPrinter fizzBuzzPrinter = new FizzBuzzWithIfChain();
        fizzBuzzPrinter.fizzBuzzPrint();
        System.out.println("=======================");

        System.out.println("FizzBuzz with switch:");
        FizzBuzzPrinter fizzBuzzPrinter2 = new FizzBuzzWithSwitch();
        fizzBuzzPrinter2.fizzBuzzPrint();
        System.out.println("=======================");

        System.out.println("FizzBuzz with Stream API:");
        FizzBuzzPrinter fizzBuzzPrinter3 = new FizzBuzzWithStreamApi();
        fizzBuzzPrinter3.fizzBuzzPrint();
        System.out.println("=======================");



    }

    private static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
