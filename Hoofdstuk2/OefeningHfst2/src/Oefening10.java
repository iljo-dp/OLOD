import java.io.InterruptedIOException;
import java.util.Scanner;

public class Oefening10 {
    public static void main(String[] args) {
        Oefening10 oef = new Oefening10();
        oef.start();
    }
    private void start(){
        Oefening1();

    }
    private void Oefening69(){
        //Write hello world in java

    }
    private void Oefening1(){
        int somNegatieveGetallen = 0, aantelNegatieveGetallen = 0;
        int getal = leesgetal();

        while (getal != 0)
        {
            if (getal < 0)
            {
                somNegatieveGetallen += getal;
                aantelNegatieveGetallen++;
            }
            getal = leesgetal();
        }
        if (aantelNegatieveGetallen == 0){
            System.out.println("Er zijn geen negatieve getallen ingegeven.");
        }
        else{
            System.out.println("Het gemiddelde van de negatieve getallen is " + somNegatieveGetallen/aantelNegatieveGetallen);
        }
    }
    private int leesgetal(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een getal: ");
        return scanner.nextInt();

    }
    private void Oefening2(){
        int kleinsteGetal = Integer.MAX_VALUE, grootsteGetal = Integer.MIN_VALUE;
        int getal = leesgetal();
        while (getal != 0)
        {
            if (getal < kleinsteGetal)
            {
                kleinsteGetal = getal;
            }
            if (getal > grootsteGetal)
            {
                grootsteGetal = getal;
            }
            getal = leesgetal();
        }
        if (kleinsteGetal == Integer.MAX_VALUE){
            System.out.println("Er zijn geen getallen ingegeven.");
        }
        else{
            System.out.println("Het kleinste getal is " + kleinsteGetal + " en het grootste getal is " + grootsteGetal);
        }
    }
}
