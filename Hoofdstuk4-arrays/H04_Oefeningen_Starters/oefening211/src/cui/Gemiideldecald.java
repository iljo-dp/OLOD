package cui;
import java.util.Scanner;
public class Gemiideldecald {
    public static void main(String[] args) {
        new Gemiideldecald().berekenGemiddeldeVanGetallenInTweedimensionaleArray();
    }
    private void berekenGemiddeldeVanGetallenInTweedimensionaleArray() {
        double getallenMatrix[][]= new double[3][2];
        for (int i = 0; i < getallenMatrix.length; i++) {
            for (int j = 0; j < getallenMatrix[i].length; j++) {
                getallenMatrix[i][j] = geefElement(i+i, j+j);
            }
        }
        double totaal = 0.0;
        int aantal = 0;
        for(double[] rij: getallenMatrix){
            for(double getal: rij){
                totaal += getal;
                aantal++;
            }
        }
        //Get total array length
        //double gemiddelde = totaal / (getallenMatrix.length * getallenMatrix[0].length);
        double gemiddelde = totaal / aantal;
        System.out.printf("Het gemiddelde van de getallen in de matrix is %.1f%n", gemiddelde);
    }

    private double geefElement(int rij, int kolom)  {
        Scanner invoer = new Scanner(System.in);
        System.out.printf("Geef element [%d,%d] in: ", rij, kolom);
        return invoer.nextDouble();
    }
}
