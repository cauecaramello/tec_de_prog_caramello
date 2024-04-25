public class Caminhao extends Veiculo {
    private int qtdPortas;
    private int qtdEixos;

    public Caminhao(String placa, String marca, String modelo, int ano, int qtdPortas, int qtdEixos) {
        super(placa, marca, modelo);
        this.qtdPortas = qtdPortas;
        this.qtdEixos = qtdEixos;
    }

    public void transportar() {
        System.out.println(" Estou transportando mercadoria.....");
    }

    public String toString() {
        return "\n Caminhão: \n"
                + "Placa: " + this.getPlaca() + "\n"
                + "Marca: " + this.getMarca() + "\n"
                + "Modelo: " + this.getModelo() + "\n"
                + "Portas: " + this.qtdPortas + "\n"
                + "Eixos: " + this.qtdEixos + "\n";
    }

}
