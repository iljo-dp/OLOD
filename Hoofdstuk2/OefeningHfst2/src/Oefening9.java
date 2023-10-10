import java.util.Scanner;
public class Oefening9 {
    public static void main(String[] args) {
        Oefening9 voorbeeld = new Oefening9();
        //voorbeeld.oefening();
        //voorbeeld.Deel2();
        voorbeeld.oefening3();
    }
    private void oefening(){
        Scanner scanner = new Scanner(System.in);
        int teller = 0;
        for (int x = 0; x < 5; x++)
        {
            System.out.print("\nGeef een getal in  ");
            teller += scanner.nextInt();
        }
        System.out.println("De som van de getallen is " + teller);
    }
    private void Deel2(){
        Scanner scanner = new Scanner(System.in);
        int beelbaar2 = 0, deelbaar3 = 0;

        for (int x = 1; x <= 5; x++){

            System.out.print("\nGeef een getal in  ");
            int getal = scanner.nextInt();

            if (x % 2 == 0){
                beelbaar2++;
            }
            if (x % 3 == 0){
                deelbaar3++;
            }
        }
        scanner.close();
        //De conditionele opperator
        System.out.println("Je gaf %d even getal%s en %d getal%s deelbaar door 3 in. " + beelbaar2 + (beelbaar2 == 1 ? "" : "len") + deelbaar3 + (deelbaar3 == 1 ? "" : "len"));
    }
    private void oefening3(){
        System.out.printf("%-8s %-8s %-8s %-8s%n", "N", "10*N", "100*N", "1000*N");
        for (int x = 1; x <= 5; x++){
            System.out.printf("%-8d %-8d %-8d %-8d%n", x, x * 10, x * 100, x * 1000);
        }
    }
}

