import java.util.Scanner;

public class ArrayPositiveNegative {
    public ArrayPositiveNegative() {
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type 6 numbers");
        double[] num1 = new double[]{s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble()};
        double[] num2 = new double[num1.length];
        int num3p = 0;
        int num4n = 0;

        for(int i = 0; i < num1.length; ++i) {
            if (num1[i] > 0.0) {
                num2[i] = num1[i];
                ++num3p;
            } else if (num1[i] < 0.0) {
                num2[i] = num1[i] * -1.0;
                ++num4n;
            } else {
                num2[i] = 0.0;
            }
        }

        System.out.println("The final array is [ " + (int)num2[0] + "," + (int)num2[1] + "," + (int)num2[2] + "," + (int)num2[3] + "," + (int)num2[4] + "," + (int)num2[5] + "]");
        System.out.println("We have " + num3p + " Positive numbers at the start");
        System.out.println("There are  " + num4n + " Changes");
    }
}