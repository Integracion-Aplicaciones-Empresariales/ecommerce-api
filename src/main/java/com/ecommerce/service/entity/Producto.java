package com.ecommerce.service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100)
    private String nombre;
    @OneToOne
    @JoinColumn(name = "foto_id", referencedColumnName = "id", unique = false)
    private DocumentoAlmacenado foto;
    @Column
    private Double precio;
    @Column
    private int stock;
    @Column(length = 500)
    private String descripcionPlatillo;
    @OneToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "id", unique = false)
    private Categoria categoria;
    @Column
    private boolean vigencia;
    @Column
    private boolean recomendado;


}
