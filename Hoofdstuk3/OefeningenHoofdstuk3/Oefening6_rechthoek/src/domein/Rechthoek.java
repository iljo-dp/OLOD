package domein;

public class Rechthoek {
    private double lengte;
    private double breedte;


    //Getters en setters
    public double getLengte() {
        return lengte;
    }
    public double getBreedte() {
        return breedte;
    }

    private void setLengte(double lengte) {
        this.lengte = lengte > 0 ? lengte : 1;
    }
    public void setBreedte(double breedte) {
        this.breedte = breedte > 0 ? breedte : 1;
    }

    //Constructors

    //Default constructor
    public Rechthoek()
    {
        this(10,7);
    }
    public Rechthoek(double lengte, double breedte)
    {
        setLengte(lengte);
        setBreedte(breedte);
    }

    public double berekenOmtrek()
    {
        return 2 * (lengte + breedte);
    }
    public double berekenOppervlakte()
    {
        return lengte * breedte;
    }
}
