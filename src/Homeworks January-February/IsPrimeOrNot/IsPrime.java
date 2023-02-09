import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()};
        int goingToPrimeCounter = 0;
        int primeCounter = 0;
        System.out.println("Prime numbers:");
        for (int i = 0; i < arr.length; i++, goingToPrimeCounter = 0) {
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    goingToPrimeCounter++;
                }
            }
            if (goingToPrimeCounter == 2) {
                System.out.print(arr[i] + " ");
                primeCounter++;
            }
        }
        if (primeCounter == 0) {
            System.out.println("There is no prime number");
        }
    }
}



