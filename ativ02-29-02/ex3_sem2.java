import java.util.Scanner;

public class ex3_sem2 {
    public static void main(String[] args) {
        int tamanho;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha o tamanho da matriz: ");
        tamanho = scan.nextInt();
        int[][] matriz = new int[tamanho][tamanho];
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.println("Digite a posição de Linha " + l + " Coluna " + c + " Da matriz A");
                matriz[l][c] = scan.nextInt();
            }
        }
        System.out.println("Matriz antes da transposição: \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.print(" | " + matriz[l][c] + " | ");
            }
            System.out.println();
        }
        System.out.println("\n Matriz Depois da transposição: \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.print(" | " + matriz[c][l] + " | ");
            }
            System.out.println();
        }
        scan.close();
    }
}
