package cui;

import java.util.Scanner;
import domein.Lied;

public class AfspeellijstApp {
    public static void main(String[] args) {
        new AfspeellijstApp().run();
    }

    public void run() {
        int aantalAfspeellijsten = leesInput("Hoeveel afspeellijsten: ");
        vulAfspeellijsten(aantalAfspeellijsten);
    }

    public int leesInput(String tekst) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(tekst);
        int input = scanner.nextInt();
        return input;
    }

    public void vulAfspeellijsten(int aantalAfspeellijsten) {
        int totaleDuurAlleAfspeellijsten = 0;

        for (int afspeellijstNr = 1; afspeellijstNr <= aantalAfspeellijsten; afspeellijstNr++) {
            System.out.printf("Geef de details van de liedjes voor afspeellijst %d:\n", afspeellijstNr);

            int totaleDuurAfspeellijst = 0;

            for (int liedNr = 1; liedNr <= 3; liedNr++) {
                System.out.printf("Lied %d duur:\n", liedNr);
                int duur = leesInput(" ");
                Lied lied = new Lied(duur); // Create a new Lied object with the given duration
                totaleDuurAfspeellijst += lied.geefDuurInSeconden();
            }

            totaleDuurAlleAfspeellijsten += totaleDuurAfspeellijst;

            if (controleerDansbaarheid(totaleDuurAfspeellijst)) {
                System.out.println("De afspeellijst is dansbaar!");
            } else {
                System.out.println("De afspeellijst is niet dansbaar.");
            }
        }

        toonGemiddeldeDuur(totaleDuurAlleAfspeellijsten, aantalAfspeellijsten);
    }

    private boolean controleerDansbaarheid(int totaleDuurAfspeellijst) {
        // Implement logic to check if the playlist is danceable
        // For example, return true if total duration is greater than 90 seconds
        return totaleDuurAfspeellijst > 90;
    }

    private void toonGemiddeldeDuur(int totaleDuurAlleAfspeellijsten, int aantalAfspeellijsten) {
        int gemiddeldeDuur = (aantalAfspeellijsten > 0) ? totaleDuurAlleAfspeellijsten / aantalAfspeellijsten : 0;

        if (aantalAfspeellijsten == 1) {
            System.out.printf("De duur van je afspeellijst is %d seconden.\n", gemiddeldeDuur);
        } else {
            System.out.printf("De gemiddelde duur van je afspeellijsten is %d seconden.\n", gemiddeldeDuur);
        }
    }
//Bubblesort in java

}
