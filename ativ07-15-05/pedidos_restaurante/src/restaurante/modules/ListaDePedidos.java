package restaurante.modules;

import java.util.ArrayList;
import java.util.List;

public class ListaDePedidos {
    private List<Pedido> pedidos;


    public ListaDePedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void removerPedido(Pedido pedido) {
        pedidos.remove(pedido);
    }

    public void exibirPedidosEmAndamento() {
        System.out.println("Pedidos em andamento:");
        for (Pedido pedido : pedidos) {
            if (pedido.getStatus().equals("Em andamento")) {
                System.out.println(pedido);
            }
        }
    }
    public void marcarPedidoComoEntregue(Pedido pedido) {
        pedido.setStatus("Entregue");
    }
}