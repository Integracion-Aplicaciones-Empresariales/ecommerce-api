package com.ecommerce.service.repository;

import com.ecommerce.service.entity.Producto;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {
    @Query("SELECT P FROM Producto P WHERE P.recomendado = true AND P.stock != 0")
    Iterable<Producto> listarPlatillosRecomendados();

    @Query("SELECT P FROM Producto P WHERE P.categoria.id=:idC AND P.stock != 0")
    Iterable<Producto> listarPlatillosPorCategoria(int idC);

    @Modifying
    @Query("UPDATE Producto P SET P.stock= P.stock-:cant WHERE P.id=:id")
    void descontarStock(int cant, int id);

    @Modifying
    @Query("UPDATE Producto P SET P.stock= P.stock+:cant WHERE P.id=:id")
    void aumentarStock(int cant, int id);

    @Query("SELECT P FROM Producto P WHERE P.id=:idstock")
    Producto obtenerStockRepo(int idstock);
}
