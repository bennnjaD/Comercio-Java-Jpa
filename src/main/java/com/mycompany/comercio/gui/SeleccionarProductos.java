
package com.mycompany.comercio.gui;

import com.mycompany.comercio.controller.Controladora;
import com.mycompany.comercio.model.Producto;
import com.mycompany.comercio.utils.Utils;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class SeleccionarProductos extends javax.swing.JFrame {

    Controladora control = new Controladora();
    Ventas ventasVentana;
    
    public SeleccionarProductos(Ventas v) {
        this.ventasVentana = v;
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cargarCategorias();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnAgregarVenta = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textBuscadorProducto = new javax.swing.JTextField();
        btnBuscarPorNom = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnBuscarPorCate = new javax.swing.JButton();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel1.setText("Seleccionar Producto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        btnAgregarVenta.setText("Agregar Venta");
        btnAgregarVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(btnAgregarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(372, 372, 372))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Buscar Por Nombre:");

        textBuscadorProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBuscadorProductoActionPerformed(evt);
            }
        });

        btnBuscarPorNom.setText("Buscar");
        btnBuscarPorNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorNomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(textBuscadorProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addComponent(btnBuscarPorNom, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textBuscadorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPorNom))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Buscar Por Categoria:");

        btnBuscarPorCate.setText("Buscar");
        btnBuscarPorCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorCateActionPerformed(evt);
            }
        });

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxCategoria, 0, 160, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(btnBuscarPorCate, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnBuscarPorCate)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

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
        jScrollPane1.setViewportView(tablaProductos);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Lista de Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(785, 785, 785))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textBuscadorProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBuscadorProductoActionPerformed
        
    }//GEN-LAST:event_textBuscadorProductoActionPerformed

    private void btnAgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVentaActionPerformed
        
        if (Utils.esFilaSeleccionada(tablaProductos)) {
                String nombreProducto = String.valueOf (tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0));
                String marcaProducto = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 1));
                
                AgregarVenta agVenta = new AgregarVenta(nombreProducto, marcaProducto, ventasVentana);
                agVenta.setVisible(true);
                agVenta.setLocationRelativeTo(null);
                this.dispose();
            }
            else {
                Utils.mostrarMensajeAgregarProducto(tablaProductos);
            }
        
    }//GEN-LAST:event_btnAgregarVentaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        cargarTablaProductos();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnBuscarPorNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorNomActionPerformed
        
    String nombreProducto = textBuscadorProducto.getText();

    if (nombreProducto.isEmpty()) {
        Utils.mostrarMensaje("Debe ingresar un nombre para buscar", "Error", "Error al buscar");
    }

    List<Producto> productos = control.buscarProductosPorNombre(nombreProducto);

    if (productos.isEmpty()) {
        Utils.mostrarMensaje("No se encontraron productos con el nombre: " + nombreProducto, "Info", "Búsqueda Vacía");
    } else {
        cargarTablaPorBusqueda(productos);
        textBuscadorProducto.setText("");
    }
        
    }//GEN-LAST:event_btnBuscarPorNomActionPerformed

    private void btnBuscarPorCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorCateActionPerformed

        String categoriaSeleccionada = (String) jComboBoxCategoria.getSelectedItem();

        if (categoriaSeleccionada == null || categoriaSeleccionada.isEmpty()) {
            Utils.mostrarMensaje("Debe seleccionar una categoría para buscar", "Error", "Error al buscar");
            return;
        }

        List<Producto> productos = control.buscarProductosPorCategoria(categoriaSeleccionada);

        if (productos.isEmpty()) {
            Utils.mostrarMensaje("No se encontraron productos en la categoría: " + categoriaSeleccionada, "Info", "Búsqueda Vacía");
        } else {
            cargarTablaPorBusqueda(productos);
        }

    }//GEN-LAST:event_btnBuscarPorCateActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarVenta;
    private javax.swing.JButton btnBuscarPorCate;
    private javax.swing.JButton btnBuscarPorNom;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField textBuscadorProducto;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaProductos() {
        
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable (int row, int column) {
                return false;
            }
        };
        
        String titulos[] = {"Nombre Producto" , "Marca Producto", "Precio Producto", "Precio Venta", "Categoria", "Tipo Producto"};
        
        modeloTabla.setColumnIdentifiers(titulos);
        
        List <Producto> listaProductos = control.traerProductos();
        
        if (listaProductos != null) {
            for (Producto producto : listaProductos) {
                Object[] object = { producto.getNombre(), 
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

    private void cargarTablaPorBusqueda(List<Producto> productos) {
    DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
    model.setRowCount(0); 

        for (Producto p : productos) {
            model.addRow(new Object[]{p.getNombre(), p.getMarca(), p.getPrecioCompra(), p.getPrecioVenta(), p.getCategoria(), p.getTipoProducto()});
        }
    }

    private void cargarCategorias() {
        List<String> categorias = control.obtenerTodasLasCategorias(); 
        jComboBoxCategoria.setModel(new DefaultComboBoxModel<>(categorias.toArray(new String[0]))); 
    }    
}

