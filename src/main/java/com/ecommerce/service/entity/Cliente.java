package com.ecommerce.service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100)
    private String nombres;
    @Column(length = 100)
    private String apellidoPaterno;
    @Column(length = 100)
    private String apellidoMaterno;
    @Column(length = 20)
    private String tipoDoc;
    @Column(length = 11)
    private String numDoc;
    @Column(length = 500)
    private String direccionEnvio;
    @Column(length = 100)
    private String departamento;
    @Column(length = 100)
    private String provincia;
    @Column(length = 100)
    private String distrito;
    @Column(length = 9)
    private String telefono;
    @OneToOne
    private DocumentoAlmacenado foto;


    public String getNombreCompletoCiente(){
        return this.nombres != null && this.apellidoPaterno != null && this.apellidoMaterno != null ?
                this.nombres + " " + this.apellidoPaterno + " " + this.apellidoMaterno: "-----";
    }
}
