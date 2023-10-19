import java.util.Scanner;
public class Oefening21 {
    public static void main(String[] args) {
        Oefening21 oef = new Oefening21();
        oef.run();
    }
    public void run(){
        main();
    }
    public void main(){
        int input;
        do {
            input = vraagGetal();
        }while (input != 0 && input <= 0);
        speed(input);
    }
    public int vraagGetal(){
        Scanner input = new Scanner(System.in);
        System.out.println("Geef een strikt positief geheel getal in: ");
        int getal = input.nextInt();
        return getal;
    }
    public void speed(int input){
        System.out.println(input);
        for (int i = input/2; i > 0; i--) {
            if (input % i == 0){
                System.out.println(i);
            }
        }
        System.out.println("1");
    }
}