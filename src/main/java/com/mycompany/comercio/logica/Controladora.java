
package com.mycompany.comercio.logica;

import com.mycompany.comercio.logica.Venta.MedioDePago;
import com.mycompany.comercio.persistencia.ControladoraPersistencia;
import java.time.LocalDate;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    GestorVentas gestor = new GestorVentas();
    
    public void agregarProducto(String nombreProducto, String marcaProducto, int precioProducto, int precioVenta, String categoria, boolean tipoProd) {
        
        Producto producto = new Producto(nombreProducto, marcaProducto, precioProducto, precioVenta, categoria, tipoProd);
        
        controlPersis.agregarProducto(producto);
        
    }
    
    public void agregarVenta (Producto producto, int cantidad, int precioVenta, MedioDePago medioDePago){
        
        int precioCompra = producto.getPrecioCompra();
        Venta venta = new Venta(LocalDate.now(), producto, cantidad, precioVenta, precioCompra, medioDePago);
        
        controlPersis.agregarVenta(venta);
        
    }
    
    public List<Producto> traerProductos() {
        
        return controlPersis.traerProductos();
        
    }

    public void borrarProducto(String nombreProducto, String marcaProducto) {
        
        controlPersis.borrarProducto(nombreProducto, marcaProducto);
        
    }

    public Producto traerProducto(String nombreProducto, String marcaProducto) {
        return controlPersis.traerProducto(nombreProducto, marcaProducto);
    }

    public void modificarProducto(Producto producto, String nombreProducto, String marcaProducto, int precioProducto, String categoria) {
        producto.setPrecioCompra(precioProducto);
        producto.setCategoria(categoria);
        controlPersis.modificarProducto(producto);
    }
    

    public List<Producto> buscarProductosPorNombre(String nombre) {
        return controlPersis.buscarProductosPorNombre(nombre);
    }

    public List<String> obtenerTodasLasCategorias() {
        return controlPersis.obtenerTodasLasCategorias();
    }

    public List<Producto> buscarProductosPorCategoria(String categoriaSeleccionada) {
        return controlPersis.buscarProductosPorCategoria(categoriaSeleccionada);
    }

    public List<Venta> traerVentasDelDia() {
        LocalDate diaActual = LocalDate.now();
        return controlPersis.traerVentasDelDia(diaActual);
    }

    public void agregarGanancia(String gananciasTotales) {
        Ganancia ganancia = new Ganancia();
        ganancia.setFecha(LocalDate.now());
        ganancia.setGanancia(gananciasTotales);
        
        controlPersis.agregarGanancia(ganancia);
        
    }

    public void borrarVenta(long idVenta) {
        controlPersis.borrarVenta(idVenta);
    }

    public Venta traerVenta(long idVenta) {
        return controlPersis.traerVenta(idVenta);
    }

    public void modificarVenta(Venta venta, int cantidad, int precioVenta, MedioDePago medioDePago) {
        venta.setCantidad(cantidad);
        venta.setPrecioVenta(precioVenta);
        venta.setMedioDePago(medioDePago);
        
        controlPersis.modificarVenta(venta);
    }

    public List<Venta> traerVentas() {
        
        return controlPersis.traerVentas();
    }

    public List<Venta> buscarVentasPorFecha(String fechaSeleccionada) {
        return controlPersis.traerVentasPorFecha(fechaSeleccionada);
    }

    public List<Ganancia> traerGanancias() {
        return controlPersis.traerGanancias();
    }

    public List<Ganancia> buscarGananciasPorFecha(String fechaSeleccionada) {
        return controlPersis.traerGananciasPorFecha(fechaSeleccionada);
    }

    public List<Ganancia> traerGananciasDelMes() {
        return controlPersis.traerGananciasDelMes();
    }

    public String calcularGananciaTotal(List<Venta> listaVentas) {
        gestor.setVentas(listaVentas);
        return String.valueOf(gestor.calcularGananciaTotal());
    }

    public String calcularGananciaDelDia(List<Venta> listaVentas) {
        gestor.setVentas(listaVentas);
        
        return String.valueOf(gestor.calcularDineroDelDia());
    }


    
}
