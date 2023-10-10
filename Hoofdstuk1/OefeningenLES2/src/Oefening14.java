import java.util.Scanner;
public class Oefening14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een geheel getal in =");
        int getal = scanner.nextInt();
        scanner.close();

        System.out.printf("\n%15d%15d%15d%15d%15d\n", 1, 10, 100, 1000, 10000);
        System.out.printf("%15d%15d%15d%15d%15d", getal, getal*10, getal*100, getal*1000, getal*10000);
        
        /*
        System.out.printf("\n%15d%15d%15d%15d%15d\n", 1, 10, 100, 1000, 10000);
        for (int i = 0; i <= 5; i++) {
            System.out.printf("%15d", getal * (int) Math.pow(10, i));
        }
        */

    }
}
