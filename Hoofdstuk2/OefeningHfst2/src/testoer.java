import java.util.Scanner;

public class testoer {


    public void setA(int a) {
        this.a = a>0? a:1;
    }

    public void setB(int b) {
        this.b = b>0? b:1;
    }

    public void setC(int c) {
        this.c = c>0? c:1;
    }

    private int a,b,c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    public testoer(){
        this(1,1,1);
    }
    public testoer(int a, int b, int c){
        setA(a);
        setB(b);
        setC(c);
    }



    private double resultaat;
    public double getResultaat() {

        return resultaat;
    }

    public void telOp(double getal1, double getal2){
        resultaat = getal1+getal2;
    }
    public void trekAf(double getal1, double getal2){
        resultaat =  getal1-getal2;
    }
    public void deel(double getal1, double getal2){
        resultaat=getal1/getal2;
    }
    public void vermenigvuldig(double getal1, double getal2){
        resultaat=getal1*getal2;
    }

    public static void main(String[] args) {
        testoer test = new testoer();
        test.run();
    }
    public void run(){
        System.out.println("Welke actie wil je uitvoeren\n1. Som\n2.versch\n3.Vermenigvuldig\n4. deel\n5. stop");
        Scanner scanner = new Scanner(System.in);
        int output = scanner.nextInt();
        switch (output){
            case 1: telOp();
        }

    }
}
