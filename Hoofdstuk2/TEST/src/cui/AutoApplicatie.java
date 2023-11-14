package cui;
import java.util.Scanner;
import domein.Auto;

public class AutoApplicatie {
    public static void main(String[] args) {
        new AutoApplicatie().start();
    }
    int vergoeding;
    double aantalKilometers;
    int rechOpExtra = 0;
    double totaleVergoeding = 0;
    int aantal = 0;
    public void start(){
        int invoer;
        do {
            invoer = (int) leesInput("Menu\n 1: niet elektrische auto \n 2: Elektrische auto met aantal kilometers en vergoeding \n 3: elektrische auto met vergoeding\n -1: stoppen\n ");
        }while (invoer != 1 && invoer != 2 && invoer != 3 && invoer != -1);
        aantal++;
        berekening(invoer);
    }

    public void berekening(int invoer){
        if (invoer == 1){
            aantalKilometers = leesInput("Geef aantal Kilometers");
            Auto auto = new Auto(false, aantalKilometers, 1);
            //Geen berkening nodig voor extra vergoeding, want die vergoeding is enkel voor Elektrische wagens.
            aantal++;
            start();
        }
        if (invoer == 2){
            aantalKilometers = leesInput("Geef aantal kilometers ");
            vergoeding = (int) leesInput("geef vergoeding ");
            Auto auto = new Auto(true, aantalKilometers, vergoeding);
            if (auto.heeftExtraVergoeding()){
                rechOpExtra++;
                totaleVergoeding =+ auto.berekenTotaleVergoeding();
            }
            aantal++;
            start();
        }
        if (invoer == 3){
            vergoeding = (int) leesInput("Geef vergoeding ");
            Auto auto = new Auto(vergoeding);
            if (auto.heeftExtraVergoeding()){
                rechOpExtra++;
                totaleVergoeding =+ auto.berekenTotaleVergoeding();
            }
            aantal++;
            start();

        }
        if (invoer == -1){
            if (aantal == 0){
                System.out.println("Geen auto's ingegeven.");
            }
            else{
                System.out.printf("Er %s %s auto%s waar je recht hebt op extra vergoeding", (rechOpExtra == 1) ? "is" : "zijn", rechOpExtra, (rechOpExtra == 1) ? "" : "'s");
                System.out.printf("\nGemiddelde totale vergoeding is %s", totaleVergoeding / rechOpExtra);
            }
        }
    }
    public double leesInput(String tekst) {
        Scanner scanner = new Scanner(System.in);
        double output;
        System.out.print(tekst);
        output = scanner.nextDouble();
        return output;
    }
}