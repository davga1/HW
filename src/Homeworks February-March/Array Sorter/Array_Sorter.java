package work;

import java.util.Scanner;

public class Array_Sorter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int substitute = 0;
        int[] arr = {a,b,c,c,c,a,b,b,a};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    substitute = arr[i];
                    arr[i] = arr[j];
                    arr[j] = substitute;
                }
            }
        }
        System.out.println("Your array is");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}