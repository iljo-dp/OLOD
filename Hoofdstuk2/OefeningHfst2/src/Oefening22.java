import java.util.Scanner;
public class Oefening22 {
    public static void main(String[] args) {
        Oefening22 run = new Oefening22();
        run.werkUit();
    }
    public void werkUit(){
        int i = 0;
        int test;
       do {
           i++;
           test = leesgetal(i);

           if (test != 0 && test > 0)
             deelBaarDoorx(test);
       }while (test != 0);
       /*
       do{
       System.out.println("Geef getal " + i + " in : ");
         test = scanner.nextInt();

       }while(test<0;
        */
       System.out.println("Er zijn " + deelbaar2 + " getallen deelbaar door 2.");
       System.out.println("Er zijn " + deelbaar3 + " getallen deelbaar door 3.");
       System.out.println("Er zijn " + deelbaar6 + " getallen deelbaar door 6.");

    }
    private int leesgetal(int i){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef getal " + i + " in : ");
        return scanner.nextInt();

    }
    int deelbaar3 = 0;
    int deelbaar2 = 0;
    int deelbaar6 = 0;
    private void deelBaarDoorx(int i){
        if (i % 3 == 0){
            deelbaar3++;
        }
        if (i % 2 == 0){
            deelbaar2++;
        }
        if (i % 6 == 0){
            deelbaar6++;
        }
    }
}
