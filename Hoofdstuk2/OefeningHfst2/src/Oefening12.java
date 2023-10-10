public class Oefening12 {
    public static void main(String[] args) {
        Oefening12 oef = new Oefening12();
        oef.werkUit();
    }
    private void werkUit()
    {
        int i = 0;
        double leeuwen = 50;
        do {
            leeuwen = Math.floor(leeuwen * 1.15);
            i++;
            System.out.println(i + " " + leeuwen);
        }while (leeuwen <= 1000);
        System.out.println("Er zijn meer dan 1000 leeuwen. En dit duurde " + i + " jaar.");
    }
}
