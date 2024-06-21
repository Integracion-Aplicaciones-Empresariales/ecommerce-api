package com.ecommerce.service.entity.dto;

import com.ecommerce.service.entity.Cliente;
import com.ecommerce.service.entity.DetallePedido;
import com.ecommerce.service.entity.Pedido;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenerarPedidoDTO {

    private Pedido pedido;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Iterable<DetallePedido> detallePedidos;
    private Cliente cliente;



}