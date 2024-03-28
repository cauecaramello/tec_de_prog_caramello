package br.edu.fatecpg.tp.main;
import java.util.Scanner;

import br.edu.fatecpg.tp.abstracao.Carro;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Carro meuCarro = new Carro();
		System.out.println("Digite a marca do seu carro: ");

		String marca = scan.nextLine();
		meuCarro.setMarca(marca);
		System.out.println("Digite o modelo do seu carro: ");

		String modelo = scan.nextLine();
		meuCarro.setModelo(modelo);
		System.out.println("Digite a aceleração: ");

		double acle = scan.nextDouble();
		meuCarro.acelerar(acle);
		System.out.println("Digite a aceleração: ");

		acle = scan.nextDouble();
		meuCarro.acelerar(acle);
		System.out.println("Digite a aceleração: ");
		
		acle = scan.nextDouble();
		meuCarro.acelerar(acle);
		System.out.println(meuCarro.getMarca());
		meuCarro.girarChave();
		
		double precoGasolina = 4.50; 
        double valorTotalGasolina = meuCarro.calcularValorTotalGasolina(precoGasolina);
        System.out.println("Valor total para encher o tanque: R$" + valorTotalGasolina);
		scan.close();
	}
}