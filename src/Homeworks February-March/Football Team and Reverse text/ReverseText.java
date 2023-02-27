package work;

import java.util.Scanner;

public class ReverseText {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String firstWord = s.nextLine();
        String sub = "";
        for (int i = 0; i < firstWord.length(); i++) {
            sub = sub.concat(String.valueOf(firstWord.charAt(firstWord.length() - 1 - i)));
        }
        char[] firstArray = sub.toCharArray();
        String[] lastArray = new String[firstArray.length];
        for (int i = 0; i < lastArray.length; i++) {
            lastArray[i] = String.valueOf(firstArray[i]);
        }
        for (int i = 0; i < lastArray.length; i++) {
            System.out.print(lastArray[i] + "");
        }
        System.out.print(" ");
    }
}