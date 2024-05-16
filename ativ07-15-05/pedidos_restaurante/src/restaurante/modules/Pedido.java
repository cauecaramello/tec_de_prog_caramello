package restaurante.modules;

import java.util.List;

public class Pedido {
    private int numero;
    private List<ItemPedido> itens;
    private String status;

    public Pedido(int numero, List<ItemPedido> itens) {
        this.numero = numero;
        this.itens = itens;
        this.status = "Em andamento"; // Por padrão, o pedido começa em andamento
    }

    public int getNumero() {
        return numero;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido #" + numero + " - Status: " + status + "\nItens: " + itens;
    }
}
