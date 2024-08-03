
package com.mycompany.comercio.logica;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GestorVentas {
    
    private List<Venta> ventas;
    
    public GestorVentas () {
        ventas = new ArrayList<>();
    }
    
    public List<Venta> getVentas() {
        return ventas;
    }
    
    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public double calcularGananciaTotal() {
        return ventas.stream()
                .mapToDouble(v -> v.calcularGanancia())
                .sum();
    }
    
    public double calcularDineroDelDia() {
        return ventas.stream()
                .mapToDouble(v -> v.calcularPlataObtenida())
                .sum();
    }
    
    public void vaciarVentas() {
        ventas.clear();
    }
    
}

