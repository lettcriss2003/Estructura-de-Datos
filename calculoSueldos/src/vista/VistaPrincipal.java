package vista;

public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        panelCalculo = new javax.swing.JPanel();
        labelCalculo = new javax.swing.JLabel();
        buttonCalculo = new javax.swing.JButton();
        panelVista = new javax.swing.JPanel();
        labelVista = new javax.swing.JLabel();
        buttonVista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        labelTitulo.setText("Sistema de Calculo de Sueldos");

        labelCalculo.setText("Desea Calcular los sueldos");

        buttonCalculo.setText("Aceptar");
        buttonCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCalculoLayout = new javax.swing.GroupLayout(panelCalculo);
        panelCalculo.setLayout(panelCalculoLayout);
        panelCalculoLayout.setHorizontalGroup(
            panelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculoLayout.createSequentialGroup()
                .addGroup(panelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCalculoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(labelCalculo))
                    .addGroup(panelCalculoLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(buttonCalculo)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelCalculoLayout.setVerticalGroup(
            panelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCalculo)
                .addGap(18, 18, 18)
                .addComponent(buttonCalculo)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        labelVista.setText("Desea cargar JSON con sueldos");

        buttonVista.setText("Aceptar");
        buttonVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVistaLayout = new javax.swing.GroupLayout(panelVista);
        panelVista.setLayout(panelVistaLayout);
        panelVistaLayout.setHorizontalGroup(
            panelVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVistaLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(panelVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVistaLayout.createSequentialGroup()
                        .addComponent(labelVista)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVistaLayout.createSequentialGroup()
                        .addComponent(buttonVista)
                        .addGap(65, 65, 65))))
        );
        panelVistaLayout.setVerticalGroup(
            panelVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelVista)
                .addGap(18, 18, 18)
                .addComponent(buttonVista)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculoActionPerformed
        this.setVisible(false);
        VistaCalculo vistaCalculo = new VistaCalculo();
        vistaCalculo.setVisible(true);
    }//GEN-LAST:event_buttonCalculoActionPerformed

    private void buttonVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVistaActionPerformed
        this.setVisible(false);
        VistaJSON vistaJSON = new VistaJSON();
        vistaJSON.setVisible(true);
    }//GEN-LAST:event_buttonVistaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalculo;
    private javax.swing.JButton buttonVista;
    private javax.swing.JLabel labelCalculo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelVista;
    private javax.swing.JPanel panelCalculo;
    private javax.swing.JPanel panelVista;
    // End of variables declaration//GEN-END:variables
}
