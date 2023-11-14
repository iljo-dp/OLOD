package domein;

public class Auto {
    //Aanmaken van de datatypen
    private boolean elektrisch = true;
    private double aantalKilometers;
    private int vergoeding;

    //Getters en setters
    public boolean isElektrisch() {
        return elektrisch;
    }
    public double getAantalKilometers() {
        return aantalKilometers;
    }
    public int getVergoeding() {
        return vergoeding;
    }

    public void setAantalKilometers(double aantalKilometers) {
        this.aantalKilometers = (aantalKilometers >= 0.0 && aantalKilometers <= 1000.0) ? aantalKilometers : 400.50;
    }
    public void setVergoeding(int vergoeding) {
        this.vergoeding = (vergoeding >= 1 && vergoeding <= 5) ? vergoeding : 2;
    }

    //De rest
    public Auto(int vergoeding){
       setVergoeding(vergoeding);
       setAantalKilometers(400.50);
    }
    public Auto(double aantalKilometers, int vergoeding){
        setVergoeding(vergoeding);
        setAantalKilometers(aantalKilometers);
    }
    public Auto(boolean elektrisch, double aantalKilometers, int vergoeding){
        setElektrisch(elektrisch);
        setAantalKilometers(aantalKilometers);
        setVergoeding(vergoeding);
    }

    public boolean heeftExtraVergoeding(){
        if (isElektrisch() && getAantalKilometers() <= 400.50){
            return true;
        }
        return false;
    }

    public double berekenTotaleVergoeding(){
       double totaal = (getAantalKilometers() - 1000) * getVergoeding();
       double rechtOpMeerVergoeding = 1;
       if (heeftExtraVergoeding()){
           rechtOpMeerVergoeding = 2;
       }
       return (totaal-totaal-totaal) * rechtOpMeerVergoeding;
    }

    private void setElektrisch(boolean elektrisch){
        this.elektrisch= elektrisch;
    }

}