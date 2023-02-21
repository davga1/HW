package stringsHomeworksAndExercises;

import java.util.Scanner;

class City {
    String name = "Not Defined";
    int age;
    int peopleQuantity;
    double area;
    void cityParameters() {
        System.out.println("City's name is " + name + "\nCity's age is " + age + " years" + "\nCity's population " + peopleQuantity + "\nCity's area is equal to:" + area + "km^2");
    }
}

public class CityParameters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        City City1 = new City();
        City1.name = "Goris";
        City1.age = 2736;
        City1.peopleQuantity = 20591;
        City1.area = 8;
        City1.cityParameters();
        System.out.println("About Goris.If you don't believe,take https://en.wikipedia.org/wiki/Goris");
        City City2 = new City();
        System.out.print("City's name is:");
        City2.name = s.nextLine();
        if (City2.name.isEmpty()) {
            do {
                System.out.println("City's name is not defined");
                System.out.print("City's name is:");
                City2.name = s.nextLine();
            } while (City2.name.isEmpty());
        }
        System.out.println("City's age is:");
        City2.age = s.nextInt();
        System.out.println("City's population is:");
        City2.peopleQuantity = s.nextInt();
        System.out.println("City's area is:");
        City2.area = s.nextDouble();
        City2.cityParameters();
    }
}

