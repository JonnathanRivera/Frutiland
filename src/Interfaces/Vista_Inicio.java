/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JButton;

/**
 *
 * @author Dominguez
 */
public class Vista_Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Inicio
     */
    public Vista_Inicio() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnUsuario1 = new javax.swing.JButton();
        btnUsuario2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        jPanel2.setOpaque(false);

        btnUsuario1.setBackground(new java.awt.Color(255, 255, 255));
        btnUsuario1.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        btnUsuario1.setForeground(new java.awt.Color(0, 0, 51));
        btnUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/user.png"))); // NOI18N
        btnUsuario1.setText("USUARIO 1");
        btnUsuario1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUsuario1.setFocusPainted(false);
        btnUsuario1.setOpaque(false);
        btnUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuario1ActionPerformed(evt);
            }
        });

        btnUsuario2.setBackground(new java.awt.Color(255, 255, 255));
        btnUsuario2.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        btnUsuario2.setForeground(new java.awt.Color(0, 0, 51));
        btnUsuario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBotones/user.png"))); // NOI18N
        btnUsuario2.setText("USUARIO 2");
        btnUsuario2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUsuario2.setFocusPainted(false);
        btnUsuario2.setOpaque(false);
        btnUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuario2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECIONE EL USUARIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 360, 240));

        jlabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotosFondo/ima4.jpg"))); // NOI18N
        jPanel1.add(jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuario1ActionPerformed

    private void btnUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuario2ActionPerformed

    public JButton getBtnUsuario1() {
        return btnUsuario1;
    }

    public void setBtnUsuario1(JButton btnUsuario1) {
        this.btnUsuario1 = btnUsuario1;
    }

    public JButton getBtnUsuario2() {
        return btnUsuario2;
    }

    public void setBtnUsuario2(JButton btnUsuario2) {
        this.btnUsuario2 = btnUsuario2;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuario1;
    private javax.swing.JButton btnUsuario2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlabel;
    // End of variables declaration//GEN-END:variables
}
