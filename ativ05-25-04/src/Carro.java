public class Carro extends Veiculo {
    private int qtdPortas;
    private boolean tetoSolar;

    public Carro(String placa, String marca, String modelo, int qtdPortas, boolean tetoSolar) {
        super(placa, marca, modelo);
        this.qtdPortas = qtdPortas;
        this.tetoSolar = tetoSolar;
    }

    public void drift() {
        System.out.println("Cantou pneu ");
    }

    public String toString() {
        return "\nCarro: \n"
                + "Placa: " + this.getPlaca() + "\n"
                + "Marca: " + this.getMarca() + "\n"
                + "Modelo: " + this.getModelo() + "\n"
                + "Portas: " + this.qtdPortas + "\n"
                + "TetoSolar: " + (this.tetoSolar == true ? "Possui" : "Nao Possui");
    }
}
