/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.pentatlonfinal.frames;

import com.mycompany.pentatlonfinal.Competencia;
import com.mycompany.pentatlonfinal.Usuario;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.File;
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

public class MenuPanel extends javax.swing.JPanel {
    JFrame frame1 = new JFrame();
    private Usuario u = new Usuario();
    public MenuPanel(JFrame frame1, Usuario u) {
        initComponents();
        this.frame1 = frame1;
        this.u = u;
        frame1.setVisible(true);
        frame1.revalidate();
        frame1.repaint();
        frame1.setLocationRelativeTo(null);
        System.out.println(u.toString());
        scrollCompetencias.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollCompetencias.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        labelSumar.setSize(128,96);
        labelSumar.setToolTipText("Añade más competencias 😈");
        labelPicture.setSize(93, 82);
        imagenAEstampa(labelSumar, SesionForm.AÑADIR_IMAGEN);
        setProfilePic();
        scrollCompetencias.setSize(403, 454);
        panelCompetencias.setSize(403, 454);
        panelCompetencias.setLayout(new BoxLayout(panelCompetencias, BoxLayout.Y_AXIS));
        for (int i = 0; i < u.getCompetencias().size(); i++) {
            if(!u.getCompetencias().get(i).getNombre().equals("NULA")){
                cargarCompetencias(u.getCompetencias().get(i));
            }
        }
        labelPicture.setToolTipText("No hubo tiempo para el menú lateral 😭");
        labelBienvenida.setText("Bienvenido, " + u.getName());
        labelAviso.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBienvenida = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        scrollCompetencias = new javax.swing.JScrollPane();
        panelCompetencias = new javax.swing.JPanel();
        labelSumar = new javax.swing.JLabel();
        labelPicture = new javax.swing.JLabel();
        labelAviso = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        labelBienvenida.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labelBienvenida.setForeground(new java.awt.Color(0, 102, 0));
        labelBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBienvenida.setText("jLabel1");

        label1.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(51, 204, 0));
        label1.setText("Aqui se encuentran tus competencias:");

        scrollCompetencias.setBackground(new java.awt.Color(204, 255, 204));
        scrollCompetencias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollCompetencias.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelCompetencias.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout panelCompetenciasLayout = new javax.swing.GroupLayout(panelCompetencias);
        panelCompetencias.setLayout(panelCompetenciasLayout);
        panelCompetenciasLayout.setHorizontalGroup(
            panelCompetenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );
        panelCompetenciasLayout.setVerticalGroup(
            panelCompetenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        scrollCompetencias.setViewportView(panelCompetencias);

        labelSumar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelSumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSumarMouseClicked(evt);
            }
        });

        labelAviso.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        labelAviso.setForeground(new java.awt.Color(255, 51, 51));
        labelAviso.setText("COMPETENCIAS MAXIMAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollCompetencias, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(labelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSumar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(labelPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollCompetencias, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        int x = evt.getX();
        int y = evt.getY();
        System.out.println("X: " + x + "--Y:" + y);
    }//GEN-LAST:event_formMouseClicked

    private void labelSumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSumarMouseClicked
        if(u.getCompetencias().size() == 5){
            labelAviso.setText("COMPETENCIAS MÁXIMAS");
        } else {
            SelectComp sc = new SelectComp(frame1, u);
            frame1.getContentPane().removeAll();
            frame1.setSize(492, 363);
            frame1.getContentPane().add(sc, BorderLayout.CENTER);
            frame1.setLocationRelativeTo(null);
            frame1.revalidate();
            frame1.repaint(); 
        }
    }//GEN-LAST:event_labelSumarMouseClicked

    public void setProfilePic(){
        try {
            BufferedImage imagen = ImageIO.read(new File(u.getFoto()));
            BufferedImage recorte = circulizar(imagen);
            ImageIcon icono = new ImageIcon(recorte);
            labelPicture.setIcon(icono);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void cargarCompetencias(Competencia C){
        JPanel comp = new JPanel();
        comp.setLayout(new GridLayout(1,3));
        comp.setSize(panelCompetencias.getSize().width - 10, 10);
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
        medio.add(fechaI);
        derecho.add(fechaF);
        comp.add(izquierdo);
        comp.add(medio);
        comp.add(derecho);
        panelCompetencias.add(comp);
        panelCompetencias.revalidate();
        panelCompetencias.updateUI();
    }
    
    public BufferedImage circulizar(BufferedImage imagen){
        int diametro = Math.min(labelPicture.getSize().width, labelPicture.getSize().height);
        BufferedImage circular = new BufferedImage(diametro, diametro, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = circular.createGraphics();
        g2d.setClip(new java.awt.geom.Ellipse2D.Float(0, 0, diametro, diametro));
        g2d.drawImage(imagen, 0, 0, diametro, diametro, null);
        g2d.dispose();
        return circular;
    }
    
    public void imagenAEstampa(JLabel label1, String imagen){
        try {
            BufferedImage imagencita = ImageIO.read(new File(imagen));
            int labelw = label1.getSize().width;
            int labelh = label1.getSize().height;
            Image escalada = imagencita.getScaledInstance(label1.getSize().width, label1.getSize().height, Image.SCALE_SMOOTH);
            ImageIcon icono = new ImageIcon(escalada);
            label1.setIcon(icono);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label1;
    private javax.swing.JLabel labelAviso;
    private javax.swing.JLabel labelBienvenida;
    private javax.swing.JLabel labelPicture;
    private javax.swing.JLabel labelSumar;
    private javax.swing.JPanel panelCompetencias;
    private javax.swing.JScrollPane scrollCompetencias;
    // End of variables declaration//GEN-END:variables
}
