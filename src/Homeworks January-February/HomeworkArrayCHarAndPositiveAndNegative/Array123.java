import java.util.Scanner;

public class Array123 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter arr1 numbers");
        double[] arr1 = new double[]{s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble()};
        System.out.println("Enter arr2 numbers");
        double[] arr2 = new double[]{s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble()};
        double[] arr3 = new double[arr1.length];

        for (int i = 0; i < arr1.length; ++i) {
            if (arr1[i] % 2.0 == 0.0 && arr2[i] % 2.0 == 0.0) {
                arr3[i] = arr2[i];
            } else if (arr1[i] % 2.0 == 1.0 && arr2[i] % 2.0 == 1.0) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = 0.0;
            }
        }

        System.out.println("arr [" + (int) arr3[0] + "," + (int) arr3[1] + "," + (int) arr3[2] + "," + (int) arr3[3] + "," + (int) arr3[4] + "," + (int) arr3[5] + "]");
    }
}


