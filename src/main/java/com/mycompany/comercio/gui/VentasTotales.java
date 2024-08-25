
package com.mycompany.comercio.gui;

import com.mycompany.comercio.controller.Controladora;
import com.mycompany.comercio.model.Venta;
import com.mycompany.comercio.utils.Utils;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


public class VentasTotales extends javax.swing.JFrame {

    Controladora control = new Controladora();
    
    public VentasTotales() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cargarFechasComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnBuscarPorFecha = new javax.swing.JButton();
        jComboBoxFecha = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaVentas);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Buscar Por Fecha:");

        btnBuscarPorFecha.setText("Buscar");
        btnBuscarPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorFechaActionPerformed(evt);
            }
        });

        jComboBoxFecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxFecha, 0, 349, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(btnBuscarPorFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(btnBuscarPorFecha))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(382, 382, 382))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTablaVentas();
    }//GEN-LAST:event_formWindowOpened

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarTablaVentas();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorFechaActionPerformed

       String fechaSeleccionada = (String) jComboBoxFecha.getSelectedItem();

        if (fechaSeleccionada == null || fechaSeleccionada.isEmpty()) {
            Utils.mostrarMensaje("Debe seleccionar una fecha para buscar", "Error", "Error al buscar");
            
        } else {
            List<Venta> ventas = control.buscarVentasPorFecha(fechaSeleccionada);
            cargarTablaPorVentas(ventas);
        }
    
        
    }//GEN-LAST:event_btnBuscarPorFechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarPorFecha;
    private javax.swing.JComboBox<String> jComboBoxFecha;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVentas;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaVentas() {
    DefaultTableModel modeloTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    String titulos[] = {"ID", "Producto", "Marca", "Cantidad", "Categoria", "Precio Compra", "Precio Venta", "Ganancia", "Medio de Pago"};
    modeloTabla.setColumnIdentifiers(titulos);

    List<Venta> listaVentas = control.traerVentas();

    if (listaVentas != null) {
        for (Venta venta : listaVentas) {
            Object[] object = {
                venta.getId(),
                venta.getNombre(), 
                venta.getMarca(),
                venta.getCantidad(),
                venta.getCategoria(),
                venta.getPrecioCompra(),
                venta.getPrecioVenta(),
                venta.calcularGanancia(),
                venta.getMedioDePago()
            };
            modeloTabla.addRow(object);
        }
    }

    tablaVentas.setModel(modeloTabla);

    // Ocultar la columna del ID
    tablaVentas.getColumnModel().getColumn(0).setMinWidth(0);
    tablaVentas.getColumnModel().getColumn(0).setMaxWidth(0);
    }

    private void cargarFechasComboBox() {
        
        jComboBoxFecha.removeAllItems();
        
        LocalDate hoy = LocalDate.now();

        // Añade las fechas desde hoy hasta hace 7 días
        for (int i = 0; i <= 7; i++) {
            LocalDate fecha = hoy.minusDays(i);
            jComboBoxFecha.addItem(fecha.toString());
        }
    }

    private void cargarTablaPorVentas(List<Venta> ventas) {
        
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    String titulos[] = {"ID", "Producto", "Marca", "Cantidad", "Categoria", "Precio Compra", "Precio Venta", "Ganancia", "Medio de Pago"};
    modeloTabla.setColumnIdentifiers(titulos);

    if (ventas != null) {
        for (Venta venta : ventas) {
            Object[] object = {
                venta.getId(),
                venta.getNombre(),
                venta.getMarca(),
                venta.getCantidad(),
                venta.getCategoria(),
                venta.getPrecioCompra(),
                venta.getPrecioVenta(),
                venta.calcularGanancia(),
                venta.getMedioDePago()
            };
            modeloTabla.addRow(object);
        }
    }

    tablaVentas.setModel(modeloTabla);

    // Ocultar la columna del ID
    tablaVentas.getColumnModel().getColumn(0).setMinWidth(0);
    tablaVentas.getColumnModel().getColumn(0).setMaxWidth(0);
}

}
