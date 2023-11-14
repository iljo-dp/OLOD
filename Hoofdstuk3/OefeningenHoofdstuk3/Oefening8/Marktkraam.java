package domein;

public class Marktkraam {
    //<- kraamhouder : String
    //<- breedte : int
    //-inkomsten : double
    //DEZE ALTIJD PRIVATE DATATYPE NAAM
    private String kraamhouder;
    private int breedte;
    private double inkomsten;


    //ENKEL kraamhouder en breedte hebben getters nodig, beiden zijn public. PIJLTJE ALTIJD PUBLIC, private getter doet niets.
    public String getKraamhouder() {
        return kraamhouder;
    }

    public int getBreedte() {
        return breedte;
    }

    public Marktkraam(String kraamhouder, int breedte) {
        setKraamhouder(kraamhouder);
        setBreedte(breedte);
    }


    //IN DE METHODES MET EEN -
    private void setKraamhouder(String kraamhouder) {
        if (kraamhouder != null && !kraamhouder.isBlank()) {
            this.kraamhouder = kraamhouder;
        } else {
            this.kraamhouder = "anoniem";
        }
    }
    private void setBreedte(int breedte) {
        if (breedte < 10 && breedte >= 2){
            this.breedte = breedte;
        } else {
            this.breedte = 10;
        }
    }



    public void ontvang(double bedrag) {
        if (bedrag > 0) {
            inkomsten += bedrag;
        }
    }
    public double geefWinst() {
        if (breedte <= 5 && breedte >= 2) {
            return inkomsten - breedte * 3;
        } else {
            return inkomsten - breedte * 2.5;
        }
    }

}
