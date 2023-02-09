import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 11 letters");
        char[] char1 = new char[]{s.next().charAt(0), s.next().charAt(0), s.next().charAt(0), s.next().charAt(0), s.next().charAt(0), s.next().charAt(0), s.next().charAt(0), s.next().charAt(0), s.next().charAt(0), s.next().charAt(0), s.next().charAt(0)};
        System.out.println("Choose a letter");
        char ch = s.next().charAt(0);
        int i = 0;
        while (i >= 0 && i < char1.length - 1) {
            if (char1[i] == ch) {
                System.out.println("The letter is under the number " + (i + 1));
                break;
            }
            i++;
        }
        if (char1[i] != ch) {
            System.out.println("There is no selected letter there");
        }

    }
}