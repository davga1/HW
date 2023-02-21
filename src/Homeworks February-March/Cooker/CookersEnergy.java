package Cooker;

import java.util.Scanner;

public class CookersEnergy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cooker Cooker = new Cooker();
        System.out.println("Is gas heater working?");
        String answer1 = s.nextLine();
        if (answer1.equalsIgnoreCase("Yes")) {
            System.out.println("Enter your heater's quantity");
            Cooker.setGasHeaterCount(s.nextInt());
        } else if (answer1.equalsIgnoreCase("No"))
            System.out.println("You have no gas heater working");
        else {
            do {
                System.out.println("Please type \"yes\" or \"no\"");
                answer1 = s.nextLine();
            } while (!answer1.equalsIgnoreCase("yes") && !answer1.equalsIgnoreCase("no"));
        }
        int gasHeatersEnergyCounter = Cooker.getGasHeaterCount();
        System.out.println("Is Electric Heater working?");
        Scanner ss = new Scanner(System.in);
        String answer2 = ss.nextLine();
        if (answer2.equalsIgnoreCase("Yes")) {
            System.out.println("Enter your heaters quantity");
            Cooker.setElectricHeaterCount(ss.nextInt());
        } else if (answer2.equalsIgnoreCase("No"))
            System.out.println("You have no electric heater working");
        else
            do {
                System.out.println("Please type \"yes\" or \"no\"");
                answer2 = ss.nextLine();
            } while (!answer2.equalsIgnoreCase("yes") && !answer2.equalsIgnoreCase("no"));
        int electricHeatersEnergyCounter = Cooker.getElectricHeaterCount();
        System.out.println("Your energy is:" + (gasHeatersEnergyCounter + electricHeatersEnergyCounter));
    }
}
