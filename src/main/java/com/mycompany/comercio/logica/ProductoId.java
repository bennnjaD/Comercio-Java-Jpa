
package com.mycompany.comercio.logica;

import java.io.Serializable;
import java.util.Objects;

public class ProductoId implements Serializable {
    private String nombre;
    private String marca;

    public ProductoId() {}

    public ProductoId(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoId that = (ProductoId) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(marca, that.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, marca);
    }
}

