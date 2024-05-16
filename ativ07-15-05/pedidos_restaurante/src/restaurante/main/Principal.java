package restaurante.main;

import restaurante.modules.ItemPedido;
import restaurante.modules.ListaDePedidos;
import restaurante.modules.Pedido;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Criando alguns itens de pedido
        ItemPedido item1 = new ItemPedido("Hambúrguer", 15.50);
        ItemPedido item2 = new ItemPedido("Batata Frita", 8.00);
        ItemPedido item3 = new ItemPedido("Refrigerante", 5.00);

        List<ItemPedido> itensPedido1 = new ArrayList<>();
        itensPedido1.add(item1);
        itensPedido1.add(item2);
        Pedido pedido1 = new Pedido(1, itensPedido1);

        List<ItemPedido> itensPedido2 = new ArrayList<>();
        itensPedido2.add(item3);
        Pedido pedido2 = new Pedido(2, itensPedido2);

        ListaDePedidos listaDePedidos = new ListaDePedidos();
        listaDePedidos.adicionarPedido(pedido1);
        listaDePedidos.adicionarPedido(pedido2);

        listaDePedidos.exibirPedidosEmAndamento();
    }
}
