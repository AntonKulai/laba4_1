package com.laba41;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть слово або фразу для перевірки на паліндром:");
        String input = scanner.nextLine();

        if (com.laba41.PalindromeChecker.isPalindrome(input)) {
            System.out.println("Це слово або фраза є паліндромом.");
        } else {
            System.out.println("Це слово або фраза не є паліндромом.");
        }
    }
}