
package com.mycompany.comercio.persistencia;


import com.mycompany.comercio.igu.Ganancias;
import com.mycompany.comercio.logica.Ganancia;
import com.mycompany.comercio.logica.Producto;
import com.mycompany.comercio.logica.Venta;
import com.mycompany.comercio.persistencia.exceptions.NonexistentEntityException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    ProductoJpaController productoJpa = new ProductoJpaController();
    VentaJpaController ventaJpa = new VentaJpaController();
    GananciaJpaController gananciaJpa = new GananciaJpaController();
    
    public void agregarProducto(Producto producto) {
        
        try {
            productoJpa.create(producto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public List<Producto> traerProductos() {
        
        return productoJpa.findProductoEntities();
    }

    public void borrarProducto(String nombreProducto, String marcaProducto) {
        
        try {
            productoJpa.destroy(nombreProducto, marcaProducto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Producto traerProducto(String nombreProducto, String marcaProducto) {
        return productoJpa.findProducto(nombreProducto, marcaProducto);
    }

    public void modificarProducto(Producto producto) {
        try {
            productoJpa.edit(producto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Producto> buscarProductosPorNombre(String nombre) {
        return productoJpa.findProductosByNombre(nombre);
    }

    public List<String> obtenerTodasLasCategorias() {
        return productoJpa.findDistinctCategorias();
    }

    public List<Producto> buscarProductosPorCategoria(String categoriaSeleccionada) {
        return productoJpa.findProductosByCategoria(categoriaSeleccionada);
    }


    public void agregarVenta(Venta venta) {
        ventaJpa.create(venta);
    }

    public List<Venta> traerVentasDelDia(LocalDate fecha) {
        return ventaJpa.findVentasDelDia(fecha);
    }

    public void agregarGanancia(Ganancia ganancia) {
        gananciaJpa.create(ganancia);
    }

    public void borrarVenta(long idVenta) {
        try {
            ventaJpa.destroy(idVenta);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Venta traerVenta(long idVenta) {
        return ventaJpa.findVenta(idVenta);
    }

    public void modificarVenta(Venta venta) {
        try {
            ventaJpa.edit(venta);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Venta> traerVentas() {
        return ventaJpa.findVentaEntities();
    }

    public List<Venta> traerVentasPorFecha(String fechaSeleccionada) {
        return ventaJpa.findVentasByFecha(fechaSeleccionada);
    }

    public List<Ganancia> traerGanancias() {
        return gananciaJpa.findGananciaEntities();
    }

    public List<Ganancia> traerGananciasPorFecha(String fechaSeleccionada) {
        return gananciaJpa.findGananciasByFecha(fechaSeleccionada);
    }

    public List<Ganancia> traerGananciasDelMes() {
        return gananciaJpa.traerGananciasDelMes();
    }


    
}
