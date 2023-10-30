package cui;
import java.util.Scanner;
import domein.Product;

public class ProductApplicatie {
    public static void main(String[] args) {
        // Maak de producten
        Product pannenkoek = new Product("Pannenkoek", 0.125, 21, 5);
        Product pannenkoekMetSuiker = new Product("Pannenkoek met suiker", 2.0, 6, 10);
        Product pannenkoekMetChoco = new Product("Pannenkoek met Choco", 2.2, 6, 15);

        // Vraag de klant om het aantal stuks van elk product
        Scanner input = new Scanner(System.in);
        int pannenkoekAantal = leesGetal("Pannenkoek");
        int pannenkoekMetSuikerAantal = leesGetal("pannenkoekMetSuiker");
        int pannenkoekMetChocoAantal = leesGetal("pannenkoekMetChoco");

        // Bereken de totale prijs
        double totaalPrijs = pannenkoek.berekenPrijs(pannenkoekAantal)
                + pannenkoekMetSuiker.berekenPrijs(pannenkoekMetSuikerAantal)
                + pannenkoekMetChoco.berekenPrijs(pannenkoekMetChocoAantal);

        System.out.println("Aan de kassa zult u " + totaalPrijs + " betalen.");

        input.close();
    }
    private static int leesGetal(String naam) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Geef het aantal %s in: ", naam);
        return input.nextInt();
    }

}