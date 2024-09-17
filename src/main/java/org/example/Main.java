package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    public static boolean isPalindrome(int x) {
        int mutlak = Math.abs(x);
        String sayi = Integer.toString(mutlak);
        StringBuilder ters = new StringBuilder();
        for (int i = sayi.length() - 1; i >= 0; i--) {
            ters.append(sayi.charAt(i));
        }
        return ters.toString().equals(sayi);
    }

    public static boolean isPerfectNumber(int x) {
        int sonuc = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                sonuc += i;
            }

        }
        return sonuc == x;
    }

    public static String numberToWords(int x) {
        if (x<0){
            return "Invalid Value";
        }
        String sayi = Integer.toString(x);
        StringBuilder sonuc = new StringBuilder();
        for (int i = 0; i < sayi.length(); i++) {
            switch (Character.getNumericValue(sayi.charAt(i))) {
                case 0:
                    sonuc.append("Zero ");
                    break;
                case 1:
                    sonuc.append("One ");
                    break;
                case 2:
                    sonuc.append("Two ");
                    break;
                case 3:
                    sonuc.append("Three ");
                    break;
                case 4:
                    sonuc.append("Four ");
                    break;
                case 5:
                    sonuc.append("Five ");
                    break;
                case 6:
                    sonuc.append("Six ");
                    break;
                case 7:
                    sonuc.append("Seven ");
                    break;
                case 8:
                    sonuc.append("Eight ");
                    break;
                case 9:
                    sonuc.append("Nine ");
                    break;
            }
        }
        return sonuc.toString().trim();
    }
}