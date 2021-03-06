
package edu.vistas;

import edu.clases.Estu;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 * Nombre de la clase: FormEstudiante
 * Fecha: 24-05-2018
 * Version: 1.0
 * CopyRight: Andrés Alfaro
 * @author Andrés Alfaro
 */
public class FormuEstudiante extends javax.swing.JInternalFrame {

    /**
     * Creates new form DatosEstudiante
     */
    public FormuEstudiante() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jNom = new javax.swing.JTextField();
        jCarn = new javax.swing.JTextField();
        jPromTeo = new javax.swing.JTextField();
        jPromPrac = new javax.swing.JTextField();
        jEnviar = new javax.swing.JButton();
        jLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Login");
        setVisible(true);

        jLabel2.setText("Carnet: ");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Nota Promedio Teoria:");

        jLabel5.setText("Nota promedio Práctica: ");

        jNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomActionPerformed(evt);
            }
        });
        jNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNomKeyTyped(evt);
            }
        });

        jCarn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCarnActionPerformed(evt);
            }
        });
        jCarn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCarnKeyTyped(evt);
            }
        });

        jPromTeo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPromTeoKeyTyped(evt);
            }
        });

        jPromPrac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPromPracKeyTyped(evt);
            }
        });

        jEnviar.setText("Enviar");
        jEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEnviarActionPerformed(evt);
            }
        });

        jLimpiar.setText("Limpiar");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Datos Estudiante: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jEnviar)
                                .addGap(11, 11, 11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCarn, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(jNom)
                                    .addComponent(jPromTeo)
                                    .addComponent(jPromPrac)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLimpiar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jCarn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPromTeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPromPrac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEnviar)
                    .addComponent(jLimpiar))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomActionPerformed

    private void jNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNomKeyTyped
        Character l = evt.getKeyChar();

        if(!Character.isLetter(l) && l != KeyEvent.VK_SPACE)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jNomKeyTyped

    private void jCarnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCarnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCarnActionPerformed

    private void jCarnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCarnKeyTyped
        Character s = evt.getKeyChar();

        if(!Character.isDigit(s))
        {
            evt.consume();
        }

    }//GEN-LAST:event_jCarnKeyTyped

    private void jPromTeoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPromTeoKeyTyped

        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.')
        {
            evt.consume();
        }
        if(evt.getKeyChar() == '.' && jPromTeo.getText().contains("."))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jPromTeoKeyTyped

    private void jPromPracKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPromPracKeyTyped

        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.')
        {
            evt.consume();
        }
        if(evt.getKeyChar() == '.' && jPromTeo.getText().contains("."))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jPromPracKeyTyped

    private void jEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEnviarActionPerformed
        llenar();
    }//GEN-LAST:event_jEnviarActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jLimpiarActionPerformed
    public void limpiar()
    {
        this.jCarn.setText(" ");
        this.jNom.setText(" ");
        this.jPromPrac.setText(" ");
        this.jPromTeo.setText(" ");
    }
    public void llenar()
    {
        Estu obj = new Estu();
        obj.setCarnet(Integer.parseInt(this.jCarn.getText()));
        obj.setNombre(this.jNom.getText());
        obj.setNotaPractica(Double.parseDouble(this.jPromPrac.getText()));
        obj.setNotaTeoria(Double.parseDouble(this.jPromTeo.getText()));
        
        JOptionPane.showMessageDialog(null, "Datos del estudiante: " +
                                            "\n Carnet: " + obj.getCarnet() + 
                                            "\n Nombre: " + obj.getNombre() +
                                            "\n Nota Final: " + obj.calcularPromedio(obj.getNotaTeoria(), obj.getNotaPractica()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jCarn;
    private javax.swing.JButton jEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JTextField jNom;
    private javax.swing.JTextField jPromPrac;
    private javax.swing.JTextField jPromTeo;
    // End of variables declaration//GEN-END:variables
}
