package br.edu.fatecpg.tp.abstracao;

public class Carro {
	private String marca;
	private String modelo;
	private boolean status=false;
	private double velocidade=0;
	private double velMax = 180;
	private double velMin = 0;
	private final int capacidadeMaxima = 180;

    public double calcularValorTotalGasolina(double precoGasolina) {
        double capacidadeTanque = this.capacidadeMaxima;
        double valorTotal = capacidadeTanque * precoGasolina;
        return valorTotal;
    }
	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void girarChave() {
		if(this.status==true) {
			System.out.println("Carrou Desligou");
			this.status = false;
		}
		else {
			System.out.println("Carrou Ligou");
			this.status = true;
		}
	}

	public void acelerar(double acl) {
		if(this.velocidade <180) {
			this.velocidade+=acl;
			if(this.velocidade>=velMax) {
				this.velocidade = 180;
				System.out.println("Velocidade Máxima!");
			}
			else {
				System.out.println("Velocidade atual: "+ this.velocidade);
			}
		}
		else {
			System.out.println("Velocidade atual: "+ this.velocidade);
		}
	}

	public void frear(double freio) {
		if(this.velocidade>0) {
			this.velocidade-= freio;
			if(this.velocidade<=velMin) {
				this.velocidade = 0;
				System.out.println("Carro Parou!");
			}
			else {
				System.out.println("Velocidade atual: "+ this.velocidade);;
			}
		}
	}
}