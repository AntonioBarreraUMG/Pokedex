/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Modelo.AccesoDatosJDBC;
import Modelo.ClsConexion;
import Modelo.UsuarioJDBC;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author linda
 */
public class Filtros extends javax.swing.JFrame {

    /**
     * Creates new form Filtros
     */
    private final DefaultTableModel modelo;
    private final BufferedImage buffer1 = null;
    private final Image imagen1 = null;
    private int contador = 0;
    private ResultSet resultadoConsulta;
    private String columna = "";
    private String valor = "";
    private String USER = "";
    
    public Filtros() {
        initComponents();     
        modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("height");
        modelo.addColumn("weight");
        modelo.addColumn("species");
        modelo.addColumn("capture_rate");
        this.TablaMostrar.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboFiltroColores = new javax.swing.JComboBox<>();
        cboFiltroHabitat = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMostrar = new javax.swing.JTable();
        btnEnviarCorreo = new javax.swing.JButton();
        btnGenerarPDF = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtRateCaptura = new javax.swing.JTextField();
        txtExperienciaBase = new javax.swing.JTextField();
        btnFiltroCaptura = new javax.swing.JButton();
        btnFiltroExperiencia = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboFiltroColores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar opción", "red", "green", "white", "brown", "yellow", "purple", "blue", "pink", "gray", "black" }));
        cboFiltroColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFiltroColoresActionPerformed(evt);
            }
        });

        cboFiltroHabitat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar opción", "grassland", "mountain", "forest", "rough terrain", "cave", "urban", "sea", "rare" }));
        cboFiltroHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFiltroHabitatActionPerformed(evt);
            }
        });

        jLabel1.setText("Color:");

        jLabel2.setText("Habitat:");

        jLabel3.setText("Experiencia Base:");

        jLabel4.setText("Rate de Captura:");

        TablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "name", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaMostrar);

        btnEnviarCorreo.setText("Enviar por correo");
        btnEnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCorreoActionPerformed(evt);
            }
        });

        btnGenerarPDF.setText("Convertir PDF");
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel5.setText("Filtros pokedex");

        btnFiltroCaptura.setText("->");
        btnFiltroCaptura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroCapturaActionPerformed(evt);
            }
        });

        btnFiltroExperiencia.setText("->");
        btnFiltroExperiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroExperienciaActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(cboFiltroColores, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2)
                                            .addComponent(cboFiltroHabitat, 0, 145, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtRateCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnFiltroCaptura))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRegresar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtExperienciaBase, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFiltroExperiencia))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(btnEnviarCorreo)
                                .addGap(52, 52, 52)
                                .addComponent(btnGenerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnRegresar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboFiltroColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboFiltroHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRateCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFiltroCaptura)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtExperienciaBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFiltroExperiencia))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviarCorreo)
                    .addComponent(btnGenerarPDF))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setUSER(String usuario) {
        this.USER = usuario;
    }
    
    private void llenarTabla(String consul){    
        String tabla = "pokemon ";
        try {
            resultadoConsulta = AccesoDatosJDBC.ejecutarConsulta(tabla, consul);
            String []info = new String[7];
            while (resultadoConsulta.next()){
                info[0] = resultadoConsulta.getString(1);
                info[1] = resultadoConsulta.getString(2);
                info[2] = resultadoConsulta.getString(5);
                info[3] = resultadoConsulta.getString(10);
                info[4] = resultadoConsulta.getString(11);
                info[5] = resultadoConsulta.getString(12);
                info[6] = resultadoConsulta.getString(17);
                modelo.addRow(info);
            } 
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    private void filtrarDatos(String columna, String valor) {
        if (!Objects.equals(valor, "Seleccionar opción")) {
            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }
            llenarTabla("WHERE " + columna + " = '" + valor + "'");
        }
    }
    
    private void generarPDF(String columna, String valor){
        JasperReport jasperReport;
        JasperPrint jasperPrint; 
        Map parametros = null;
        try
        {
            if (!Objects.equals(columna, "") && !Objects.equals(valor, "")) {
                parametros = new HashMap();
                parametros.put("columna", columna);
                parametros.put("valor", valor);
            }
            String path = "C:\\Users\\jeant\\Documents\\NetBeansProjects\\Pokedex\\src\\main\\java\\Reportes\\ReportePokemon.jasper";
            jasperReport = (JasperReport) JRLoader.loadObjectFromFile(path);
            jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, ClsConexion.getConnection());
            JasperExportManager.exportReportToPdfFile( jasperPrint, "C:\\Users\\jeant\\Downloads\\ReportePokemon" + (columna.substring(0,1).toUpperCase() + columna.substring(1).toLowerCase()) + ".pdf");
        }
        catch (JRException ex) {
          System.err.println( "Error iReport: " + ex.getMessage());
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    private void enviarCorreo(String destinatario, String path) {
        try {
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            
            Session session = Session.getDefaultInstance(props);
            
            String correoRemitente = "proyectofinalpokedex@gmail.com";
            String passwordRemitente = "Poke1234";
            String correoReceptor = destinatario;
            
            String asunto = "Reporte Pokemon";
            
            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(new DataHandler(new FileDataSource(path)));
            adjunto.setFileName("Reporte.pdf");
            
            MimeMultipart multiparte = new MimeMultipart();
            multiparte.addBodyPart(adjunto);
            
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setContent(multiparte);
            
            Transport t = session.getTransport("smtp");
            t.connect(correoRemitente,passwordRemitente);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();
        } catch (AddressException ex) {
            ex.printStackTrace(System.out);
        } catch (MessagingException ex) {
            ex.printStackTrace(System.out);
        }                                         
    }
      
    private void btnEnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCorreoActionPerformed
        try {
            generarPDF(columna, valor);
            String destinatario = UsuarioJDBC.selectCorreo(USER);
            String tipoFiltro = columna.substring(0,1).toUpperCase() + columna.substring(1).toLowerCase();
            String path = "C:\\Users\\jeant\\Downloads\\ReportePokemon" + tipoFiltro + ".pdf";
            enviarCorreo(destinatario, path);
            File reporte = new File(path);
            reporte.delete();
            JOptionPane.showMessageDialog(null,"Correo Electrónico enviado con exito.");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
    }//GEN-LAST:event_btnEnviarCorreoActionPerformed

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        try {
            generarPDF(columna, valor);
            JOptionPane.showMessageDialog(null, "Tu reporte ha sido guardado en la carpeta de descargas.");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
        
    }//GEN-LAST:event_btnGenerarPDFActionPerformed

    private void cboFiltroColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFiltroColoresActionPerformed
        columna = "color";
        valor = cboFiltroColores.getSelectedItem().toString();
        filtrarDatos(columna, valor);
        cboFiltroColores.setSelectedIndex(0);
    }//GEN-LAST:event_cboFiltroColoresActionPerformed

    private void btnFiltroCapturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroCapturaActionPerformed
        columna = "capture_rate";
        valor = txtRateCaptura.getText();
        filtrarDatos(columna, valor);
        txtRateCaptura.setText("");
    }//GEN-LAST:event_btnFiltroCapturaActionPerformed

    private void cboFiltroHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFiltroHabitatActionPerformed
        columna = "habitat";
        valor = cboFiltroHabitat.getSelectedItem().toString();
        filtrarDatos(columna, valor);
        cboFiltroHabitat.setSelectedIndex(0);
    }//GEN-LAST:event_cboFiltroHabitatActionPerformed
  
    private void btnFiltroExperienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroExperienciaActionPerformed
        columna = "base_experience";
        valor = txtExperienciaBase.getText();
        filtrarDatos(columna, valor);
        txtExperienciaBase.setText("");
    }//GEN-LAST:event_btnFiltroExperienciaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        VentanaPokedex ventanaPoke = new VentanaPokedex();
        ventanaPoke.setUSER(USER);
        ventanaPoke.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaMostrar;
    private javax.swing.JButton btnEnviarCorreo;
    private javax.swing.JButton btnFiltroCaptura;
    private javax.swing.JButton btnFiltroExperiencia;
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cboFiltroColores;
    private javax.swing.JComboBox<String> cboFiltroHabitat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtExperienciaBase;
    private javax.swing.JTextField txtRateCaptura;
    // End of variables declaration//GEN-END:variables
}
