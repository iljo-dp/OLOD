import java.util.Scanner;
public class Oefening12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef de hoogte van de muur in(m) =");
        double hoogte = scanner.nextDouble();

        System.out.print("Geef de breedte van de muur in(m) =");
        double breedte = scanner.nextDouble();
        scanner.close();
        int oppervlakteRol = 5;
        double oppervlakteMuur = (hoogte * breedte);
        double aantalRollen = (oppervlakteMuur / oppervlakteRol);

        System.out.printf("Het aantal benodigde rollen = %.1f", aantalRollen);


    }
}
