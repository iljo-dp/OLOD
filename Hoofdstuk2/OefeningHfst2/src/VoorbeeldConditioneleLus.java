import java.util.Scanner;
public class VoorbeeldConditioneleLus {
    public static void main(String[] args) {
        VoorbeeldConditioneleLus voorbeeld = new VoorbeeldConditioneleLus();
        voorbeeld.start();
    }
    private void start() {
        int nummerStudent = 1, aantalGebuisd = 0, aantalGeslaagd = 0;
        int punt = leesGeheelGetal(nummerStudent++);

        while (punt != -1) {
            if (punt < 10) {
                aantalGebuisd++;
            }
            else {
                aantalGeslaagd++;
            }
            punt = leesGeheelGetal(nummerStudent++);
        }
System.out.printf("Aantal geslaagd: %d%nAantal gebuisd: %d%n", aantalGeslaagd, aantalGebuisd);
    }
    private int leesGeheelGetal(int nummerStudent){
        Scanner input = new Scanner(System.in);
        int getal;
        do {
            System.out.printf("Geef restultaat an student %d in (-1 om te stoppen): ", nummerStudent);
            getal = input.nextInt();
        }while (getal < -1 || getal > 20);

        return getal;
    }
}
