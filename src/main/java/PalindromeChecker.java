package com.laba41;

public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase().replaceAll("\\s+", "");
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }
}
