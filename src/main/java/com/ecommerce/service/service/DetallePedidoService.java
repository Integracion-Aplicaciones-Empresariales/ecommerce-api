package com.ecommerce.service.service;

import com.ecommerce.service.entity.DetallePedido;
import com.ecommerce.service.repository.DetallePedidoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DetallePedidoService {
    private final DetallePedidoRepository repository;

    public DetallePedidoService(DetallePedidoRepository repository) {
        this.repository = repository;
    }
    //Método para guardar detalles del pedido
    public void guardarDetalles(Iterable<DetallePedido> detalle){
        this.repository.saveAll(detalle);
    }
}
