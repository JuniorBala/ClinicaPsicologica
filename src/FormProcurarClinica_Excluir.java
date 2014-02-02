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

public class FormProcurarClinica_Excluir extends javax.swing.JFrame {
    static String retornoNome = null;
    static String retornoCNPJ = null;
    /**
     * Creates new form FormProcurarClinica_Excluir
     */
    public FormProcurarClinica_Excluir() {
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
        labNome = new javax.swing.JLabel();
        txtNomeClinica = new javax.swing.JTextField();
        labCNPJ = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        rbNome = new javax.swing.JRadioButton();
        rbCNPJ = new javax.swing.JRadioButton();
        labProcurarClinicaCredenciadaPor = new javax.swing.JLabel();
        btnProcurarClinica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Procurar Clínica Credenciada");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        painel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Clínica:"));

        labNome.setText("NOME DA CLÍNICA :");

        txtNomeClinica.setToolTipText("Inserir Nome da CLínica");
        txtNomeClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClinicaActionPerformed(evt);
            }
        });
        txtNomeClinica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeClinicaKeyTyped(evt);
            }
        });

        labCNPJ.setText("CNPJ :");

        txtCNPJ.setToolTipText("Inserir CNPJ");
        txtCNPJ.setEnabled(false);
        txtCNPJ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCNPJKeyTyped(evt);
            }
        });

        groupButton.add(rbNome);
        rbNome.setSelected(true);
        rbNome.setText("Nome");
        rbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNomeActionPerformed(evt);
            }
        });

        groupButton.add(rbCNPJ);
        rbCNPJ.setText("CNPJ");
        rbCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCNPJActionPerformed(evt);
            }
        });

        labProcurarClinicaCredenciadaPor.setText("Procurar Clínica Credenciada Por :");
        labProcurarClinicaCredenciadaPor.setToolTipText("");

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addComponent(rbNome)
                        .addGap(83, 83, 83)
                        .addComponent(rbCNPJ))
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addComponent(labNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addComponent(labCNPJ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labProcurarClinicaCredenciadaPor))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labProcurarClinicaCredenciadaPor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNome)
                    .addComponent(rbCNPJ))
                .addGap(18, 18, 18)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNome)
                    .addComponent(txtNomeClinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCNPJ)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnProcurarClinica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes_Site_5746_Knob_Valid_Blue.png"))); // NOI18N
        btnProcurarClinica.setText("Procurar Clínica");
        btnProcurarClinica.setToolTipText("Procurar Clínica");
        btnProcurarClinica.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnProcurarClinicaStateChanged(evt);
            }
        });
        btnProcurarClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarClinicaActionPerformed(evt);
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
                .addComponent(btnProcurarClinica)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProcurarClinica)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClinicaActionPerformed
        btnProcurarClinica.setEnabled(true);
    }//GEN-LAST:event_txtNomeClinicaActionPerformed

    private void txtCNPJKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCNPJKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        int x = 0;
        String CNPJ = txtCNPJ.getText();
        x = CNPJ.length();
        if(x == 18){
            evt.consume();
        }
    }//GEN-LAST:event_txtCNPJKeyTyped

    private void rbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNomeActionPerformed
        if(rbNome.isSelected()){
            txtNomeClinica.setEnabled(true);
            txtCNPJ.setEnabled(false);
            txtNomeClinica.grabFocus();
            txtCNPJ.setText("");
        }else{
            txtNomeClinica.setEnabled(false);
        }
    }//GEN-LAST:event_rbNomeActionPerformed

    private void rbCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCNPJActionPerformed
        if(rbCNPJ.isSelected()){
            txtCNPJ.setEnabled(true);
            txtNomeClinica.setEnabled(false);
            txtCNPJ.grabFocus();
            txtNomeClinica.setText("");
        }else{
            txtCNPJ.setEnabled(false);
        }
    }//GEN-LAST:event_rbCNPJActionPerformed

    private void btnProcurarClinicaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnProcurarClinicaStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcurarClinicaStateChanged

    private void btnProcurarClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarClinicaActionPerformed
        String txt1 = txtNomeClinica.getText();
        String txt2 = txtCNPJ.getText();
        if (rbNome.isSelected() && txt1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o NOME DA CLÍNICA !!!", "Erro", JOptionPane.WARNING_MESSAGE);
            txtNomeClinica.grabFocus();
        } else if (rbCNPJ.isSelected() && txt2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o CNPJ !!!", "Erro", JOptionPane.WARNING_MESSAGE);
            txtCNPJ.grabFocus();
        } else {
            if(rbNome.isSelected()){
                retornoNome = txtNomeClinica.getText();
            }
            if(rbCNPJ.isSelected()){
                retornoCNPJ = txtCNPJ.getText();
            }
            groupButton.clearSelection();
            txtNomeClinica.setText("");
            txtCNPJ.setText("");
            FormExcluirClinica excluirClinica = new FormExcluirClinica();
            excluirClinica.setLocationRelativeTo(null);
            excluirClinica.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnProcurarClinicaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtNomeClinica.grabFocus();
    }//GEN-LAST:event_formWindowOpened

    private void txtNomeClinicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeClinicaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)){
            if(!Character.isWhitespace(c)){
                evt.consume();
            }
        }
        int x = 0;
        String nome = txtNomeClinica.getText();
        x = nome.length();
        if(x == 45){
            evt.consume();
        }
    }//GEN-LAST:event_txtNomeClinicaKeyTyped

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
            java.util.logging.Logger.getLogger(FormProcurarClinica_Excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProcurarClinica_Excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProcurarClinica_Excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProcurarClinica_Excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProcurarClinica_Excluir().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcurarClinica;
    private javax.swing.ButtonGroup groupButton;
    private javax.swing.JLabel labCNPJ;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labProcurarClinicaCredenciadaPor;
    private javax.swing.JPanel painel1;
    private javax.swing.JRadioButton rbCNPJ;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtNomeClinica;
    // End of variables declaration//GEN-END:variables
}
