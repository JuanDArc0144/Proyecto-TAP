
package com.mycompany.pentatlonfinal.frames;

import com.google.gson.Gson;
import com.mycompany.pentatlonfinal.Competencia;
import com.mycompany.pentatlonfinal.Usuario;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Label;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.chrono.JapaneseEra;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class SesionForm extends javax.swing.JFrame {
    private static final String IMAGEN = "src//main//java//com//mycompany//pentatlonfinal//images//loginImage.png";
//    private static final String LOGO = "src\\main\\java\\com\\mycompany\\pentatlonfinal\\images\\LOGO.png";
    public static final String AÑADIR_IMAGEN = "src//main//java//com//mycompany//pentatlonfinal//images//añadirIcono.png";
    public static final String USUARIOS_LOCATION = "src//main//java//com//mycompany//pentatlonfinal//images//usuarios.json";
    public static final String COMPETENCIAS_LOCATION  = "src//main//java//com//mycompany//pentatlonfinal//images//competencias.json";
    public static final String ESPERAR_LOGO = "src//main//java//com//mycompany//pentatlonfinal//images//catwaitingIcon.gif";
    private Usuario user;
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private boolean encontrado = false;
    public SesionForm() {
        setLocationRelativeTo(null);
        setResizable(false);
        initComponents();
        labelAVISO.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelInicioSesion = new javax.swing.JLabel();
        labelCONTRASEÑA = new javax.swing.JLabel();
        labelIS1 = new javax.swing.JLabel();
        fieldUsuario = new javax.swing.JTextField();
        fieldContraseña = new javax.swing.JPasswordField();
        btnFalsoIC = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelAVISO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Body & Mind");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto", 3, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("From CODEC ;)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 260, 40));

        labelInicioSesion.setBackground(new java.awt.Color(0, 51, 204));
        labelInicioSesion.setText("jLabel1");
        jPanel1.add(labelInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 510, 550));

        labelCONTRASEÑA.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        labelCONTRASEÑA.setForeground(new java.awt.Color(0, 153, 0));
        labelCONTRASEÑA.setText("Contraseña:");
        jPanel1.add(labelCONTRASEÑA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 220, 20));

        labelIS1.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        labelIS1.setForeground(new java.awt.Color(0, 153, 0));
        labelIS1.setText("Usuario:");
        jPanel1.add(labelIS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 220, 20));

        fieldUsuario.setBackground(new java.awt.Color(153, 255, 153));
        fieldUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        fieldUsuario.setForeground(new java.awt.Color(0, 153, 0));
        fieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(fieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 270, -1));

        fieldContraseña.setBackground(new java.awt.Color(153, 255, 153));
        fieldContraseña.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(fieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 270, -1));

        btnFalsoIC.setBackground(new java.awt.Color(102, 255, 102));
        btnFalsoIC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFalsoIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFalsoICMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INICIAR SESIÓN");

        javax.swing.GroupLayout btnFalsoICLayout = new javax.swing.GroupLayout(btnFalsoIC);
        btnFalsoIC.setLayout(btnFalsoICLayout);
        btnFalsoICLayout.setHorizontalGroup(
            btnFalsoICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnFalsoICLayout.setVerticalGroup(
            btnFalsoICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnFalsoIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, 40));

        labelAVISO.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelAVISO.setForeground(new java.awt.Color(255, 0, 51));
        labelAVISO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAVISO.setText("LabelAVISO");
        jPanel1.add(labelAVISO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 210, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Body & Mind");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 320, 40));

        jLabel4.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mens sana in corpore sano.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 200, -1));

        labelRegistro.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        labelRegistro.setForeground(new java.awt.Color(0, 153, 102));
        labelRegistro.setText("¿No tienes usuario? Registrate.");
        labelRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegistroMouseClicked(evt);
            }
        });
        jPanel1.add(labelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 214, 270, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        imagetoLabel(labelInicioSesion, IMAGEN);
        cargarUsuarios();
    }//GEN-LAST:event_formWindowOpened

    private void fieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUsuarioActionPerformed

    private void btnFalsoICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFalsoICMouseClicked
        String nombre = fieldUsuario.getText();
        String contraseña = new String(fieldContraseña.getPassword()); //ALGO NO VISTO ANTES, WTF XD
        //java.util.Arrays.fill(passwordChars,'\0') para limpiar los PasswordFields
        if(nombre.isEmpty() || contraseña.isEmpty()){
            labelAVISO.setText("Ingrese los datos correspondientes");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                if(nombre.equals(usuarios.get(i).getName()) && contraseña.equals(usuarios.get(i).getContraseña())){
                    user = usuarios.get(i);
                    encontrado = true;
                }
            }
            if(encontrado == true){
                if(nombre.endsWith("xyz")){
                    AdminPanel ad = new AdminPanel(this, user);
                    this.getContentPane().removeAll();
                    this.setSize(1050, 500);
                    this.getContentPane().add(ad, BorderLayout.CENTER);
                    this.setLocationRelativeTo(null);
                    this.revalidate();
                    this.repaint();
                } else {
                    if(user.getInnasistencias() < 5 && user.getInnasistencias() > 0){
                        JOptionPane.showMessageDialog(null, "Usted tiene " + user.getInnasistencias() + " innasistencias, por lo que será bloqueado de escoger alguna 🤔");
                        JOptionPane.showMessageDialog(null, "Pero tranquilo, aún podrá asistir a las competencias a las que se encuentra registrado");
                        int restantes = user.getCompetencias().size();
                        for (int i = 0; i < (5-restantes); i++) {
                            Competencia C = new Competencia("NULA", 0, 0, "0000-00-00", "0000-00-00", "", null);
                            user.getCompetencias().add(C);
                        }
                    }
                    if(user.getInnasistencias() == 5){
                        JOptionPane.showMessageDialog(null, "Usted ha faltado a 5 competencias, su usuario ha sido bloqueado 😭");
                    } else {
                        System.out.println(user.getFoto());
                        System.out.println(user.getCompetencias().size());
                        MenuPanel mp = new MenuPanel(this, user);
                        this.getContentPane().removeAll();
                        this.setSize(440,600);
                        this.getContentPane().add(mp, BorderLayout.CENTER);
                        this.setLocationRelativeTo(null);
                        this.revalidate();
                        this.repaint();
                    }
                } 
            }
        }
        
    }//GEN-LAST:event_btnFalsoICMouseClicked

    private void labelRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistroMouseClicked
        RegistroPanel rp = new RegistroPanel(this, user);
        this.getContentPane().removeAll();
        this.getContentPane().add(rp, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_labelRegistroMouseClicked

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
            java.util.logging.Logger.getLogger(SesionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SesionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SesionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SesionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SesionForm().setVisible(true);
            }
        });
    }
    
    public void imagetoLabel(JLabel label1, String url){
        try {
            BufferedImage imagen = ImageIO.read(new File(url));
            Image escalada = imagen.getScaledInstance(label1.getSize().width, label1.getSize().height, Image.SCALE_SMOOTH);
            ImageIcon icono = new ImageIcon(escalada);
            label1.setIcon(icono);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void cargarUsuarios(){
            try {
                BufferedReader br = new BufferedReader(new FileReader(SesionForm.USUARIOS_LOCATION));
            String lectura;
            String resultado = ""; 
            while ((lectura = br.readLine()) != null) {
                resultado += lectura;
            }
            br.close();
            JSONParser jsonP = new JSONParser();
            JSONArray jArray = (JSONArray) jsonP.parse(resultado);
            for (int i = 0; i < jArray.size(); i++) {
                String json = "" + jArray.get(i);
                Usuario u = new Gson().fromJson(json, Usuario.class);
                System.out.println(u.toString());
                usuarios.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnFalsoIC;
    private javax.swing.JPasswordField fieldContraseña;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAVISO;
    private javax.swing.JLabel labelCONTRASEÑA;
    private javax.swing.JLabel labelIS1;
    private javax.swing.JLabel labelInicioSesion;
    private javax.swing.JLabel labelRegistro;
    // End of variables declaration//GEN-END:variables
}
