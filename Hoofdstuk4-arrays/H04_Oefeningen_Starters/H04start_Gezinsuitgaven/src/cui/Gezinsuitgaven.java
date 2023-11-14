package cui;
import java.util.Scanner;
public class Gezinsuitgaven {

    public static void main(String args[]) {
        new Gezinsuitgaven().toonMaandenMetUitgavenBovenGemiddelde();
    }
    private void toonMaandenMetUitgavenBovenGemiddelde(){
        double[] uitgaven = new double[12];
        String result = "";
        double totaal = 0;

        for(int i = 0; i < uitgaven.length; i++){
            uitgaven[i] = geefUitgaveInt(i+1);
            totaal += uitgaven[i];
        }

        double gem = totaal / uitgaven.length;
        for (int index = 0; index<uitgaven.length; index++){
            if (uitgaven[index] > gem){
                result += String.format("%d ", index+1);
            }
        }
        if (!result.equals(""))
            System.out.printf("In de volgende maanden werd er meer " + "uitgegeven dan het gemiddelde: %s%n", result);
        else
            System.out.printf("Geen maanden gevonden waarin meer werd uitgegeven" + " dan het gemiddelde!%n");
    }
    private double geefUitgaveInt(int maand) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Geef de uitgaven in voor maand %d: ", maand);
        return input.nextDouble();
    }
    public double berekenGemiddelde(double[] uitgaven) {
		double totaal = 0;
		for (double uitgave : uitgaven) {
			totaal += uitgave;
		}
		return totaal / uitgaven.length;
	}
}
