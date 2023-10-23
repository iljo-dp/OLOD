package domein;

public class Driehoek {
    //attributen
    private int a;
    private int b;
    private int c;

    //Getters en setters
    //Pijltje naar buiten bij de a (<--), dus de waarde van a wordt opgehaald Getter
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }

    //Nu de setters
    //Er staat een - in het uml, dus dat betekend dat de setA(a : int) : void Private is
    //Altijd return VOID + 1 parameter & this.a = a;.
    private void setA(int a){
        //Dit shrijven we zo.
        //We willen geen negatieve getallen, dus als a kleiner is dan 0, dan wordt a 1
        this.a = a>0? a : 1;
    }
    private void setB(int b){
        this.b = b>0? b : 1;
    }
    private void setC(int c){
        this.c = c>0? c : 1;
    }

    //Constructor
    //Er staat een + bij de constructor, dus die is public
    public Driehoek(){
        //Dit is de default constructor
        //Deze is leeg, dus we moeten de attributen nog een waarde geven
        //Dit doen we met de setters
        //Waarom gebruiken we set? Omdat als we this. gebruiken en we bv contorle gebruiken moeten we dit zeer veel herhalen
        //Als we meteen de setter terug callen moeten we dit maar 1 keer doen
        //Als er een setter is gebruiken we deze ELKE keer.

        //Constructor met minder parameters, geen logica hier.
        //Maar hier verwijzen we dus naar constructor et de meeste parameters
        this(1,1,1);
    }

    public Driehoek(int a, int b, int c){
        //Dit is de constructor met parameters
        //Deze is niet leeg, dus we moeten de attributen een waarde geven
        //Dit doen we met de setters

        //Constructor met de meeste parameters --> logica goes here lmao
        setA(a);
        setB(b);
        setC(c);
    }


    public boolean isRechthoekig() {
        //We moeten de stelling van pythagoras gebruiken
        //a^2 + b^2
        //c^2
        //Als a^2 + b^2 = c^2 dan is het een rechthoekige driehoek
        return Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)
                || Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)
                || Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2);
    }
}

