import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a > 0) {
            if (isNumber(a) == a)
                System.out.println(a + " is an Armstrong number");
            else System.out.println(a + " Isn't an Armstrong number");
        } else System.out.println("Please type positive number");
    }

    static int isNumber(int a) {
        int x = powerCount(a);
        int counter2 = 0;
        int num = 0;
        while (a > 0) {
            num = a % 10;
            a /= 10;
            counter2 += numPower(num,x);
        }
        return counter2;
    }static int powerCount(int a) {
        int counter = 0;
        for (; a >= 1; a /= 10) {
            counter++;
        }
        return counter;
    }
    static int numPower(int a,int b) {
        int counter3 = 1;
        for (int i = 0; i < b; i++) {
            counter3 *= a;
        }
        return counter3;
    }
}
