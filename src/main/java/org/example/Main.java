package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("-----------------------");

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("-----------------------");

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int num1) {
        num1 = Math.abs(num1);
        int original = num1;
        int reversed = 0;
        while (num1 > 0) {
            reversed = reversed * 10 + num1 % 10;
            num1 /= 10;
        }
        return original == reversed;
    }

    public static boolean isPerfectNumber(int num1) {
        if (num1 < 0) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                sum += i;
            }
        }
        return sum == num1;
    }

    public static String numberToWords(int num1) {
        if (num1 < 0) {
            return "Invalid Value";
        }
        String[] num1Dizi = String.valueOf(num1).split("");
        // "1", "2", "3"
        String newNum = "";
        for (String num : num1Dizi) {
            switch (num) {
                case "0":
                    newNum += "Zero ";
                    break;
                case "1":
                    newNum += "One ";
                    break;
                case "2":
                    newNum += "Two ";
                    break;
                case "3":
                    newNum += "Three ";
                    break;
                case "4":
                    newNum += "Four ";
                    break;
                case "5":
                    newNum += "Five ";
                    break;
                case "6":
                    newNum += "Six ";
                    break;
                case "7":
                    newNum += "Seven ";
                    break;
                case "8":
                    newNum += "Eight ";
                    break;
                case "9":
                    newNum += "Nine ";
                    break;
            }
        }
        return newNum.trim();
    }

}
