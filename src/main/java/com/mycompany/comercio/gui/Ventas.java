
package com.mycompany.comercio.gui;

import com.mycompany.comercio.controller.Controladora;
import com.mycompany.comercio.model.Venta;
import com.mycompany.comercio.utils.Utils;
import java.awt.Font;
import java.util.List;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class Ventas extends javax.swing.JPanel {
    
    Controladora control = new Controladora();
    
    public Ventas() {
        initComponents();
        configuracionesAdicionales();
        cargarTablaVentas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPaneDineroDelDia = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPaneGanancias = new javax.swing.JTextPane();
        btnVentasTotales = new javax.swing.JButton();
        btnFinalizarVentas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregar.setBackground(new java.awt.Color(21, 101, 192));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Nueva Venta");
        btnAgregar.setPreferredSize(new java.awt.Dimension(120, 23));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(21, 101, 192));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar Venta");
        btnModificar.setPreferredSize(new java.awt.Dimension(120, 23));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar Venta");
        btnEliminar.setPreferredSize(new java.awt.Dimension(120, 23));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(21, 101, 192));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setPreferredSize(new java.awt.Dimension(120, 23));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Dinero del dia:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane3.setViewportView(txtPaneDineroDelDia);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ganancias del dia:");
        jLabel3.setFocusable(false);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane2.setViewportView(txtPaneGanancias);

        btnVentasTotales.setBackground(new java.awt.Color(21, 101, 192));
        btnVentasTotales.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVentasTotales.setForeground(new java.awt.Color(255, 255, 255));
        btnVentasTotales.setText("Ventas Totales");
        btnVentasTotales.setPreferredSize(new java.awt.Dimension(120, 23));
        btnVentasTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasTotalesActionPerformed(evt);
            }
        });

        btnFinalizarVentas.setBackground(new java.awt.Color(21, 101, 192));
        btnFinalizarVentas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFinalizarVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizarVentas.setText("FINALIZAR VENTAS");
        btnFinalizarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarVentasActionPerformed(evt);
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
        tablaVentas.setPreferredSize(new java.awt.Dimension(900, 340));
        jScrollPane1.setViewportView(tablaVentas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addGap(32, 32, 32)
                        .addComponent(btnFinalizarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36)
                        .addComponent(btnVentasTotales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnFinalizarVentas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnVentasTotales, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        SeleccionarProductos agVenta = new SeleccionarProductos(this);
        agVenta.setVisible(true);
        agVenta.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        if (Utils.esFilaSeleccionada(tablaVentas)) {
                long idVenta = obtenerIdVentaSeleccionada();
                ModifVenta modif = new ModifVenta(idVenta, this);
                modif.setVisible(true);
                modif.setLocationRelativeTo(null);
                
            }
            else {
                Utils.mostrarMensajeModificacion(tablaVentas);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    
        if (Utils.esFilaSeleccionada(tablaVentas)) {
            long idVenta = obtenerIdVentaSeleccionada();
                if (Utils.confirmarEliminacion(this)) {
                    eliminarVenta(idVenta);
                    Utils.mostrarMensaje("Venta borrada correctamente", "Info", "Borrado Exitoso");
                    cargarTablaVentas();
                }
        } else {
             Utils.mostrarMensajeEliminar(tablaVentas);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
 
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarTablaVentas();

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnVentasTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasTotalesActionPerformed
        VentasTotales ventasTot = new VentasTotales();
        ventasTot.setVisible(true);
        ventasTot.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVentasTotalesActionPerformed

    private void btnFinalizarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVentasActionPerformed
        String gananciasTotales = txtPaneGanancias.getText();
        control.agregarGanancia(gananciasTotales);
        Utils.mostrarMensaje("Las ventas del día han sido finalizadas y las ganancias guardadas.", "Info", "Operación exitosa");
    }//GEN-LAST:event_btnFinalizarVentasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFinalizarVentas;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVentasTotales;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTextPane txtPaneDineroDelDia;
    private javax.swing.JTextPane txtPaneGanancias;
    // End of variables declaration//GEN-END:variables

    public void cargarTablaVentas() {
    DefaultTableModel modeloTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    String titulos[] = {"ID", "Producto", "Marca", "Cantidad", "Categoria", "Precio Compra", "Precio Venta", "Ganancia", "Medio de Pago"};
    modeloTabla.setColumnIdentifiers(titulos);

    List<Venta> listaVentas = control.traerVentasDelDia();

    if (listaVentas != null) {
        actualizarGanancias(listaVentas);
        for (Venta venta : listaVentas) {
            String cantidadConUnidad = venta.isPorPeso() ? venta.getCantidad() + "gr" : String.valueOf(venta.getCantidad());
            
            Object[] object = {
                venta.getId(),
                venta.getNombre(), 
                venta.getMarca(),
                cantidadConUnidad,
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


    private void actualizarGanancias(List<Venta> listaVentas) {
        
        String ganancias = control.calcularGananciaTotal(listaVentas);
        String dineroDia = control.calcularGananciaDelDia(listaVentas);
        
        txtPaneGanancias.setText(ganancias);
        txtPaneDineroDelDia.setText(dineroDia);
    }

    private void configuracionesAdicionales() {
        txtPaneGanancias.setEditable(false);
        txtPaneDineroDelDia.setEditable(false);
        cambiarFuente(txtPaneGanancias, "Arial", Font.PLAIN, 16);
        cambiarFuente(txtPaneDineroDelDia, "Arial", Font.PLAIN, 16);
    }
    
    private void cambiarFuente(JTextPane textPane, String fontName, int fontStyle, int fontSize) {
        SimpleAttributeSet attributes = new SimpleAttributeSet();
        StyleConstants.setFontFamily(attributes, fontName);
        StyleConstants.setFontSize(attributes, fontSize);
        textPane.setCharacterAttributes(attributes, true);
    }

    private long obtenerIdVentaSeleccionada() {
        return (long) tablaVentas.getModel().getValueAt(tablaVentas.getSelectedRow(), 0);
    }

    private void eliminarVenta(long idVenta) {
        control.borrarVenta(idVenta);
    }


}
