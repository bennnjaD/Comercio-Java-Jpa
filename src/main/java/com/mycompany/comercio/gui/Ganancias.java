
package com.mycompany.comercio.gui;

import com.mycompany.comercio.controller.Controladora;
import com.mycompany.comercio.model.Ganancia;
import com.mycompany.comercio.utils.Utils;
import java.time.LocalDate;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Ganancias extends javax.swing.JPanel {

    Controladora control = new Controladora();
    
    public Ganancias() {
        initComponents();
        cargarTablaGanancias();
        cargarFechasComboBox();
        configuracionesAdicionales();
        mostrarGananciasDelMes();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnBuscarPorFecha = new javax.swing.JButton();
        jComboBoxFecha = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGanancias = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPaneGananciasMes = new javax.swing.JTextPane();
        btnActualizar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

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
                .addComponent(jComboBoxFecha, 0, 160, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(btnBuscarPorFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnBuscarPorFecha)
                    .addComponent(jComboBoxFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        tablaGanancias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaGanancias);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Ganancias del mes:");

        jScrollPane2.setViewportView(txtPaneGananciasMes);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jScrollPane2)
                                .addGap(255, 255, 255)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(270, 270, 270)))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorFechaActionPerformed

        String fechaSeleccionada = (String) jComboBoxFecha.getSelectedItem();

        if (fechaSeleccionada == null || fechaSeleccionada.isEmpty()) {
            Utils.mostrarMensaje("Debe seleccionar una fecha para buscar", "Error", "Error al buscar");
            
        } else {
            List<Ganancia> ganancias = control.buscarGananciasPorFecha(fechaSeleccionada);
            cargarTablaPorGanancias(ganancias);
        }
    }//GEN-LAST:event_btnBuscarPorFechaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarTablaGanancias();
        mostrarGananciasDelMes();
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarPorFecha;
    private javax.swing.JComboBox<String> jComboBoxFecha;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaGanancias;
    private javax.swing.JTextPane txtPaneGananciasMes;
    // End of variables declaration//GEN-END:variables

    private void cargarFechasComboBox() {
        jComboBoxFecha.removeAllItems();
        
        LocalDate hoy = LocalDate.now();

        for (int i = 0; i <= 7; i++) {
            LocalDate fecha = hoy.minusDays(i);
            jComboBoxFecha.addItem(fecha.toString());
        }
    }

    private void configuracionesAdicionales() {
        txtPaneGananciasMes.setEditable(false);
        txtPaneGananciasMes.putClientProperty( "FlatLaf.styleClass", "h3" );
    }

    private void mostrarGananciasDelMes() {
        
        List<Ganancia> gananciasDelMes = control.traerGananciasDelMes();
        double totalGanancias = 0;

        StringBuilder sb = new StringBuilder();
        for (Ganancia ganancia : gananciasDelMes) {
            sb.append("Fecha: ").append(ganancia.getFecha()).append(", Ganancia: ").append(ganancia.getGanancia()).append("\n");
            totalGanancias += Double.parseDouble(ganancia.getGanancia());
        }
        
        txtPaneGananciasMes.setText(String.valueOf(totalGanancias));    
    }
    
    private void cargarTablaGanancias() {
        
    DefaultTableModel modeloTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    String titulos[] = {"Id", "Fecha", "Ganancia"};
    modeloTabla.setColumnIdentifiers(titulos);

    List<Ganancia> listaGanancias = control.traerGanancias();

    if (listaGanancias != null) {
        
        for (Ganancia ganancia : listaGanancias) {
            Object[] object = {
                ganancia.getId(),
                ganancia.getFecha(),
                ganancia.getGanancia()
                
            };
            modeloTabla.addRow(object);
        }
    }

    tablaGanancias.setModel(modeloTabla);
    
    // Ocultar la columna del ID
    tablaGanancias.getColumnModel().getColumn(0).setMinWidth(0);
    tablaGanancias.getColumnModel().getColumn(0).setMaxWidth(0);
    }
    
    private void cargarTablaPorGanancias(List<Ganancia> ganancias) {
      
    DefaultTableModel modeloTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    String titulos[] = {"Id", "Fecha", "Ganancia"};
    modeloTabla.setColumnIdentifiers(titulos);


    if (ganancias != null) {
        for (Ganancia ganancia : ganancias) {
            Object[] object = {
                ganancia.getId(),
                ganancia.getFecha(),
                ganancia.getGanancia()
                
            };
            modeloTabla.addRow(object);
        }
    }

    tablaGanancias.setModel(modeloTabla);
    
    // Ocultar la columna del ID
    tablaGanancias.getColumnModel().getColumn(0).setMinWidth(0);
    tablaGanancias.getColumnModel().getColumn(0).setMaxWidth(0);    
    }
}