package FootballTeam;

import java.util.Scanner;

public class TeamInfo {
    public static void main(String[] args) {
        System.out.println("My team is Manchester United,I am a big fan of this club since 2020");
         PlayerInfo P1 = new PlayerInfo(1, "David", "De Gea", "Spain", "Goalkeeper");
         PlayerInfo P2 = new PlayerInfo(2, "Victor", "Lindelöf", "Sweden", "Defender");
         PlayerInfo P3 = new PlayerInfo(4, "Phil", "Jones", "England", "Defender");
         PlayerInfo P4 = new PlayerInfo(5, "Harry", "Maguire", "England", "Defender");
         PlayerInfo P5 = new PlayerInfo(6, "Lisandro(Licha)", "Martínez", "Argentina", "Defender");
         PlayerInfo P6 = new PlayerInfo(8, "Bruno", "Miguel Borges Fernandes", "Portugal", "Midfielder");
         PlayerInfo P7 = new PlayerInfo(9, "Anthony", "Martial", "France", "Forward");
         PlayerInfo P8 = new PlayerInfo(10, "Marcus", "Rashford", "England", "Forward");
         PlayerInfo P9 = new PlayerInfo(12, "Tyrell", "Malacia", "Netherlands", "Defender");
         PlayerInfo P10 = new PlayerInfo(14, "Christian", "Eriksen", "Denmark", "Midfielder");
         PlayerInfo P11 = new PlayerInfo(15, "Marcel", "Sabitzer", "Austria", "Midfielder");
         PlayerInfo P12 = new PlayerInfo(17, "Frederico Rodrigues", "de Paula Santos (Fred) ", "Brazil", "Midfielder");
         PlayerInfo P13 = new PlayerInfo(18, "Carlos Henrique", "Casimiro(Casemiro)", "Brazil", "Midfielder");
         PlayerInfo P14 = new PlayerInfo(19, "Raphaël", "Varane", "France", "Defender");
         PlayerInfo P15 = new PlayerInfo(20, "Diogo", "Dalot", "Portugal", "Defender");
         PlayerInfo P16 = new PlayerInfo(21, "Anthony", "Matheus Dos Santos", "Brazil", "Forward");
         PlayerInfo P17 = new PlayerInfo(22, "Tom", "Heaton", "England", "Goalkeeper");
         PlayerInfo P18 = new PlayerInfo(23, "Luke", "Shaw", "England", "Defender");
         PlayerInfo P19 = new PlayerInfo(25, "Jadon", "Sancho", "England", "Forward");
         PlayerInfo P20 = new PlayerInfo(27, "Wout", "Weghorst", "Netherlands", "Forward");
         PlayerInfo P21 = new PlayerInfo(28, "Facundo", "Pellistri Rebollo", "Uruguay", "Midfielder");
         PlayerInfo P22 = new PlayerInfo(29, "Aaron", "Wan-Bissaka", "England", "Defender");
         PlayerInfo P23 = new PlayerInfo(30, "Nathan", "Bishop", "England", "Goalkeeper");
         PlayerInfo P24 = new PlayerInfo(31, "Jack", "Butland", "England", "Goalkeeper");
         PlayerInfo P25 = new PlayerInfo(33, "Brandon", "Williams", "England", "Defender");
         PlayerInfo P26 = new PlayerInfo(34, "Donny", "Van de Beek", "Netherlands", "Midfielder");
         PlayerInfo P27 = new PlayerInfo(36, "Anthony", "Elanga", "Sweden", "Defender");
         PlayerInfo P28 = new PlayerInfo(39, "Scott", "McTominay", "Scotland", "Midfielder");
         PlayerInfo P29 = new PlayerInfo(49, "Alejandro", "Garnacho", "Argentina", "Forward");
         PlayerInfo P30 = new PlayerInfo(55, "Zidane", "Iqbal", "Iraq", "Midfielder");
         PlayerInfo P31 = new PlayerInfo(66, "Rhys", "Bennett", "England", "Defender");
         PlayerInfo P32 = new PlayerInfo(73, "Kobbie", "Mainoo", "England", "Midfielder");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your player's number");
        int num;
        num = s.nextInt();
        if (num == 3 || num == 7 || num == 11 || num == 13 || num == 16 || num == 24 || num == 26 || num == 32 || num == 35 || num == 37 || num == 38 || num > 39 && num < 49 || num > 49 && num < 55 || num > 55 && num < 66 || num > 66 && num < 73 || num > 73)
            do {
                System.out.println("There is no player with this number");
                num = s.nextInt();
            } while (num == 3 || num == 7 || num == 11 || num == 13 || num == 16 || num == 24 || num == 26 || num == 32 || num == 35 || num == 37 || num == 38 || num > 39 && num < 49 || num > 49 && num < 55 || num > 55 && num < 66 || num > 66 && num < 73 || num > 73);
        switch (num) {
            case 1:
                P1.getInfo();
                break;
            case 2:
                P2.getInfo();
                break;
            case 4:
                P3.getInfo();
                break;
            case 5:
                P4.getInfo();
                break;
            case 6:
                P5.getInfo();
                break;
            case 8:
                P6.getInfo();
                break;
            case 9:
                P7.getInfo();
                break;
            case 10:
                P8.getInfo();
                break;
            case 12:
                P9.getInfo();
                break;
            case 14:
                P10.getInfo();
                break;
            case 15:
                P11.getInfo();
                break;
            case 17:
                P12.getInfo();
                break;
            case 18:
                P13.getInfo();
                break;
            case 19:
                P14.getInfo();
                break;
            case 20:
                P15.getInfo();
                break;
            case 21:
                P16.getInfo();
                break;
            case 22:
                P17.getInfo();
                break;
            case 23:
                P18.getInfo();
                break;
            case 25:
                P19.getInfo();
                break;
            case 27:
                P20.getInfo();
                break;
            case 28:
                P21.getInfo();
                break;
            case 29:
                P22.getInfo();
                break;
            case 30:
                P23.getInfo();
                break;
            case 31:
                P24.getInfo();
                break;
            case 33:
                P25.getInfo();
                break;
            case 34:
                P26.getInfo();
                break;
            case 36:
                P27.getInfo();
                break;
            case 39:
                P28.getInfo();
                break;
            case 49:
                P29.getInfo();
                break;
            case 55:
                P30.getInfo();
                break;
            case 66:
                P31.getInfo();
                break;
            case 73:
                P32.getInfo();
        }
    }
}
