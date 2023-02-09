import java.util.Scanner;

public class NumbersPower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (powerOfNum(a, b) == -1)
            System.out.println("Please select numbers from 0 to 10");
        else if (powerOfNum(a, b) == -2)
            System.out.println("Please select numbers from 0 to 10 for your first number");
        if (powerOfNum(a, b) % 1 == 0 && powerOfNum(a, b) != powerOfNum(9, 10) && powerOfNum(a, b) != powerOfNum(10, 10))
            System.out.println(a + "^" + b + "=" + (int) powerOfNum(a, b));
        else
            System.out.println(a + "^" + b + "=" + powerOfNum(a, b));
    }

    static double powerOfNum(int a, int b) {
        double counter = 1;
        for (int i = 0; i < b; i++) {
            counter *= a;
        }
        if (a < 0 && b < 0) return -2;
        if (a > 10 || b > 10 || b * -1 > 10) {
            return -1;
        } else if (a == 0)
            return 0;
        else if (a < 0) {
            return -2;
        }
        if (b < 0) {
            for (int i = b; i < 0; i++) {
                counter *= a;
            }
            return 1 / counter;
        } else
            return counter;
    }
}
