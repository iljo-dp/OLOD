import java.util.Scanner;
public class Oefening11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een nummer in tussen 999 and 9999: ");
        int nummer = scanner.nextInt();

        int duizenTallen = nummer / 1000; // 1234 / 1000 = 1
        int honderdtallen = (nummer % 1000) / 100; // 1234 % 1000 = 234 / 100 = 2
        int tienen = (nummer % 100) / 10;
        int eenheden = nummer % 10;

        System.out.println("\nDuizentallen: " + duizenTallen);
        System.out.println("Honderdtallen: " + honderdtallen);
        System.out.println("Tientallen: " + tienen);
        System.out.println("eenheden: " + eenheden);

    }
}
