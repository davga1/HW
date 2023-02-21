package SportsmanHomework;

public class Sportsman {
    private int competition1;

    public void setCompetition1(int competition1) {
        if (competition1 < 10 || competition1 > 20) competition1 = 10;
        this.competition1 = competition1;
    }

    public int getCompetition1() {
        return competition1;
    }

    private int competition2;

    public void setCompetition2(int competition2) {
        if (competition2 < 10 || competition2 > 20) competition2 = 10;
        this.competition2 = competition2;
    }

    public int getCompetition2() {
        return competition2;
    }

    private int competition3;


    public void setCompetition3(int competition3) {
        if (competition3 < 10 || competition3 > 20) competition3 = 10;
        this.competition3 = competition3;
    }

    public int getCompetition3() {
        return competition3;
    }

    private int competition4;

    public void setCompetition4(int competition4) {
        if (competition4 < 10 || competition4 > 20) competition4 = 10;
        this.competition4 = competition4;
    }

    public int getCompetition4() {
        return competition4;
    }

    private int competition5;

    public void setCompetition5(int competition5) {
        if (competition5 < 10 || competition5 > 20) competition5 = 10;
        this.competition5 = competition5;
    }

    public int getCompetition5() {
        return competition5;
    }
    public int averagePointCounter(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        return sum / 5;
    }int Compare(int a, int b){
        int result = 0;
        if (a > b) result = 1;
        if (a < b) result = -1;
        return  result;
    }
}
