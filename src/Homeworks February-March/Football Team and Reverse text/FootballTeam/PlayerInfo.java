package FootballTeam;
//Պատկերացրեք ունեք ֆուտբոլային ակումբ։
// Ձեր մտքով ոնց անցնումա, սարքեք էդ կլասը՝ իրա անհրաժեշտ property-ներով ու մեթոդներով։
// Իմ կողմից միակ պահանջն էնա, որ պետքա ունենաք ֆուտբոլիստների ցանկ, ովքեր խաղում են տվյալ ակումբում
// պետքա հնարավոր լինի ամեն ֆուտբոլիստի անուն, ազգանուն, խաղային դիրք ու ազգություն վերցնել ( բայց ոչ փոխել )։
//Ոնց եք կազմակերպում՝ Ձեր գործնա։ Սաղ գիտելիքներն ունեք էդ ամենն անելու համար։ Թե մնացածը ինչ կմտածեք՝ թողնում եմ Ձեր հայեցողությանը։

public class PlayerInfo {


    private final int number;


    public int getNumber() {
        return number;
    }

    private final String name;


    public String getName() {
        return name;
    }


    private final String surname;


    public String getSurname() {
        return surname;
    }

    private final String nation;

    public String getNation() {
        return nation;
    }

    private final String position;

    public String getPosition() {
        return position;
    }

    //------------------------------------------------------------------------------------------------------------------
    PlayerInfo(int number, String name, String surname, String nation, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.nation = nation;
        this.position = position;

    }

    public void getInfo() {
        System.out.println("Number:" + number + "\nName:" + name + "\nSurname:" + surname + "\nNation:" + nation + "\nPosition:" + position);
    }
}



