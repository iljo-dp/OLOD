package domein;

public class VerplaatsingPerAuto extends Verplaatsing {
    private double benzinePrijs;
    private double verbruik;
    public static final double MIN_BENZINEPRIJS = 0.5;
    public static final double MAX_BENZINEPRIJS = 2.0;
    public static final double MIN_VERBRUIK = 0.02;
    public static final double MAX_VERBRUIK = 0.07;

    public final void setBenzineprijs(double benzinePrijs) {
        if (benzinePrijs < MIN_BENZINEPRIJS || benzinePrijs > MAX_BENZINEPRIJS) {
            throw new IllegalArgumentException("Benzineprijs moet tussen " + MIN_BENZINEPRIJS + " en " + MAX_BENZINEPRIJS + " liggen");
        }
        this.benzinePrijs = benzinePrijs;
    }

    public final void setVerbruik(double verbruik) {
        if (verbruik < MIN_VERBRUIK || verbruik > MAX_VERBRUIK) {
            throw new IllegalArgumentException("Verbruik moet tussen " + MIN_VERBRUIK + " en " + MAX_VERBRUIK + " liggen");
        }
        this.verbruik = verbruik;
    }

    public double getBenzineprijs() {
        return benzinePrijs;
    }
    public double getVerbruik() {
        return verbruik;
    }
    public VerplaatsingPerAuto(String van, String naar, double aantalKm, double benzinePrijs, double verbruik) {
        super(van, naar, aantalKm);
        setBenzineprijs(benzinePrijs);
        setVerbruik(verbruik);
    }
    public double berekenPrijs() {
        return super.getAantalKm() * benzinePrijs * verbruik;
    }

}
