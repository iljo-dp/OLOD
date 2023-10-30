import java.security.SecureRandom;

public class matrixtranspon {
    public static void main(String[] args) {
       new matrixtranspon().MaakMatrix();
    }
    public void MaakMatrix () {

        SecureRandom sr = new SecureRandom();
        //Maak random array met [1,5[ rijen en [1,5[ kolommen
        int[][] matrix = new int[sr.nextInt(1, 5)][sr.nextInt(1, 5)];
        //Vul de array met random getallen tussen 0 en 100
        for (int rij = 0; rij < matrix.length; rij++) {
            for (int kolom = 0; kolom < matrix[rij].length; kolom++) {
                matrix[rij][kolom] = sr.nextInt(101);
            }
        }
        //Toon de matrix
        System.out.println("Matrix:");
        toonMatrix(matrix);

        System.out.println("omgedraaid");
        //Aanmaken nieuwe matrix met juiste vorm
        int[][] transponedMatrix = new int[matrix[0].length][matrix.length];

        //4.2 Matrix invullen

        for (int index = 0; index < matrix.length; index++)
        {
            for (int varj = 0; varj < matrix[index].length; varj++){
                transponedMatrix[varj][index] = matrix[index][varj];
            }
        }
        //toon
        toonMatrix(transponedMatrix);

    }
    private void toonMatrix(int[][] matrix) {
        for (int[] rij : matrix) {
            for (int getal : rij) {
                System.out.printf("%5d", getal);
            }
            System.out.println();
        }
    }
}
