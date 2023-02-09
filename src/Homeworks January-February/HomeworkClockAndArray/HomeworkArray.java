import java.util.Scanner;
public class HomeworkArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double []a= {s.nextDouble(),s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble()};
        double []b = new double[5];
        int i = 0;
        if (a[0] > 0) {
            b[i] = a[0];
            i++;}
        if (a[1] > 0) {
            b[i] = a[1];
            i++;}
        if (a[2] > 0) {
            b[i] = a[2];
            i++;}
        if (a[3] > 0) {
            b[i] = a[3];
            i++;}
        if (a[4] > 0) {
            b[i] = a[4];
        }
        System.out.println("[" + (int)b[0] + "," + (int)b[1] + "," + (int)b[2] + "," + (int)b[3] + "," + (int)b[4] + "]");
    }
}





