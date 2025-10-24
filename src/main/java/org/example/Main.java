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
    public static boolean isPalindrome(int num1){
       num1 = Math.abs(num1);
       int original = num1;
       int reversed = 0;
       while(num1>0){
           reversed = reversed *10 + num1 %10;
           num1 /=10;
       }
       return original == reversed;
    }

    public static boolean isPerfectNumber(int num1){
        if(num1<0){
            return  false;
        }

        int sum =0;
        for(int i =1; i<=num1/2; i++) {
            if(num1 % i==0){
                sum +=i;
            }
        }
        return sum==num1;
    }

    public static String  numberToWords(int num1){
        if (num1 < 0) {
            return "Invalid Value"; // Negatif sayılar için uyarı
        }
        // Sayıyı Stringe çeviriyoruz, her rakamı tek tek alabilmek için
        String numStr = String.valueOf(num1);
        StringBuilder result = new StringBuilder();

        // Her karakteri kontrol edip rakama uygun kelimeyi ekliyoruz
        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);
            switch (digit) {
                case '0': result.append("Zero"); break;
                case '1': result.append("One"); break;
                case '2': result.append("Two"); break;
                case '3': result.append("Three"); break;
                case '4': result.append("Four"); break;
                case '5': result.append("Five"); break;
                case '6': result.append("Six"); break;
                case '7': result.append("Seven"); break;
                case '8': result.append("Eight"); break;
                case '9': result.append("Nine"); break;
            }
            if (i != numStr.length() - 1) {
                result.append(" "); // Rakamlar arasına boşluk ekliyoruz
            }
        }

        return result.toString(); // Sonucu döndürüyoruz
    }

}
