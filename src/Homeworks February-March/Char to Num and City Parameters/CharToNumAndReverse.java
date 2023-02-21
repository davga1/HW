package stringsHomeworksAndExercises;

import java.util.Scanner;

public class CharToNumAndReverse {
    public static void main(String[] args) {
        int[] finalResult = ascii();
        System.out.println("Your char array is:");
        For(finalResult, 1);
        System.out.println("\nYour char array's reverse to int array is:");
        For(finalResult, 0);
    }
    static int[] ascii() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your char array's size");
        int size = s.nextInt();
        int[] result = new int[size];
        char[] arr = new char[size];
        System.out.println("Enter characters for this array");
        for (int i = 0; i < size; i++) {
            arr[i] = s.next().charAt(0);
            result[i] = arr[i];
        }
        return result;
    }

    static void For(int[] word, int num) {
        for (int i = 0; i < word.length; i++) {
            if (num == 1) {
                System.out.print(word[i] + " ");
            } else if (num == 0) System.out.print((char) word[i] + " ");
        }
    }
}

