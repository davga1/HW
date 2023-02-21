package Cooker;

public class Cooker {
    private int gasHeaterCount;

    public void setGasHeaterCount(int gasHeaterCount) {
        if (gasHeaterCount < 3 || gasHeaterCount > 5) {
            System.out.println("You should have from 3 to 5 gas heaters");
            gasHeaterCount = 0;
        }
        this.gasHeaterCount = gasHeaterCount;
    }

    public int getGasHeaterCount() {
        gasHeaterCount *= 80;
        return gasHeaterCount;
    }

    private int electricHeaterCount;

    public void setElectricHeaterCount(int electricHeaterCount) {
        if (electricHeaterCount < 1 || electricHeaterCount > 3) {
            System.out.println("You should have from 1 to 3 electric heater");
            electricHeaterCount = 0;
        }
        this.electricHeaterCount = electricHeaterCount;
    }

    public int getElectricHeaterCount() {
        electricHeaterCount *= 100;
        return electricHeaterCount;
    }
}
