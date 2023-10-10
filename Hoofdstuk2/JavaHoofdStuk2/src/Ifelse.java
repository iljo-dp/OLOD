public class Ifelse {
    public static void main(String[] args) {
        Ifelse voorbeeld = new Ifelse();
        voorbeeld.bekijkVoorbeeld();
        voorbeeld.ifelseVoorbeeld();
        voorbeeld.ifelsesamenVoorbeeld();
    }
    private void bekijkVoorbeeld(){
        int punten = 30;
        //1 lijn
        if (punten >= 60) System.out.println("Geslaagd");

        //Op 2 lijnen
        if (punten >= 60)
            System.out.println("Geslaagd");

        //Op 1 lijn met accoladen
        if (punten >= 60) { System.out.println("Geslaagd"); }

        //Normale notatie
        if (punten >= 60) {
            System.out.println("Geslaagd");
        }
        //Else hoort altijd bij de dichtsbijzijnde if, tenzij er {} zijn.
    }
    private void ifelseVoorbeeld(){
        int punten = 30;
        if (punten >= 60) {
            System.out.println("Geslaagd");
        } else {
            System.out.println("Niet geslaagd");
        }
    }
    private void ifelsesamenVoorbeeld()
    {
        int getal1 = 4, getal2 = 5;
        if (getal1 < getal2) {
            if (getal1 > 10)
                System.out.println("Getal 1 is kleiner dan getal 2 en groter dan 10");
        } else if (getal1 > getal2) {
            System.out.println("Getal 1 is groter dan getal 2");
        } else {
            System.out.println("Getal 1 is gelijk aan getal 2");
        }
    }
}
