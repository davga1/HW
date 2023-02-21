package GreatestArrayDivisor;

import java.util.Scanner;

public class BiggestDivisor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arrayTest1 = {5,25,125,625};
        int[] arrayTest2 = {5,8,11,16};
        int[] arrayTest3 = {2,18,6};
        int[] arrayTest4 = {s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
        System.out.print("First array " );
        BiggestDivisorFinder BD1 = new BiggestDivisorFinder(arrayTest1);
        System.out.print("Second array ");
        BiggestDivisorFinder BD2 = new BiggestDivisorFinder(arrayTest2);
        System.out.print("Third array ");
        BiggestDivisorFinder BD3 = new BiggestDivisorFinder(arrayTest3);
        System.out.print("Fourth array ");
        BiggestDivisorFinder BD4 = new BiggestDivisorFinder(arrayTest4);
    }
}
