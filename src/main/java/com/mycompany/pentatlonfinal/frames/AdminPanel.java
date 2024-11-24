
package com.mycompany.pentatlonfinal.frames;
import com.google.gson.Gson;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;
import com.mycompany.pentatlonfinal.Competencia;
import com.mycompany.pentatlonfinal.Usuario;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.TableModel;
import javax.swing.text.Document;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.jdatepicker.impl.UtilCalendarModel;
import org.w3c.dom.css.RGBColor;
public class AdminPanel extends javax.swing.JPanel {
    private JFrame frame1;
    private Usuario u;
    private ArrayList<Competencia> competencias = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Usuario> ganadores = new ArrayList<>();
    private JTable jt = new JTable();
    private String pdf;
    public AdminPanel(JFrame frame1, Usuario u) {
        initComponents();
        this.u = u;
        this.frame1 = frame1;
        scrollCompetencias.setSize(617, 368);
        panelCompetencias.setSize(617, 368);
        panelVariable.setSize(350,550);
        panelCompetencias.setLayout(new BoxLayout(panelCompetencias, BoxLayout.Y_AXIS));
        cargarJSONS();
        for (int i = 0; i < competencias.size(); i++) {
            mostrarLista(competencias.get(i));
        }
        btnVariable.setVisible(false);
        ordenarGanadores();
        btnExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        scrollCompetencias = new javax.swing.JScrollPane();
        panelCompetencias = new javax.swing.JPanel();
        btnVariable = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        panelVariable = new javax.swing.JPanel();
        btnExcel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Thin", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("COMPETENCIAS ACTUALES:");

        scrollCompetencias.setBackground(new java.awt.Color(255, 255, 255));
        scrollCompetencias.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelCompetencias.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelCompetenciasLayout = new javax.swing.GroupLayout(panelCompetencias);
        panelCompetencias.setLayout(panelCompetenciasLayout);
        panelCompetenciasLayout.setHorizontalGroup(
            panelCompetenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );
        panelCompetenciasLayout.setVerticalGroup(
            panelCompetenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        scrollCompetencias.setViewportView(panelCompetencias);

        btnVariable.setBackground(new java.awt.Color(51, 204, 0));
        btnVariable.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnVariable.setForeground(new java.awt.Color(255, 255, 255));
        btnVariable.setText("Seleccionar");
        btnVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVariableActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(51, 204, 0));
        btnAgregar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Añadir");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnPDF.setBackground(new java.awt.Color(51, 204, 0));
        btnPDF.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnPDF.setText("Ganadores");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        panelVariable.setBackground(new java.awt.Color(204, 255, 204));
        panelVariable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelVariableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelVariableLayout = new javax.swing.GroupLayout(panelVariable);
        panelVariable.setLayout(panelVariableLayout);
        panelVariableLayout.setHorizontalGroup(
            panelVariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        panelVariableLayout.setVerticalGroup(
            panelVariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        btnExcel.setBackground(new java.awt.Color(51, 204, 0));
        btnExcel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnExcel.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel.setText("Resultados");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(51, 204, 0));
        btnExit.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("CERRAR SESIÓN");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollCompetencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panelVariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(panelVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPDF))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollCompetencias, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVariableActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jfc.setDialogTitle("Selecciona la carpeta");
        int seleccion = jfc.showSaveDialog(null);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            String carpeta = jfc.getSelectedFile().getAbsolutePath();
            if(btnVariable.getText().equals("Descargar Excel")){
                tablaaExcel(jt, carpeta + "\\RESULTADOS.xlsx");
            } else if(btnVariable.getText().equals("Descargar PDF")){
                stringAPDF(pdf, carpeta + "\\competidores_mas_buenos.pdf");
            }
        }
    }//GEN-LAST:event_btnVariableActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        panelVariable.removeAll();
        btnVariable.setVisible(false);
        añadirC();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        ganadores.removeAll(ganadores);
        ordenarGanadores();
        JTextArea jta = new JTextArea();
        jta.setText("");
        pdf = "";
        panelVariable.removeAll();
        panelVariable.updateUI();
        panelVariable.setLayout(new BoxLayout(panelVariable, BoxLayout.Y_AXIS));
        btnVariable.setVisible(true);
        btnVariable.setText("Descargar PDF");
        pdf = "-------------------------MEJORES COMPETIDORES------------------------------------------\n\n";
        for (int i = 0; i < ganadores.size(); i++) {
            pdf += "Nombre: " + ganadores.get(i).getName() + " con un total de " + ganadores.get(i).getGanadas() + " victorias. \n";
        }
        jta.setText(pdf);
        JScrollPane scroll = new JScrollPane(jta);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setSize(panelVariable.getWidth(), 500);
        panelVariable.add(scroll);
        panelVariable.revalidate();
        panelVariable.repaint();
    }//GEN-LAST:event_btnPDFActionPerformed

    private void panelVariableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVariableMouseClicked
        int x = evt.getX();
        int y = evt.getY();
        System.out.println("X: " + x + "Y: " + y);
    }//GEN-LAST:event_panelVariableMouseClicked

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        panelVariable.removeAll();
        panelVariable.updateUI();
        panelVariable.setLayout(new BoxLayout(panelVariable, BoxLayout.Y_AXIS));
        String[] columnas = {"Competencia", "Asistentes", "Innasistentes", "Ganador"};
        String[][] datos = new String[competencias.size()][4];
        for (int i = 0; i < competencias.size(); i++) {
            datos[i][0] = competencias.get(i).getNombre();
            datos[i][1] = "" + competencias.get(i).getConcursantes();
            datos[i][2] = "" + competencias.get(i).getInnasistentes();
            datos[i][3] = competencias.get(i).getGanador().getName();
        }
        
        btnVariable.setVisible(true);
        btnVariable.setText("Descargar Excel");
        jt = new JTable(datos, columnas);
        JScrollPane scroll = new JScrollPane(jt);
        scroll.setSize(panelVariable.getWidth(), 300);
        jt.setSize(panelVariable.getWidth() - 10, panelVariable.getHeight() - 10);
        panelVariable.add(scroll);
        panelVariable.revalidate();
        panelVariable.repaint();
        ganadores.removeAll(ganadores);
    }//GEN-LAST:event_btnExcelActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        int x = evt.getX();
        int y = evt.getY();
        System.out.println("X:" + x + "Y: "+y);
    }//GEN-LAST:event_formMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        frame1.dispose();
        SesionForm sf = new SesionForm();
        sf.setVisible(true);
        sf.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(Color.red);
        btnExit.setForeground(Color.white);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(new Color(51,204,0));
        btnExit.setForeground(Color.white);
    }//GEN-LAST:event_btnExitMouseExited

    public void ordenarGanadores(){
        ganadores.addAll(usuarios);
        Collections.sort(ganadores, new Comparator<Usuario> (){
            @Override
            public int compare(Usuario o1, Usuario o2) {
                return Integer.compare(o2.getGanadas(), o1.getGanadas());
            }
        });
    }
    public void añadirC(){
        panelVariable.setLayout(new BoxLayout(panelVariable, BoxLayout.Y_AXIS));
        JLabel nombre = new JLabel("Nombre");
        nombre.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField nombreF = new JTextField();
        nombreF.setSize(panelVariable.getWidth() - 20, 10);
        JLabel descrip = new JLabel("Descripción");
        descrip.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextArea descripA = new JTextArea();
        descripA.setSize(panelVariable.getWidth() - 20, 10);
        UtilDateModel modelo = new UtilDateModel();
        Properties prop = new Properties();
        prop.put("Dia", "Hoy"); //Pruebas
        prop.put("Mes", "Noviembre");
        prop.put("Año", "2024");
        JDatePanelImpl jdpi = new JDatePanelImpl(modelo, prop);
        JDatePickerImpl fechaInicio = new JDatePickerImpl(jdpi, new DateLabelFormatter());
        fechaInicio.setSize(panelVariable.getWidth() - 5, 150);
        panelVariable.add(nombre);
        panelVariable.add(nombreF);
        panelVariable.add(descrip);
        panelVariable.add(descripA);
        JLabel lblFechaI = new JLabel("Fecha de Inicio");
        lblFechaI.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelVariable.add(lblFechaI);
        panelVariable.add(fechaInicio);
        JLabel lblFechaFin = new JLabel("Fecha de Salida");
        lblFechaFin.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelVariable.add(lblFechaFin);
        UtilDateModel modelo2 = new UtilDateModel();
        Properties prop2 = new Properties();
        prop2.put("Dia", "Hoy"); //Pruebas
        prop2.put("Mes", "Noviembre");
        prop2.put("Año", "2024");
        JDatePanelImpl jdpi2 = new JDatePanelImpl(modelo2, prop2);
        JDatePickerImpl fechaFinal = new JDatePickerImpl(jdpi2, new DateLabelFormatter());
        JButton btn = new JButton("Agregar");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean vacio = true;
                if(!nombreF.getText().isEmpty()){
                    vacio = false;
                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea agregar la competencia " + nombreF.getText() + "?");
                    if(respuesta == JOptionPane.YES_OPTION){
                        ArrayList<Competencia> competencias22 = new ArrayList<>();
                        Usuario u = new Usuario("No registrado", 0, "", "", competencias22, 0);
                        String fechaInicial = "" + fechaInicio.getModel().getYear() + "-" + fechaInicio.getModel().getMonth() + "-" + fechaInicio.getModel().getDay() + "T00:00:00-06:00";
                        String fechaUltima = "" + fechaFinal.getModel().getYear() + "-" + fechaFinal.getModel().getMonth() + "-" + fechaFinal.getModel().getDay() + "T00:00:00-06:00";
                        Competencia C = new Competencia(nombreF.getText(), 0, 0, fechaInicial, fechaUltima, descripA.getText(), u);
                        competencias.add(C);
                        panelCompetencias.removeAll();
                        for (int i = 0; i < competencias.size(); i++) {
                            mostrarLista(competencias.get(i));
                        }
                        JOptionPane.showMessageDialog(null, "Competencia registrada correctamente");
                        actualizarJSON();
                        panelVariable.removeAll();
                        añadirC();
                    } else {
                        panelVariable.removeAll();
                        añadirC();
                    }
                } else if(vacio == true){
                    JOptionPane.showMessageDialog(null, "Introduzca un nombre, por favor");
                }
            }
        });
        panelVariable.add(fechaFinal);
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelVariable.add(btn);
        panelVariable.revalidate();
        panelVariable.updateUI();
    }
    
    public void stringAPDF(String texto, String carpeta){
        try {
            com.itextpdf.text.Document dc = new com.itextpdf.text.Document();
            PdfWriter.getInstance((com.itextpdf.text.Document) dc, new FileOutputStream(carpeta));
            dc.open();
            dc.add(new Paragraph(texto));
            dc.close();
            JOptionPane.showMessageDialog(null, "El documento se ha creado en la carpeta 🐧");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void mostrarLista(Competencia C){
        JPanel comp = new JPanel();
        comp.setLayout(new GridLayout(1,5));
//        comp.setSize(panelCompetencias.getSize().width - 10, 10);
        JLabel nombreC = new JLabel(C.getNombre());
        JLabel fechaI = new JLabel(C.getFechaInicio().substring(0, 10));
        JLabel fechaF = new JLabel(C.getFechaFinal().substring(0, 10));
        JButton btn = new JButton("Consultar");
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                panelVariable.removeAll();
                panelVariable.setLayout(new BoxLayout(panelVariable, BoxLayout.Y_AXIS));
                JLabel nombreC = new JLabel(C.getNombre());
                nombreC.setAlignmentX(Component.CENTER_ALIGNMENT);
                JLabel descrip = new JLabel(C.getDescrip());
                descrip.setAlignmentX(Component.CENTER_ALIGNMENT);
                panelVariable.add(nombreC);
                panelVariable.add(descrip);
                boolean tiene = false;
                for (int i = 0; i < usuarios.size(); i++) {
                    for (int j = 0; j < usuarios.get(i).getCompetencias().size(); j++) {
                        if(C.getNombre().equals(usuarios.get(i).getCompetencias().get(j).getNombre())){
                        inscritos(usuarios.get(i), C, usuarios.get(i).getCompetencias().get(j));
                        tiene = true;
                        }
                    }
                } if(!tiene){
                    JOptionPane.showMessageDialog(null, "No tiene participantes inscritos");
                    btnVariable.setVisible(false);
                    panelVariable.removeAll();
                    panelVariable.updateUI();
                }   
            }
        });
        JButton delete = new JButton("Eliminar");
        delete.setForeground(Color.white);
        delete.setBackground(Color.red);
        delete.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean tiene = false;
                    for (int i = 0; i < usuarios.size(); i++) {
                        for (int j = 0; j < usuarios.get(i).getCompetencias().size(); j++) {
                            if(C.getNombre().equals(usuarios.get(i).getCompetencias().get(j).getNombre())){
                                tiene = true;
                            }
                        }
                    }
                if(!tiene){
                        int seleccion = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar " + C.getNombre() + "de las competencias?");
                        if(seleccion == JOptionPane.YES_OPTION){
                            competencias.remove(C);
                            panelCompetencias.removeAll();
                            actualizarJSON();
                            for (int i = 0; i < competencias.size(); i++) {
                                mostrarLista(competencias.get(i));
                            }
                        }
                } if(tiene){
                    JOptionPane.showMessageDialog(null, "Tiene alumnos inscritos, confirmar asistencias antes de eliminar");
                }
            }
        });
        nombreC.setAlignmentX(Component.CENTER_ALIGNMENT);
        fechaI.setAlignmentX(Component.CENTER_ALIGNMENT);
        fechaF.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        comp.add(nombreC);
        comp.add(fechaI);
        comp.add(fechaF);
        comp.add(btn);
        comp.add(delete);
        panelCompetencias.add(comp);
        panelCompetencias.validate();
        panelCompetencias.updateUI();
    }
    
    //No sirvio mucho, se ve bien 
//    public BufferedImage circulizar(JLabel labelPicture, BufferedImage imagen){
//        int diametro = Math.min(labelPicture.getSize().width, labelPicture.getSize().height);
//        BufferedImage circular = new BufferedImage(diametro, diametro, BufferedImage.TYPE_INT_ARGB);
//        Graphics2D g2d = circular.createGraphics();
//        g2d.setClip(new java.awt.geom.Ellipse2D.Float(0, 0, diametro, diametro));
//        g2d.drawImage(imagen, 0, 0, diametro, diametro, null);
//        g2d.dispose();
//        return circular;
//    }
    public void actualizarJSON(){
        try {
            Gson gson = new Gson();
            String json = gson.toJson(competencias);
            BufferedWriter bw = new BufferedWriter(new FileWriter(SesionForm.COMPETENCIAS_LOCATION, false));
            bw.write(json);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void actualizarUsuarios(){
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
    
    public void tablaaExcel(JTable tabla, String file){
        TableModel model = tabla.getModel();
        Workbook archivo = new XSSFWorkbook();
        org.apache.poi.ss.usermodel.Sheet sheet = archivo.createSheet("Hoja1");
        Row headerRow = sheet.createRow(0);
        for (int i = 0; i < model.getColumnCount(); i++){
            headerRow.createCell(i).setCellValue(model.getColumnName(i));
        }
        for (int i = 0; i < model.getRowCount(); i++){
            Row row = sheet.createRow(i + 1);
            for (int j = 0; j < model.getColumnCount(); j++){
                row.createCell(j).setCellValue(model.getValueAt(i, j).toString());
            }
        }
        try (FileOutputStream fileOut = new FileOutputStream(file)){
            archivo.write(fileOut);
            archivo.close();
            JOptionPane.showMessageDialog(null, "El archivo se creó en la carpeta especificada");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void inscritos(Usuario u, Competencia C, Competencia CUsuario){
        JPanel panelU = new JPanel();
        panelU.setLayout(new GridLayout(1, 4));
//        panelU.setSize(panelVariable.getWidth(), panelVariable.getHeight());
        JLabel foto = new JLabel();
        foto.setSize(40,40);
        imageToLabel(foto, u.getFoto());
        foto.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel nombreU = new JLabel(u.getName());
        nombreU.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton si = new JButton("Asistió");
        si.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea confirmar a " + u.getName() + " como ganador de la competencia " + C.getNombre() + "?");
                if(seleccion == JOptionPane.YES_OPTION){
                    C.setConcursantes(C.getConcursantes()+1);
                    u.getCompetencias().remove(CUsuario);
                    u.setGanadas(u.getGanadas()+1);
                    C.setGanador(u);
                    actualizarJSON();
                    actualizarUsuarios();
                    panelVariable.removeAll();
                    panelVariable.setLayout(new BoxLayout(panelVariable, BoxLayout.Y_AXIS));
                    JLabel nombreC = new JLabel(C.getNombre());
                    nombreC.setAlignmentX(Component.CENTER_ALIGNMENT);
                    JLabel descrip = new JLabel(C.getDescrip());
                    descrip.setAlignmentX(Component.CENTER_ALIGNMENT);
                    panelVariable.add(nombreC);
                    panelVariable.add(descrip);
                    for (int i = 0; i < usuarios.size(); i++) {
                        for (int j = 0; j < usuarios.get(i).getCompetencias().size(); j++) {
                        if(C.getNombre().equals(usuarios.get(i).getCompetencias().get(j).getNombre())){
                        inscritos(usuarios.get(i), C, usuarios.get(i).getCompetencias().get(j));
                        }
                        }
                    }
                    panelVariable.updateUI();
                } else {
                    C.setConcursantes(C.getConcursantes()+1);
                    u.getCompetencias().remove(CUsuario);
                    actualizarJSON();
                    actualizarUsuarios();
                    panelVariable.removeAll();
                    panelVariable.setLayout(new BoxLayout(panelVariable, BoxLayout.Y_AXIS));
                    JLabel nombreC = new JLabel(C.getNombre());
                    nombreC.setAlignmentX(Component.CENTER_ALIGNMENT);
                    JLabel descrip = new JLabel(C.getDescrip());
                    descrip.setAlignmentX(Component.CENTER_ALIGNMENT);
                    panelVariable.add(nombreC);
                    panelVariable.add(descrip);
                    for (int i = 0; i < usuarios.size(); i++) {
                        for (int j = 0; j < usuarios.get(i).getCompetencias().size(); j++) {
                        if(C.getNombre().equals(usuarios.get(i).getCompetencias().get(j).getNombre())){
                        inscritos(usuarios.get(i), C, usuarios.get(i).getCompetencias().get(j));
                        }
                        }
                    }
                    panelVariable.updateUI();
                }
            }
        });
        si.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton no = new JButton("No asistió");
        no.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                C.setInnasistentes(C.getInnasistentes()+1);
                u.setInnasistencias(u.getInnasistencias()+1);
                u.getCompetencias().remove(CUsuario);
                actualizarJSON();
                    actualizarUsuarios();
                    panelVariable.removeAll();
                    panelVariable.setLayout(new BoxLayout(panelVariable, BoxLayout.Y_AXIS));
                    JLabel nombreC = new JLabel(C.getNombre());
                    nombreC.setAlignmentX(Component.CENTER_ALIGNMENT);
                    JLabel descrip = new JLabel(C.getDescrip());
                    descrip.setAlignmentX(Component.CENTER_ALIGNMENT);
                    panelVariable.add(nombreC);
                    panelVariable.add(descrip);
                    for (int i = 0; i < usuarios.size(); i++) {
                        for (int j = 0; j < usuarios.get(i).getCompetencias().size(); j++) {
                        if(C.getNombre().equals(usuarios.get(i).getCompetencias().get(j).getNombre())){
                        inscritos(usuarios.get(i), C, usuarios.get(i).getCompetencias().get(j));
                        }
                        }
                    }
                    panelVariable.updateUI(); 
            }
        });
        no.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelU.add(foto);
        panelU.add(nombreU);
        panelU.add(si);
        panelU.add(no);
        panelVariable.add(panelU);
        panelVariable.revalidate();
        panelVariable.updateUI();
    }
    public void imageToLabel(JLabel label, String imagen){
        try {
            BufferedImage imagen2 = ImageIO.read(new File(imagen));
            Image fotito = imagen2.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icono = new ImageIcon(fotito);
            label.setIcon(icono);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void cargarJSONS(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(SesionForm.COMPETENCIAS_LOCATION));
            String lectura;
            String resultado = "";
            while((lectura = br.readLine()) != null){
                resultado += lectura;
            }
            JSONParser parser = new JSONParser();
            JSONArray json = (JSONArray) parser.parse(resultado);
            for (int i = 0; i < json.size(); i++) {
                String json2 = "" + json.get(i);
                Competencia c = new Gson().fromJson(json2, Competencia.class);
                competencias.add(c);
                System.out.println(c.getNombre());
            }
            BufferedReader br2 = new BufferedReader(new FileReader(SesionForm.USUARIOS_LOCATION));
            String lectura2;
            String resultado2 = "";
            while((lectura2 = br2.readLine()) != null){
                resultado2 += lectura2;
            }
            JSONParser parser2 = new JSONParser();
            JSONArray json2 = (JSONArray) parser2.parse(resultado2);
            for (int i = 0; i < json2.size(); i++) {
                String json22 = "" + json2.get(i);
                Usuario user = new Gson().fromJson(json22, Usuario.class);
                usuarios.add(user);
                System.out.println(user.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    class DateLabelFormatter extends JFormattedTextField.AbstractFormatter{
        private String datePattern = "yyyy-MM-dd";
        private SimpleDateFormat dateFormatter = new SimpleDateFormat();

        @Override
        public Object stringToValue(String text) throws ParseException {
            return dateFormatter.parseObject(text);
        }

        @Override
        public String valueToString(Object value) throws ParseException {
            if(value!=null){
                Calendar cal = (Calendar) value;
                return dateFormatter.format(cal.getTime());
            }
            return "";
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnVariable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelCompetencias;
    private javax.swing.JPanel panelVariable;
    private javax.swing.JScrollPane scrollCompetencias;
    // End of variables declaration//GEN-END:variables
}
