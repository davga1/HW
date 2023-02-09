import java.util.Scanner;
public class HomeworkClock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter clock number");
        int num = s.nextInt();
        if (num >= 1 && num <= 11) {
            System.out.println("There is" + " " + num * 5 + " " + "minutes");
        } else if (num == 12) {
            System.out.println("00");
        } else System.out.println("Please Enter a Number from 1 to 12");
    }
}