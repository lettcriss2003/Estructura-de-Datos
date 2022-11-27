package vista;

import controlador.ControladorCalculo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.ModeloEmpleado;
import org.json.JSONObject;

public class VistaCalculo extends javax.swing.JFrame {

    public VistaCalculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatos = new javax.swing.JPanel();
        labelSueldo = new javax.swing.JLabel();
        labelAnios = new javax.swing.JLabel();
        labelNombres = new javax.swing.JLabel();
        textSueldo = new javax.swing.JTextField();
        dateIngreso = new com.toedter.calendar.JDateChooser();
        textNombres = new javax.swing.JTextField();
        buttonIngresarEmpleado = new javax.swing.JButton();
        panelResultadoCalculo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableResultadoCalculo = new javax.swing.JTable();
        buttonGuardarJSON = new javax.swing.JButton();
        labelCalculo = new javax.swing.JLabel();
        buttonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelSueldo.setText("Sueldo");

        labelAnios.setText("Fecha de Ingreso");

        labelNombres.setText("Nombres Completos");

        textSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSueldoActionPerformed(evt);
            }
        });

        buttonIngresarEmpleado.setText("Ingresar");
        buttonIngresarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIngresarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSueldo)
                    .addComponent(labelAnios)
                    .addComponent(labelNombres))
                .addGap(35, 35, 35)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(dateIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(buttonIngresarEmpleado))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSueldo)
                    .addComponent(textSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAnios)
                    .addComponent(dateIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIngresarEmpleado))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombres)
                    .addComponent(textNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableResultadoCalculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Años de Empleo", "Sueldo", "Tipo de Empleado", "Sueldo + Bono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableResultadoCalculo);

        buttonGuardarJSON.setText("Guardar en JSON");
        buttonGuardarJSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarJSONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelResultadoCalculoLayout = new javax.swing.GroupLayout(panelResultadoCalculo);
        panelResultadoCalculo.setLayout(panelResultadoCalculoLayout);
        panelResultadoCalculoLayout.setHorizontalGroup(
            panelResultadoCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoCalculoLayout.createSequentialGroup()
                .addGroup(panelResultadoCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelResultadoCalculoLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(buttonGuardarJSON))
                    .addGroup(panelResultadoCalculoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelResultadoCalculoLayout.setVerticalGroup(
            panelResultadoCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResultadoCalculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(buttonGuardarJSON)
                .addContainerGap())
        );

        labelCalculo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelCalculo.setText("Calcule sus sueldos");

        buttonVolver.setText("Volver");
        buttonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelResultadoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCalculo)
                .addGap(219, 219, 219))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelResultadoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIngresarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIngresarEmpleadoActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableResultadoCalculo.getModel();
        try {
            Double sueldo = Double.parseDouble(textSueldo.getText());
            if (!dateIngreso.getDate().after(Date.from(Instant.now()))) {
                ControladorCalculo controladorCalculo = new ControladorCalculo();
                Date date = dateIngreso.getDate();
                SimpleDateFormat anio = new SimpleDateFormat("YYYY");
                SimpleDateFormat mes = new SimpleDateFormat("MM");
                SimpleDateFormat dia = new SimpleDateFormat("dd");
                LocalDate fechaIngreso = LocalDate.of(Integer.parseInt(anio.format(date)), Integer.parseInt(mes.format(date)), Integer.parseInt(dia.format(date)));
                ModeloEmpleado empleado = new ModeloEmpleado(textNombres.getText(), controladorCalculo.calcularAnios(fechaIngreso), sueldo);
                model.addRow(new Object[]{empleado.getNombres(), empleado.getAnios(), empleado.getSueldo(), empleado.getTipoEmpleado(), empleado.getSueldoBono()});
                tableResultadoCalculo.setModel(model);

            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una fecha antes de la actual");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero correcto");
        }
    }//GEN-LAST:event_buttonIngresarEmpleadoActionPerformed

    private void buttonGuardarJSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarJSONActionPerformed
        ControladorCalculo controladorCalculo = new ControladorCalculo();
        if (tableResultadoCalculo.getModel().getRowCount() > 0) {
            JSONObject json = controladorCalculo.guardarDatosTablaAJSON((DefaultTableModel) tableResultadoCalculo.getModel());

            JFileChooser filechooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JSON", "json");
            filechooser.setFileFilter(filter);
            filechooser.showSaveDialog(filechooser);
            File guarda = filechooser.getSelectedFile();
            FileWriter save = null;
            try {
                save = new FileWriter(guarda + ".json");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            try {
                save.write(json.toString());
                save.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tabla sin datos");
        }
    }//GEN-LAST:event_buttonGuardarJSONActionPerformed

    private void buttonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolverActionPerformed
        this.setVisible(false);
        VistaPrincipal vistaPrincipal = new VistaPrincipal();
        vistaPrincipal.setVisible(true);
    }//GEN-LAST:event_buttonVolverActionPerformed

    private void textSueldoActionPerformed(java.awt.event.ActionEvent evt) {

    }

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
            java.util.logging.Logger.getLogger(VistaCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCalculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGuardarJSON;
    private javax.swing.JButton buttonIngresarEmpleado;
    private javax.swing.JButton buttonVolver;
    private com.toedter.calendar.JDateChooser dateIngreso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAnios;
    private javax.swing.JLabel labelCalculo;
    private javax.swing.JLabel labelNombres;
    private javax.swing.JLabel labelSueldo;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelResultadoCalculo;
    private javax.swing.JTable tableResultadoCalculo;
    private javax.swing.JTextField textNombres;
    private javax.swing.JTextField textSueldo;
    // End of variables declaration//GEN-END:variables
}
