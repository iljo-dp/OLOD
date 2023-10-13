import java.util.Scanner;
public class Oefening16 {
    public static void main(String[] args) {
        Oefening16 start = new Oefening16();
        start.werkUit();
    }
    private void werkUit(){
        int input = 0;
        int totaal = 0;
        int max = 0;
        for (int i = 1; i <= 3; i++) {
            input = leesGetallenIn(i);
            totaal += input;
            if (input > max)
                max = input;
        }
        System.out.println("Van de ingegeven getallen is de som: " + totaal);
        System.out.println("En het gemiddelde is: " + (totaal / 3));
        System.out.println("De rest is: " + (totaal % 3));
        System.out.println("Het grootste getal is: " + max);
    }
    private int leesGetallenIn(int teller) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef getal " + teller +  " in: ");
        return scanner.nextInt();
    }
}
