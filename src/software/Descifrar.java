package software;

import java.awt.Color;
import javax.swing.JOptionPane;
import static software.Encriptar.Encritado;
import static software.Encriptar.Texto;

/**
 *
 * @author Jhonatan Romero
 */
public class Descifrar extends javax.swing.JFrame {

    /**
     * Creates new form Descifrar
     */
    Fuentes tipoFuente;

    public Descifrar() {
        initComponents();
        tipoFuente = new Fuentes();
        this.setLocationRelativeTo(null);
        TextoMorse.setBackground(new Color(0, 0, 0, 0));
        claveopos.setBackground(new Color(0, 0, 0, 0));
        jLabel1.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 36));
        jLabel4.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 24));
        jLabel2.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 24));
        jLabel3.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 24));
        vigenere.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 18));
        cesar.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 18));
        claveopos.setFont(tipoFuente.fuente(tipoFuente.RM, 0, 38));
        TextoMorse.setFont(tipoFuente.fuente(tipoFuente.RM, 0, 38));
        salir.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 24));
        jLabel7.setFont(tipoFuente.fuente(tipoFuente.positive, 0, 18));
        Menu.valmus = 1;

    }
    public static String enmorse;
    public static String traducido;
    public static String decifrado;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        metodo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        cesar = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        claveopos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        vigenere = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        TextoMorse = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        barrasup = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Positive System", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("POSICIONES / CLAVE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 260, 40));

        salir.setBackground(new java.awt.Color(0, 18, 43));
        salir.setFont(new java.awt.Font("Positive System", 0, 24)); // NOI18N
        salir.setForeground(new java.awt.Color(51, 153, 255));
        salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir.setText("X");
        salir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        metodo.add(cesar);
        cesar.setFont(new java.awt.Font("Positive System", 0, 18)); // NOI18N
        cesar.setForeground(new java.awt.Color(153, 255, 255));
        cesar.setText("cesar");
        jPanel1.add(cesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 140, 30));

        jLabel4.setFont(new java.awt.Font("Positive System", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 204, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("texto en morse");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, 40));

        claveopos.setFont(new java.awt.Font("RM Typerighter", 0, 36)); // NOI18N
        claveopos.setForeground(new java.awt.Color(153, 204, 255));
        claveopos.setBorder(null);
        jPanel1.add(claveopos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 470, 40));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("_________________________________________________");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 370, 30));

        jLabel3.setFont(new java.awt.Font("Positive System", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 204, 255));
        jLabel3.setText("METODO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 140, 30));

        jLabel7.setFont(new java.awt.Font("Positive System", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 204, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DECIFRAR");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 255), null, null, new java.awt.Color(51, 102, 255)));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 150, 50));

        metodo.add(vigenere);
        vigenere.setFont(new java.awt.Font("Positive System", 0, 18)); // NOI18N
        vigenere.setForeground(new java.awt.Color(153, 153, 255));
        vigenere.setText("VIGENERE");
        jPanel1.add(vigenere, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 130, 30));

        jLabel1.setFont(new java.awt.Font("Positive System", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DECIFRAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 760, 60));

        TextoMorse.setFont(new java.awt.Font("RM Typerighter", 0, 38)); // NOI18N
        TextoMorse.setForeground(new java.awt.Color(153, 204, 255));
        TextoMorse.setBorder(null);
        TextoMorse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextoMorseKeyTyped(evt);
            }
        });
        jPanel1.add(TextoMorse, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 470, 40));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("__________________________________________________________");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 530, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Blue Futuristic Technology Pitch Deck Presentation (4).png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 510));

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

    private void barrasupMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barrasupMouseDragged
        int Xmouse = evt.getXOnScreen();
        int Ymouse = evt.getYOnScreen();
        this.setLocation(Xmouse - x, Ymouse - y);
    }//GEN-LAST:event_barrasupMouseDragged
    int x, y;
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

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        String TextoenMorse = TextoMorse.getText();
        String clavepos = claveopos.getText();
        if (!cesar.isSelected() && !vigenere.isSelected()) {
            error.mensaje = "NO HA SELECCIONADO NINGÚN METODO DE CIFRADO.";
            error mostrar = new error();
            mostrar.setVisible(true);
        } else {
            if (TextoenMorse.length() == 0 || clavepos.length() == 0) {
                error.mensaje = "FALTAN DATOS POR LLENAR.";
                error mostrar = new error();
                mostrar.setVisible(true);
            } else {
                String Traducido = destrad(TextoenMorse);
                boolean correcto = true;
                int i = 0;
                if (cesar.isSelected()) {
                    while (i < clavepos.length()) {
                        if (!clavepos.substring(i, i + 1).equals("0") && !clavepos.substring(i, i + 1).equals("1") && !clavepos.substring(i, i + 1).equals("2") && !clavepos.substring(i, i + 1).equals("3") && !clavepos.substring(i, i + 1).equals("4") && !clavepos.substring(i, i + 1).equals("5") && !clavepos.substring(i, i + 1).equals("6") && !clavepos.substring(i, i + 1).equals("7") && !clavepos.substring(i, i + 1).equals("8") && !clavepos.substring(i, i + 1).equals("9") && !clavepos.substring(i, i + 1).equals("-")) {
                            correcto = !correcto;
                            break;
                        }
                        i++;
                    }
                    if (correcto) {
                        char[] m = new char[100];
                        String EncriptadoCesar = "";
                        String CesarPos = clavepos;
                        String p;
                        int cant, pos = 0, cambio;
                        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
                        String[] palabra = new String[100];
                        String[] palabraEncriptada = new String[100];
                        cambio = Integer.parseInt(CesarPos) * -1;
                        p = Traducido;
                        cant = p.length();
                        for (i = 0; i < cant; i++) {
                            palabra[i] = p.substring(i, i + 1).toLowerCase();
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
                        enmorse = TextoenMorse;
                        traducido = Traducido;
                        decifrado = EncriptadoCesar;
                        SalidaDecifrado mostrar = new SalidaDecifrado();
                        mostrar.setVisible(true);
                        this.setVisible(false);
                    } else {
                        error.mensaje = "cesar solo funciona con numeros.";
                        error mostrar = new error();
                        mostrar.setVisible(true);

                    }
                } else {
                    while (i < clavepos.length()) {
                        if (clavepos.substring(i, i + 1).equals("0") || clavepos.substring(i, i + 1).equals("1") || clavepos.substring(i, i + 1).equals("2") || clavepos.substring(i, i + 1).equals("3") || clavepos.substring(i, i + 1).equals("4") || clavepos.substring(i, i + 1).equals("5") || clavepos.substring(i, i + 1).equals("6") || clavepos.substring(i, i + 1).equals("7") || clavepos.substring(i, i + 1).equals("8") || clavepos.substring(i, i + 1).equals("9")) {
                            correcto = !correcto;
                            break;
                        }
                        i++;
                    }
                    if (correcto) {
                        String pale, palc, p3 = "", por = "";
                        String[] dejenere = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
                        pale = Traducido;
                        palc = clavepos;
                        int j = 0;
                        if (palc.length() < pale.length()) {
                            for (i = 0; i < pale.length(); i++) {
                                if (pale.substring(i, i + 1).equals(" ")) {
                                    p3 = p3.concat(" ");
                                } else {
                                    p3 = p3.concat(palc.substring(j, j + 1));
                                    j++;
                                    if (j == palc.length()) {
                                        j = 0;
                                    }
                                }
                            }
                            pale = pale.toUpperCase();
                            p3 = p3.toUpperCase();
                            original(dejenere, pale, p3, 26, por);
                        } else {
                            if (palc.length() == pale.length()) {
                                pale = pale.toUpperCase();
                                p3 = p3.toUpperCase();
                                original(dejenere, pale, p3, 26, por);

                            }
                        }
                        enmorse = TextoenMorse;
                        traducido = Traducido;
                        SalidaDecifrado mostrar = new SalidaDecifrado();
                        mostrar.setVisible(true);
                        this.setVisible(false);
                    } else {
                        error.mensaje = "vigenere solo funciona con letras.";
                        error mostrar = new error();
                        mostrar.setVisible(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void TextoMorseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoMorseKeyTyped
        int key = evt.getKeyChar();
        boolean espacio = key == 32;
        boolean guion = key == 45;
        boolean punto = key == 46;
        if (!(espacio || guion || punto)) {
            evt.consume();
        }

    }//GEN-LAST:event_TextoMorseKeyTyped

    static void original(String v[], String enc, String cla, int tam, String ori) {
        String C, K;
        int posor = 0;
        for (int i = 0; i < enc.length(); i++) {
            C = enc.substring(i, i + 1);
            K = cla.substring(i, i + 1);
            if (C.equals(" ")) {
                ori = ori.concat(" ");
            } else {
                posor = pos(v, C, K) % 26;
                ori = ori.concat(v[posor]);
            }
        }
        decifrado = ori;
    }

    public static int pos(String v[], String C, String K) {
        int pose = 0, posc = 0;
        for (int i = 0; i < 26; i++) {
            if (C.equals(v[i])) {
                pose = i;
            }
            if (K.equals(v[i])) {
                posc = i;
            }
        }

        return pose - posc + 26;
    }

    static String destrad(String mors) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] palabra = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] letrasenc = new String[100];
        int i = 0;
        int a = mors.length();
        String español = "", letra;
        int c = 0;
        int pos = 0;
        while (i < a) {
            if (mors.substring(i, i + 1).equals(" ")) {
                letra = mors.substring(pos, i);
                System.out.println(letra);
                letrasenc[c] = letra;
                for (int j = 0; j < 26; j++) {
                    if (letra.equals(morse[j])) {
                        español = español + palabra[j];
                    }
                }
                if (i < a - 1) {
                    if (mors.substring(i + 1, i + 2).equals(" ")) {
                        i++;
                        System.out.println(mors.substring(i + 1, i + 2));
                        español = español + " ";
                        i++;
                        pos = i;
                    }
                }
                i++;
                pos = i;
            }
            i++;
        }
        System.out.println(español);
        return español;
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
            java.util.logging.Logger.getLogger(Descifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Descifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Descifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Descifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Descifrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextoMorse;
    private javax.swing.JPanel barrasup;
    private javax.swing.JRadioButton cesar;
    private javax.swing.JTextField claveopos;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup metodo;
    private javax.swing.JLabel salir;
    private javax.swing.JRadioButton vigenere;
    // End of variables declaration//GEN-END:variables
}