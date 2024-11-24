/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.pentatlonfinal.frames;

import com.google.gson.Gson;
import com.itextpdf.text.Image;
import com.mycompany.pentatlonfinal.Competencia;
import com.mycompany.pentatlonfinal.Usuario;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.edisoncor.gui.label.LabelTask;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author chata
 */
public class SelectComp extends javax.swing.JPanel {
    private JFrame frame1;
    private Usuario user;
    private boolean seleccionada = false;
    private ArrayList<Competencia> competencias = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private int disponibles;
    private int id;
    public SelectComp(JFrame frame1, Usuario user) {
        initComponents();
        this.frame1 = frame1;
        this.user = user;
        labelAviso.setText("");
        disponibles = 5 - user.getCompetencias().size();
        scrollCompetencias.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollCompetencias.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        labelPrincipal.setSize(101,58);
        jLabel2.setText("Cuentas con " + disponibles + " competencias disponibles");
        scrollCompetencias.setSize(478, 254);
        jPanel1.setSize(478, 254);
        jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));
        cargarJSON();
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getName().equals(user.getName())){
                id = i;
            }
        }
        System.out.println(usuarios.get(id).getName());
        ImagetoLabel(labelPrincipal, SesionForm.ESPERAR_LOGO);
        System.out.println(competencias.size());
        for (int i = 0; i < competencias.size(); i++) {
            cargarCompetencias(competencias.get(i));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonRect1 = new org.edisoncor.gui.button.ButtonRect();
        scrollCompetencias = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        labelAviso = new javax.swing.JLabel();
        labelPrincipal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));

        buttonRect1.setBackground(new java.awt.Color(102, 255, 102));
        buttonRect1.setText("Regresar");
        buttonRect1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        buttonRect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRect1ActionPerformed(evt);
            }
        });

        scrollCompetencias.setBackground(new java.awt.Color(255, 255, 255));
        scrollCompetencias.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        scrollCompetencias.setViewportView(jPanel1);

        labelAviso.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        labelAviso.setForeground(new java.awt.Color(204, 0, 0));
        labelAviso.setText("COMPETENCIA YA SELECCIONADA");

        jLabel1.setFont(new java.awt.Font("Roboto", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("SELECCIONA TUS COMPETENCIAS:");

        jLabel2.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(scrollCompetencias))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollCompetencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAviso))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRect1ActionPerformed
        reescribirJSON();
        MenuPanel mp = new MenuPanel(frame1, usuarios.get(id));
        frame1.getContentPane().removeAll();
        frame1.setSize(440,600);
        frame1.getContentPane().add(mp, BorderLayout.CENTER);
        frame1.setLocationRelativeTo(null);
        frame1.revalidate();
        frame1.repaint();
    }//GEN-LAST:event_buttonRect1ActionPerformed

    public void ImagetoLabel(JLabel label, String imagen){
        try {
            BufferedImage foto = ImageIO.read(new File(imagen));
            java.awt.Image escalada = foto.getScaledInstance(label.getSize().width, label.getSize().height, java.awt.Image.SCALE_SMOOTH);
            ImageIcon icono = new ImageIcon(escalada);
            label.setIcon(icono);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void cargarJSON(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(SesionForm.COMPETENCIAS_LOCATION));
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
                Competencia c = new Gson().fromJson(json, Competencia.class);
                competencias.add(c);
            }
            BufferedReader br2 = new BufferedReader(new FileReader(SesionForm.USUARIOS_LOCATION));
            String lectura2;
            String resultado2 = ""; 
            while ((lectura2 = br2.readLine()) != null) {
                resultado2 += lectura2;
            }
            br2.close();
            JSONParser jsonP2 = new JSONParser();
            JSONArray jArray2 = (JSONArray) jsonP2.parse(resultado2);
            for (int i = 0; i < jArray2.size(); i++) {
                String json = "" + jArray2.get(i);
                Usuario u = new Gson().fromJson(json, Usuario.class);
                usuarios.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void reescribirJSON(){
        try {
            Gson gson = new Gson();
            String json = gson.toJson(usuarios);
            BufferedWriter bw = new BufferedWriter(new FileWriter(SesionForm.USUARIOS_LOCATION, false));
            bw.write(json);
            bw.close();
        } catch (Exception e) {
        }
        
    }
    
    public void cargarCompetencias(Competencia C){
        JPanel comp = new JPanel();
        comp.setLayout(new GridLayout(1,4));
        comp.setSize(jPanel1.getSize().width - 10, 85);
        JPanel izquierdo = new JPanel(new FlowLayout());
        JLabel nombreC = new JLabel();
        nombreC.setText(C.getNombre());
        JLabel fechaI = new JLabel();
        fechaI.setText("Del: " + C.getFechaInicio().substring(0, 10));
        JLabel fechaF = new JLabel();
        fechaF.setText("Al: "+ C.getFechaFinal().substring(0, 10));
        izquierdo.add(nombreC);
        JPanel medio = new JPanel(new FlowLayout());
        JPanel derecho = new JPanel();
        JPanel ultimo = new JPanel(new FlowLayout());
        JButton escoger = new JButton("Añadir");
        escoger.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean seleccionada = false;
                if(disponibles==0){
                    JOptionPane.showMessageDialog(null, "Usted ha seleccionado todas sus competencias, le recomendamos salir 🤔");
                } else {
                    for (int i = 0; i < usuarios.get(id).getCompetencias().size(); i++) {
                    System.out.println(usuarios.get(id).getCompetencias().size());
                    if(usuarios.get(id).getCompetencias().get(i).getNombre().equals(C.getNombre())){
                        JOptionPane.showMessageDialog(null, "Competencia ya seleccionada");
                        seleccionada = true;
                        break;
                    }
                }
                if(!seleccionada){
                      usuarios.get(id).getCompetencias().add(C);
                      disponibles--;
                      JOptionPane.showMessageDialog(null, "Competencia registrada correctamente");
                      jLabel2.setText("Cuentas con " + disponibles + " competencias disponibles");
                }   
                }
                
            }
        });
        medio.add(fechaI);
        derecho.add(fechaF);
        ultimo.add(escoger);
        comp.add(izquierdo);
        comp.add(medio);
        comp.add(derecho);
        comp.add(ultimo);
        jPanel1.add(comp);
        jPanel1.revalidate();
        jPanel1.updateUI();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonRect buttonRect1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAviso;
    private javax.swing.JLabel labelPrincipal;
    private javax.swing.JScrollPane scrollCompetencias;
    // End of variables declaration//GEN-END:variables
}
