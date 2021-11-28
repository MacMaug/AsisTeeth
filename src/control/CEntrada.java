package control;

import com.toedter.calendar.JDateChooser;
import static java.lang.Integer.parseInt;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CEntrada {
    
    //VALIDACIÓN DATO NUMERICO
    public boolean datoEsNumerico(JTextField txtNumero){
        String numero = txtNumero.getText();
        int cant;
        if(txtNumero.getText().isEmpty())return true;
        try{
            cant = Integer.parseInt(numero);
            System.out.println(cant);
            if(cant<1){
                JOptionPane.showMessageDialog(null, "Número fuera del rango aceptado.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Introduzca un valor numérico.", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumero.setText(null);
            return false;
        }
        return true;
    }
 
    
    //VALIDACIÓN NOMBRE
    public boolean validarNombreApellido(JTextField txtNombre){
        if(txtNombre.getText().isEmpty()==false){
            if(txtNombre.getText().matches("^([A-Za-zñáéíóúü]+[ ]?){2}$")==false){
                JOptionPane.showMessageDialog(null,"Debe introducir el nombre y el apellido únicamente usando letras y espacios.","Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
    
    //VALIDACIÓN OCUPACIÓN
    public boolean validarOcupacion(JTextField txtOcupacion){
        if(txtOcupacion.getText().isEmpty()==false){
            if(txtOcupacion.getText().matches("^([A-Za-zñáéíóúü]+[ ]?){3}$")==false){
                JOptionPane.showMessageDialog(null,"Debe introducir la ocupación (hasta tres palabras) únicamente usando letras y espacios.","Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
    
    public boolean validarLugarNacimiento(JTextField txtLugarNacimiento){
        if(txtLugarNacimiento.getText().isEmpty()==false){
            if(txtLugarNacimiento.getText().matches("^([A-Za-zñáéíóúü]+[,]?+[ ]?){3}$")==false){
                JOptionPane.showMessageDialog(null,"Debe introducir el lugar de nacimiento (hasta tres palabras) únicamente usando letras, espacios y comas.","Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
    
    public boolean validarColorOrina(JTextField txtOrina){
        if(txtOrina.getText().isEmpty()==false){
            if(txtOrina.getText().matches("^([A-Za-zñáéíóúü]+[/]?+[ ]?){3}$")==false){
                JOptionPane.showMessageDialog(null,"Al introducir el color no se deben utilizar caracteres numéricos o especiales.","Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
    
    //VALIDACIÓN TELÉFONO
    public boolean validarTelf(JTextField txtTelf,int dig){
        if(txtTelf.getText().isEmpty()==false){
            if(datoEsNumerico(txtTelf)==false) return false;
            if(dig==4 && txtTelf.getText().matches("[0]?\\d{3}")==false){
                JOptionPane.showMessageDialog(null,"Debe introducir un prefijo telefónico.\nEjemplo: 0212 ó 212","Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }   
            if(dig==7 && txtTelf.getText().matches("\\d{7}")==false){
                JOptionPane.showMessageDialog(null,"Debe introducir los últimos 7 dígitos del número telefónico.","Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }   
        }
        return true;
    }
    
    
    //VALIDACIÓN EDAD
    public boolean validarEdad(JTextField txtEdad){
        int edad = 0;
        if(txtEdad.getText().isEmpty()==false){
            if(datoEsNumerico(txtEdad)==false) return false;
            edad = Integer.parseInt(txtEdad.getText());
            if(edad>100){
                JOptionPane.showMessageDialog(null,"Edad fuera del rango aceptado.","Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }   
        }
        return true;
    }
    
    //LIMITAR JDATECHOOSER
    public void fechaMaxima(Date fecha, JDateChooser calendario){
        calendario.setMaxSelectableDate(fecha);
    }
    
    //HABILITAR/DESHABILITAR ENTRADA
    public void habilitarTxt(JRadioButton radio, JTextField txt1, JTextField txt2, JTextField txt3){
        txt1.setEnabled(radio.isSelected());
        txt2.setEnabled(radio.isSelected());
        txt3.setEnabled(radio.isSelected());
    }
    
    public void habilitarTxt(JRadioButton radio, JTextField txt1, JTextField txt2){
        txt1.setEnabled(radio.isSelected());
        txt2.setEnabled(radio.isSelected());
    }
    
    public void habilitarTxt(JRadioButton radio, JTextField txt){
        txt.setEnabled(radio.isSelected());
    }
    
    public void habilitarTxt(JComboBox combo, JTextField txt){
        txt.setEnabled(combo.getSelectedItem().equals("Sí"));
    }
    
    
    public void habilitarRadios(JRadioButton noAplica, JRadioButton radio1, JRadioButton radio2, JRadioButton radio3, JRadioButton radio4, JRadioButton radio5){
        radio1.setEnabled(!noAplica.isSelected());
        radio2.setEnabled(!noAplica.isSelected());
        radio3.setEnabled(!noAplica.isSelected());
        radio4.setEnabled(!noAplica.isSelected());
        radio5.setEnabled(!noAplica.isSelected());
    }
    
    public void habilitarCombo(JRadioButton radio, JComboBox combo){
        combo.setEnabled(radio.isSelected());
    }
    
    public void habilitarCombo(JRadioButton radio, JComboBox combo1, JComboBox combo2){
        combo1.setEnabled(radio.isSelected());
        combo2.setEnabled(radio.isSelected());
    }
    
    public void habilitarRadios(JRadioButton noAplica, JRadioButton radio1, JRadioButton radio2){
        radio1.setEnabled(!noAplica.isSelected());
        radio2.setEnabled(!noAplica.isSelected());
    }
    
    public void habilitarCalendario(JRadioButton radio, JDateChooser calendario){
        calendario.setEnabled(radio.isSelected());
    }
 
    public void habilitarAntecedenteCardiovasculares(JRadioButton noAplica, JTextField txt, JRadioButton radio1, JRadioButton radio2, JRadioButton radio3, JRadioButton radio4, JRadioButton radio5, JRadioButton radio6, JRadioButton radio7, JRadioButton radio8, JRadioButton radio9, JRadioButton radio10){
        if(noAplica.isSelected()) txt.setEnabled(false);
        habilitarRadios(noAplica,radio1,radio2,radio3,radio4,radio5);
        habilitarRadios(noAplica,radio6,radio7,radio8,radio9,radio10);
    }
    
    public void habilitarAntecedenteFemenino(JRadioButton noAplica, JComboBox combo, JRadioButton radio1, JRadioButton radio2, JRadioButton radio3, JRadioButton radio4, JRadioButton radio5){
        if(noAplica.isSelected()) combo.setEnabled(false);
        habilitarRadios(noAplica,radio1,radio2,radio3,radio4,radio5);
    }
    
    public void habilitarAntecedenteAlergicos(JRadioButton noAplica, JTextField txt1, JTextField txt2, JTextField txt3, JRadioButton radio1, JRadioButton radio2, JRadioButton radio3, JRadioButton radio4, JRadioButton radio5){
        if(noAplica.isSelected()){
            txt1.setEnabled(false);
            txt2.setEnabled(false);
        }
        txt3.setEnabled(!noAplica.isSelected());
        habilitarRadios(noAplica,radio1,radio2,radio3,radio4,radio5);
    }
    
    public void habilitarAntecedenteNM(JRadioButton noAplica, JTextField txt, JRadioButton radio1, JRadioButton radio2, JRadioButton radio3, JRadioButton radio4, JRadioButton radio5, JRadioButton radio6, JRadioButton radio7, JRadioButton radio8, JRadioButton radio9, JRadioButton radio10, JRadioButton radio11, JRadioButton radio12){
        if(noAplica.isSelected()) txt.setEnabled(false);
        habilitarRadios(noAplica,radio1,radio2,radio3,radio4,radio5);
        habilitarRadios(noAplica,radio6,radio7,radio8,radio9,radio10);
        habilitarRadios(noAplica,radio11,radio12);
    }
    
    public void habilitarAntecedenteInfecciosas(JRadioButton noAplica, JComboBox combo, JTextField txt1, JTextField txt2, JTextField txt3, JRadioButton radio1, JRadioButton radio2, JRadioButton radio3, JRadioButton radio4, JRadioButton radio5){
        if(noAplica.isSelected()){
            txt1.setEnabled(false);
            txt2.setEnabled(false);
            txt3.setEnabled(false);
            combo.setEnabled(false);
        }
        habilitarRadios(noAplica,radio1,radio2,radio3,radio4,radio5);
    }
    
    public void habilitarAntecedenteNeurologicos(JRadioButton noAplica, JTextField txt, JDateChooser calendario, JRadioButton radio1, JRadioButton radio2, JRadioButton radio3, JRadioButton radio4, JRadioButton radio5, JRadioButton radio6, JRadioButton radio7){
        if(noAplica.isSelected()){
            txt.setEnabled(false);
            calendario.setEnabled(false);
        }
        habilitarRadios(noAplica,radio1,radio2,radio3,radio4,radio5);
        habilitarRadios(noAplica,radio6,radio7);
    }
    
    public void habilitarAntecedenteHematologicos(JRadioButton noAplica, JTextField txt1, JTextField txt2, JRadioButton radio1, JRadioButton radio2, JRadioButton radio3, JRadioButton radio4){
        if(noAplica.isSelected()){
            txt1.setEnabled(false);
            txt2.setEnabled(false);
        }
        habilitarRadios(noAplica,radio1,radio2);
        habilitarRadios(noAplica,radio3,radio4);
    }
    
    public void habilitarAntecedenteFamiliares(JRadioButton noAplica, JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JTextField txt6, JComboBox combo, JRadioButton radio1, JRadioButton radio2, JRadioButton radio3, JRadioButton radio4, JRadioButton radio5){
        if(noAplica.isSelected()){
            txt1.setEnabled(false);
            txt2.setEnabled(false);
            txt3.setEnabled(false);
            txt4.setEnabled(false);
            txt5.setEnabled(false);
        }
        txt6.setEnabled(!noAplica.isSelected());
        combo.setEnabled(!noAplica.isSelected());
        habilitarRadios(noAplica,radio1,radio2,radio3,radio4,radio5);
    }
    
    public void habilitarTxtArea(JRadioButton radio, JTextArea txtArea1, JTextArea txtArea2, JTextArea txtArea3){
        txtArea1.setEnabled(radio.isSelected());
        txtArea2.setEnabled(radio.isSelected());
        txtArea3.setEnabled(radio.isSelected());
    }
    
    
    //VERIFICACION DE CAMPOS OBLIGATORIOS
    
    public boolean revisarFaltantesDP(JTextField txtCedula, JTextField txtNombre, JTextField txtTelf1, JTextField txtTelf2, JTextField txtEdad, JLabel labelFaltanteCedula, JLabel labelFaltanteNombre, JLabel labelFaltanteTelf, JLabel labelFaltanteEdad){
        labelFaltanteCedula.setVisible(txtCedula.getText().isEmpty());
        labelFaltanteNombre.setVisible(txtNombre.getText().isEmpty());
        if(txtTelf1.getText().isEmpty() || txtTelf2.getText().isEmpty()) labelFaltanteTelf.setVisible(true);
        else labelFaltanteTelf.setVisible(false);
        labelFaltanteEdad.setVisible(txtEdad.getText().isEmpty());
        
        if(txtCedula.getText().isEmpty() || txtNombre.getText().isEmpty() || (txtTelf1.getText().isEmpty() || txtTelf2.getText().isEmpty()) || (txtEdad.getText().isEmpty()))
            return true;
        return false;
    }
    
    public boolean revisarFaltantesES(JTextField txtMotivo, JTextField txtMedicamento, JComboBox comboMedicamento, JLabel labelFaltanteMotivo, JLabel labelFaltanteMedicamento){
        labelFaltanteMotivo.setVisible(txtMotivo.getText().isEmpty());
        if(comboMedicamento.getSelectedItem().equals("Sí") && txtMedicamento.getText().isEmpty()){
            labelFaltanteMedicamento.setVisible(true);
        }
        else labelFaltanteMedicamento.setVisible(false);
        
        if(txtMotivo.getText().isEmpty() || (comboMedicamento.getSelectedItem().equals("Sí") && txtMedicamento.getText().isEmpty()))
            return true;
        return false;
    }
    
    public boolean revisarFaltantesAntecedentes(JTextField txtCuandoInfarto, JTextField txtAlergicoMedicamento, JTextField txtCausaHemorragia, JLabel labelFaltanteCardio, JLabel labelFaltanteAlergico, JLabel labelFaltanteHematologicas, JRadioButton radioNoAplicaC, JRadioButton radioNoAplicaA, JRadioButton radioNoAplicaH, JRadioButton radioInfarto, JRadioButton radioMedAlergico, JRadioButton radioHemorragia){
        labelFaltanteCardio.setVisible(!radioNoAplicaC.isSelected() && radioInfarto.isSelected() && txtCuandoInfarto.getText().isEmpty());
        labelFaltanteAlergico.setVisible(!radioNoAplicaA.isSelected() && radioMedAlergico.isSelected() && txtAlergicoMedicamento.getText().isEmpty());
        labelFaltanteHematologicas.setVisible(!radioNoAplicaH.isSelected() && radioHemorragia.isSelected() && txtCausaHemorragia.getText().isEmpty());         
        
        if((!radioNoAplicaC.isSelected() && radioInfarto.isSelected() && txtCuandoInfarto.getText().isEmpty()) || (!radioNoAplicaA.isSelected() && radioMedAlergico.isSelected() && txtAlergicoMedicamento.getText().isEmpty()) || (!radioNoAplicaH.isSelected() && radioHemorragia.isSelected() && txtCausaHemorragia.getText().isEmpty()))
            return true;
        return false;
    }
    
    public boolean revisarFaltantesExC(JTextArea txtLabios, JTextField txtFrenillosLabiales, JTextField txtVestibuloBucal, JTextField txtMucosaPalatina, JTextArea txtMucosaPisoBoca, JTextField txtFrenilloLingual, JTextField txtCaraDorsal, JTextField txtCaraVentral, JTextField txtBordesLaterales, JTextField txtEncias, JTextArea txtDientes, JTextField txtMaxima, JTextField txtMinima, JTextField txtLocalizacion, JTextField txtCaracteristicas, JRadioButton radioIncluirTensionArterial, JRadioButton radioIncluirPalpacion, JRadioButton radioPalpables, JLabel labelExamenCBFaltante, JLabel labelMaximaFaltante, JLabel labelMinimaFaltante, JLabel labelCaracteristicasFaltante, JLabel labelLocalizacionFaltante){
        labelExamenCBFaltante.setVisible(txtLabios.getText().isEmpty() || txtFrenillosLabiales.getText().isEmpty() || txtVestibuloBucal.getText().isEmpty() || txtMucosaPalatina.getText().isEmpty() || txtMucosaPisoBoca.getText().isEmpty() || txtFrenilloLingual.getText().isEmpty() || txtCaraDorsal.getText().isEmpty() || txtCaraVentral.getText().isEmpty() || txtBordesLaterales.getText().isEmpty() || txtEncias.getText().isEmpty() || txtDientes.getText().isEmpty());
        labelMaximaFaltante.setVisible(radioIncluirTensionArterial.isSelected() && txtMaxima.getText().isEmpty());
        labelMinimaFaltante.setVisible(radioIncluirTensionArterial.isSelected() && txtMinima.getText().isEmpty());
        labelLocalizacionFaltante.setVisible(radioPalpables.isSelected() && radioIncluirPalpacion.isSelected() && txtLocalizacion.getText().isEmpty());
        labelCaracteristicasFaltante.setVisible(radioPalpables.isSelected() && radioIncluirPalpacion.isSelected() && txtCaracteristicas.getText().isEmpty());
        
        if((txtLabios.getText().isEmpty() || txtFrenillosLabiales.getText().isEmpty() || txtVestibuloBucal.getText().isEmpty() || txtMucosaPalatina.getText().isEmpty() || txtMucosaPisoBoca.getText().isEmpty() || txtFrenilloLingual.getText().isEmpty() || txtCaraDorsal.getText().isEmpty() || txtCaraVentral.getText().isEmpty() || txtBordesLaterales.getText().isEmpty() || txtEncias.getText().isEmpty() || txtDientes.getText().isEmpty())
                    || (radioIncluirTensionArterial.isSelected() && txtMaxima.getText().isEmpty())
                    || (radioIncluirTensionArterial.isSelected() && txtMinima.getText().isEmpty())
                    || (radioPalpables.isSelected() && radioIncluirPalpacion.isSelected() && txtLocalizacion.getText().isEmpty())
                    || (radioPalpables.isSelected() && radioIncluirPalpacion.isSelected() && txtCaracteristicas.getText().isEmpty()))
            return true;
        return false;
    }
    
    public boolean revisarFaltantesDiagnostico(JTextArea txtPresuntivo, JTextArea txtHistopatologico, JTextArea txtDefinitivo, JLabel labelFaltantesDiagnostico){
        labelFaltantesDiagnostico.setVisible(txtPresuntivo.getText().isEmpty() || txtHistopatologico.getText().isEmpty() || txtDefinitivo.getText().isEmpty());
        
        if(txtPresuntivo.getText().isEmpty() || txtHistopatologico.getText().isEmpty() || txtDefinitivo.getText().isEmpty())
            return true;
        return false;
    }
    
}
