package control;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Consulta;
import modelo.Odontologo;
import modelo.Paciente;

public class CBuscar {
    
    public void llenarTabla(JTable tabla, Odontologo odontologo, JTextField txtCedula){
        String titulo[]={"Cédula","Nombre","Fecha","Número de consulta"};
        Paciente pac = odontologo.buscarObjetoPaciente(Integer.parseInt(txtCedula.getText()));
        String matriz[][]=new String[pac.getListaConsultas().size()][4];
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");


        for (int i=0;i<pac.getListaConsultas().size();i++){
            matriz[i][0] = Integer.toString(pac.getCedula());
            matriz[i][1] = pac.getNombre();
            matriz[i][2] = formatter.format(new Date());
            matriz[i][3] = Integer.toString(pac.getListaConsultas().get(i).getCodigo());
        }
        
        TableModel model = new DefaultTableModel(matriz,titulo);
        tabla.setModel(model);
        tabla.setDefaultEditor(Object.class, null);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
    }
    
    public Paciente obtenerPacienteSeleccionado(JTable tabla,Odontologo odontologo){
        int indice = tabla.getSelectedRow();   
        int cedula = Integer.parseInt(tabla.getModel().getValueAt(indice,0).toString());
        Paciente pac = odontologo.buscarObjetoPaciente(cedula);
        return pac;
    }
    
    public Consulta obtenerConsultaSeleccionada(JTable tabla,Odontologo odontologo, Paciente pac){
        int indice = tabla.getSelectedRow();   
        int codigo = Integer.parseInt(tabla.getModel().getValueAt(indice,3).toString());
        Consulta consulta = pac.buscarConsultaPorCodigo(codigo);
        return consulta;
    }
    
    
    
}
