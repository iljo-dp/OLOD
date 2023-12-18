package domein;

/* ===== De klasse Rechthoek na code generatie uit VP ===== */
public class Rechthoek {

	private double lengte;
	private double breedte;

	
	private static final int MIN_LENGTE_BREEDTE = 0;
	private static final int MIN_PERCENTAGE_SCHAAL = 1;
	private static final int MAX_PERCENTAGE_SCHAAL = 200;

	public Rechthoek(double lengte, double breedte) {
		//Make the constructor
		this.setLengte(lengte);
		this.setBreedte(breedte);
	}

	public double geefOmtrek() {
		// TODO - implement Rechthoek.geefOmtrek
		throw new UnsupportedOperationException();
	}

	public double geefOppervlakte() {
		// TODO - implement Rechthoek.geefOppervlakte
		throw new UnsupportedOperationException();
	}

	public void schaal(int percentage) {
		// TODO - implement Rechthoek.schaal
		throw new UnsupportedOperationException();
	}

	public double getLengte() {
		return this.lengte;
	}

	public double getBreedte() {
		return this.breedte;
	}

	private void setLengte(double lengte) {
		if (lengte <= MIN_LENGTE_BREEDTE)
			throw new IllegalArgumentException(String.format("Lengte moet groter zijn dan %d", MIN_LENGTE_BREEDTE));
		this.lengte = lengte;
	}

	private void setBreedte(double breedte) {
		if (breedte <= MIN_LENGTE_BREEDTE)
			throw new IllegalArgumentException(String.format("Breedte moet groter zijn dan %d", MIN_LENGTE_BREEDTE));
		this.breedte = breedte;
	}
}
