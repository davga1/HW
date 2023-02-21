package BuildingPackage;

import java.util.Scanner;

public class Building {
    Scanner s = new Scanner(System.in);
private int floorCount;
void setFloorCount(int floorCount) {
    this.floorCount = floorCount;
}
    public int getFloorCount() {
        System.out.println();
        return floorCount;
    }


    private int twoRoomedHouseCount;
void setTwoRoomedHouseCount(int twoRoomedHouseCount){
    if (twoRoomedHouseCount > floorCount*4){
        System.out.println("There can't be more houses than " + floorCount*4);
        System.exit(1);
    }
    this.twoRoomedHouseCount = twoRoomedHouseCount;
}

    public int getTwoRoomedHouseCount() {

        return twoRoomedHouseCount;
    }
    private int threeRoomedHouseCount;
void setThreeRoomedHouseCount(int threeRoomedHouseCount){
    if (threeRoomedHouseCount > (floorCount*4) - twoRoomedHouseCount){
        System.out.println("There can't be more three roomed houses than " + ((floorCount*4)-twoRoomedHouseCount));
        System.exit(1);
    }
    this.threeRoomedHouseCount = threeRoomedHouseCount;
}
void getLength(int length) {
    int[] lengthFinder = new int[length];
    for (int i = 0; i < length; i++) {
        lengthFinder[i] = s.nextInt();
    }
    System.out.println("Your two-room apartments numbers are");
    for (int i = 0; i <lengthFinder.length; i++) {
        System.out.print(lengthFinder[i] + " ");
    }
}

    public int getThreeRoomedHouseCount() {
        return threeRoomedHouseCount;
    }
}


