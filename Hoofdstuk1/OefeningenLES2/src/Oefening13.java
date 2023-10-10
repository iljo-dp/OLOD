import java.util.Scanner;
public class Oefening13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een datum in <ddmmjjjj>: ");
        int datum = scanner.nextInt();

        int dagen = datum / 1000000; //30092022 / 1000000 = 30
        int maand = (datum / 10000) % 100;

        int maandenTotVolgendJaar = 12 - maand + 1;
        int totaalAandalDagen = maandenTotVolgendJaar * 30 - dagen;

        System.out.print(totaalAandalDagen);



    }
}
