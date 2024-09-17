package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }
    public static boolean isPalindrome(int x){
        int mutlak = Math.abs(x);
        String sayi= Integer.toString(mutlak);
        String ters= "";
        for (int i=sayi.length()-1;i>=0;i--){
            ters+=sayi.charAt(i);
        }
        return ters.equals(sayi);
    }
    public static boolean isPerfectNumber(int x){
        int sonuc=0;
        for (int i=1;i<=x/2;i++){
            if (x%i==0){
                sonuc += i;
            }

        }
        return sonuc==x;
    }
    public static String numberToWords(int x){

    }
}
