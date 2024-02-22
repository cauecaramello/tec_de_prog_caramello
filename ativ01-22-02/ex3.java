import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) throws Exception {
        double base;
        double altura;
        double areaquadrado;
        double raio;
        double areacirculo;
        
        int valor;
        Scanner ler = new Scanner(System.in);
        String menu = """
                ********************
                Entre com a opção desejada:
                1 - Área do Quadrado;
                2 - Área do Circulo;
                ********************
                """;
        System.out.println(menu);
        valor = ler.nextInt();

        switch(valor){
            case 1:
                System.out.println("Digite a base do quadrado: ");
                base = ler.nextDouble();
                System.out.println("Digite a altura do quadrado: ");
                altura = ler.nextDouble();
                areaquadrado = base*altura;
                System.out.println("A área do Quadrado é: " + areaquadrado);
                break;
            case 2:
                System.out.println("Digite o raio do círculo: ");
                raio = ler.nextDouble();
                areacirculo = Math.PI * Math.pow(raio, 2);
                System.out.println("A área do círculo é: " + areacirculo);
                break;
        }
        ler.close();
    }
}