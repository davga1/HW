import java.util.Scanner;
public class HWCalendar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            System.out.println("1- January 2-February 3-March 4-April 5-May 6-June 7-July 8-August 9-September 10-October 11-November 12-December");
            System.out.println("Enter Your selected month number");
    int month = s.nextInt();
            switch (month) {
        case 1, 3, 5, 7, 8, 10, 12:
            System.out.println("The selected month number is " + "" + month + "," + "it has 31 days");
            break;
        case 2:
            System.out.println("The selected month number is "  + "" +month + "," + "it has 28 days");
            break;
        case 4, 6, 9, 11:
            System.out.println("The selected month number is " + "" +month + "," + "it has 30 days");
            break;
        default:
            System.out.println("Wrong number,please write a number from 1 to 12");
        }
    }
}