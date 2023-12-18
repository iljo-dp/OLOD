package domein;

public class VerplaatsingPerBusTram extends Verplaatsing {
    private int lijnnr;
    private boolean bus;
    private boolean stadslijn;
    private static final double PRIJS_PER_HALTE = 0.32;

    public VerplaatsingPerBusTram(String van, String naar, double aantalKm, int lijnnr, boolean bus, boolean stadslijn) {
        super(van, naar, aantalKm);
        this.lijnnr = lijnnr;
        this.bus = bus;
        this.stadslijn = stadslijn;
    }

    public int getLijnnr() {
        return lijnnr;
    }

    public boolean isBus() {
        return bus;
    }

    public boolean isStadslijn() {
        return stadslijn;
    }

    public void setStadslijn(boolean stadslijn) {
        this.stadslijn = stadslijn;
    }

    public final void setLijnnr(int lijnnr) {
        if (lijnnr < 0)
            throw new IllegalArgumentException("Lijnnummer moet positief zijn.");
        this.lijnnr = lijnnr;
    }
    private void setBus(boolean bus) {
        this.bus = bus;
    }
    @Override
    public String toString() {
        return String.format("%s met %s%s %d", super.toString(), stadslijn?"stads":"", bus?"bus":"tram", lijnnr);
    }
    public double berekenPrijs() {
        int aantalHaltes = (int) Math.ceil(super.getAantalKm());
        double prijs = aantalHaltes * PRIJS_PER_HALTE * 2;
        if (stadslijn)
            prijs *= 0.8;
        return prijs;
    }
}
