import java.util.Scanner;
public class OefeningenHfst2 {
    public static void main(String[] args) {
        OefeningenHfst2 voorbeeld = new OefeningenHfst2();
        voorbeeld.werkUit();
    }
    private void werkUit(){
      //  Oefening1();
      // Oefening22();
      //  Oefening23();
        Oefening4();
    }

    private void Oefening1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef een getal in: ");
        int x = input.nextInt();
        //1.1
        if (x >= 0) {
            System.out.println("Positief");
        }
        else {
                System.out.println("Negatief");
       }

        //1.2
        System.out.print("Geef een temperatuur in: ");
        int temp = input.nextInt();
        if (temp <= 10){
            System.out.println("Koud");
        }
        else if (temp >= 20){
            System.out.println("Warm");
        }
        else {
            System.out.println("Goed");
        }
        //1.3
        System.out.print("Geef een getal in: ");
        int y = input.nextInt();

        if (y >= 0 && y%2 == 0)//Positief en even
        {
            System.out.println("Positief en even");
        }
        else if (y >= 0 && y%2 != 0)//Positief en oneven
        {
            System.out.println("Positief en oneven");
        }
        else if (y < 0 && y%2 == 0)//Negatief en even
        {
            System.out.println("Negatief en even");
        }
        else if (y < 0 && y%2 != 0)//Negatief en oneven Voorbeeld: -3%2 = -1
        {
            System.out.println("Negatief en oneven");
        }
        else
        {
            System.out.println("NULL");
        }
   }
   private void Oefening2()
   {
       Scanner input = new Scanner(System.in);
       System.out.print("Geef een getal in ");
       int aantal = input.nextInt();
       //System.out.printf(aantal == 1 ? "student" : "studenten");
       System.out.println("Student" + (aantal == 1 ? "" : "en"));
   }
   private void Oefening3(){
         Scanner input = new Scanner(System.in);
         System.out.print("Geef een getal in ");

         int i = input.nextInt();
         int k = switch (i) {
             case 1 -> 3;
             case 2 -> 6;
             case 3, 4 -> 10;
             default -> 20;
         };
       System.out.println("K = " + k);

       System.out.print("Geef de waarde van X in: ");
       int x = input.nextInt();
       int y = -1;
       switch (x) {
           case 99, 100, 149, 169, 198:
               y = y + 1;
       }
   }
   private void Oefening4(){
    //verbeter
      // if ( age >= 65 );
    //   { System.out.println ("Age greater than or equal to 65" );}
  //      else //else is unreadable
//       System.out.println ("Age is less then 65)"; --> ...then 65");
    }
    private void oefening5(){
        // a = 0, b = 0, c = 0;
        // a = ++b  +  ++c;             //  a =  2     b =1       c =1
        // a = b++  +  c++;             //  a =  2     b =2       c =2
        // a = ++b  +  c++;             //  a =  5     b =3       c =3
        // a = b--  +  c--;             //  a =  6     b =2       c =2

    }
    private void Oefening7(){
        /*
        x = 1
y = 1*1
toal 1

x=2
y = 2*2
total 5

x=3
y = 3*3
total 5 + 3*3

x=4
y=4*4
total = 5 + 3*3 + 4*4

x=5
y=5*5
total = 5 + 3*3 + 4*4 + 5*5



         */


        //oefening 2

        /*
        ****
        +++++
        *****
        ++++++

         */
    }
    private void Oefening8()
    {

    }
}


