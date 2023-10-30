package domein;

public class Product {
	// declareren
	private String naam;
	private double prijsExclBtw;
	private int btwPercentage;
	private int kortingStuksPercentage;

	private int doomemacs;
	// Getters and setters


	public String getNaam(){
		return naam;
	}
	public double getPrijsExclBtw() {
		return prijsExclBtw;
	}
	public int getBtwPercentage() {
		return btwPercentage;
	}
	public int getKortingStuksPercentage() {
		return kortingStuksPercentage;
	}


	// 3 van de 4 zijn public setters want > in het uml
	//Bij public setters altijd final zetten --> inheritance.
	private void setNaam(String naam) {
		this.naam = naam;
	}
	public final void setBtwPercentage(int btwPercentage) {
		if (btwPercentage >= 6 && btwPercentage <= 21) {
			this.btwPercentage = btwPercentage;
		} else {
			this.btwPercentage = 21; // Default
		}
	}
	public final void setKortingStuksPercentage(int kortingStuksPercentage) {
		if (kortingStuksPercentage >= 0 && kortingStuksPercentage <= 50) {
			this.kortingStuksPercentage = kortingStuksPercentage;
		} else {
			this.kortingStuksPercentage = 0; // Default
		}
	}

	public final void setPrijsExclBtw(double prijsExclBtw) {
		if (prijsExclBtw > 0) {
			this.prijsExclBtw = prijsExclBtw;
		} else {
			this.prijsExclBtw = 1; // Default
		}
	}




	public Product(String naam, double prijsExclBtw, int btwPercentage, int kortingStuksPercentage) {
		setNaam(naam);
		setPrijsExclBtw(prijsExclBtw);
		setBtwPercentage(btwPercentage);
		setKortingStuksPercentage(kortingStuksPercentage);
	}

	public double berekenPrijs(int aantal) {
		double prijsVoorKorting = prijsExclBtw;
		if (aantal >= 6) {
			double korting = prijsExclBtw * kortingStuksPercentage / 100.0;
			prijsVoorKorting -= korting;
		}

		double prijsMetBtw = prijsVoorKorting + (prijsVoorKorting * btwPercentage / 100.0);

		return Math.round(prijsMetBtw * aantal * 100.0) / 100.0; // De totale prijs voor het opgegeven aantal stuks.
	}


}
