package BuildingPackage;

import java.util.Scanner;

public class District_With_Buildings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        District D1 = new District();
        System.out.println("District 1 Building 1");
        System.out.println("Let's build first building with you,the other part is written by me");
        String answer;
        boolean isPanel = true;
        do {
            System.out.println("Is your first building with panels?");
            answer = s.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                isPanel = true;
            }
            if (answer.equalsIgnoreCase("no")) {
                isPanel = false;
            }
        } while (!answer.equalsIgnoreCase("yes") && (!answer.equalsIgnoreCase("no")));
        if (isPanel) answer = "Panel type ";
        if (!isPanel) answer = "Monolithic type ";
        System.out.println("How many floors has your building");
        int floorCount = s.nextInt();
        System.out.println("How many two-room houses are in your building");
        int twoRoomedHouseCount = s.nextInt();
        System.out.println("How many three-room houses are in your building");
        int threeRoomedHouseCount = s.nextInt();

        Building B1 = new Building();
        B1.setFloorCount(floorCount);
        B1.setTwoRoomedHouseCount(twoRoomedHouseCount);
        B1.setThreeRoomedHouseCount(threeRoomedHouseCount);
        int floor = B1.getFloorCount();
        int two_RoomHouse = B1.getTwoRoomedHouseCount();
        int three_RoomHouse = B1.getThreeRoomedHouseCount();
        System.out.println(("\nYour building is " + answer + "it has " + floor + " floors," + two_RoomHouse + " Two-Roomed apartments," + three_RoomHouse + " Three-Roomed apartments"));
        System.out.println("Write numbers for your two-room apartments");
        B1.getLength(two_RoomHouse);
        System.out.println("\nWrite numbers for your three-room apartments");
        B1.getLength(three_RoomHouse);
        System.out.println("\nDistrict 1 Building 2");
        Building B2 = new Building();
        isPanel = false;
        B2.setFloorCount(5);
        B2.setTwoRoomedHouseCount(3);
        B2.setThreeRoomedHouseCount(1);
        floor = B2.getFloorCount();
        two_RoomHouse = B2.getTwoRoomedHouseCount();
        three_RoomHouse = B2.getThreeRoomedHouseCount();
        System.out.println(("\nYour building is " + answer + "it has " + floor + " floors," + two_RoomHouse + " Two-Roomed apartments," + three_RoomHouse + " Three-Roomed apartments"));
        System.out.println("Write numbers for your two-room apartments");
        B2.getLength(two_RoomHouse);
        System.out.println("\nWrite numbers for your three-room apartments");
        B2.getLength(three_RoomHouse);
        System.out.println("\nDistrict 1 Building 3");
        Building B3 = new Building();
        isPanel = true;
        B3.setFloorCount(4);
        B3.setTwoRoomedHouseCount(1);
        B3.setThreeRoomedHouseCount(3);
        floor = B3.getFloorCount();
        two_RoomHouse = B3.getTwoRoomedHouseCount();
        three_RoomHouse = B3.getThreeRoomedHouseCount();
        System.out.println(("\nYour building is " + answer + "it has " + floor + " floors," + two_RoomHouse + " Two-Roomed apartments," + three_RoomHouse + " Three-Roomed apartments"));
        System.out.println("Write numbers for your two-room apartments");
        B3.getLength(two_RoomHouse);
        System.out.println("\nWrite numbers for your three-room apartments");
        B3.getLength(three_RoomHouse);
        System.out.println("\nSet garden area for this district");
        D1.setGarden(s.nextInt());
        double eachGardenPart = (D1.getGarden() / (double) (B1.getTwoRoomedHouseCount() + B1.getThreeRoomedHouseCount() + B2.getTwoRoomedHouseCount() + B2.getThreeRoomedHouseCount() + B3.getTwoRoomedHouseCount() + B3.getThreeRoomedHouseCount()));
        if (eachGardenPart % 1 == 0) {
            System.out.println("\nEach house in this district should have " + (int) eachGardenPart + "km^2 garden");
        } else
            System.out.println("\nEach house in this district should have " + eachGardenPart + "km^2 garden");
        System.out.println("\n District 2 Building 1");
        District D2 = new District();
        Building B1D2 = new Building();
        B1D2.setFloorCount(6);
        B1D2.setTwoRoomedHouseCount(4);
        B1D2.setThreeRoomedHouseCount(2);
        isPanel = false;
        System.out.println(("\nYour building is " + answer + "it has " + floor + " floors," + two_RoomHouse + " Two-Roomed apartments," + three_RoomHouse + " Three-Roomed apartments"));
        System.out.println("\nWrite numbers for your two-room apartments");
        B1D2.getLength(two_RoomHouse);
        System.out.println("\nWrite numbers for your three-room apartments");
        B1D2.getLength(three_RoomHouse);
        System.out.println("\nDistrict 2 Building 2");
        Building B2D2 = new Building();
        B2D2.setFloorCount(7);
        B2D2.setTwoRoomedHouseCount(2);
        B2D2.setThreeRoomedHouseCount(3);
        isPanel = true;
        System.out.println(("\nYour building is " + answer + "it has " + floor + " floors," + two_RoomHouse + " Two-Roomed apartments," + three_RoomHouse + " Three-Roomed apartments"));
        System.out.println("\nWrite numbers for your two-room apartments");
        B2D2.getLength(two_RoomHouse);
        System.out.println("\nWrite numbers for your three-room apartments");
        B2D2.getLength(three_RoomHouse);
        System.out.println("\nDistrict 2 Building 3");
        Building B3D2 = new Building();
        B3D2.setFloorCount(2);
        B3D2.setTwoRoomedHouseCount(1);
        B3D2.setThreeRoomedHouseCount(4);
        isPanel = false;
        System.out.println(("\nYour building is " + answer + "it has " + floor + " floors," + two_RoomHouse + " Two-Roomed apartments," + three_RoomHouse + " Three-Roomed apartments"));
        System.out.println("\nWrite numbers for your two-room apartments");
        B3D2.getLength(two_RoomHouse);
        System.out.println("\nWrite numbers for your three-room apartments");
        B3D2.getLength(three_RoomHouse);

        System.out.println("\nSet garden area for this district");
        D2.setGarden(s.nextInt());
        eachGardenPart = (D2.getGarden() / (double) (B1D2.getTwoRoomedHouseCount() + B1D2.getThreeRoomedHouseCount() + B2D2.getTwoRoomedHouseCount() + B2D2.getThreeRoomedHouseCount() + B3D2.getTwoRoomedHouseCount() + B3D2.getThreeRoomedHouseCount()));
        if (eachGardenPart % 1 == 0) {
            System.out.println("\nEach house in this district should have " + (int) eachGardenPart + "km^2 garden");
        } else
            System.out.println("\nEach house in this district should have " + eachGardenPart + "km^2 garden");
    }
}

