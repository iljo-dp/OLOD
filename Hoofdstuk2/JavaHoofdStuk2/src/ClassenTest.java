import java.util.Scanner;
public class ClassenTest {
    public static void main(String[] args) {
        //In de main functie zelf moet je dus een nieuw object aanmaken waarin we een nieuwe classe callen
        ClassenTest voorbeeld = new ClassenTest();
        //Hier gebruiken we ons nieuw object dan om een andere methode te callen, en uit te voeren?
        voorbeeld.bekijkVoorbeeld();

    }
    private void bekijkVoorbeeld(){
       
        leesEnToonGetal();
        System.out.println("Dit is het vak OOSD");

        leesEnToonGetal();
        System.out.println("Dat staat voor Object-oriented software development");
        
    }
    private void leesEnToonGetal(){
        Scanner input = new Scanner(System.in);
        int getal;

        System.out.print("Geef en getal in ");
        getal = input.nextInt();
        System.out.printf("Je koos voor %d%%n", getal);
    }
}
