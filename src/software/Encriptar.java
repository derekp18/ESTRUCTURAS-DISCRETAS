package software;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhonatan Romero
 */
public class Encriptar extends javax.swing.JFrame {

    /**
     * Creates new form Encriptar
     */
    Fuentes tipoFuente;

    public Encriptar() {
        initComponents();
        tipoFuente = new Fuentes();
        this.setLocationRelativeTo(null);
        VinegereTextoInput.setBackground(new Color(0, 0, 0, 0));
        VigenereClaveInput.setBackground(new Color(0, 0, 0, 0));
        CesarTextoInput.setBackground(new Color(0, 0, 0, 0));
        CesarPosInput.setBackground(new Color(0, 0, 0, 0));
        mensaje.setVisible(false);
        mensaje1.setVisible(false);
        mensaje2.setVisible(false);
        BotonEnviar.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 24));
        jLabel3.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 24));
        salir.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 24));
        jLabel10.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 36));
        vigenere.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 18));
        cesar.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 18));
        jLabel8.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 24));
        mensaje1.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 18));
        mensaje2.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 18));
        jLabel2.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 24));
        jLabel7.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 24));
        jLabel4.setFont(tipoFuente.fuente(tipoFuente.RM, 0, 32));
        jLabel13.setFont(tipoFuente.fuente(tipoFuente.RM, 0, 32));
        jLabel11.setFont(tipoFuente.fuente(tipoFuente.RM, 0, 32));
        jLabel15.setFont(tipoFuente.fuente(tipoFuente.RM, 0, 32));
        jPanel1.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 24));
        VigenereClaveInput.setFont(tipoFuente.fuente(tipoFuente.RM, 0, 32));
        VinegereTextoInput.setFont(tipoFuente.fuente(tipoFuente.RM, 0, 32));
        CesarPosInput.setFont(tipoFuente.fuente(tipoFuente.RM, 0, 32));
        CesarTextoInput.setFont(tipoFuente.fuente(tipoFuente.RM, 0, 32));
        Menu.valmus =1;
    }

    public static String Texto;
    public static String Encritado;
    public static String[] dejenere = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        metodo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        salir = new javax.swing.JLabel();
        mensaje2 = new javax.swing.JLabel();
        mensaje1 = new javax.swing.JLabel();
        foquito = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        vigenere = new javax.swing.JRadioButton();
        cesar = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CesarTextoInput = new javax.swing.JTextField();
        CesarPosInput = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonEnviar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        VinegereTextoInput = new javax.swing.JTextField();
        VigenereClaveInput = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        barrasup = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(0, 18, 43));
        salir.setFont(new java.awt.Font("Positive System", 0, 24)); // NOI18N
        salir.setForeground(new java.awt.Color(51, 153, 255));
        salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir.setText("X");
        salir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        salir.setOpaque(true);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 50, 40));

        mensaje2.setFont(new java.awt.Font("Positive System", 0, 18)); // NOI18N
        mensaje2.setForeground(new java.awt.Color(102, 153, 255));
        mensaje2.setText("NUMEROS NEGATIVOS");
        jPanel1.add(mensaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 220, 30));

        mensaje1.setFont(new java.awt.Font("Positive System", 0, 18)); // NOI18N
        mensaje1.setForeground(new java.awt.Color(102, 153, 255));
        mensaje1.setText("Usa el guión (-) para los");
        jPanel1.add(mensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 250, 40));

        foquito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foquito.png"))); // NOI18N
        foquito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        foquito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                foquitoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                foquitoMouseExited(evt);
            }
        });
        jPanel1.add(foquito, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, -1, -1));

        mensaje.setBackground(new java.awt.Color(255, 255, 255));
        mensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nube.png"))); // NOI18N
        jPanel1.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 430, 240));

        jLabel13.setFont(new java.awt.Font("RM Typerighter", 0, 32)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 255));
        jLabel13.setText("PALABRA A ENCRIPAR:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 370, 30));

        jLabel11.setFont(new java.awt.Font("RM Typerighter", 0, 32)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 255));
        jLabel11.setText("POSICIONES A MOVER:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 370, 30));

        metodo.add(vigenere);
        vigenere.setFont(new java.awt.Font("Positive System", 0, 18)); // NOI18N
        vigenere.setForeground(new java.awt.Color(153, 153, 255));
        vigenere.setText("VIGENERE");
        vigenere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vigenereActionPerformed(evt);
            }
        });
        jPanel1.add(vigenere, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, 30));

        metodo.add(cesar);
        cesar.setFont(new java.awt.Font("Positive System", 0, 18)); // NOI18N
        cesar.setForeground(new java.awt.Color(153, 255, 255));
        cesar.setText("CESAR");
        jPanel1.add(cesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, 30));

        jLabel10.setFont(new java.awt.Font("Positive System", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ENCRIPTACIÓN");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 750, -1));

        jLabel15.setFont(new java.awt.Font("RM Typerighter", 0, 32)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 255, 255));
        jLabel15.setText("CLAVE A USAR:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 370, 30));

        CesarTextoInput.setFont(new java.awt.Font("RM Typerighter", 0, 32)); // NOI18N
        CesarTextoInput.setForeground(new java.awt.Color(204, 255, 255));
        CesarTextoInput.setBorder(null);
        CesarTextoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CesarTextoInputActionPerformed(evt);
            }
        });
        CesarTextoInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CesarTextoInputKeyTyped(evt);
            }
        });
        jPanel1.add(CesarTextoInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 360, 30));

        CesarPosInput.setFont(new java.awt.Font("RM Typerighter", 0, 32)); // NOI18N
        CesarPosInput.setForeground(new java.awt.Color(204, 255, 255));
        CesarPosInput.setBorder(null);
        CesarPosInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CesarPosInputKeyTyped(evt);
            }
        });
        jPanel1.add(CesarPosInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 340, 30));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("_________________________________________________");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 370, 30));

        jLabel7.setFont(new java.awt.Font("Positive System", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 255));
        jLabel7.setText("CESAR");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 230, 30));

        jLabel2.setFont(new java.awt.Font("Positive System", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("POSICIONES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 330, 30));

        BotonEnviar.setFont(new java.awt.Font("Positive System", 0, 24)); // NOI18N
        BotonEnviar.setForeground(new java.awt.Color(204, 255, 255));
        BotonEnviar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonEnviar.setText("Encriptar");
        BotonEnviar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 204, 255), new java.awt.Color(204, 204, 204)));
        BotonEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEnviarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonEnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonEnviarMouseExited(evt);
            }
        });
        jPanel1.add(BotonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 150, 40));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("_________________________________________________");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 370, 30));

        jLabel8.setFont(new java.awt.Font("Positive System", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("VIgEnÉRE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 320, 30));

        VinegereTextoInput.setFont(new java.awt.Font("RM Typerighter", 0, 32)); // NOI18N
        VinegereTextoInput.setForeground(new java.awt.Color(204, 255, 255));
        VinegereTextoInput.setBorder(null);
        VinegereTextoInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                VinegereTextoInputKeyTyped(evt);
            }
        });
        jPanel1.add(VinegereTextoInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 360, 30));

        VigenereClaveInput.setFont(new java.awt.Font("RM Typerighter", 0, 32)); // NOI18N
        VigenereClaveInput.setForeground(new java.awt.Color(204, 255, 255));
        VigenereClaveInput.setBorder(null);
        VigenereClaveInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                VigenereClaveInputKeyTyped(evt);
            }
        });
        jPanel1.add(VigenereClaveInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 330, 30));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("_________________________________________________");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 370, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("_________________________________________________");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 370, 30));

        jLabel3.setFont(new java.awt.Font("Positive System", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CLAVE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 330, 30));

        jLabel4.setFont(new java.awt.Font("RM Typerighter", 0, 32)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("PALABRA A ENCRIPAR:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 370, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Blue Futuristic Technology Pitch Deck Presentation (1).png"))); // NOI18N
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
    private void BotonEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEnviarMouseClicked
        Menu.valmus =1;
        String VigenereTexto, VigenereClave, EncriptadoVigenere = "", pc = "", EncriptadoCesar = "", CesarTexto, CesarPos;
        VigenereTexto = VinegereTextoInput.getText();
        VigenereClave = VigenereClaveInput.getText();
        CesarTexto = CesarTextoInput.getText();
        CesarPos = CesarPosInput.getText();
        if (cesar.isSelected() && vigenere.isSelected()) {
            JOptionPane.showMessageDialog(null, "NINGÚN METODO HA SIDO SELECCIONADO", "ERROR", JOptionPane.ERROR_MESSAGE, null);
        } else {
            if (vigenere.isSelected()) {
                if (VigenereTexto.length() == 0 || VigenereClave.length() == 0) {
                    error.mensaje = "FALTAN DATOS POR LLENAR.";
                    error mostrar = new error();
                    mostrar.setVisible(true);
                } else {
                    int j = 0;
                    if (VigenereClave.length() < VigenereTexto.length()) {
                        for (int i = 0; i < VigenereTexto.length(); i++) {
                            if (VigenereTexto.substring(i, i + 1).equals(" ")) {
                                EncriptadoVigenere = EncriptadoVigenere.concat(" ");
                            } else {
                                EncriptadoVigenere = EncriptadoVigenere.concat(VigenereClave.substring(j, j + 1));
                                j++;
                                if (j == VigenereClave.length()) {
                                    j = 0;
                                }
                            }
                        }
                        VigenereTexto = VigenereTexto.toUpperCase();
                        EncriptadoVigenere = EncriptadoVigenere.toUpperCase();
                        clave(dejenere, VigenereTexto, EncriptadoVigenere, 26, pc);
                        Texto = VigenereTexto;
                        SalidaEncriptado mostra = new SalidaEncriptado();
                        mostra.setVisible(true);
                        this.setVisible(false);

                    } else {
                        if (VigenereClave.length() == VigenereTexto.length()) {
                            VigenereTexto = VigenereTexto.toUpperCase();
                            EncriptadoVigenere = VigenereClave.toUpperCase();
                            clave(dejenere, VigenereTexto, EncriptadoVigenere, 26, pc);
                            Texto = VigenereTexto;
                            SalidaEncriptado mostra = new SalidaEncriptado();
                            mostra.setVisible(true);
                            this.setVisible(false);

                        } else {
                            error.mensaje = "LA CLAVE ES MAS LARGA QUE EL TEXTO.";
                            error mostrar = new error();
                            mostrar.setVisible(true);
                        }
                    }
                }
            } else {
                if (cesar.isSelected()) {
                    if (CesarTexto.length() == 0 || CesarPos.length() == 0) {
                        error.mensaje = "FALTAN DATOS POR LLENAR.";
                        error mostrar = new error();
                        mostrar.setVisible(true);
                    } else {
                        char[] m = new char[100];
                        String p;
                        int cant, i, pos = 0, cambio;
                        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
                        String[] palabra = new String[100];
                        String[] palabraEncriptada = new String[100];
                        cambio = Integer.parseInt(CesarPos);
                        p = CesarTexto;
                        cant = p.length();
                        for (i = 0; i < cant; i++) {
                            palabra[i] = p.substring(i, i + 1);
                            for (int j = 0; j < letras.length; j++) {
                                if (palabra[i].equals(" ")) {
                                    EncriptadoCesar = EncriptadoCesar + " ";
                                    palabraEncriptada[i] = " ";
                                    break;
                                } else {
                                    if (palabra[i].equals(letras[j])) {
                                        if (j + cambio > 0) {
                                            pos = (j + cambio) % (letras.length);
                                        } else {
                                            pos = (j + cambio + 26) % (letras.length);
                                        }
                                        palabraEncriptada[i] = letras[pos];
                                        break;
                                    }
                                }
                            }
                            EncriptadoCesar = EncriptadoCesar + palabraEncriptada[i];
                        }
                        Texto = CesarTexto;
                        Encritado = EncriptadoCesar;

                        SalidaEncriptado mostra = new SalidaEncriptado();
                        mostra.setVisible(true);
                        this.setVisible(false);
                    }
                } else {
                    error.mensaje = "NINGÚN METODO HA SIDO \nSELECCIONADO.";
                    error mostrar = new error();
                    mostrar.setVisible(true);

                }
            }
        }


    }//GEN-LAST:event_BotonEnviarMouseClicked

    private void barrasupMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barrasupMouseDragged
        int Xmouse = evt.getXOnScreen();
        int Ymouse = evt.getYOnScreen();
        this.setLocation(Xmouse - x, Ymouse - y);
    }//GEN-LAST:event_barrasupMouseDragged

    private void barrasupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barrasupMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_barrasupMousePressed

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        salir.setForeground(Color.red);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        salir.setForeground(new Color(51, 153, 255));
    }//GEN-LAST:event_salirMouseExited

    private void CesarTextoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CesarTextoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CesarTextoInputActionPerformed

    private void vigenereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vigenereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vigenereActionPerformed

    private void foquitoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foquitoMouseEntered
        mensaje.setVisible(true);
        mensaje1.setVisible(true);
        mensaje2.setVisible(true);
    }//GEN-LAST:event_foquitoMouseEntered

    private void foquitoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foquitoMouseExited
        mensaje.setVisible(false);
        mensaje1.setVisible(false);
        mensaje2.setVisible(false);
    }//GEN-LAST:event_foquitoMouseExited

    private void BotonEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEnviarMouseEntered
        BotonEnviar.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_BotonEnviarMouseEntered

    private void BotonEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEnviarMouseExited
        BotonEnviar.setForeground(new Color(204, 255, 255));
    }//GEN-LAST:event_BotonEnviarMouseExited

    private void CesarPosInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CesarPosInputKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean guion = key == 45;
        if (!(numeros || guion)) {
            evt.consume();
        }
    }//GEN-LAST:event_CesarPosInputKeyTyped

    private void VigenereClaveInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VigenereClaveInputKeyTyped
        int key = evt.getKeyChar();
        boolean minusculas = key >= 97 && key <= 122;
        if (!minusculas) {
            evt.consume();
        }
    }//GEN-LAST:event_VigenereClaveInputKeyTyped

    private void VinegereTextoInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VinegereTextoInputKeyTyped
        int key = evt.getKeyChar();
        boolean espacio = key == 32;
        boolean minusculas = key >= 97 && key <= 122;
        if (!(minusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_VinegereTextoInputKeyTyped

    private void CesarTextoInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CesarTextoInputKeyTyped
        int key = evt.getKeyChar();
        boolean espacio = key == 32;
        boolean minusculas = key >= 97 && key <= 122;
        if (!(minusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_CesarTextoInputKeyTyped
    void clave(String v[], String ori, String cla, int tam, String encri) {
        String M, K;
        int posen = 0;
        for (int i = 0; i < ori.length(); i++) {
            M = ori.substring(i, i + 1);
            K = cla.substring(i, i + 1);
            if (M.equals(" ")) {
                encri = encri.concat(" ");
            } else {
                posen = pos(v, M, K) % 26;
                encri = encri.concat(v[posen]);
            }
        }
        Encritado = encri;
    }

    public static int pos(String v[], String M, String K) {
        int poso = 0, posc = 0;
        for (int i = 0; i < 26; i++) {
            if (M.equals(v[i])) {
                poso = i;
            }
            if (K.equals(v[i])) {
                posc = i;
            }
        }

        return poso + posc;
    }

    public static String trad(String dato) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] palabra = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String traduccion = "";
        String mayuscula = " ";
        String letra = " ";
        mayuscula = dato.toUpperCase();
        for (int i = 0; i < dato.length(); i++) {
            letra = mayuscula.substring(i, i + 1);
            for (int j = 0; j < 26; j++) {
                if (letra.equals(palabra[j])) {
                    traduccion = traduccion + morse[j] + " ";
                } else {
                    if (letra.equals(" ")) {
                        traduccion = traduccion + "  ";
                        break;
                    }
                }
            }
        }
        return traduccion;
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
            java.util.logging.Logger.getLogger(Encriptar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encriptar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encriptar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encriptar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encriptar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonEnviar;
    private javax.swing.JTextField CesarPosInput;
    private javax.swing.JTextField CesarTextoInput;
    private javax.swing.JTextField VigenereClaveInput;
    private javax.swing.JTextField VinegereTextoInput;
    private javax.swing.JPanel barrasup;
    private javax.swing.JRadioButton cesar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel foquito;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel mensaje1;
    private javax.swing.JLabel mensaje2;
    private javax.swing.ButtonGroup metodo;
    private javax.swing.JLabel salir;
    private javax.swing.JRadioButton vigenere;
    // End of variables declaration//GEN-END:variables
}
