package br.edu.fatecpg.tecprog.controleversao;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operacao;
		double num1, num2, resultado;
		Scanner scan = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		while(true) {
			
		System.out.println("Digite a operação desejada \n 1-Soma" + "\n 2-Subtração" + "\n 3-Multiplicação" + "\n 4-Divisão");
		operacao = scan.nextInt();
		System.out.println("Digite o primeiro numero: ");
		num1 = scan.nextDouble();
		System.out.println("Digite o segundo numero: ");
		num2 = scan.nextDouble();
		if (operacao == 5) {
			break;
		}
		
		switch(operacao) {
			case 1:
				resultado = calc.soma(num1, num2);
				System.out.println(resultado);
				break;
			case 2:
				resultado = calc.subtracao(num1, num2);
				System.out.println(resultado);
				break;
			case 3:
				resultado = calc.multiplicacao(num1, num2);
				System.out.println(resultado);
				break;
			case 4:
				resultado = calc.divisao(num1, num2);
				System.out.println(resultado);
				break;
			}
		}
	}
}
