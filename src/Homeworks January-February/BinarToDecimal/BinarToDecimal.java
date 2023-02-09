import java.util.Scanner;

public class BinarToDecimal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type value for your Binary array");
        int[] a = {s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()};
        for (int stop = a.length - 1; stop >= 0; stop--) {
            if (a[stop] >= 2) {
                System.out.println("Please write only 1 or 0");
               System.exit(1);

            }
        }
            int sum = 0;
            int j = 1;
            System.out.println("Your Binary Array is ");
            for (int i = a.length - 1, h = 0; i >= 0; i--, j *= 2, h++) {
                sum = a[i] * j + sum;
                System.out.print(a[h] + " ");
            }
            System.out.println();
            System.out.println("Your Decimal Number is");
            System.out.print(sum);

        }
    }
















