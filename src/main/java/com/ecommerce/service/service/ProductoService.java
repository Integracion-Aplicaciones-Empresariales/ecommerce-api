package com.ecommerce.service.service;

import com.ecommerce.service.repository.ProductoRepository;
import com.ecommerce.service.utility.GenericResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.ecommerce.service.utility.Global.*;

@Service
@Transactional
public class ProductoService {
    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }
    public GenericResponse<?> listarPlatillosRecomendados(){
        return new GenericResponse<>(TIPO_DATA, RPTA_OK, OPERACION_CORRECTA, this.repository.listarPlatillosRecomendados());
    }
    public GenericResponse<?> listarPlatillosPorCategoria(int idC){
        return new GenericResponse<>(TIPO_DATA, RPTA_OK, OPERACION_CORRECTA, this.repository.listarPlatillosPorCategoria(idC));
    }

    public GenericResponse<?> obtenerStock(int id){
        return new GenericResponse<>(TIPO_DATA,RPTA_OK,OPERACION_CORRECTA, this.repository.obtenerStockRepo(id).getStock());
    }
}
