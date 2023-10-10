import java.util.stream.StreamSupport;

public class Oefening8forlussen {
    public static void main(String[] args) {
        Oefening8forlussen voorbeeld = new Oefening8forlussen();
        voorbeeld.WerkUit();
    }
    private void WerkUit()
    {
        Deel3();
    }
    private void Deel1()
    {   int totaal = 0;
        for (int x = 12; x < 500; x+=12)
        {
           // System.out.println(x % 12 == 0? Integer.toString(x) : Integer.toString(x) + "\n" );
            System.out.println(x);
            totaal += x;
        }
        System.out.print("De som van de getallen is " + totaal);
    }
    private void Deel2()
    {
        for (int teller = 51; teller > 0; teller-=2)
        {
            //Soort van if-else statement. If teller % 2 != 0 is true, print teller, else print niets.
           // System.out.println(teller % 2 != 0? Integer.toString(teller) : "");
            System.out.println(teller);
        }
    }
    private void Deel3()
    {
        //FUCK FUCK FUCK FUCK
        for (char x = 'a'; x <= 'z'; x++)
        {
            System.out.println(x);
        }
    }
}
