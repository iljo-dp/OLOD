package cui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domein.DomeinControleer;
//import dto.TrekkingDTO;

public class LottoApplicatie {

    private Scanner invoer = new Scanner(System.in);
    private DomeinControleer domeinController; // TODO UC1: Declare DomeinController as an attribute

    public LottoApplicatie(DomeinControleer domeinController) {
        this.domeinController = domeinController; // TODO UC1: Initialize DomeinController in the constructor
    }

    public void startLotto() {
        int keuze = invoerKeuze();
        while (keuze != 3) {
            switch (keuze) {
                case 1 -> doeRegistreerTrekking();
                //case 2 -> doeControleerNummers(); // TODO UC2: Uncomment this line after implementing UC2
            }
            keuze = invoerKeuze();
        }
        System.out.println("Tot volgende keer!");
    }

    private int invoerKeuze()
    {
        int keuze;
        do {
            System.out.println("MENU");
            System.out.println("1. Registreer een trekking");
            System.out.println("2. Controleer je nummers");
            System.out.println("3. Stoppen");
            System.out.println("Maak je keuze > ");
            keuze = invoer.nextInt();
        } while (keuze < 1 || keuze > 3);
        return keuze;
    }

    private String invoerTekst(String instructie) {
        String naam;

        System.out.print(instructie);
        naam = invoer.nextLine();
        return naam;
    }

    private LocalDate invoerDatum() {
        System.out.print("Geef de dag van de trekking in (1-31): ");
        int dag = invoer.nextInt();
        System.out.print("Geef de maand van de trekking in (1-12): ");
        int maand = invoer.nextInt();
        System.out.print("Geef het jaar van de trekking in: ");
        int jaar = invoer.nextInt();
        return LocalDate.of(jaar, maand, dag);
    }

    private List invoerNummers()
    {
        List nummers = new ArrayList<>();
        for (int teller = 1; teller <= 6; teller++) {
            System.out.printf("Geef %d%s nummer in > ", teller, teller == 1 ? "ste" : "de");
            nummers.add(invoer.nextInt());
        }
        return nummers;
    }

    private int invoerNogControleren()
    {
        int keuze;
        do
        {
            System.out.print("Wil je nog nummers controleren voor deze trekking? (1=ja, 2=nee) :");
            keuze = invoer.nextInt();
        }
        while(keuze < 1 || keuze > 2);
        return keuze;
    }

    private void doeRegistreerTrekking() {
        invoer.nextLine(); // buffer for text input AFTER a number

        String naam = invoerTekst("Registreer een nieuwe trekking.\nGeef de naam van de trekking > ");
        LocalDate datum = invoerDatum();
        List<Integer> nummers = invoerNummers();

        // TODO UC1: Register the lottery draw using domeinController
        domeinController.registreerTrekking(naam, datum, nummers);

        System.out.println("De trekking werd geregistreerd!");
    }

    /*
    private void doeControleerNummers() {
        String naam;
        List nummers;
        int keuze;

        invoer.nextLine(); 	// buffer voor tekst inlezen NA getal

        naam = invoerTekst("Geef de naam van de trekking waarvoor je je nummers wil controleren > ");
        // TODO UC2: selecteer trekking

        // TODO UC2: vervang null door ophalen trekking uit dc en verander het datatype
        String trekking = null;

        if(trekking == null)
            System.out.println("Geen trekking gevonden");
        else
        {
            // TODO UC2: vervang "" door naam en datum uit DTO
            System.out.printf("Trekking gevonden met %s en datum %s%n",
                    "", "");

            do {
                System.out.printf("Geef jouw nummers in.%n");

                nummers = invoerNummers();

                // TODO UC2: roep methode geefWinst uit dc op en ken waarde toe aan winst

                System.out.printf("Met deze nummers win je %d Euro.%n", winst);
                keuze = invoerNogControleren();
            } while (keuze == 1);
        }

    }
    */
}