package software;

import java.awt.Color;

/**
 *
 * @author Jhonatan Romero
 */
public class SalidaDecifrado extends javax.swing.JFrame {

    /**
     * Creates new form SalidaEncriptado
     */
    Fuentes tipoFuente;
    public SalidaDecifrado() {
        initComponents();
        tipoFuente = new Fuentes();
        this.setLocationRelativeTo(null);
        morse.setText(Descifrar.enmorse);
        encriptado.setText(Descifrar.traducido.toUpperCase());
        original.setText(Descifrar.decifrado.toUpperCase());
        jLabel2.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 38));
        jLabel1.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 24));
        jLabel3.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 24));
        jLabel4.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 24));
        morse.setFont(tipoFuente.fuente(tipoFuente.RM, 0, 48));
        encriptado.setFont(tipoFuente.fuente(tipoFuente.RM, 0, 48));
        original.setFont(tipoFuente.fuente(tipoFuente.RM, 0, 48));
        regresar.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 18));
        salirX.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 24));
        SalirBoton.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 18));
        Menu.valmus =1;
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
        salirX = new javax.swing.JLabel();
        SalirBoton = new javax.swing.JLabel();
        regresar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        encriptado = new javax.swing.JLabel();
        original = new javax.swing.JLabel();
        morse = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        barrasup = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirX.setBackground(new java.awt.Color(0, 18, 43));
        salirX.setFont(new java.awt.Font("Positive System", 0, 24)); // NOI18N
        salirX.setForeground(new java.awt.Color(51, 153, 255));
        salirX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salirX.setText("X");
        salirX.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        salirX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirX.setOpaque(true);
        salirX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirXMouseExited(evt);
            }
        });
        jPanel1.add(salirX, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 50, 40));

        SalirBoton.setFont(new java.awt.Font("Positive System", 0, 18)); // NOI18N
        SalirBoton.setForeground(new java.awt.Color(102, 153, 255));
        SalirBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalirBoton.setText("SALIR");
        SalirBoton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 204, 204), null, new java.awt.Color(0, 204, 204)));
        SalirBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalirBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirBotonMouseExited(evt);
            }
        });
        jPanel1.add(SalirBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 130, 50));

        regresar.setFont(new java.awt.Font("Positive System", 0, 18)); // NOI18N
        regresar.setForeground(new java.awt.Color(102, 153, 255));
        regresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regresar.setText("REGRESAR");
        regresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 204, 204), null, new java.awt.Color(0, 204, 204)));
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regresarMouseExited(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 130, 50));

        jLabel1.setFont(new java.awt.Font("Positive System", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENCRIPTADO en morse");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 760, 60));

        encriptado.setFont(new java.awt.Font("RM Typerighter", 0, 48)); // NOI18N
        encriptado.setForeground(new java.awt.Color(153, 153, 255));
        encriptado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(encriptado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 760, 50));

        original.setFont(new java.awt.Font("RM Typerighter", 0, 48)); // NOI18N
        original.setForeground(new java.awt.Color(153, 204, 255));
        original.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        original.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(original, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 760, 50));

        morse.setFont(new java.awt.Font("RM Typerighter", 0, 48)); // NOI18N
        morse.setForeground(new java.awt.Color(0, 255, 255));
        morse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(morse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 760, 50));

        jLabel3.setFont(new java.awt.Font("Positive System", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 204, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Texto DECIFRADO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 760, 60));

        jLabel4.setFont(new java.awt.Font("Positive System", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Texto TRADUCIDO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 760, 60));

        jLabel2.setFont(new java.awt.Font("Positive System", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DECIFRADO!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 760, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Blue Futuristic Technology Pitch Deck Presentation (2).png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        barrasup.setBackground(new java.awt.Color(204, 204, 204));
        barrasup.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barrasupMouseDragged(evt);
            }
        });
        barrasup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barrasupMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barrasupLayout = new javax.swing.GroupLayout(barrasup);
        barrasup.setLayout(barrasupLayout);
        barrasupLayout.setHorizontalGroup(
            barrasupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barrasupLayout.setVerticalGroup(
            barrasupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(barrasup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int x, y;
    private void barrasupMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barrasupMouseDragged
        int Xmouse = evt.getXOnScreen();
        int Ymouse = evt.getYOnScreen();
        this.setLocation(Xmouse - x, Ymouse - y);
    }//GEN-LAST:event_barrasupMouseDragged

    private void barrasupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barrasupMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_barrasupMousePressed

    private void salirXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirXMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirXMouseClicked

    private void salirXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirXMouseEntered
        salirX.setForeground(Color.red);
    }//GEN-LAST:event_salirXMouseEntered

    private void salirXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirXMouseExited
        salirX.setForeground(new Color(51, 153, 255));
    }//GEN-LAST:event_salirXMouseExited

    private void regresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseEntered
        regresar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_regresarMouseEntered

    private void SalirBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirBotonMouseEntered
        SalirBoton.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_SalirBotonMouseEntered

    private void regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseClicked
        Menu mostrar = new Menu();
        mostrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarMouseClicked


    private void regresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseExited
        regresar.setForeground(new Color(102, 153, 255));
    }//GEN-LAST:event_regresarMouseExited

    private void SalirBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirBotonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirBotonMouseClicked

    private void SalirBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirBotonMouseExited
        SalirBoton.setForeground(new Color(102, 153, 255));
    }//GEN-LAST:event_SalirBotonMouseExited

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
            java.util.logging.Logger.getLogger(SalidaDecifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalidaDecifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalidaDecifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalidaDecifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalidaDecifrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SalirBoton;
    private javax.swing.JPanel barrasup;
    private javax.swing.JLabel encriptado;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel morse;
    private javax.swing.JLabel original;
    private javax.swing.JLabel regresar;
    private javax.swing.JLabel salirX;
    // End of variables declaration//GEN-END:variables
}