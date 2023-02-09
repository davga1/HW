import java.util.Scanner;

public class ArrayBiggerThanPrevious {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] d = {s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()};
        int i, j = 0;
        for (i = 0; i < d.length - 1; i++)
            if (d[i] < d[i + 1]) {
                j++;
            }
        {
            if (j == 0) {
                System.out.println("There is no number bigger than it's previous");
            } else if (j != 1) {
                System.out.println("There is " + " " + j + " " + "Numbers bigger than their previous number");
            } else System.out.println("There is only one number bigger than it's previous number");
        }
    }
}