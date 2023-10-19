import java.util.Scanner;
public class Oefening18 {
    public static void main(String[] args) {
        Oefening18 oef = new Oefening18();
        oef.run();
    }
    static void run(){
        main();
    }
    static void main(){
        int input;
        do {
            input=leesUserInput();
        }while (input<1000 || input>9999);
        checkGemeente(input);
    }
    static void checkGemeente(int input){
        switch (input){
            case 9300 -> System.out.println("Aalst");
            case 2000 -> System.out.println("Antwerpen");
            case 1000 -> System.out.println("Brussel");
            case 9200 -> System.out.println("Dendermonde");
            case 9000 -> System.out.println("Gent");
            case 8500 -> System.out.println("Kortrijk");
            case 9700 -> System.out.println("Oudenaarde");
            case 2300 -> System.out.println("Turnhout");
            default -> System.out.println("Onbekend");
        }
    }
    static int leesUserInput(){
       Scanner input = new Scanner(System.in);
       System.out.println("Geef een getal in: ");
       return input.nextInt();

    }
}
