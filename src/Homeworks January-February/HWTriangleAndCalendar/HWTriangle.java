import java.util.Scanner;

public class HWTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your triangle parameters");
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        System.out.print("c=");
        int c = scanner.nextInt();
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("It's a Triangle");
        } else System.out.println("It isn't a Triangle");
    }
}