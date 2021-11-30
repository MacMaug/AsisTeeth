package control;

import com.toedter.calendar.JDateChooser;
import static java.lang.Integer.parseInt;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modelo.*;

public class CEntrada {
    
    //VALIDACIÓN DATO NUMERICO
    public boolean datoEsNumerico(JTextField txtNumero){
        String numero = txtNumero.getText();
        int cant;
        if(txtNumero.getText().isEmpty())return true;
        try{
            cant = Integer.parseInt(numero);
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
 
    
    public boolean datoEsNumericoSinMensaje(JTextField txtNumero){
        String numero = txtNumero.getText();
        int cant;
        if(txtNumero.getText().isEmpty())return true;
        try{
            cant = Integer.parseInt(numero);
            System.out.println(cant);
            if(cant<1)
                return false;
        }catch(NumberFormatException ex){
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
    
    
    public void pacienteRegistrado(Paciente paciente, JTextField txtCedula, JTextField txtNombre, JComboBox comboSexo, JLabel labelHistoriaMedica, JTextField txtLugarNacimiento, JButton botonDeshacerBusqueda){
        
        txtCedula.setEnabled(false);
        txtNombre.setText(paciente.getNombre());
        txtNombre.setEnabled(false);
        
        if(paciente.getSexo()=='M')
            comboSexo.setSelectedIndex(0);
        else 
            comboSexo.setSelectedIndex(1);
        comboSexo.setEnabled(false);
        
        labelHistoriaMedica.setText("Historia médica: "+paciente.getHistoriaClinica());
        labelHistoriaMedica.setVisible(true);
        
        txtLugarNacimiento.setText(paciente.getLugarNacimiento());
        txtLugarNacimiento.setEnabled(false);
        
        botonDeshacerBusqueda.setVisible(true);
    }
    
    public void deshacerBusqueda(JTextField txtCedula, JTextField txtNombre, JComboBox comboSexo, JLabel labelHistoriaMedica, JTextField txtLugarNacimiento, JButton botonDeshacerBusqueda){
        
        txtCedula.setEnabled(true);
        txtCedula.setText(null);
        
        txtNombre.setEnabled(true);
        txtNombre.setText(null);
        
        txtLugarNacimiento.setText(null);
        txtLugarNacimiento.setEnabled(true);
        
        comboSexo.setEnabled(true);
        labelHistoriaMedica.setVisible(false);
        botonDeshacerBusqueda.setVisible(false);
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
        labelLocalizacionFaltante.setVisible(radioIncluirPalpacion.isSelected() && txtLocalizacion.getText().isEmpty());
        labelCaracteristicasFaltante.setVisible(radioIncluirPalpacion.isSelected() && txtCaracteristicas.getText().isEmpty());
        
        if((txtLabios.getText().isEmpty() || txtFrenillosLabiales.getText().isEmpty() || txtVestibuloBucal.getText().isEmpty() || txtMucosaPalatina.getText().isEmpty() || txtMucosaPisoBoca.getText().isEmpty() || txtFrenilloLingual.getText().isEmpty() || txtCaraDorsal.getText().isEmpty() || txtCaraVentral.getText().isEmpty() || txtBordesLaterales.getText().isEmpty() || txtEncias.getText().isEmpty() || txtDientes.getText().isEmpty())
                    || (radioIncluirTensionArterial.isSelected() && txtMaxima.getText().isEmpty())
                    || (radioIncluirTensionArterial.isSelected() && txtMinima.getText().isEmpty())
                    || (radioIncluirPalpacion.isSelected() && txtLocalizacion.getText().isEmpty())
                    || (radioIncluirPalpacion.isSelected() && txtCaracteristicas.getText().isEmpty()))
            return true;
        return false;
    }
    
    public boolean revisarFaltantesDiagnostico(JTextArea txtPresuntivo, JTextArea txtHistopatologico, JTextArea txtDefinitivo, JLabel labelFaltantesDiagnostico){
        labelFaltantesDiagnostico.setVisible(txtPresuntivo.getText().isEmpty() || txtHistopatologico.getText().isEmpty() || txtDefinitivo.getText().isEmpty());
        
        if(txtPresuntivo.getText().isEmpty() || txtHistopatologico.getText().isEmpty() || txtDefinitivo.getText().isEmpty())
            return true;
        return false;
    }
    
    
    //CREAR OBJETO CONSULTA
    
    public Consulta crearConsulta(JTextField txtEdad, JTextField txtDomicilio, JTextField txtTelf1, JTextField txtTelf2, JTextField txtOcupacion,
                                    JRadioButton radioEstudiante, JTextField txtReferencia, JTextArea txtPresuntivo, JTextArea txtHispatologico,
                                    JTextArea txtDefinitivo, JTextArea txtPlanTratamiento, JTextArea txtObservaciones){
        int edad = Integer.parseInt(txtEdad.getText());
        String telefono = txtTelf1.getText()+"-"+txtTelf2.getText();
        Consulta consulta = new Consulta(new Date(),edad,txtDomicilio.getText(),telefono,txtOcupacion.getText(),radioEstudiante.isSelected(),
                                            txtReferencia.getText(),txtPresuntivo.getText(),txtHispatologico.getText(),txtDefinitivo.getText(),
                                               txtPlanTratamiento.getText(),txtObservaciones.getText());
        return consulta;
    }
    
    public ExamenSubjetivo crearExamenSubjetivo(JTextField txtMotivo, JTextField txtCurso, JComboBox comboMedicamento, JComboBox comboHospitalizado, 
                                                JComboBox comboIntervenidoQuirurgicamente, JRadioButton radioFuma, JRadioButton radioToma,
                                                JTextField txtCualMed, JTextField txtPorQueHospitalizado, JTextField txtCuantosCigarrillos, 
                                                JTextField txtDesdeFuma, JTextField txtCantidadToma){
        boolean tomandoMed = comboMedicamento.getSelectedItem().equals("Sí");
        boolean sidoHospitalizado = comboHospitalizado.getSelectedItem().equals("Sí");
        boolean sidoIntervenidoQuirurgicamente = comboIntervenidoQuirurgicamente.getSelectedItem().equals("Sí");
        boolean fuma = radioFuma.isSelected();
        boolean toma = radioToma.isSelected();
        
        int cuantosCigarrillos;
        try{
            cuantosCigarrillos = Integer.parseInt(txtCuantosCigarrillos.getText());
        }
        catch(Exception e){
            cuantosCigarrillos=0;
        }
        ExamenSubjetivo exSub = new ExamenSubjetivo(txtMotivo.getText(),txtCurso.getText(),tomandoMed,txtCualMed.getText(),sidoHospitalizado,
                                                      txtPorQueHospitalizado.getText(),sidoIntervenidoQuirurgicamente,fuma,cuantosCigarrillos,
                                                        txtDesdeFuma.getText(),toma,txtCantidadToma.getText(),"Subjetivo");
//        prueba(exSub);
        return exSub;
    }
    
    public ExamenClinico crearExamenClinico(JTextArea txtLabios, JTextField txtFrenillosLabiales, JTextField txtVestibuloBucal,
                                            JTextField txtMucosaPalatina, JTextField txtMucosaPisoBoca, JTextField txtFrenilloLingual,
                                            JTextField txtCaraDorsal, JTextField txtCaraVentral, JTextField txtBordesLaterales,
                                            JTextField txtEncias, JTextArea txtDientes, JRadioButton radioIncluirTensionArterial,
                                            JTextField txtMaxima, JTextField txtMinima, JRadioButton radioIncluirPalpacion,
                                            JRadioButton radioPalpables, JTextField txtLocalizacion, JTextField txtCaracteristicas){
        int tensionMaxima, tensionMinima;
        try{
            tensionMaxima = Integer.parseInt(txtMaxima.getText());
            tensionMinima = Integer.parseInt(txtMinima.getText());
        }
        catch(Exception e){
            tensionMaxima = 0;
            tensionMinima = 0;
        }

        
        boolean gangliosPalpables = radioPalpables.isSelected();
        
        ExamenClinico exCli = new ExamenClinico(radioIncluirTensionArterial.isSelected(),tensionMinima,tensionMaxima,
                                                radioIncluirPalpacion.isSelected(),gangliosPalpables,txtLocalizacion.getText(),
                                                txtCaracteristicas.getText(),txtLabios.getText(),
                                                txtFrenillosLabiales.getText(),txtVestibuloBucal.getText(),
                                                txtMucosaPalatina.getText(),txtMucosaPisoBoca.getText(),txtFrenilloLingual.getText(),
                                                txtCaraDorsal.getText(),txtCaraVentral.getText(),txtBordesLaterales.getText(),
                                                txtEncias.getText(),txtDientes.getText(),"Clinico");
//        prueba(exCli);
        return exCli;
    }
    
    public ExamenRadiografico crearExamenRadiografico(JTextArea txtRxPanoramica, JTextArea txtRxPeriapical, JTextArea txtRxOclusal){
        ExamenRadiografico exRad = new ExamenRadiografico(txtRxPanoramica.getText(),txtRxPeriapical.getText(),txtRxOclusal.getText(),"Radiografico");
        return exRad;
    }
    
    public ExamenLaboratorio crearExamenLaboratorio(JTextField txtPerfilHematologico, JTextField txtPerfilCoagulacion, JTextField txtGlicemia,
                                                    JComboBox comboVDRL, JComboBox comboVIH){
        int glicemia;
        try{
            glicemia = Integer.parseInt(txtGlicemia.getText());
        }
        catch(Exception e){
            glicemia = 0;
        }
        ExamenLaboratorio exLab = new ExamenLaboratorio(txtPerfilHematologico.getText(),txtPerfilCoagulacion.getText(),glicemia,
                                                        comboVDRL.getSelectedItem().toString(),comboVIH.getSelectedItem().toString(),"Laboratorio");
        return exLab;
    }
    
   
    public AntecedenteRenalGastroIntestinal crearAntRN(JRadioButton radioEnfermedadRenal, JRadioButton radioCalculosRenales,
                                                        JRadioButton radioAcidezEstomacal, JRadioButton radioUlceraPeptica,
                                                        JRadioButton radioDiarreasFrecuencia, JTextField txtOrinaDia, JTextField txtColorOrinaDia){
        int cantidadOrina;
        try{
            cantidadOrina = Integer.parseInt(txtOrinaDia.getText());
        }
        catch(Exception e){
            cantidadOrina = 0;
        }
        AntecedenteRenalGastroIntestinal antRN = new AntecedenteRenalGastroIntestinal(radioEnfermedadRenal.isSelected(),cantidadOrina, 
                                                                                        txtColorOrinaDia.getText(),radioAcidezEstomacal.isSelected(),
                                                                                        radioUlceraPeptica.isSelected(),radioDiarreasFrecuencia.isSelected(), 
                                                                                        radioCalculosRenales.isSelected(),"RN");
        return antRN;
    }
    
    public AntecedenteFemenino crearAntFem(JRadioButton radioRegular, JRadioButton radioIrregular, JRadioButton radioEmbarazada,
                                            JComboBox comboMesesEmbarazo, JRadioButton radioPastillasAnticonceptivas,
                                            JRadioButton radioMenopausia){
        String regularidad;
        
        if(radioRegular.isSelected())
            regularidad = radioRegular.getText();
        else    regularidad = radioIrregular.getText();
        
        int meses;
        if(radioEmbarazada.isSelected()){
            try{
                meses = Integer.parseInt(comboMesesEmbarazo.getSelectedItem().toString());
            } catch(Exception e){
                meses=0;
            }
        }
        else meses = 0;
        
        AntecedenteFemenino antFem = new AntecedenteFemenino(regularidad,radioEmbarazada.isSelected(),meses,
                                                                radioPastillasAnticonceptivas.isSelected(),radioMenopausia.isSelected(),"Femenino");
        return antFem;
    }
    
    public AntecedenteCardiovascular crearAntCardio(JRadioButton radioSubirEscaleras, JRadioButton radioEdema, JRadioButton radioPalpitaciones,
                                                        JRadioButton radioDoloresPecho, JRadioButton radioInfarto, JTextField txtCuandoInfarto,
                                                        JRadioButton radioEndocarditisBacteriana, JRadioButton radioValvulopatia, JRadioButton radioHipertenso,
                                                        JRadioButton radioHipotenso, JRadioButton radioTratamientoTension){
        
        AntecedenteCardiovascular antCardio = new AntecedenteCardiovascular(radioSubirEscaleras.isSelected(),radioEdema.isSelected(),
                                                                            radioPalpitaciones.isSelected(),radioDoloresPecho.isSelected(), 
                                                                            radioInfarto.isSelected(),txtCuandoInfarto.getText(),
                                                                            radioEndocarditisBacteriana.isSelected(), radioValvulopatia.isSelected(), 
                                                                            radioHipertenso.isSelected(),radioHipotenso.isSelected(),
                                                                            radioTratamientoTension.isSelected(),"Cardiovascular");
        return antCardio;
    }
    
    public AntecedenteAlergico crearAntAlergico(JRadioButton radioAlergicoMedicamento, JTextField txtAlergicoMedicamento, JRadioButton radioUrticaria,
                                                    JRadioButton radioDificultadTragar, JRadioButton radioDificultadRespirar,
                                                    JRadioButton radioSufreAsma, JTextField txtUltimaCrisisAsma, JTextField txtReaccionAnestesiaLocal){
        
        AntecedenteAlergico antAlergico = new AntecedenteAlergico(radioAlergicoMedicamento.isSelected(),txtAlergicoMedicamento.getText(), 
                                                                    radioUrticaria.isSelected(),radioDificultadTragar.isSelected(), 
                                                                    radioDificultadRespirar.isSelected(),radioSufreAsma.isSelected(), 
                                                                    txtUltimaCrisisAsma.getText(),txtReaccionAnestesiaLocal.getText(),"Alergico");
        return antAlergico;
    }
    
    public AntecedenteNutricional crearAntNutricional(JRadioButton radioAnemia, JRadioButton radioPerdidoPeso, JRadioButton radioDieta,
                                                        JRadioButton radioSienteDecaimiento, JRadioButton radioMalestarGeneral,
                                                        JRadioButton radioFiebre, JRadioButton radioDiabetico, JRadioButton radioTratamientoDiabetico,
                                                        JRadioButton radioOrinaNoche, JTextField txtOrinaNoche, JRadioButton radioMuchaSed, 
                                                        JRadioButton radioInsomnio, JRadioButton radioTiroides){
        int vecesOrinaDeNoche;
        if(radioOrinaNoche.isSelected()){
            try{
                vecesOrinaDeNoche = Integer.parseInt(txtOrinaNoche.getText());
            } catch(Exception e){
                vecesOrinaDeNoche = 0;
            }
        }
        else vecesOrinaDeNoche = 0;
        AntecedenteNutricional antNutri = new AntecedenteNutricional(radioAnemia.isSelected(),radioPerdidoPeso.isSelected(), 
                                                                        radioDieta.isSelected(),radioSienteDecaimiento.isSelected(),
                                                                        radioMalestarGeneral.isSelected(),radioFiebre.isSelected(), radioDiabetico.isSelected(),
                                                                        radioTratamientoDiabetico.isSelected(), radioOrinaNoche.isSelected(), 
                                                                        vecesOrinaDeNoche,radioMuchaSed.isSelected(),radioInsomnio.isSelected(), 
                                                                        radioTiroides.isSelected(),"Nutricional");
        return antNutri;
    }
    
    public AntecedenteInfeccioso crearAntInfeccioso(JRadioButton radioEnfermedadesVenereas, JTextField txtHaceCuantoVenereas, JRadioButton radioTransfusion,
                                                        JRadioButton radioHepatitis, JTextField txtHaceCuantoHepatitis, JComboBox comboTipoHepatitis,
                                                        JRadioButton radioOtraEnfermedadHepatica, JTextField txtCualOtraHepatica, 
                                                        JRadioButton radioTuberculosis){
        
        char tipoHepatitis = (comboTipoHepatitis.getSelectedItem().toString()).charAt(0);
        AntecedenteInfeccioso antInfec = new AntecedenteInfeccioso(radioEnfermedadesVenereas.isSelected(),txtHaceCuantoVenereas.getText(),
                                                                    radioTransfusion.isSelected(),radioHepatitis.isSelected(), 
                                                                    txtHaceCuantoHepatitis.getText(),tipoHepatitis, 
                                                                    radioOtraEnfermedadHepatica.isSelected(),txtCualOtraHepatica.getText(), 
                                                                    radioTuberculosis.isSelected(),"Infeccioso");
        return antInfec;
    }
    
    public AntecedenteNeurologico crearAntNeurologico(JRadioButton radioConvulsiones, JTextField txtCuantoTiempoConvulsiones, JRadioButton radioEpilepsia,
                                                        JDateChooser fechaUltimaCrisis, JRadioButton radioNeuralgiasNeuritis, JRadioButton radioParalisisFacial, 
                                                        JRadioButton radioParestesia, JRadioButton radioSeAltera, JRadioButton radioCefaleas){
        
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String ultimaCrisis;
        try{
            ultimaCrisis = formatter.format(fechaUltimaCrisis.getDate());
        }
        catch(Exception e){
            ultimaCrisis = " ";
        }
        AntecedenteNeurologico antNeuro = new AntecedenteNeurologico(radioConvulsiones.isSelected(),txtCuantoTiempoConvulsiones.getText(), 
                                                                        radioEpilepsia.isSelected(),ultimaCrisis,radioNeuralgiasNeuritis.isSelected(),
                                                                        radioParalisisFacial.isSelected(),radioParestesia.isSelected(),
                                                                        radioSeAltera.isSelected(),radioCefaleas.isSelected(),"Neurologico");
        return antNeuro;
    }
    
    public AntecedenteHematologico crearAntHematologico(JRadioButton radioHemorragiasImportantes, JTextField txtCausaHemorragia,
                                                            JTextField txtDuracionHemorragia, JRadioButton radioHematomas, 
                                                            JRadioButton radioSangranEncias, JRadioButton radioSangraNariz){
        
        AntecedenteHematologico antHema = new AntecedenteHematologico(radioHemorragiasImportantes.isSelected(),txtCausaHemorragia.getText(), 
                                                                        txtDuracionHemorragia.getText(),radioSangranEncias.isSelected(), 
                                                                        radioSangraNariz.isSelected(),radioHematomas.isSelected(),"Hematologico");
        return antHema;
    }
    
    public AntecedenteFamiliar crearAntFamiliar(JTextField txtTipoCancer, JTextField txtTipoEnfPulmonares, 
                                                    JComboBox comboTipoDiabetes, JTextField txtTipoEnfCardiovasculares,
                                                    JTextField txtTipoEnfHepaticas, JTextField txtOtros1){
        
        String diabetes = "Tipo "+comboTipoDiabetes.getSelectedItem().toString();
        AntecedenteFamiliar antFam = new AntecedenteFamiliar(txtTipoCancer.getText(),diabetes,txtTipoEnfPulmonares.getText(),
                                                                txtTipoEnfCardiovasculares.getText(),txtTipoEnfHepaticas.getText(),
                                                                txtOtros1.getText(),"Familiar");
        return antFam;
    }
    
    
    //CREAR PACIENTE
    public Paciente crearPaciente(Odontologo odontologo, JTextField txtCedula, JTextField txtNombre, JTextField txtLugarNacimiento, JComboBox comboSexo){
        int cedula, hm;
        
        try{
            cedula = Integer.parseInt(txtCedula.getText());
        }
        catch(Exception e){
            cedula = 0;
        }
        
        char sexo = (comboSexo.getSelectedItem().toString()).charAt(0);
        
        hm = odontologo.getListaPacientes().size()+1;
        
        
        Paciente pac = new Paciente(txtNombre.getText(),cedula,txtLugarNacimiento.getText(),hm,sexo);
        
        return pac;
    }
    
    
//    public void prueba(Consulta consulta){
//        System.out.println("Fecha de registro: "+consulta.getFecha());
//        System.out.println("Edad: "+consulta.getEdadPaciente());
//        System.out.println("Domicilio: "+consulta.getDomicilioPaciente());
//        System.out.println("Telefono: "+consulta.getTelefonoPaciente());
//        System.out.println("Ocupacion: "+consulta.getOcupacionPaciente());
//        System.out.println("Estudiante: ");
//            if(consulta.isEsEstudiante()) System.out.println("Si");
//            else System.out.println("No");
//        System.out.println("Referencia: "+consulta.getReferencia());
//    }
//    
//    public void prueba(ExamenSubjetivo exSub){
//        System.out.println("Motivo: "+exSub.getMotivoConsulta());
//        
//        System.out.println("Curso de la enfermedad actual: "+exSub.getCursoEnfermedad());
//        
//        System.out.println("¿Está tomando algún medicamento: ");
//        if(exSub.isTomandoMedicamento()) System.out.println("Sí");
//        else System.out.println("No");
//        
//        System.out.println("¿Cuál?: "+exSub.getMedicamentoQueToma());
//        
//        System.out.println("¿Ha sido hospitalizado alguna vez?: "+exSub.isSidoHospitalizado());
//        System.out.println("¿Por qué?:"+exSub.getMotivoHospitalizado());
//        
//        System.out.println("¿Ha sido intervenido quirurgicamente?: ");
//        if(exSub.isSidoIntervenidoQuirurgicamente())
//            System.out.println("Sí");
//        else System.out.println("No");
//        
//        System.out.println("Fuma: ");
//        if(exSub.isFuma()) System.out.println("Sí");
//        else System.out.println("No");
//        System.out.println("¿Cuántos cigarrillos?: "+exSub.getCantidadCigarrillos());
//        System.out.println("¿Desde cuándo?: "+exSub.getTiempoFumando());
//       
//        System.out.println("Toma: ");
//        if(exSub.isToma()) System.out.println("Sí");
//        else System.out.println("No");
//        System.out.println("¿Qué cantidad?: "+exSub.getCantidadTomando());
//    }
//    
//    public void prueba(ExamenClinico exCli){
//        System.out.println("Labios: "+exCli.getLabios());
//        
//        System.out.println("Frenillos labiales: "+exCli.getFrenillosLabiales());
//        
//        System.out.println("Vesitibulo bucal: "+exCli.getVestibuloBocal());
//        System.out.println("Mucosa palatina: "+exCli.getMucosaPalatina());
//        System.out.println("Mucosa del piso de la boca: "+exCli.getMucosaPisoDeBoca());
//        
//        
//        System.out.println("Frenillo lingual: "+exCli.getFrenilloLingual());
//        
//        System.out.println("Lengua\nCara dorsal: "+exCli.getCaraDorsalLengua());
//        System.out.println("Cara ventral: "+exCli.getCaraVentralLengua());
//        System.out.println("BordesLaterales: "+exCli.getBordesLateralesLengua());
//        
//        System.out.println("Encias: "+exCli.getEncia());
//        System.out.println("Dientes: "+exCli.getDientes());
//        
//        System.out.println("Tension incluida "+exCli.isIncluirTensionArterial());
//        System.out.println("Tension maxima: "+exCli.getTensionArterialMaxima()+"    Tension minima "+exCli.getTensionArterialMinima());
//        System.out.println("Palpacion incluida "+exCli.isIncluirPalpacion());
//        System.out.println("Palpables: "+exCli.isGangliosPalpables());
//        System.out.println("Localizacion: "+exCli.getUbicacionGanglios());
//        System.out.println("Caracteristicas: "+exCli.getCaracteristicasPalpacion());
//    }
    
}
