package testen;
import domein.Bestelling;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
public class BestellingTest {
    /* Boomer manier om te testen
    @Test
    void maakBestelling_GeldigAantal_MakktBestelling(){
        // ARRANGE
        //Alles klaarzetten voor de test, wat heb ik nodig
        int aantal = 3;
        // ACT
        //De methode oproepen die ik wil testen
        Bestelling bestelling = new Bestelling(aantal);

        // ASSERT
        //Nagaan of het resultaat juist is
        assertEquals(aantal, bestelling.getAantal());
    }
 
*/
    @ParameterizedTest
    @ValueSource(ints = {2,4,5,7,10})
    void maakBestelling_CorrectAantal_MakktBestelling(int aantal){
        // ARRANGE
        //Alles klaarzetten voor de test, wat heb ik nodig
        //Niet meer nodig, dit gebeurt in de valuesource

        // ACT
        //De methode oproepen die ik wil testen
        Bestelling bestelling = new Bestelling(aantal);
        
        
        // ASSERT
        //Nagaan of het resultaat juist is
        assertEquals(aantal, bestelling.getAantal());
    }
   /* boomermanier
    @Test
    void maakBestelling_TekleinAanta_WerptException(){
        // ARRANGE
        //Alles klaarzetten voor de test, wat heb ik nodig
        int aantal = -1;
        // ACT
        //De methode oproepen die ik wil testen
        // ASSERT
        //Nagaan of het resultaat juist is
        assertThrows(IllegalArgumentException.class, () -> new Bestelling(aantal));
    }

    */
    @ParameterizedTest
    @ValueSource(ints = {-1,0,11,12,1000000})
    void maakBestelling_Tekleinaantal_WerptException(int aantal){
        // ARRANGE
        //Alles klaarzetten voor de test, wat heb ik nodig
        //Niet meer nodig, dit gebeurt in de valuesource

        // ACT
        //De methode oproepen die ik wil testen
        // ASSERT
        //Nagaan of het resultaat juist is
        assertThrows(IllegalArgumentException.class, () -> new Bestelling(aantal));
    }

    //act --> maakt bestelling aan met aantal ....
    // arrange --> geefRechtOpKorting
    // assert --> geeftRechtOpKorting geeft true terug --> assertTrue
    @ParameterizedTest
    @ValueSource(ints = {5,7})
    void geeftRechtOpKorting_AantalGroterDan5_GeeftTrueTerug(int aantal){
        // ARRANGE
        //Alles klaarzetten voor de test, wat heb ik nodig
        Bestelling bestelling = new Bestelling(aantal);
        // ACT
        //De methode oproepen die ik wil testen
        // ASSERT
        //Nagaan of het resultaat juist is
        assertTrue(bestelling.geeftRechtOpKorting());
    }
    @ParameterizedTest
    @ValueSource(ints = {2,4})
    void geefRechtOpKorting_AantalKleinerDan5_GeeftFalseTerug(int aantal){
        // ARRANGE
        //Alles klaarzetten voor de test, wat heb ik nodig
        Bestelling bestelling = new Bestelling(aantal);
        // ACT
        //De methode oproepen die ik wil testen
        // ASSERT
        //Nagaan of het resultaat juist is
        assertFalse(bestelling.geeftRechtOpKorting());
    }
}
