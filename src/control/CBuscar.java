package control;

import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Consulta;
import modelo.Odontologo;
import modelo.Paciente;

public class CBuscar {
    
    
    public void ajustarTabla(JTable tabla, String matriz[][],String titulo[]){
        TableModel model = new DefaultTableModel(matriz,titulo);
        tabla.setRowHeight(30);
        tabla.setModel(model);
        tabla.setDefaultEditor(Object.class, null);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
    }
    
    public void llenarTabla(JTable tabla, Odontologo odontologo, JTextField txtInfo, int indice){
        String titulo[]={"Fecha","Nombre","Cédula","N° Historia Médica","N° consulta"};
        Paciente pac;

        if(indice==0)
            pac=odontologo.buscarObjetoPaciente(Integer.parseInt(txtInfo.getText()));
        else
            pac=odontologo.buscarObjetoPacienteHM(Integer.parseInt(txtInfo.getText()));
        
        
        String matriz[][]=new String[pac.getListaConsultas().size()][5];
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        
        for (int i=0;i<pac.getListaConsultas().size();i++){
            matriz[i][0] = formatter.format(pac.getListaConsultas().get(i).getFecha());
            matriz[i][1] = pac.getNombre();
            matriz[i][2] = Integer.toString(pac.getCedula());
            matriz[i][3] = Integer.toString(pac.getHistoriaClinica());
            matriz[i][4] = Integer.toString(pac.getListaConsultas().get(i).getCodigo());
        }
        
        ajustarTabla(tabla, matriz, titulo);
        
    }
    
    public void llenarTabla(JTable tabla, Odontologo odontologo, Date fecha){
        String titulo[]={"Fecha","Nombre","Cédula","N° Historia Médica","N° consulta"};   
        
        String matriz[][]=new String[odontologo.numeroConsultasPorFecha(fecha)][5];
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        int i=0;
        for (Paciente pac : odontologo.getListaPacientes()){
            for(Consulta con : pac.getListaConsultas()){
                if((formatter.format(fecha)).equals(formatter.format(con.getFecha()))){
                    matriz[i][0] = formatter.format(fecha);
                    matriz[i][1] = pac.getNombre();
                    matriz[i][2] = Integer.toString(pac.getCedula());
                    matriz[i][3] = Integer.toString(pac.getHistoriaClinica());
                    matriz[i][4] = Integer.toString(con.getCodigo());
                    i++;
                }
            }
        }
        
        ajustarTabla(tabla,matriz,titulo);
    }
    
    
    
    public Paciente obtenerPacienteSeleccionadoCed(JTable tabla,Odontologo odontologo){
        int indice = tabla.getSelectedRow();   
        int cedula = Integer.parseInt(tabla.getModel().getValueAt(indice,2).toString());
        Paciente pac = odontologo.buscarObjetoPaciente(cedula);
        return pac;
    }

    public Consulta obtenerConsultaSeleccionada(JTable tabla,Odontologo odontologo, Paciente pac){
        int indice = tabla.getSelectedRow();   
        int codigo = Integer.parseInt(tabla.getModel().getValueAt(indice,4).toString());
        Consulta consulta = pac.buscarConsultaPorCodigo(codigo);
        return consulta;
    }
    
    public void cambiarCampo(JComboBox combo, JTextField texto, JDateChooser calendario){
        calendario.setVisible(combo.getSelectedIndex()==1);
        texto.setVisible(!(combo.getSelectedIndex()==1));
    }
    
    
    
}
