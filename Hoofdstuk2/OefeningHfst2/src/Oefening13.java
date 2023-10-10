import java.util.Scanner;

public class Oefening13 {
    private Scanner scanner;

    public Oefening13() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Oefening13 oef = new Oefening13();
        oef.werkUit();
    }

    private void werkUit() {
        int getal1, teller = 0;
        double gemmidelde = 0;
        do {
            teller++;
            getal1 = leesGetallenIn(teller);
            gemmidelde += getal1;
        } while (getal1 != -1 && teller < 10);
        System.out.println("Het gemiddelde is: " + (gemmidelde / teller));
        scanner.close();
    }

    private int leesGetallenIn(int teller) {
        System.out.println("Geef getal " + teller +  " in: ");
        return scanner.nextInt();
    }
}