package cui;
import domein.Driehoek;
import domein.Rechthoek;
import java.util.Scanner;
public class Oefening7 {
    public static void main(String[] args) {
        new Oefening7().start();
    }
    public void start()
    {
        System.out.print("Wil je graag de vorm ingeven van een (0, stop, 1 = Rechthoek, 2 = driehoek ");
        int input = leesGetal('1');
        switch (input)
        {
            case 0 -> stopscherm();
            case 1 -> rechthoek();
            case 2 -> driehoek();
            default -> System.exit(1);
        }
    }
    int totaalAantal = 0;
    int aantalrechthoekig = 0;
    int groteRechthoeken = 0;
    private void rechthoek()
    {
        double lengte = leesGetal('l');
        double breedte = leesGetal('b');
        Rechthoek rechthoek1 = new Rechthoek(lengte,breedte);
        if (rechthoek1.berekenOppervlakte() > 50)
        {
            groteRechthoeken++;
        }
        totaalAantal++;
        start();
    }
    private void stopscherm()
    {

        System.out.println("Totaal aantal vormen " + totaalAantal);
        System.out.println("Rechthoekige driehoeken " + aantalrechthoekig);
        System.out.println("Rechthoeken met opp. > 50 " + groteRechthoeken);
    }
    private void driehoek(){
        int a = leesGetal('a');
        int b = leesGetal('b');
        int c = leesGetal('c');
        Driehoek driehoek1 = new Driehoek(a,b,c);
        if (driehoek1.isRechthoekig()){
            aantalrechthoekig++;

        } totaalAantal++;
        start();
    }
    private int leesGetal(char letter){
        Scanner input = new Scanner(System.in);
        System.out.printf("Geef de waarde voor %s in ", letter);
        return input.nextInt();
    }
}
