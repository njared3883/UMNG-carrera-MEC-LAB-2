package carrera;

import javax.swing.JLabel;

public class pista extends javax.swing.JFrame {

    public pista() {
        initComponents();
    }
    public JLabel getcarro1(){
        return carro1;
    }
    public JLabel getcarro2(){
        return carro2;
    }
    public JLabel getcarro3(){
        return carro3;
    }
    public JLabel getcarro4(){
        return carro4;
    }
    public JLabel getcarro5(){
        return carro5;
    }
    public JLabel getcarro6(){
        return carro6;
    }
    public JLabel getcarro7(){
        return carro7;
    }
    public JLabel getcarro8(){
        return carro8;
    }
    public JLabel getcarro9(){
        return carro9;
    }
    public JLabel getcarro10(){
        return carro10;
    }
    public JLabel getllegada(){
        return llegada;
    }
    public JLabel getcarla(){
        return carla;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        carro1 = new javax.swing.JLabel();
        carro2 = new javax.swing.JLabel();
        carro3 = new javax.swing.JLabel();
        carro4 = new javax.swing.JLabel();
        carro5 = new javax.swing.JLabel();
        carro6 = new javax.swing.JLabel();
        carro7 = new javax.swing.JLabel();
        carro8 = new javax.swing.JLabel();
        carro9 = new javax.swing.JLabel();
        carro10 = new javax.swing.JLabel();
        llegada = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        apuesta = new javax.swing.JButton();
        numero = new javax.swing.JTextField();
        carla = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 51, 0));
        jPanel1.setDoubleBuffered(false);
        jPanel1.setEnabled(false);
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setInheritsPopupMenu(true);

        carro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrera/IMG_9154.PNG"))); // NOI18N

        carro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrera/IMG_9154.PNG"))); // NOI18N

        carro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrera/IMG_9154.PNG"))); // NOI18N

        carro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrera/IMG_9154.PNG"))); // NOI18N

        carro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrera/IMG_9154.PNG"))); // NOI18N

        carro6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrera/IMG_9154.PNG"))); // NOI18N

        carro7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrera/IMG_9154.PNG"))); // NOI18N

        carro8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrera/IMG_9154.PNG"))); // NOI18N

        carro9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrera/IMG_9154.PNG"))); // NOI18N

        carro10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrera/IMG_9154.PNG"))); // NOI18N

        llegada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carro2)
                    .addComponent(carro3)
                    .addComponent(carro4)
                    .addComponent(carro5)
                    .addComponent(carro7)
                    .addComponent(carro8)
                    .addComponent(carro9)
                    .addComponent(carro10)
                    .addComponent(carro6)
                    .addComponent(carro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 583, Short.MAX_VALUE)
                .addComponent(llegada)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(llegada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(carro1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carro2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carro3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carro4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carro5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carro6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carro7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carro8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carro9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carro10)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 720, 850));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrera/you.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, 100));

        inicio.setText("Inicio de la carrera.");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        getContentPane().add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 347, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Apuesta por el carro vencedor.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 347, 27));

        apuesta.setText("ACCEPTAR");
        apuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apuestaActionPerformed(evt);
            }
        });
        getContentPane().add(apuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 347, -1));

        numero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        numero.setPreferredSize(new java.awt.Dimension(2, 20));
        getContentPane().add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 347, -1));

        carla.setBackground(new java.awt.Color(255, 255, 255));
        carla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carla.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        getContentPane().add(carla, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 347, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("APUESTA VIGENTE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, 347, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrera/444.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 460, 500));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrera/IMG_9162.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        carro1.setLocation(0, carro1.getLocation().y);
        carro2.setLocation(0, carro2.getLocation().y);
        carro3.setLocation(0, carro3.getLocation().y);
        carro4.setLocation(0, carro4.getLocation().y);
        carro5.setLocation(0, carro5.getLocation().y);
        carro6.setLocation(0, carro6.getLocation().y);
        carro7.setLocation(0, carro7.getLocation().y);
        carro8.setLocation(0, carro8.getLocation().y);
        carro9.setLocation(0, carro9.getLocation().y);
        carro10.setLocation(0, carro10.getLocation().y);
        competencia hilo1 = new competencia (carro1, this);
        competencia hilo2 = new competencia (carro2, this);
        competencia hilo3 = new competencia (carro3, this);
        competencia hilo4 = new competencia (carro4, this);
        competencia hilo5 = new competencia (carro5, this);
        competencia hilo6 = new competencia (carro6, this);
        competencia hilo7 = new competencia (carro7, this);
        competencia hilo8 = new competencia (carro8, this);
        competencia hilo9 = new competencia (carro9, this);
        competencia hilo10 = new competencia (carro10, this);
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        hilo7.start();
        hilo8.start();
        hilo9.start();
        hilo10.start();
    }//GEN-LAST:event_inicioActionPerformed

    private void apuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apuestaActionPerformed
        float luisa;
        luisa = Float.parseFloat(numero.getText());
        carla.setText(Float.toString(luisa));
    }//GEN-LAST:event_apuestaActionPerformed

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
            java.util.logging.Logger.getLogger(pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apuesta;
    private javax.swing.JLabel carla;
    private javax.swing.JLabel carro1;
    private javax.swing.JLabel carro10;
    private javax.swing.JLabel carro2;
    private javax.swing.JLabel carro3;
    private javax.swing.JLabel carro4;
    private javax.swing.JLabel carro5;
    private javax.swing.JLabel carro6;
    private javax.swing.JLabel carro7;
    private javax.swing.JLabel carro8;
    private javax.swing.JLabel carro9;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel llegada;
    private javax.swing.JTextField numero;
    // End of variables declaration//GEN-END:variables

    private String Float(float luisa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
