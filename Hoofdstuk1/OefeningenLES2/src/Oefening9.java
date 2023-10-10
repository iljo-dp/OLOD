import java.util.Scanner;
public class Oefening9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef je maandasalaris in: \n");
        double maandSalaris = scanner.nextInt();
        scanner.close();
        System.out.printf("Jaarsalaris = %f\n", maandSalaris*12);
        System.out.printf("Vakantiegeld = %f\n", maandSalaris*0.92);


    }
}
