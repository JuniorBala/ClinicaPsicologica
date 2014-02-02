/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrick Felipi Cursino Fonseca - TIA: 3125393-8
 */

import javax.swing.*;
import java.text.*;
import java.sql.*;

public class FormProcurarPaciente_Exame extends javax.swing.JFrame {
    static String retornoRG = null;
    static String retornoCPF = null;
    /**
     * Creates new form FormProcurarPaciente_Exame
     */
    public FormProcurarPaciente_Exame() {
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

        groupButton = new javax.swing.ButtonGroup();
        painel1 = new javax.swing.JPanel();
        labCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        labRG = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        rbCPF = new javax.swing.JRadioButton();
        rbRG = new javax.swing.JRadioButton();
        labProcurarPacientePor = new javax.swing.JLabel();
        btnProcurarPaciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Procurar Paciente");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        painel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Paciente:"));

        labCPF.setText("CPF :");
        labCPF.setToolTipText("");

        txtCPF.setToolTipText("Inserir CPF");
        txtCPF.setEnabled(false);
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCPFKeyTyped(evt);
            }
        });

        labRG.setText("RG :");

        txtRG.setToolTipText("Inserir CNPJ");
        txtRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRGKeyTyped(evt);
            }
        });

        groupButton.add(rbCPF);
        rbCPF.setText("CPF");
        rbCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCPFActionPerformed(evt);
            }
        });

        groupButton.add(rbRG);
        rbRG.setSelected(true);
        rbRG.setText("RG");
        rbRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRGActionPerformed(evt);
            }
        });

        labProcurarPacientePor.setText("Procurar Paciente Por :");
        labProcurarPacientePor.setToolTipText("");

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addComponent(labRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labProcurarPacientePor)
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addComponent(rbRG)
                        .addGap(75, 75, 75)
                        .addComponent(rbCPF))
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addComponent(labCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCPF)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labProcurarPacientePor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCPF)
                    .addComponent(rbRG))
                .addGap(18, 18, 18)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labRG)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnProcurarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes_Site_5746_Knob_Valid_Blue.png"))); // NOI18N
        btnProcurarPaciente.setText("Procurar Paciente");
        btnProcurarPaciente.setToolTipText("Procurar Paciente");
        btnProcurarPaciente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnProcurarPacienteStateChanged(evt);
            }
        });
        btnProcurarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProcurarPaciente)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProcurarPaciente)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        btnProcurarPaciente.setEnabled(true);
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        int x = 0;
        String cpf = txtCPF.getText();
        x = cpf.length();
        if(x == 12){
            evt.consume();
        }
    }//GEN-LAST:event_txtCPFKeyTyped

    private void txtRGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRGKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        int x = 0;
        String rg = txtRG.getText();
        x = rg.length();
        if(x == 12){
            evt.consume();
        }
    }//GEN-LAST:event_txtRGKeyTyped

    private void rbCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCPFActionPerformed
        if(rbCPF.isSelected()){
            txtCPF.setEnabled(true);
            txtRG.setEnabled(false);
            txtCPF.grabFocus();
            txtRG.setText("");
        }else{
            txtCPF.setEnabled(false);
        }
    }//GEN-LAST:event_rbCPFActionPerformed

    private void rbRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRGActionPerformed
        if(rbRG.isSelected()){
            txtRG.setEnabled(true);
            txtCPF.setEnabled(false);
            txtRG.grabFocus();
            txtCPF.setText("");
        }else{
            txtRG.setEnabled(false);
        }
    }//GEN-LAST:event_rbRGActionPerformed

    private void btnProcurarPacienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnProcurarPacienteStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcurarPacienteStateChanged

    private void btnProcurarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarPacienteActionPerformed
        String txt1 = txtRG.getText();
        String txt2 = txtCPF.getText();
        if (rbRG.isSelected() && txt1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o RG !!!", "Erro", JOptionPane.WARNING_MESSAGE);
            txtRG.grabFocus();
        } else if (rbCPF.isSelected() && txt2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o CPF !!!", "Erro", JOptionPane.WARNING_MESSAGE);
            txtCPF.grabFocus();
        } else {
            if(rbRG.isSelected()){
                retornoRG = txtRG.getText();
            }
            if(rbCPF.isSelected()){
                retornoCPF = txtCPF.getText();
            }
            groupButton.clearSelection();
            txtRG.setText("");
            txtCPF.setText("");
            FormRealizarExame realizarExame = new FormRealizarExame();
            realizarExame.setLocationRelativeTo(null);
            realizarExame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnProcurarPacienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtRG.grabFocus();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormProcurarPaciente_Exame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProcurarPaciente_Exame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProcurarPaciente_Exame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProcurarPaciente_Exame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProcurarPaciente_Exame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcurarPaciente;
    private javax.swing.ButtonGroup groupButton;
    private javax.swing.JLabel labCPF;
    private javax.swing.JLabel labProcurarPacientePor;
    private javax.swing.JLabel labRG;
    private javax.swing.JPanel painel1;
    private javax.swing.JRadioButton rbCPF;
    private javax.swing.JRadioButton rbRG;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtRG;
    // End of variables declaration//GEN-END:variables
}
