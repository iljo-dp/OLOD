package cui;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stoelendans {
    public static void main(String[] args) {
        new stoelendans().StoelenDans();
    }
    private void StoelenDans(){
        List<String> kinderen = new ArrayList<>();
        kinderen.add("Mo");
        kinderen.add("To");
        kinderen.add("Bo");
        kinderen.add("Jo");
        kinderen.add("Co");

        System.out.printf("We starten de stoelendans met %s%n", kinderen);

        int aantalAfvallers = kinderen.size()-1;
        for (int i = 0; i < aantalAfvallers; i++) {
            String afvaller = leesNaam(i, kinderen);
            kinderen.remove(afvaller);
        }
    }
    private String leesNaam(int index, List<String> kinderen){
        Scanner scanner = new Scanner(System.in);
        boolean naamIsCorrect;
        do {
            System.out.printf("Ronde %d met %s%nGeef de naam van de afvaller", index+1, kinderen);
            String naam = scanner.nextLine();
         naamIsCorrect = kinderen.contains(naam);
         if (!naamIsCorrect)
         {
             System.out.printf("%s is geen correcte naam%n", naam);
         }
        }while (!naamIsCorrect);
        return kinderen.get(index);
    }
}
