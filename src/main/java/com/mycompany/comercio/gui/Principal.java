
package com.mycompany.comercio.gui;

import java.awt.Color;


public class Principal extends javax.swing.JPanel {

    public Principal() {
        initComponents();
        initStyles();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        txtFirstSentence = new javax.swing.JLabel();
        txtSndSentence = new javax.swing.JLabel();
        txtThirdSentence = new javax.swing.JLabel();
        txtFthSentence = new javax.swing.JLabel();
        txtFithSentence = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtSixthSentence = new javax.swing.JLabel();
        txtSeventhSentence = new javax.swing.JLabel();
        txtEighthSentence = new javax.swing.JLabel();
        txtNinthSentence = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1050, 500));

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setMinimumSize(new java.awt.Dimension(1030, 540));
        body.setPreferredSize(new java.awt.Dimension(1030, 540));

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3082031 (2).png"))); // NOI18N

        txtFirstSentence.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFirstSentence.setText("Sistema de Gestión para un Comercio. ");

        txtSndSentence.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSndSentence.setText("Controle y administre forma óptima y fácil el flujo de productos, ventas y ganancias. ");

        txtThirdSentence.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtThirdSentence.setText("Esta herramienta le permitirá llevar un control completo y detallado de su Comercio,");

        txtFthSentence.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFthSentence.setText("tendrá acceso a herramientas especiales para tareas específicas, como lo son:");

        txtFithSentence.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFithSentence.setText("• Listado de Productos");

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("¡Bienvenido!");

        txtSixthSentence.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSixthSentence.setText("• Listado de Ventas");

        txtSeventhSentence.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSeventhSentence.setText("• Registro de Ganancias");

        txtEighthSentence.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEighthSentence.setText("• Edición de Productos y Ventas existentes");

        txtNinthSentence.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNinthSentence.setText("• Eliminar todo tipo de registros");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtFirstSentence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(773, 773, 773))
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtSndSentence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(495, 495, 495))
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNinthSentence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFithSentence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSeventhSentence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSixthSentence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEighthSentence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addComponent(txtThirdSentence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15))
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addComponent(txtFthSentence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(21, 21, 21)))
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(txtFirstSentence, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(txtSndSentence, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtThirdSentence, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addGap(251, 251, 251))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(txtNinthSentence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(txtFithSentence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(170, 170, 170))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(txtSeventhSentence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(94, 94, 94))
                    .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(txtFthSentence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(218, 218, 218))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(txtSixthSentence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(132, 132, 132))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(txtEighthSentence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(56, 56, 56)))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JLabel image;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtEighthSentence;
    private javax.swing.JLabel txtFirstSentence;
    private javax.swing.JLabel txtFithSentence;
    private javax.swing.JLabel txtFthSentence;
    private javax.swing.JLabel txtNinthSentence;
    private javax.swing.JLabel txtSeventhSentence;
    private javax.swing.JLabel txtSixthSentence;
    private javax.swing.JLabel txtSndSentence;
    private javax.swing.JLabel txtThirdSentence;
    // End of variables declaration//GEN-END:variables
   
    private void initStyles() {
        
        Title.putClientProperty( "FlatLaf.styleClass", "h0" );
        Title.setForeground(Color.BLUE);

        txtFirstSentence.putClientProperty( "FlatLaf.styleClass", "h3" );
        txtFirstSentence.setForeground(Color.BLACK);
        txtSndSentence.putClientProperty( "FlatLaf.styleClass", "h3" );
        txtSndSentence.setForeground(Color.black);
        
        txtThirdSentence.putClientProperty( "FlatLaf.styleClass", "h3" );
        txtThirdSentence.setForeground(Color.DARK_GRAY);
        txtFthSentence.putClientProperty( "FlatLaf.styleClass", "h3" );
        txtFthSentence.setForeground(Color.DARK_GRAY);
        
        txtFithSentence.putClientProperty( "FlatLaf.styleClass", "h3" );
        txtSixthSentence.putClientProperty( "FlatLaf.styleClass", "h3" );
        txtSeventhSentence.putClientProperty( "FlatLaf.styleClass", "h3" );
        txtEighthSentence.putClientProperty( "FlatLaf.styleClass", "h3" );
        txtNinthSentence.putClientProperty( "FlatLaf.styleClass", "h3" );
  
    }
}
