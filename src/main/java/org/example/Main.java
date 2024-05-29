package org.example;

public class Main {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(int sayi) {
        sayi = Math.abs(sayi);
        char[] charArray =  String.valueOf(sayi).toCharArray();

        String reversed = "";
        for(int i = charArray.length-1; i>=0; i--) {
            reversed += charArray[i];
        }
        return reversed.equalsIgnoreCase(String.valueOf(sayi));
    }

}
