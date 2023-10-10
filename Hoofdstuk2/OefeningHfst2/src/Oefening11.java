import java.util.Scanner;
public class Oefening11 {
    public static void main(String[] args) {
        Oefening11 start = new Oefening11();
        start.werkUit();
    }
    public void werkUit()
    {
        // oefening1();
        Oefening2();
    }
    public void oefening1()
    {
        Scanner input = new Scanner(System.in);
        int getal;
        do {
            System.out.println("Geef een getal in: ");
            getal = input.nextInt();
        }while (getal > 0 && getal%2 != 0);

    }
    public void Oefening2()
    {
        Scanner input = new Scanner(System.in);
        int getal1, getal2;
        do {
            System.out.printf("Geef getal 1 in(niet 1000 en deelbaar door 12)");
            getal1 = input.nextInt();
        }while (getal1 == 1000 || getal1 % 12 == 0);

        do {
            System.out.printf("Geef getal 2 in(groter dan getal 1)");
            getal2 = input.nextInt();
        }while (getal2 <= getal1);

    }
}
