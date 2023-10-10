import java.util.Scanner;
public class Oefening8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef getal 1 in: \n");
        int getal1 = scanner.nextInt();
        System.out.print("Geef getal 2 in: \n");
        int getal2 = scanner.nextInt();
        System.out.print("Geef getal 3 in: \n");
        int getal3 = scanner.nextInt();

        int resultaat = getal1 * getal2 * getal3;
        System.out.printf("De vermenigvuldiging van %d , %d en %d is %d", getal1, getal2, getal3, resultaat);

        scanner.close();
    }
}
