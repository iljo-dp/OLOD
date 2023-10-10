public class voorbeeldenSTrings {
       public static void main(String[] args) {
           System.out.println("Welcome to java programming");
           //Dit brengt ons meteen NAAR een nieuwe lijn, dus de volgende println komt op een nieuwe lijn
           System.out.print("Java programming");
           System.out.println(" ");
           //print brengt ons niet naar een nieuwe lijn, print gewoon bij de cursor.
           //espace char's
           System.out.println("Welcome\n to\n java\n programming");
           // \n is een new line
           System.out.println("Welcome\t to\t java\t programming");
           // \t is een tab
           System.out.println("Welcome\b to\b java\b programming");
           // \b is een backspace
           // twee keer \\ zorgt ervoor dat het mooi 1 keer de \ zal afdrukken. In bv C:\Users\... moet je dan C:\\Users\\... schrijven


           //printf, dit is printen met formatteren. Hierbij bouwen we een string op out tekst.
           System.out.printf("x=%d, y=%d, som=%d%n", 2, 3, 5);
           System.out.printf("%s%n%s%n", "Welcome to", "Java programming");
       }
}
