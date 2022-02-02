package control;

import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modelo.*;

public class CVerConsulta {
    
    public void pasarATxtArea(String dato, JTextArea txtArea){
        if(dato.equals(null))
            txtArea.setText(null);
        else
            txtArea.setText(dato);
    }
    
    public void pasarATxtField(String dato, JTextField txtField){
        if(dato.equals(null))
            txtField.setText(null);
        else
            txtField.setText(dato);
    }
    
    public void pasarAComboSexo(char sexo, JComboBox combo){
       if(sexo=='M')
           combo.setSelectedIndex(0);
       else
          combo.setSelectedIndex(1);
    }
    
    public void pasarAComboSiNo(boolean dato, JComboBox combo){
        if(!dato)
            combo.setSelectedIndex(0);
        else
            combo.setSelectedIndex(1);
    }
    
    public void pasarAComboSiNo(boolean dato, JComboBox combo, JTextField texto){
        if(!dato)
            combo.setSelectedIndex(0);
        else
            combo.setSelectedIndex(1);
        texto.setEnabled(dato);
    }
    
    public void pasarAComboExLab(String dato, JComboBox combo){
        if(dato.equals("Negativo"))
            combo.setSelectedIndex(0);
        else
            combo.setSelectedIndex(1);
    }
    
    
    public void pasarAComboNumero(int num, JComboBox combo){
        combo.setSelectedIndex(num-1);
    }
    
    public void pasarAComboHepatitis(char dato, JComboBox combo){
        switch(dato){
            case 'A': combo.setSelectedIndex(0);
                break;
            case 'B': combo.setSelectedIndex(1);
                break;
            case 'C': combo.setSelectedIndex(2);
                break;
            case 'D': combo.setSelectedIndex(3);
                break;
            case 'E': combo.setSelectedIndex(4);
                break;
        }
    }
    
    public void pasarALabel(String dato, JLabel label){
        if(dato.equals(null))
            label.setText(null);
        else 
            label.setText(dato);
    }
    
    public void pasarALabel(boolean dato, JLabel label){
        if(dato)
            label.setText("Sí");
        else 
            label.setText("No");
    }
    
    public void pasarARadio(boolean dato, JRadioButton radio){
        radio.setSelected(dato);
    }
    
    public void pasarARadio(boolean dato, JRadioButton radio, JComboBox combo1, JComboBox combo2){
        radio.setSelected(dato);
        combo1.setEnabled(dato);
        combo2.setEnabled(dato);
    }
    
    public void pasarARadio(boolean dato, JRadioButton radio, JComboBox combo){
        radio.setSelected(dato);
        combo.setEnabled(dato);
    }
    
    public void pasarARadio(boolean dato, JRadioButton radio, JTextArea texto1, JTextArea texto2, JTextArea texto3){
        radio.setSelected(dato);
        texto1.setEnabled(dato);
        texto2.setEnabled(dato);
        texto3.setEnabled(dato);
    }
    
    public void pasarARadio(boolean dato, JRadioButton radio, JTextField texto1, JTextField texto2, JTextField texto3){
        radio.setSelected(dato);
        texto1.setEnabled(dato);
        texto2.setEnabled(dato);
        texto3.setEnabled(dato);
    }
    
    public void pasarARadio(boolean dato, JRadioButton radio, JTextField texto1, JTextField texto2){
        radio.setSelected(dato);
        texto1.setEnabled(dato);
        texto2.setEnabled(dato);
    }
    
    public void pasarARadio(boolean dato, JRadioButton radio1, JRadioButton radio2, JTextField texto1, JTextField texto2){
        radio1.setSelected(dato);
        radio2.setEnabled(dato);
        texto1.setEnabled(dato);
        texto2.setEnabled(dato);
    }
    
    public void pasarARadio(boolean dato, JRadioButton radio, JTextField texto){
        radio.setSelected(dato);
        texto.setEnabled(dato);
    }
    
    public void separarTelf(String telf, JTextField txtTelf1, JTextField txtTelf2){
        if(telf.charAt(0)=='0'){
            txtTelf1.setText(telf.substring(0,4));
            txtTelf2.setText(telf.substring(5,11));
        }
        else{
            txtTelf1.setText(telf.substring(0,3));
            txtTelf2.setText(telf.substring(4,11));
        }
           
    }
    
    public void llenarDiagnostico(Consulta consulta, JTextArea txtPresuntivo, JTextArea txtHispatologico, JTextArea txtDefinitivo,
                                    JTextArea txtPlanTratamiento, JTextArea txtObservaciones){
        pasarATxtArea(consulta.getDiagnosticoPresuntivo(),txtPresuntivo);
        pasarATxtArea(consulta.getEstudioHispatologico(),txtHispatologico);
        pasarATxtArea(consulta.getDiagnosticoDefinitivo(),txtDefinitivo);
        pasarATxtArea(consulta.getPlanDeTratamiento(),txtPlanTratamiento);
        pasarATxtArea(consulta.getObservaciones(),txtObservaciones);
    }
    
    public void llenarDatosPersonalesConsulta(Consulta consulta, JTextField txtTelf1, JTextField txtTelf2, JTextField txtOcupacion ,JTextField txtEdad,
                                                JRadioButton radioEstudiante, JTextField txtReferencia, 
                                                JTextField txtDomicilio){
         
        separarTelf(consulta.getTelefonoPaciente(),txtTelf1,txtTelf2);
        pasarATxtField(consulta.getOcupacionPaciente(),txtOcupacion);
        pasarATxtField(Integer.toString(consulta.getEdadPaciente()),txtEdad);
        pasarARadio(consulta.isEsEstudiante(),radioEstudiante);
        pasarATxtField(consulta.getReferencia(),txtReferencia);
        pasarATxtField(consulta.getDomicilioPaciente(),txtDomicilio);
    }
    
    public void llenarDatosPersonalPaciente(Paciente paciente, JTextField txtCedula, JTextField txtNombre, JTextField txtHM, JComboBox comboSexo, 
                                            JTextField txtLugarNacimiento){
        
        pasarATxtField(Integer.toString(paciente.getCedula()),txtCedula);
        pasarATxtField(paciente.getNombre(),txtNombre);
        pasarATxtField(Integer.toString(paciente.getHistoriaClinica()),txtHM);
        pasarAComboSexo(paciente.getSexo(),comboSexo);
        pasarATxtField(paciente.getLugarNacimiento(),txtLugarNacimiento);
    }
    
    public void llenarDatosExamenSubjetivo(Consulta consulta, JTextField txtMotivo, JTextField txtCurso,JComboBox comboMedicamentos,
                                            JTextField txtCualMed, JComboBox comboHospitalizado, JTextField txtPorQueHospitalizado,
                                            JComboBox comboIntervenidoQuirurgicamente, JRadioButton radioFuma, JTextField txtCuantosCigarrillos,
                                            JTextField txtDesdeFuma, JRadioButton radioToma,JTextField txtCantidadToma){
        
        ExamenSubjetivo exSub = consulta.buscarExamenSubjetivo();
        pasarATxtField(exSub.getMotivoConsulta(),txtMotivo);
        pasarATxtField(exSub.getCursoEnfermedad(),txtCurso);
        pasarAComboSiNo(exSub.isTomandoMedicamento(),comboMedicamentos,txtCualMed);
        pasarATxtField(exSub.getMedicamentoQueToma(),txtCualMed);
        pasarAComboSiNo(exSub.isSidoHospitalizado(),comboHospitalizado,txtPorQueHospitalizado);
        pasarATxtField(exSub.getMotivoHospitalizado(),txtPorQueHospitalizado);
        pasarAComboSiNo(exSub.isSidoIntervenidoQuirurgicamente(),comboIntervenidoQuirurgicamente);
        
        pasarARadio(exSub.isFuma(),radioFuma,txtCuantosCigarrillos,txtDesdeFuma);
        pasarATxtField(Integer.toString(exSub.getCantidadCigarrillos()),txtCuantosCigarrillos);
        pasarATxtField(exSub.getTiempoFumando(),txtDesdeFuma);
        
        pasarARadio(exSub.isToma(),radioToma,txtCantidadToma);
        pasarATxtField(exSub.getCantidadTomando(),txtCantidadToma);
    }
    
//    txtLabios,txtFrenillosLabiales,txtVestibuloBucal,txtMucosaPalatina,txtMucosaPisoBoca,txtFrenilloLingual, 
//    txtCaraDorsal,txtCaraVentral,txtBordesLaterales,txtEncias,txtDientes,radioIncluirTensionArterial,txtMaxima,txtMinima, 
//    radioIncluirPalpacion, radioPalpables,txtLocalizacion,txtCaracteristicas
    
    
    public void llenarDatosExamenClinico(Consulta consulta, JTextArea txtLabios, JTextField txtFrenillosLabiales,JTextField txtVestibuloBucal,
                                            JTextField txtMucosaPalatina, JTextArea txtMucosaPisoBoca, JTextField txtFrenilloLingual,
                                            JTextField txtCaraDorsal, JTextField txtCaraVentral, JTextField txtBordesLaterales,
                                            JTextField txtEncias, JTextArea txtDientes, JRadioButton radioIncluirTensionArterial, 
                                            JTextField txtMaxima, JTextField txtMinima, JRadioButton radioIncluirPalpacion, 
                                            JRadioButton radioPalpables, JTextField txtLocalizacion, JTextField txtCaracteristicas){
        
        ExamenClinico exCli = consulta.buscarExamenClinico();
        
        //Datos examen de la cavidad bucal
        pasarATxtArea(exCli.getLabios(),txtLabios);
        pasarATxtField(exCli.getFrenillosLabiales(),txtFrenillosLabiales);
        pasarATxtField(exCli.getVestibuloBocal(),txtVestibuloBucal);
        pasarATxtField(exCli.getMucosaPalatina(),txtMucosaPalatina);
        pasarATxtArea(exCli.getMucosaPisoDeBoca(),txtMucosaPisoBoca);
        pasarATxtField(exCli.getFrenilloLingual(),txtFrenilloLingual);
        pasarATxtField(exCli.getCaraDorsalLengua(),txtCaraDorsal);
        pasarATxtField(exCli.getCaraVentralLengua(),txtCaraVentral);
        pasarATxtField(exCli.getBordesLateralesLengua(),txtBordesLaterales);
        pasarATxtField(exCli.getEncia(),txtEncias);
        pasarATxtArea(exCli.getDientes(),txtDientes);
        
        pasarARadio(exCli.isIncluirTensionArterial(),radioIncluirTensionArterial,txtMaxima,txtMinima);
        if(exCli.isIncluirTensionArterial()){
            pasarATxtField(Integer.toString(exCli.getTensionArterialMaxima()),txtMaxima);
            pasarATxtField(Integer.toString(exCli.getTensionArterialMinima()),txtMinima);
        }
        
        pasarARadio(exCli.isIncluirPalpacion(),radioIncluirPalpacion,radioPalpables,txtLocalizacion,txtCaracteristicas);
        if(exCli.isIncluirPalpacion()){
            pasarARadio(exCli.isGangliosPalpables(),radioPalpables);
            pasarATxtField(exCli.getUbicacionGanglios(),txtLocalizacion);
            pasarATxtField(exCli.getCaracteristicasPalpacion(),txtCaracteristicas);
        }        
  
    }
    
    public void llenarDatosExamenRadiografico(Consulta consulta, JRadioButton radioAgregarExamenRadiografico, JTextArea txtRxPanoramica, JTextArea txtRxPeriapical, JTextArea txtRxOclusal){
        
        ExamenRadiografico exRad;
        
        pasarARadio(consulta.buscarExamenRadiografico(),radioAgregarExamenRadiografico,txtRxPanoramica,txtRxPeriapical,txtRxOclusal);
        if(consulta.buscarExamenRadiografico()){
            exRad = consulta.buscarObjetoExamenRadiografico();
            pasarATxtArea(exRad.getRxPanoramica(),txtRxPanoramica);
            pasarATxtArea(exRad.getRxPeriapical(),txtRxPeriapical);
            pasarATxtArea(exRad.getRxOclusal(),txtRxOclusal);
        }    
        
           
    }
    
    public void llenarDatosExamenLaboratorio(Consulta consulta, JRadioButton radioAgregarExamenLaboratorio, JTextField txtPerfilHematologico, 
                                                JTextField txtPerfilCoagulacion, JTextField txtGlicemia, JComboBox comboVDRL, JComboBox comboVIH){
        
        ExamenLaboratorio exLab;
        
        pasarARadio(consulta.buscarExamenLaboratorio(),radioAgregarExamenLaboratorio,txtPerfilHematologico,txtPerfilCoagulacion,
                    txtGlicemia);
        pasarARadio(consulta.buscarExamenLaboratorio(),radioAgregarExamenLaboratorio,comboVDRL,comboVIH);
        
        if(consulta.buscarExamenLaboratorio()){
            exLab = consulta.buscarObjetoExamenLaboratorio();
            pasarATxtField(exLab.getPerfilHematologico(),txtPerfilHematologico);
            pasarATxtField(exLab.getPerfilCoagulacion(),txtPerfilCoagulacion);
            pasarATxtField(Integer.toString(exLab.getGlicemia()),txtGlicemia);
            pasarAComboExLab(exLab.getVdrl(),comboVDRL);
            pasarAComboExLab(exLab.getVih(),comboVIH);
        } 
    }
    
    public void llenarDatosAntecedenteRenalGastro(Consulta consulta, JRadioButton radioEnfermedadRenal, JTextField txtOrinaDia, JTextField txtColorOrina, JRadioButton radioCalculosRenales1,
                                                    JRadioButton radioAcidezEstomacal1, JRadioButton radioUlcerPeptica1, JRadioButton radioDiarreasFrecuencia1){
        
        AntecedenteRenalGastroIntestinal antRG = consulta.buscarObjetoAntecedenteRG();
        pasarARadio(antRG.isTenidoEnfermedadRenal(),radioEnfermedadRenal);
        pasarATxtField(Integer.toString(antRG.getCantidadOrinaAlDia()),txtOrinaDia);
        pasarATxtField(antRG.getColorOrina(),txtColorOrina);
        pasarARadio(antRG.isSufridoCalculosRenales(),radioCalculosRenales1);
        pasarARadio(antRG.isTenidoAcidezEstomacal(),radioAcidezEstomacal1);
        pasarARadio(antRG.isTenidoUlceraPeptica(),radioUlcerPeptica1);
        pasarARadio(antRG.isTenidoDiarreaFrecuente(),radioDiarreasFrecuencia1);
        
    }
    
    public void llenarDatosAntecedenteFemenino(Consulta consulta, JRadioButton radioNoAplicaFemenino, JRadioButton radioRegular1, JRadioButton radioIrregular1,
                                                JRadioButton radioEmbarazada1, JComboBox comboMesesEmbarazo, JRadioButton radioPastillasAnticonceptivas1,
                                                JRadioButton radioMenopausia1){
        
        AntecedenteFemenino antFem;
        
        if(consulta.buscarAntecedenteFem()){
            antFem = consulta.buscarObjetoAntecedenteFem();
            if(antFem.getRegularidadMenstrual().equals("Regular"))
                radioRegular1.setSelected(true);
            else
                radioIrregular1.setSelected(true);
            pasarARadio(antFem.isEstaEmbarazada(),radioEmbarazada1,comboMesesEmbarazo);
            pasarAComboNumero(antFem.getMesesDeEmbarazo(),comboMesesEmbarazo);
            pasarARadio(antFem.isTomaPastillasAnticonceptivas(),radioPastillasAnticonceptivas1);
            pasarARadio(antFem.isTieneMenopausia(),radioMenopausia1);
        }
        else radioNoAplicaFemenino.setSelected(true);
        
    }
    
    public void llenarDatosAntecedenteCardiovascular(Consulta consulta, JRadioButton radioNoAplicaCardiovasculares, JRadioButton radioSubirEscaleras, 
                                                        JRadioButton radioEdema, JRadioButton radioPalpitaciones, JRadioButton radioDoloresPecho, 
                                                        JRadioButton radioInfarto, JTextField txtCuandoInfarto, JRadioButton radioEndocarditisBacteriana, 
                                                        JRadioButton radioValvulopatia, JRadioButton radioHipertenso,
                                                        JRadioButton radioHipotenso, JRadioButton radioTratamientoTension){
        
        AntecedenteCardiovascular antCardio;
        
        if(consulta.bucarAntecedenteCardio()){
            antCardio = consulta.buscarObjetoAntecedenteCardio();
            pasarARadio(antCardio.isCansaSubirEscaleras(),radioSubirEscaleras);
            pasarARadio(antCardio.isEdemaMiembrosInferiores(),radioEdema);
            pasarARadio(antCardio.isPalpitaciones(),radioPalpitaciones);
            pasarARadio(antCardio.isDoloresEnPecho(),radioDoloresPecho);
            pasarARadio(antCardio.isTenidoInfarto(),radioInfarto,txtCuandoInfarto);
            pasarATxtField(antCardio.getCuandoInfarto(),txtCuandoInfarto);
            pasarARadio(antCardio.isSufreEndocarnitisBacteriana(),radioEndocarditisBacteriana);
            pasarARadio(antCardio.isPresentaVulvopatia(),radioValvulopatia);
            pasarARadio(antCardio.isEsHipertenso(),radioHipertenso);
            pasarARadio(antCardio.isEsHipotenso(),radioHipotenso);
            pasarARadio(antCardio.isEstaEnTratamiento(),radioTratamientoTension);
        }
        else radioNoAplicaCardiovasculares.setSelected(true);
    }
    
    public void llenarDatosAntecedenteAlergico(Consulta consulta, JRadioButton radioNoAplicaAlergicos, JRadioButton radioAlergicoMedicamento, JTextField txtAlergicoMedicamento,
                                                JRadioButton radioUrticaria, JRadioButton radioDificultadTragar, JRadioButton radioDificultadRespirar,
                                                JRadioButton radioSufreAsma, JTextField txtUltimaCrisisAsma, JTextField txtReaccion){
        
        AntecedenteAlergico antAlergico;
        
        if(consulta.buscarAntecedenteAlergico()){
            antAlergico = consulta.buscarObjetoAntecedenteAlergico();
            pasarARadio(antAlergico.isAlergicoAMedicamento(),radioAlergicoMedicamento,txtAlergicoMedicamento);
            pasarATxtField(antAlergico.getMedicamentosConAlergia(),txtAlergicoMedicamento);
            pasarARadio(antAlergico.isTenidoUrticaria(),radioUrticaria);
            pasarARadio(antAlergico.isDificultadParaTragar(),radioDificultadTragar);
            pasarARadio(antAlergico.isDificultadParaRespirar(),radioDificultadRespirar);
            pasarARadio(antAlergico.isTenidoAsma(),radioSufreAsma,txtUltimaCrisisAsma);
            pasarATxtField(antAlergico.getUltimaCrisisAsma(),txtUltimaCrisisAsma);
            pasarATxtField(antAlergico.getReaccionAnestesia(),txtReaccion);
        }
        else radioNoAplicaAlergicos.setSelected(true);
    }
    
    public void llenarDatosAntecedenteNM(Consulta consulta, JRadioButton radioNoAplicaNM, JRadioButton radioAnemia, JRadioButton radioPerdidoPeso,
                                            JRadioButton radioDieta, JRadioButton radioSienteDecaimiento, JRadioButton radioFiebre, JRadioButton radioDiabetico,
                                            JRadioButton radioTratamientoDiabetico, JRadioButton radioOrinaNoche, JTextField txtOrinaNoche, JRadioButton radioMuchaSed,
                                            JRadioButton radioInsomnio, JRadioButton radioTiroides){
        
        AntecedenteNutricional antNM;
        
        if(consulta.buscarAntecedenteNM()){
            antNM = consulta.buscarObjetoAntecedenteNM();
            pasarARadio(antNM.isTenidoAnemia(),radioAnemia);
            pasarARadio(antNM.isPerdidoPeso(),radioPerdidoPeso);
            pasarARadio(antNM.isEnDieta(),radioDieta);
            pasarARadio(antNM.isEnDecaimiento(),radioSienteDecaimiento);
            pasarARadio(antNM.isConFiebre(),radioFiebre);
            pasarARadio(antNM.isDiabetico(),radioDiabetico);
            pasarARadio(antNM.isEstaEnTratamiento(),radioTratamientoDiabetico);
            pasarARadio(antNM.isOrinaDeNoche(),radioOrinaNoche,txtOrinaNoche);
            pasarATxtField(Integer.toString(antNM.getVecesOrinaDeNoche()),txtOrinaNoche);
            pasarARadio(antNM.isSienteMuchaSed(),radioMuchaSed);
            pasarARadio(antNM.isTieneInsomnio(),radioInsomnio);
            pasarARadio(antNM.isPadeceDeTiroides(),radioTiroides);
        }
        else radioNoAplicaNM.setSelected(true);
    }
    
//    consulta, radioNoAplicaInfecciosas, radioEnfermedadesVenereas,txtHaceCuantoVenereas,
//    radioTransfusion,radioHepatitis,txtHaceCuantoHepatitis,comboTipoHepatitis, 
//    radioOtraEnfermedadHepatica,txtCualOtraHepatica, radioTuberculosis
    
    public void llenarDatosAntecedenteInfeccioso(Consulta consulta, JRadioButton radioNoAplicaInfecciosas, JRadioButton radioEnfermedadesVenereas,
                                                    JTextField txtHaceCuantoVenereas, JRadioButton radioTransfusion, JRadioButton radioHepatitis,
                                                    JTextField txtHaceCuantoHepatitis, JComboBox comboTipoHepatitis, JRadioButton radioOtraEnfermedadHepatica,
                                                    JTextField txtCualOtraHepatica, JRadioButton radioTuberculosis){
        
        AntecedenteInfeccioso antInf;
        
        if(consulta.bucarAntecedenteInf()){
            antInf = consulta.buscarObjetoAntecedenteInf();
            pasarARadio(antInf.isTenidoEnfermedadesVenereas(),radioEnfermedadesVenereas,txtHaceCuantoVenereas);
            pasarATxtField(antInf.getTiempoEnfermedadesVenereas(),txtHaceCuantoVenereas);
            pasarARadio(antInf.isTenidoTransfusionDeSangre(),radioTransfusion);
            pasarARadio(antInf.isTenidoHepatitis(),radioHepatitis,txtHaceCuantoHepatitis);
            pasarARadio(antInf.isTenidoHepatitis(),radioHepatitis,comboTipoHepatitis);
            pasarATxtField(antInf.getTiempoHepatitis(),txtHaceCuantoHepatitis);
            pasarAComboHepatitis(antInf.getTipoHepatitis(),comboTipoHepatitis);
            pasarARadio(antInf.isTieneOtraEnfermedadHepatica(),radioOtraEnfermedadHepatica,txtCualOtraHepatica);
            pasarATxtField(antInf.getEnfermedadHepatica(),txtCualOtraHepatica);
            pasarARadio(antInf.isTenidoTuberculosis(),radioTuberculosis);
        }
        else radioNoAplicaInfecciosas.setSelected(true);
        
    }
    
    public void llenarDatosAntecedenteNeurologico(Consulta consulta, JRadioButton radioNoAplicaNeurologicas, JRadioButton radioConvulsiones,
                                                    JTextField txtCuantoTiempoConvulsiones, JRadioButton radioEpilepsia, JTextField txtFechaUltimaCrisis,
                                                    JRadioButton radioNeuralgiasNeuritis, JRadioButton radioParalisisFacial, JRadioButton radioParestesia,
                                                    JRadioButton radioSeAltera, JRadioButton radioCefaleas){
        
        AntecedenteNeurologico antNeuro;
        
        if(consulta.buscarAntecedenteNeurologico()){
            antNeuro = consulta.buscarObjetoAntecedenteNeurologico();
            pasarARadio(antNeuro.isTenidoConvulsiones(),radioConvulsiones,txtCuantoTiempoConvulsiones);
            pasarATxtField(antNeuro.getTiempoConvulsiones(),txtCuantoTiempoConvulsiones);
            pasarARadio(antNeuro.isTenidoEpilepsia(),radioEpilepsia);
            pasarATxtField(antNeuro.getUltimaCrisisEpileptica(),txtFechaUltimaCrisis);
            pasarARadio(antNeuro.isTenidoNeuritisEnCara(),radioNeuralgiasNeuritis);
            pasarARadio(antNeuro.isParalisisFacial(),radioParalisisFacial);
            pasarARadio(antNeuro.isParestesia(),radioParestesia);
            pasarARadio(antNeuro.isAlteraConFacilidad(),radioSeAltera);
            pasarARadio(antNeuro.isCefaleasFrecuentes(),radioCefaleas);
        }
        else radioNoAplicaNeurologicas.setSelected(true);
        
    }
    
    public void llenarDatosAntecedenteHematologico(Consulta consulta, JRadioButton radioNoAplicaHematologicas, JRadioButton radioHemorragias, 
                                                    JTextField txtCausaHemorragia, JTextField txtDuracionHemorragia, JRadioButton radioHematomas, 
                                                    JRadioButton radioSangranEncias, JRadioButton radioSangraNariz){
        
        AntecedenteHematologico antHem;
        
        if(consulta.buscarAntecedenteHematologico()){
            antHem = consulta.buscarObjetoAntecedenteHematologico();
            pasarARadio(antHem.isTenidoHemorragiasImportantes(),radioHemorragias,txtCausaHemorragia,txtDuracionHemorragia);
            pasarATxtField(antHem.getCausaHemorragia(),txtCausaHemorragia);
            pasarATxtField(antHem.getDuracionHemorragia(),txtDuracionHemorragia);
            pasarARadio(antHem.isHematomas(),radioHematomas);
            pasarARadio(antHem.isSangranEncias(),radioSangranEncias);
            pasarARadio(antHem.isSangraPorNariz(),radioSangraNariz);
        }
        else radioNoAplicaHematologicas.setSelected(true);
        
    }
    
    public void llenarAntecedenteFamiliar(Consulta consulta, JRadioButton radioFamiliares, JRadioButton radioCancer, JRadioButton radioEnfPulmonares,
                                            JRadioButton radioDiabetes, JRadioButton radioEnfCardiovasculares, JRadioButton radioEnfHepaticas,
                                            JTextField txtTipoCancer, JTextField txtTipoEnfPulmonares, JComboBox comboTipoDiabetes, 
                                            JTextField txtTipoEnfCardiovasculares, JTextField txtTipoEnfHepaticas, JTextField txtOtros1){
        
        AntecedenteFamiliar antFam;
        
        if(consulta.buscarAntecedenteFamiliar()){
            antFam = consulta.buscarObjetoAntecedenteFamiliar();
 
            radioCancer.setSelected(!antFam.getCancer().equals(null));
            txtTipoCancer.setEnabled(!antFam.getCancer().equals(null));
            pasarATxtField(antFam.getCancer(),txtTipoCancer);
           
            radioEnfPulmonares.setSelected(!antFam.getCancer().equals(null));
            txtTipoEnfPulmonares.setEnabled(!antFam.getCancer().equals(null));
            pasarATxtField(antFam.getPulmonares(),txtTipoEnfPulmonares);

            if(!antFam.getDiabetes().equals(null)){
                radioDiabetes.setSelected(true);
                try{
                    char tipo = antFam.getDiabetes().charAt(antFam.getDiabetes().length()-1);
                    pasarAComboNumero(Character.getNumericValue(tipo),comboTipoDiabetes);
                }
                catch(Exception ex){
                    
                }
            }
            
            radioEnfCardiovasculares.setSelected(!antFam.getCancer().equals(null));
            txtTipoEnfCardiovasculares.setEnabled(!antFam.getCancer().equals(null));
            pasarATxtField(antFam.getCardiovasculares(),txtTipoEnfCardiovasculares);
            
            radioEnfHepaticas.setSelected(!antFam.getCancer().equals(null));
            txtTipoEnfHepaticas.setEnabled(!antFam.getCancer().equals(null));
            pasarATxtField(antFam.getHepaticas(),txtTipoEnfHepaticas);
            
            if(!antFam.getOtros().equals(null)){
                pasarATxtField(antFam.getOtros(),txtOtros1);
            }
                
        }
        else radioFamiliares.setSelected(true);
        
    }
   
}
