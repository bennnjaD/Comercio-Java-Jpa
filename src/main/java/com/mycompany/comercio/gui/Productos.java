
package com.mycompany.comercio.gui;

import com.mycompany.comercio.controller.Controladora;
import com.mycompany.comercio.model.Producto;
import com.mycompany.comercio.utils.Utils;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Productos extends javax.swing.JPanel {

    Controladora control = new Controladora();
    
    public Productos() {
        
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        textBuscadorProducto1 = new javax.swing.JTextField();
        btnBuscarPorNom1 = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaProductos.setPreferredSize(new java.awt.Dimension(900, 340));
        jScrollPane1.setViewportView(tablaProductos);

        btnAgregar.setBackground(new java.awt.Color(21, 101, 192));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar Producto");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(21, 101, 192));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar Producto");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar Producto");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Buscar Por Nombre:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textBuscadorProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBuscadorProducto1ActionPerformed(evt);
            }
        });

        btnBuscarPorNom1.setText("Buscar");
        btnBuscarPorNom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorNom1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(textBuscadorProducto1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(btnBuscarPorNom1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarPorNom1)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textBuscadorProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(12, 12, 12))
        );

        btnActualizar.setBackground(new java.awt.Color(21, 101, 192));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
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
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
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

        AgregarProducto agProd = new AgregarProducto(this);
        agProd.setVisible(true);
        agProd.setLocationRelativeTo(null);
        

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        if (Utils.esFilaSeleccionada(tablaProductos)) {
               
                String nombreProducto = String.valueOf (tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0));
                String marcaProducto = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 1));
                
                ModifProducto modif = new ModifProducto(nombreProducto, marcaProducto, this);
                modif.setVisible(true);
                modif.setLocationRelativeTo(null);
              
            }
            else {
                Utils.mostrarMensajeModificacion(tablaProductos);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (Utils.esFilaSeleccionada(tablaProductos)) {
            String nombreProducto = String.valueOf (tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0));
            String marcaProducto = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 1));
                
                if(Utils.confirmarEliminacion(this)) {
                    control.borrarProducto(nombreProducto, marcaProducto);
                    Utils.mostrarMensaje("Producto borrado correctamente", "Info", "Borrado Exitoso");
                    cargarTabla();
                }
        } else {
                Utils.mostrarMensajeEliminar(tablaProductos);
            }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void textBuscadorProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBuscadorProducto1ActionPerformed

    }//GEN-LAST:event_textBuscadorProducto1ActionPerformed

    private void btnBuscarPorNom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorNom1ActionPerformed

        String nombreProducto = textBuscadorProducto1.getText();

        if (nombreProducto.isEmpty()) {
            Utils.mostrarMensaje("Debe ingresar un nombre para buscar", "Error", "Error al buscar");
            return;
        }

        List<Producto> productos = control.buscarProductosPorNombre(nombreProducto);

        if (productos.isEmpty()) {
            Utils.mostrarMensaje("No se encontraron productos con el nombre: " + nombreProducto, "Info", "Búsqueda Vacía");
        } else {
            cargarTabla(productos);
            textBuscadorProducto1.setText("");
        }
    }//GEN-LAST:event_btnBuscarPorNom1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarTabla();
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarPorNom1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField textBuscadorProducto1;
    // End of variables declaration//GEN-END:variables

    
    public void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"Nombre Producto", "Marca Producto", "Precio Compra", "Precio Venta", "Categoria", "Tipo Producto"};
        modeloTabla.setColumnIdentifiers(titulos);

        List<Producto> listaProductos = control.traerProductos();

        if (listaProductos != null) {
            for (Producto producto : listaProductos) {
                Object[] object = {
                        producto.getNombre(),
                        producto.getMarca(),
                        producto.getPrecioCompra(),
                        producto.getPrecioVenta(),
                        producto.getCategoria(),
                        producto.getTipoProducto()
                };
                modeloTabla.addRow(object);
            }
        }

        tablaProductos.setModel(modeloTabla);
        
    }
    
    private void cargarTabla(List<Producto> productos) {
    DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
    model.setRowCount(0); 

    for (Producto p : productos) {
        model.addRow(new Object[]{p.getNombre(), p.getMarca(), p.getPrecioCompra(), p.getPrecioVenta(), p.getCategoria(), p.getTipoProducto()});
    }
    }
        
}
