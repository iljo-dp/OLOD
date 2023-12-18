package testen;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Rechthoek;

public class RechthoekTesten {
	private static final int MIN_VALUE = 1;
	private static final int MAX_VALUE = 10;
	private double geldigeBreedte = 5;
	private double geldigeLengte = Math.PI;
	@Test
	void maakRechthoek_geldigeLengteEnBreedte_maakRechthoek(){
		// ARRANGE
		//Alles klaarzetten voor de test, wat heb ik nodig
		double lengte = geldigeLengte;
		double breedte = geldigeBreedte;
		// ACT
		//De methode oproepen die ik wil testen
		Rechthoek rechthoek = new Rechthoek(lengte, breedte);
		
		// ASSERT
		//Nagaan of het resultaat juist is
		assertEquals(lengte, rechthoek.getLengte());
		assertEquals(breedte, rechthoek.getBreedte());
	}
	
	
	@Test
	void maakRechthoek_breedteIsNetGeldig_maakRechthoek(){
		// ARRANGE
		//Alles klaarzetten voor de test, wat heb ik nodig
		double lengte = geldigeLengte;
		double breedte = Double.MIN_VALUE;
		// ACT
		//De methode oproepen die ik wil testen
		Rechthoek rechthoek = new Rechthoek(lengte, breedte);
		
		// ASSERT
		//Nagaan of het resultaat juist is
		assertEquals(lengte, rechthoek.getLengte());
		assertEquals(breedte, rechthoek.getBreedte());
	}
	@ParameterizedTest
	@ValueSource(doubles = {-7.0 , 0.0})
	void maakRechthoek_lengteIsTeKlein_WerptException(double lengte){
		assertThrows(IllegalArgumentException.class, () -> new Rechthoek(lengte, geldigeBreedte));
	}
	@ParameterizedTest
	@ValueSource(doubles = {-5.0 , 0.0})
	void maakRechthoek_breedteIsTeKlein_WerptException(double breedte){
		assertThrows(IllegalArgumentException.class, () -> new Rechthoek(geldigeLengte, breedte));
	}
	
	
}
