package domein;

import java.security.PrivateKey;

public class Verplaatsing {
    private String van;
    private String naar;
    private double aantalKm;

    public String getVan() {
        return van;
    }

    public String getNaar() {
        return naar;
    }

    public double getAantalKm() {
        return aantalKm;
    }

    public void setAantalKm(double aantalKm) {
        this.aantalKm = aantalKm;
    }

    public void setNaar(String naar) {
        if (naar == null || naar.isBlank())
            throw new IllegalArgumentException("Naar meot ingvuld zijn");
        this.naar = naar;
    }

    public void setVan(String van) {
        if (naar == null || naar.isBlank())
            throw new IllegalArgumentException("Van moet ingvuld zijn");
        this.van = van;
    }
    public Verplaatsing(String van, String naar, double aantalKm){
        setAantalKm(aantalKm);
        setNaar(naar);
        setVan(van);
    }

    @Override
    public String toString(){
        return String.format("Verplaatsging van %s naar %s", van, naar);
    }
}
