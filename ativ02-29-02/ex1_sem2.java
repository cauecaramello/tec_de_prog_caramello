import java.util.Scanner;

public class ex1_sem2 {
    public static void main(String[] args) throws Exception {
        int[][] matriz_A = new int[3][3];
        int[][] matriz_B = new int[3][3];
        int[][] matriz_C = new int[3][3];
        Scanner scan = new Scanner(System.in);

        for (int l = 0; l < matriz_A.length; l++) {
            for (int c = 0; c < matriz_A.length; c++) {
                System.out.println("Digite a posição de Linha " + l + " Coluna " + c + " Da matriz A");
                matriz_A[l][c] = scan.nextInt();
            }
        }

        for (int l = 0; l < matriz_B.length; l++) {
            for (int c = 0; c < matriz_B.length; c++) {
                System.out.println("Digite a posição de Linha " + l + " Coluna " + c + " Da matriz B");
                matriz_B[l][c] = scan.nextInt();
            }
        }

        for (int l = 0; l < matriz_C.length; l++) {
            for (int c = 0; c < matriz_C.length; c++) {
                matriz_C[l][c] = matriz_A[l][c] + matriz_B[l][c];
                System.out.print(" | " + matriz_C[l][c] + " | ");
            }
            System.out.println();
        }
        scan.close();
    }
}