package SportsmanHomework;

import java.util.Scanner;
public class Competition {
    public static void main(String[] args) {
        System.out.println("We have 5 competitions and two sportsmans.They were joined at 5 competitions and each one has its own points\nYou should enter first sportsman's points and compare his average points with the second sportsman");
        System.out.println("The minimal sum of points for one competition is 10,and maximal is 20.If your sportsman have more points or less,they would be changed to \"10\"");
        Scanner s = new Scanner(System.in);
        Sportsman Sportsman1 = new Sportsman();
        System.out.println("Enter sportsman's points from first competition");
        Sportsman1.setCompetition1(s.nextInt());
        int firstCompetition = Sportsman1.getCompetition1();
        System.out.println("Enter sportsman's points from second competition");
        Sportsman1.setCompetition2(s.nextInt());
        int secondCompetition = Sportsman1.getCompetition2();
        System.out.println("Enter sportsman's points from third competition");
        Sportsman1.setCompetition3(s.nextInt());
        int thirdCompetition = Sportsman1.getCompetition3();
        System.out.println("Enter sportsman's points from fourth competition");
        Sportsman1.setCompetition4(s.nextInt());
        int fourthCompetition = Sportsman1.getCompetition4();
        System.out.println("Enter sportsman's points from fifth competition");
        Sportsman1.setCompetition5(s.nextInt());
        int fifthCompetition = Sportsman1.getCompetition5();
        int[] arr = {firstCompetition, secondCompetition, thirdCompetition, fourthCompetition, fifthCompetition};
        int result1 = Sportsman1.averagePointCounter(arr);
        System.out.println("Your sportsman's average points are: " + result1);

        Sportsman Sportsman2 = new Sportsman();
        Sportsman2.setCompetition1(9);
        firstCompetition = Sportsman2.getCompetition1();
        Sportsman2.setCompetition2(11);
        secondCompetition = Sportsman2.getCompetition2();
        Sportsman2.setCompetition3(20);
        thirdCompetition = Sportsman2.getCompetition3();
        Sportsman2.setCompetition4(25);
        fourthCompetition = Sportsman2.getCompetition4();
        Sportsman2.setCompetition5(10);
        fifthCompetition = Sportsman2.getCompetition5();
        arr = new int[]{firstCompetition, secondCompetition, thirdCompetition, fourthCompetition, fifthCompetition};
        System.out.println("Your second sportsman's average points are: " + Sportsman2.averagePointCounter(arr));
        int result2 = Sportsman2.averagePointCounter(arr);
        Sportsman classForComparing = new Sportsman();
        int compareResult = classForComparing.Compare(result1,result2);
        System.out.println("Comparing your sportsmans:if first sportsman's average points are bigger than second sportsman's,you should see \"1\",if second sportsman's average points are bigger,\"-1\".If they are equal - \"0\"");
        System.out.println("result of comparing: "+compareResult);
        }
    }
