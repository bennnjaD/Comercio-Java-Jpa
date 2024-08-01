
package com.mycompany.comercio.logica;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GestorVentas {
    
    private Controladora control;
    private List<Venta> ventas;
    private ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    
    public GestorVentas () {
        ventas = new ArrayList<>();
        programarTareaDiaria();
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
    
    public void vaciarVentas() {
        ventas.clear();
    }
    
    private void programarTareaDiaria() {
        
        LocalTime ahora = LocalTime.now();
        long hastaMediodia = LocalTime.of(23, 59).toSecondOfDay() - ahora.toSecondOfDay();
        
        scheduler.scheduleAtFixedRate(this::guardarGananciasDelDia, hastaMediodia, TimeUnit.DAYS.toSeconds(1), TimeUnit.SECONDS);
    }

    private void guardarGananciasDelDia() {

        String gananciasTotales = String.valueOf(calcularGananciaTotal());

        control.agregarGanancia(gananciasTotales);
        
        ventas.clear();
    }
    
    
}

