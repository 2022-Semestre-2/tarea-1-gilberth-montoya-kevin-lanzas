/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.CPUController;
import Backend.FileContentHandler;
import Models.Instruction;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author jimon
 */
public class main_Activity extends javax.swing.JFrame {
    
    
    private CPUController CPU;
    /**
     * Creates new form main_Activity
     */
    public main_Activity() {
        initComponents();
        
        textfieldMemorySize.setForeground(new Color(153,153,153));
        CPU = new CPUController(getPanelComponents());
        btnUploadFile.setEnabled(false);
        btnExecute.setEnabled(false);
        btnClean.setEnabled(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jContentList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jCPUContentTable = new javax.swing.JTable();
        btnClean = new javax.swing.JButton();
        textfieldMemorySize = new javax.swing.JTextField();
        jpanelRegister = new javax.swing.JPanel();
        lblPC = new javax.swing.JLabel();
        lblIR = new javax.swing.JLabel();
        lblAC = new javax.swing.JLabel();
        lblAX = new javax.swing.JLabel();
        lblBX = new javax.swing.JLabel();
        lblCX = new javax.swing.JLabel();
        lblDX = new javax.swing.JLabel();
        textPC = new javax.swing.JTextField();
        textIR = new javax.swing.JTextField();
        textAC = new javax.swing.JTextField();
        textAX = new javax.swing.JTextField();
        textBX = new javax.swing.JTextField();
        textCX = new javax.swing.JTextField();
        textDX = new javax.swing.JTextField();
        btnEnterMemorySize = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnExecute = new javax.swing.JButton();
        btnUploadFile = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jContentList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jContentList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 198, 131, 361));

        jCPUContentTable.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCPUContentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PC", "CODIGO BINARIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jCPUContentTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 198, 590, 361));

        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramImages/clean.png"))); // NOI18N
        btnClean.setText("Clean");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });
        getContentPane().add(btnClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 95, 100, 50));

        textfieldMemorySize.setText("Enter memory size");
        textfieldMemorySize.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldMemorySizeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfieldMemorySizeFocusLost(evt);
            }
        });
        textfieldMemorySize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldMemorySizeActionPerformed(evt);
            }
        });
        textfieldMemorySize.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldMemorySizeKeyTyped(evt);
            }
        });
        getContentPane().add(textfieldMemorySize, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 27, 153, 38));

        jpanelRegister.setBackground(new java.awt.Color(204, 255, 255));
        jpanelRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelRegister.setForeground(new java.awt.Color(255, 255, 255));

        lblPC.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblPC.setForeground(new java.awt.Color(0, 0, 0));
        lblPC.setText("PC:");

        lblIR.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblIR.setForeground(new java.awt.Color(0, 0, 0));
        lblIR.setText("IR:");

        lblAC.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblAC.setForeground(new java.awt.Color(0, 0, 0));
        lblAC.setText("AC:");

        lblAX.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblAX.setForeground(new java.awt.Color(0, 0, 0));
        lblAX.setText("AX:");

        lblBX.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblBX.setForeground(new java.awt.Color(0, 0, 0));
        lblBX.setText("BX:");

        lblCX.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblCX.setForeground(new java.awt.Color(0, 0, 0));
        lblCX.setText("CX:");

        lblDX.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblDX.setForeground(new java.awt.Color(0, 0, 0));
        lblDX.setText("DX:");

        textPC.setEditable(false);
        textPC.setBackground(new java.awt.Color(204, 255, 255));
        textPC.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textPC.setForeground(new java.awt.Color(0, 0, 0));
        textPC.setText("         ");
        textPC.setBorder(null);
        textPC.setFocusable(false);

        textIR.setEditable(false);
        textIR.setBackground(new java.awt.Color(204, 255, 255));
        textIR.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textIR.setText("    ");
        textIR.setBorder(null);
        textIR.setFocusable(false);

        textAC.setEditable(false);
        textAC.setBackground(new java.awt.Color(204, 255, 255));
        textAC.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textAC.setText("   ");
        textAC.setBorder(null);
        textAC.setFocusable(false);

        textAX.setEditable(false);
        textAX.setBackground(new java.awt.Color(204, 255, 255));
        textAX.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textAX.setForeground(new java.awt.Color(0, 0, 0));
        textAX.setText("      ");
        textAX.setBorder(null);
        textAX.setFocusable(false);

        textBX.setEditable(false);
        textBX.setBackground(new java.awt.Color(204, 255, 255));
        textBX.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textBX.setForeground(new java.awt.Color(0, 0, 0));
        textBX.setText("    ");
        textBX.setBorder(null);
        textBX.setFocusable(false);

        textCX.setEditable(false);
        textCX.setBackground(new java.awt.Color(204, 255, 255));
        textCX.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textCX.setText("     ");
        textCX.setBorder(null);
        textCX.setFocusable(false);

        textDX.setEditable(false);
        textDX.setBackground(new java.awt.Color(204, 255, 255));
        textDX.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textDX.setText("     ");
        textDX.setBorder(null);
        textDX.setFocusable(false);

        javax.swing.GroupLayout jpanelRegisterLayout = new javax.swing.GroupLayout(jpanelRegister);
        jpanelRegister.setLayout(jpanelRegisterLayout);
        jpanelRegisterLayout.setHorizontalGroup(
            jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRegisterLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jpanelRegisterLayout.createSequentialGroup()
                            .addComponent(lblPC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpanelRegisterLayout.createSequentialGroup()
                            .addComponent(lblAC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpanelRegisterLayout.createSequentialGroup()
                        .addComponent(lblIR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textIR, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRegisterLayout.createSequentialGroup()
                        .addComponent(lblDX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textDX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelRegisterLayout.createSequentialGroup()
                        .addComponent(lblCX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textCX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelRegisterLayout.createSequentialGroup()
                        .addComponent(lblBX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelRegisterLayout.createSequentialGroup()
                        .addComponent(lblAX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jpanelRegisterLayout.setVerticalGroup(
            jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRegisterLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPC)
                    .addComponent(lblAX)
                    .addComponent(textPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIR)
                    .addComponent(lblBX)
                    .addComponent(textIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAC)
                    .addComponent(lblCX)
                    .addComponent(textAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDX)
                    .addComponent(textDX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpanelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 6, 300, -1));

        btnEnterMemorySize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramImages/memory.png"))); // NOI18N
        btnEnterMemorySize.setText("Enter");
        btnEnterMemorySize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterMemorySizeActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnterMemorySize, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 27, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        btnExecute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramImages/play.png"))); // NOI18N
        btnExecute.setText("Execute");
        btnExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecuteActionPerformed(evt);
            }
        });

        btnUploadFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramImages/upload_file.png"))); // NOI18N
        btnUploadFile.setText("Upload file");
        btnUploadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadFileActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramImages/delete.png"))); // NOI18N
        jButton1.setText("Exit");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Instructions");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnUploadFile))
                .addGap(18, 18, 18)
                .addComponent(btnExecute)
                .addContainerGap(585, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUploadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExecute, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(375, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadFileActionPerformed
        
         JFileChooser chooser = new JFileChooser();
         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.ASM","ASM");
         chooser.setFileFilter(filter);
         int selection = chooser.showOpenDialog(this);
         if(selection == JFileChooser.APPROVE_OPTION){
             File archivo = chooser.getSelectedFile();
             String filename = archivo.getAbsolutePath();
             try {
                 if(CPU.loadInstructions(filename, jContentList,jCPUContentTable)){
                     btnExecute.setEnabled(true);
                     btnClean.setEnabled(true);
                     CPU.executeInstruction();
                 } else{
                     JOptionPane.showMessageDialog(this, "The available memory is not enough to load the program", "Insufficient space", JOptionPane.ERROR_MESSAGE);
                     btnClean.setEnabled(true);
                 }
                 
             } catch (IOException ex) {
                 Logger.getLogger(main_Activity.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }//GEN-LAST:event_btnUploadFileActionPerformed

    private void textfieldMemorySizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldMemorySizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldMemorySizeActionPerformed

    private void textfieldMemorySizeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldMemorySizeFocusGained
        if (textfieldMemorySize.getText().equals("Enter memory size")){
            textfieldMemorySize.setText("");
            textfieldMemorySize.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_textfieldMemorySizeFocusGained

    private void textfieldMemorySizeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldMemorySizeFocusLost
         if (textfieldMemorySize.getText().equals("")){
            textfieldMemorySize.setText("Enter memory size");
            textfieldMemorySize.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_textfieldMemorySizeFocusLost

    private void textfieldMemorySizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldMemorySizeKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_textfieldMemorySizeKeyTyped

    private void btnEnterMemorySizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterMemorySizeActionPerformed
        String memorySizeString = textfieldMemorySize.getText();
        
        if(!memorySizeString.equals("Enter memory size")){
            int memorySizeNumber= Integer.parseInt(memorySizeString);
            if(memorySizeNumber>9){
                CPU.setMemorySize(memorySizeNumber);
                btnUploadFile.setEnabled(true);
                JOptionPane.showMessageDialog(this, "The memory has been generated with a size of "+memorySizeString, "Valid value", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "The entered value must be greater than 10", "Invalid value", JOptionPane.ERROR_MESSAGE);
            }
        }else{JOptionPane.showMessageDialog(this, "The entered value cannot be empty", "Invalid value", JOptionPane.ERROR_MESSAGE);}
      
        
    }//GEN-LAST:event_btnEnterMemorySizeActionPerformed

    private void btnExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecuteActionPerformed
        CPU.executeInstruction();
    }//GEN-LAST:event_btnExecuteActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        this.dispose();
        main_Activity newFrame = new main_Activity();
        newFrame.setVisible(true);
    }//GEN-LAST:event_btnCleanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private ArrayList<JTextField> getPanelComponents(){
        ArrayList<JTextField> list = new ArrayList<JTextField>();
        Component[] components = jpanelRegister.getComponents();
        for (Component component : components) {
            if (component.getClass().equals(JTextField.class)) {
                list.add((JTextField)component);
            }
        }
        return list;
    }
    
    
    
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
            java.util.logging.Logger.getLogger(main_Activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_Activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_Activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_Activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_Activity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnEnterMemorySize;
    private javax.swing.JButton btnExecute;
    private javax.swing.JButton btnUploadFile;
    private javax.swing.JButton jButton1;
    private javax.swing.JTable jCPUContentTable;
    private javax.swing.JList<String> jContentList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpanelRegister;
    private javax.swing.JLabel lblAC;
    private javax.swing.JLabel lblAX;
    private javax.swing.JLabel lblBX;
    private javax.swing.JLabel lblCX;
    private javax.swing.JLabel lblDX;
    private javax.swing.JLabel lblIR;
    private javax.swing.JLabel lblPC;
    private javax.swing.JTextField textAC;
    private javax.swing.JTextField textAX;
    private javax.swing.JTextField textBX;
    private javax.swing.JTextField textCX;
    private javax.swing.JTextField textDX;
    private javax.swing.JTextField textIR;
    private javax.swing.JTextField textPC;
    private javax.swing.JTextField textfieldMemorySize;
    // End of variables declaration//GEN-END:variables
}
