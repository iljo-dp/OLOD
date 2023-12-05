package cui;

import domein.Grijpkraan;
import domein.KauwgomAutomaat;

public class AutomaatApplicatie {
	
	/* 
	 * Opmerking: 
	 * de 3 lagenarchitectuur is hier niet correct gebruikt om de focus op overerving te behouden.
	 * er is bijvoorbeeld geen DomeinController. 
	 */
	
	public void start() {
		String resultaat;
		boolean gelukt;
		int aantalKeer = 10;
		
		// TODO: maak een KauwgomAutomaat met 200 ballen aan.
		KauwgomAutomaat k1 = null;	
		
		// 10 keer KauwgomAutomaat
		// TODO: verander "" door de naam van de klasse en 0 door het aantal ballen van de automaat
		System.out.printf("%d keer aan de hendel draaien van een %s met %d ballen%n", 
				aantalKeer, "", 0);
		draaiNKeer(k1, aantalKeer, true);

		// 10 keer Grijpkraan
		// TODO: maak een Grijpkraan met 20 prijzen aan.
		Grijpkraan g1 = null;
		// TODO: verander "" door de naam van de klasse en 0 door het aantal prijzen van de grijpkraan
		System.out.printf("%d keer aan de hendel draaien van een %s met %d ballen%n",
				aantalKeer, "", 0);
		draaiNKeer(g1, aantalKeer);
		
		// zonder betalen
		gelukt = k1.draaiHendel();
		resultaat = gelukt ? "ge" : "mis";
		System.out.printf("Zonder te betalen... %slukt%n%n", resultaat);
		
		// munt teruggenomen
		k1.betaal();
		k1.neemMuntTerug();
		gelukt = k1.draaiHendel();
		resultaat = gelukt ? "ge" : "mis";
		System.out.printf("Munt teruggenomen... %slukt%n%n", resultaat);	
		
		// 2 keer zonder kauwgom er uit te nemen na eerste keer
		aantalKeer = 2;
		System.out.printf("%d pogingen, maar vergeten item er uit te nemen na de eerste...%n", 
				aantalKeer);
		draaiNKeer(k1, aantalKeer, false);
		
		// 2 keer terwijl er maar 1 kauwgom meer in zit
		System.out.println("En als alle items op zijn...");
		KauwgomAutomaat k2 = new KauwgomAutomaat(1);
		draaiNKeer(k2, 2, true);
	}
	
	private void draaiNKeer(KauwgomAutomaat k, int n, boolean neem) {
		boolean gelukt;
		
		for (int i=1; i<=n; i++)
		{
			k.betaal();
			gelukt = k.draaiHendel();
			System.out.printf("Poging %d: ", i);
			if (gelukt)
				System.out.printf("%s kauwgombal%n", k.bepaalKleur());
			else  // mislukt
				// TODO: verander false door de getter van balInBak uit KauwgomAutomaat k
				if (false) // er zit nog een kauwgom in
					System.out.println("Kauwgombal zit er nog in!");
				else // er is geen kauwgom meer voorradig
					System.out.println("geen kauwgom meer!");
			if (neem) // ik neem de bal er uit als neem = true
				// TODO: neem een bal uit KauwgomAutomaat k
		}
		
		System.out.println();
	}
	
	private void draaiNKeer(Grijpkraan g, int n) {
		boolean gelukt;
		String resultaat; 
		
		for (int i=1; i<=n; i++)
		{
			g.betaal();
			gelukt = g.draaiHendel();
			resultaat = gelukt ? "" : "geen ";
			System.out.printf("Poging %d: %sprijs gewonnen%n", i, resultaat);
			if (gelukt) // we moeten er alleen iets uitnemen als er iets uit gekomen is!
				// TODO: neem een bal uit Grijpkraan g
		}
		
		System.out.println();
		
	}
}
