
package com.mycompany.comercio.logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class Venta implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;
    
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "producto_nombre", referencedColumnName = "nombre"),
        @JoinColumn(name = "producto_marca", referencedColumnName = "marca")
    })
    private Producto producto;
    private int cantidad;
    private int precioCompra;
    private int precioVenta;
    private MedioDePago medioDePago;
    
    public Venta(){};
    
    public Venta(LocalDate fecha, Producto producto, int cantidad, int precioVenta, int precioCompra, MedioDePago medioDePago) {
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.medioDePago = medioDePago;
    }

    void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    public enum MedioDePago {
    EFECTIVO,
    TRANSFERENCIA;
    }
    
    public int calcularGanancia() {
        return (precioVenta - precioCompra) * cantidad;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Object getNombre() {
        return producto.getNombre();
    }

    public Object getMarca() {
        return producto.getMarca();
    }

    public int getPrecioCompra() {
        return this.precioCompra;
    }

    public Object getCategoria() {
        return producto.getCategoria();
    }
    
    public MedioDePago getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(MedioDePago medioDePago) {
        this.medioDePago = medioDePago;
    }
    
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
}