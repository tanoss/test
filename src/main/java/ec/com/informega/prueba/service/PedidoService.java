package ec.com.informega.prueba.service;

import ec.com.informega.prueba.model.Pedido;

import java.util.List;

public interface PedidoService {
    List<Pedido> pedidoRepartidor(Long idRepartidor);
    void updateRepartidor(Pedido pedido);
    boolean crearPedido(Pedido pedido);

    List<Pedido> pedidos();
}
