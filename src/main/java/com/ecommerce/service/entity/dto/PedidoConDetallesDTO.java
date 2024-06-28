package com.ecommerce.service.entity.dto;

import com.ecommerce.service.entity.DetallePedido;
import com.ecommerce.service.entity.Pedido;
import lombok.Data;

import java.util.ArrayList;

@Data
public class PedidoConDetallesDTO {

    private Pedido pedido;
    private Iterable<DetallePedido> detallePedido;

    public PedidoConDetallesDTO() {
        this.pedido = new Pedido();
        this.detallePedido = new ArrayList<>();
    }

    public PedidoConDetallesDTO(Pedido pedido, Iterable<DetallePedido> detallePedido) {
        this.pedido = pedido;
        this.detallePedido = detallePedido;
    }


}
