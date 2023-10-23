package cui;

import domein.Driehoek;
import java.util.Scanner;

public class DriehoekApplicatie {
    public static void main(String[] args) {
        new DriehoekApplicatie().start();
    }
    private void start(){
        //een getal inlezen is altijd apparte method.
        int a = leesGetal('a');
        int b = leesGetal('b');
        int c = leesGetal('c');
        Driehoek driehoek1 = new Driehoek(a,b,c);
        System.out.printf("De driehoek met afmetingen : %d, %d en %d is %s rechthoekig", a,b,c, driehoek1.isRechthoekig()?"WEL":"NIET");
    }
    private int leesGetal(char letter){
        Scanner input = new Scanner(System.in);
        System.out.printf("Geef de waarde voor %s in ", letter);
        int getal = input.nextInt();
        return getal;
    }
}
