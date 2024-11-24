/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.pentatlonfinal.frames;

import com.google.gson.Gson;
import com.mycompany.pentatlonfinal.Competencia;
import com.mycompany.pentatlonfinal.Usuario;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class RegistroPanel extends javax.swing.JPanel {
    public JFrame frame1;
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private Usuario u;
    private boolean existente = false;
    private String foto;
    private File fotosota;
    
    public RegistroPanel(JFrame frame1, Usuario u) {
        initComponents();
        setVisible(true);
        this.frame1 = frame1;
        this.u = u;
        labelAviso.setText("");
        leerJSON();
    }

    public void leerJSON(){
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
    
    public void serializar(){
            try {
            Gson gson = new Gson();
            String json = gson.toJson(usuarios);
            BufferedWriter bw = new BufferedWriter(new FileWriter(SesionForm.USUARIOS_LOCATION, false));
            bw.write(json);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelIS1 = new javax.swing.JLabel();
        fieldUsuario = new javax.swing.JTextField();
        labelCONTRASEÑA = new javax.swing.JLabel();
        fieldContraseña = new javax.swing.JPasswordField();
        panelFoto = new org.edisoncor.gui.panel.PanelImage();
        btnFoto = new javax.swing.JButton();
        labelCONTRASEÑA1 = new javax.swing.JLabel();
        fieldContraseña2 = new javax.swing.JPasswordField();
        buttonAqua1 = new org.edisoncor.gui.button.ButtonAqua();
        labelAviso = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 2, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 51));
        jLabel2.setText("REGISTRATE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 360, 60));

        labelIS1.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        labelIS1.setForeground(new java.awt.Color(0, 153, 0));
        labelIS1.setText("Usuario:");
        jPanel1.add(labelIS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 220, 20));

        fieldUsuario.setBackground(new java.awt.Color(153, 255, 153));
        fieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(fieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 270, -1));

        labelCONTRASEÑA.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        labelCONTRASEÑA.setForeground(new java.awt.Color(0, 153, 0));
        labelCONTRASEÑA.setText("Contraseña:");
        jPanel1.add(labelCONTRASEÑA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 220, 20));

        fieldContraseña.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.add(fieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 270, -1));

        javax.swing.GroupLayout panelFotoLayout = new javax.swing.GroupLayout(panelFoto);
        panelFoto.setLayout(panelFotoLayout);
        panelFotoLayout.setHorizontalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        panelFotoLayout.setVerticalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jPanel1.add(panelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 350, 280));

        btnFoto.setBackground(new java.awt.Color(204, 255, 204));
        btnFoto.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        btnFoto.setForeground(new java.awt.Color(0, 153, 0));
        btnFoto.setText("Selecciona tu foto de perfil.");
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 220, -1));

        labelCONTRASEÑA1.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        labelCONTRASEÑA1.setForeground(new java.awt.Color(0, 153, 0));
        labelCONTRASEÑA1.setText("Confirmar contraseña:");
        jPanel1.add(labelCONTRASEÑA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 220, 20));

        fieldContraseña2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.add(fieldContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 270, -1));

        buttonAqua1.setBackground(new java.awt.Color(0, 153, 0));
        buttonAqua1.setText("CREAR CUENTA");
        buttonAqua1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        buttonAqua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAqua1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAqua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 270, -1));

        labelAviso.setFont(new java.awt.Font("Roboto Medium", 2, 22)); // NOI18N
        labelAviso.setForeground(new java.awt.Color(255, 0, 0));
        labelAviso.setText("Ingrese los campos correspondientes");
        jPanel1.add(labelAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 466, 430, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAqua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAqua1ActionPerformed
        String contra1 = new String(fieldContraseña.getPassword());
        String contra2 = new String(fieldContraseña2.getPassword());
        if(fieldUsuario.getText().isEmpty() || contra1.isEmpty() || contra2.isEmpty() || foto.isEmpty()){
            labelAviso.setText("Ingrese los campos correspondientes");
        } else if(!contra1.equals(contra2)){
            labelAviso.setText("Las contraseñas no coinciden");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                if(usuarios.get(i).getName().equals(fieldUsuario.getText())){
                    labelAviso.setText("Usuario ya existente");
                    existente = true;
                }
            }
            if(existente == false){
                ArrayList<Competencia> competencias = new ArrayList<>();
                Usuario U = new Usuario(fieldUsuario.getText(), 0, contra2, foto, competencias, 0);
                usuarios.add(U);
                serializar();
                if(fieldUsuario.getText().endsWith("xyz")){
                    AdminPanel admin = new AdminPanel(frame1, U);
                    frame1.getContentPane().removeAll();
                    frame1.setSize(1050, 455);
                    frame1.getContentPane().add(admin, BorderLayout.CENTER);
                    frame1.setLocationRelativeTo(null);
                    frame1.revalidate();
                    frame1.repaint();
                } else {
                    MenuPanel mp = new MenuPanel(frame1, U);
                    frame1.getContentPane().removeAll();
                    frame1.setSize(440,600);
                    frame1.getContentPane().add(mp, BorderLayout.CENTER);
                    frame1.setLocationRelativeTo(null);
                    frame1.revalidate();
                    frame1.repaint();
                }
            }
        }
    }//GEN-LAST:event_buttonAqua1ActionPerformed

    private void fieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUsuarioActionPerformed

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        JFileChooser file = new JFileChooser();
        file.setDialogTitle("Selecciona tu foto de perfil");
        int seleccion = file.showSaveDialog(null);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            foto = file.getSelectedFile().getAbsolutePath();
            fotosota = file.getSelectedFile();
            System.out.println(foto);
            try {
                panelFoto.setIcon(new ImageIcon((BufferedImage)ImageIO.read(fotosota)));
                panelFoto.updateUI();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnFotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoto;
    private org.edisoncor.gui.button.ButtonAqua buttonAqua1;
    private javax.swing.JPasswordField fieldContraseña;
    private javax.swing.JPasswordField fieldContraseña2;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAviso;
    private javax.swing.JLabel labelCONTRASEÑA;
    private javax.swing.JLabel labelCONTRASEÑA1;
    private javax.swing.JLabel labelIS1;
    private org.edisoncor.gui.panel.PanelImage panelFoto;
    // End of variables declaration//GEN-END:variables
}
