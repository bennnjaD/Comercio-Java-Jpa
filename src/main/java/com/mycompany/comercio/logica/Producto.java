
package com.mycompany.comercio.logica;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import javax.persistence.Column;

@Entity
@IdClass(ProductoId.class)
public class Producto implements Serializable {

    @Id
    @Column(length = 100)
    private String nombre;
    
    @Id
    @Column(length = 100)
    private String marca;

    private int precioCompra;
    private String categoria;

    public Producto() {}

    public Producto(String nombre, String marca, int precioCompra, String categoria) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioCompra = precioCompra;
        this.categoria = categoria;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getCategoria() {
        return categoria;
    }
}


