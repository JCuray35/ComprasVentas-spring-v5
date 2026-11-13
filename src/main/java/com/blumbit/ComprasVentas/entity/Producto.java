package com.blumbit.ComprasVentas.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {

    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer id;

    @Column(nullable = false , length = 200)
    private String nombre;

    @Column(length = 500)
    private String descripcion;

    @Column(length = 20)
    private String unidadMedida;

     @Column(length = 100)
    private String marca;

    @Column(precision = 12 , scale = 2)
    private BigDecimal precioVentaActual;

    @Column(length = 255)
    private String imagen;

    @Column(nullable = false)
    private Boolean estado;

    @ManyToOne 
    private Categoria categoria;



   
}
