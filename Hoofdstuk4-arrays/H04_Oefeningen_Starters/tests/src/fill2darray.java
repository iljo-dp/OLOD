import java.security.SecureRandom;

public class fill2darray {
    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();

        int[][] pillen = new int[7][4];

        //Vullen array met random waarden
        for (int i = 0; i < pillen.length; i++) {
            for (int j = 0; j < pillen[i].length; j++) {
                pillen[i][j] = sr.nextInt(11);
            }
        }
        //Afdrukken array
        for (int[] ints : pillen) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
