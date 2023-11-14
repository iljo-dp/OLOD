import java.util.Scanner;
public class Oefening23 {
    public static void main(String[] args) {
        Oefening23 oef = new Oefening23();
        oef.oefeningnogewat();
    }
    public void main(){
        int input = vraagGetal();

        int aantalDeelbaar = deelers(input);
        System.out.println("Er " + (aantalDeelbaar > 1 ? "zijn" : "is") + " " + aantalDeelbaar + (aantalDeelbaar > 1 ? " getallen" : " getal") + " deelbaar door " + input);
    }

    public int deelers(int deler) {
        Scanner input = new Scanner(System.in);
        int deelbaar;
        int aantalDeelbaar = 0;

        do {
            System.out.println("Geef een positief getal in (-1 om te stoppen): ");
            deelbaar = input.nextInt();

            if (deelbaar >= 0 && deler != 0 && deelbaar % deler == 0) {
                aantalDeelbaar++;
            }
        } while (deelbaar != -1);
        return aantalDeelbaar;
    }

    public int vraagGetal() {
        int userinput;
        Scanner input = new Scanner(System.in);
        System.out.println("Geef een strikt positief geheel getal in: ");
        return input.nextInt();
    }
    public void oefeningnogewat(){
        int deelbaar = 0;
        int aantaldeelbaar = 0;
        do {
            deelbaar = vraagGetal();
            if (deelbaar % 3 == 0){
                aantaldeelbaar++;
            }
        }while(deelbaar != -1);

        System.out.println(aantaldeelbaar);

    }
}