/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import control.CBuscar;
import control.CEntrada;
import control.CVentana;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author jdfer
 */
public class BuscarConsulta extends javax.swing.JFrame {
    Odontologo odontologo;
    CEntrada controlEntrada = new CEntrada();
    CVentana controlVentana = new CVentana();
    CBuscar controlBuscar = new CBuscar();
    /**
     * Creates new form BuscarConsulta
     */
    public BuscarConsulta() {
        initComponents();
    }
    
    public BuscarConsulta(Odontologo odontologo) {
        initComponents();
        controlVentana.colocarFechaUsuario(labelFecha, labelUsuario, odontologo);
        controlVentana.iniciarVentana(this);
        this.odontologo = odontologo;
        controlVentana.iniciarVentana(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        panelBusqueda = new javax.swing.JPanel();
        labelCedulaPaciente = new javax.swing.JLabel();
        txtCedulaPaciente = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsultas = new javax.swing.JTable();
        botonAbrir = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTitulo.setBackground(new java.awt.Color(0, 102, 204));

        labelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        labelTitulo.setFont(new java.awt.Font("Nirmala UI", 0, 60)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Buscar consulta");

        labelUsuario.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Nombre de usuario");

        labelFecha.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha.setText("Fecha");

        panelBusqueda.setBackground(new java.awt.Color(255, 255, 255));

        labelCedulaPaciente.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        labelCedulaPaciente.setText("Cédula del paciente:");

        txtCedulaPaciente.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        txtCedulaPaciente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaPacienteFocusLost(evt);
            }
        });
        txtCedulaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaPacienteActionPerformed(evt);
            }
        });

        botonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        botonBuscar.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(0, 0, 0));
        botonBuscar.setText("Buscar");
        botonBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        tablaConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaConsultas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tablaConsultasFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tablaConsultas);

        botonAbrir.setBackground(new java.awt.Color(102, 153, 255));
        botonAbrir.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        botonAbrir.setForeground(new java.awt.Color(255, 255, 255));
        botonAbrir.setText("Abrir");
        botonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAbrir)
                    .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelBusquedaLayout.createSequentialGroup()
                            .addComponent(labelCedulaPaciente)
                            .addGap(18, 18, 18)
                            .addComponent(txtCedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonBuscar))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCedulaPaciente)
                    .addComponent(txtCedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(botonAbrir)
                .addGap(48, 48, 48))
        );

        botonSalir.setBackground(new java.awt.Color(255, 51, 51));
        botonSalir.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(botonSalir)
                .addContainerGap())
            .addComponent(panelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelTitulo)
                        .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTituloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSalir))))
                .addGap(1, 1, 1)
                .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaPacienteActionPerformed

    private void txtCedulaPacienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaPacienteFocusLost

    }//GEN-LAST:event_txtCedulaPacienteFocusLost

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        if(!controlEntrada.datoEsNumerico(txtCedulaPaciente)) txtCedulaPaciente.setText(null);
        else if (!odontologo.buscarPaciente(Integer.parseInt(txtCedulaPaciente.getText())))
            JOptionPane.showMessageDialog(null,"Paciente no encontrado.","Error",JOptionPane.ERROR_MESSAGE);
        else
            controlBuscar.llenarTabla(tablaConsultas, odontologo, txtCedulaPaciente);
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbrirActionPerformed
       if(tablaConsultas.getSelectedRow()!=-1){
            Paciente paciente = controlBuscar.obtenerPacienteSeleccionado(tablaConsultas, odontologo);
            Consulta consulta = controlBuscar.obtenerConsultaSeleccionada(tablaConsultas, odontologo, paciente);
            VerConsulta verConsulta = new VerConsulta(paciente,consulta,odontologo);
            verConsulta.setVisible(true);
       }
    }//GEN-LAST:event_botonAbrirActionPerformed

    private void tablaConsultasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tablaConsultasFocusGained
        if(!tablaConsultas.getSelectionModel().isSelectionEmpty())
            botonAbrir.setEnabled(true);
    }//GEN-LAST:event_tablaConsultasFocusGained

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
            java.util.logging.Logger.getLogger(BuscarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAbrir;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCedulaPaciente;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTable tablaConsultas;
    private javax.swing.JTextField txtCedulaPaciente;
    // End of variables declaration//GEN-END:variables
}
