import java.util.Scanner;

public class TwoDimArrHW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Հայտարարել երկչափ զանգված, ինիթ անել ու տպել տվյալ երկչափ զանգվածի ամեն անդամ զանգվածի առաջին ու վերջին տարրերը։
        int[][] s = {{1,2,3,4,66,87,21,65,-5,333,15,64},{6,4,5,8,7,13,24,654,16,20,-8,88}, {5,4,6,1,23,21,31,6,8,4,91,15}, {1,6,2,48,94,6,35,52,5,-11}, {1}};
        int FirstNum = 0;
        int LastNum;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                FirstNum = s[i][0];
            }
            System.out.print("First number of dimension"  + " " + (i+1) + " " + "is" + " " + FirstNum);
            LastNum = s[i][s[i].length - 1];
            System.out.println(", " + "Last number is " + " " + LastNum);
        }
    }
}