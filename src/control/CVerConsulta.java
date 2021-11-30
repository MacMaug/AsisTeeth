package control;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import modelo.*;

public class CVerConsulta {
    
    public void pasarATxtArea(String dato, JTextArea txtArea){
        if(dato.equals(null))
            txtArea.setText(null);
        else
            txtArea.setText(dato);
        txtArea.setEnabled(true);
        txtArea.setEditable(false);
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
        else label.setText("No");
    }
    
    public void pasarARadio(boolean dato, JRadioButton radio){
        radio.setSelected(dato);
    }
    
    public void llenarDiagnostico(Consulta consulta, JTextArea txtPresuntivo, JTextArea txtHispatologico, JTextArea txtDefinitivo,
                                    JTextArea txtPlanTratamiento, JTextArea txtObservaciones){
        pasarATxtArea(consulta.getDiagnosticoPresuntivo(),txtPresuntivo);
        pasarATxtArea(consulta.getEstudioHispatologico(),txtHispatologico);
        pasarATxtArea(consulta.getDiagnosticoDefinitivo(),txtDefinitivo);
        pasarATxtArea(consulta.getPlanDeTratamiento(),txtPlanTratamiento);
        pasarATxtArea(consulta.getObservaciones(),txtObservaciones);
    }
    
    public void llenarDatosPersonalesConsulta(Consulta consulta, JLabel labelTelfPaciente, JLabel labelOcupacionPaciente, JLabel labelEdadPaciente,
                                                JLabel labelEstudiantePaciente, JLabel labelReferenciaPaciente, 
                                                JLabel labelDomicilioPaciente){
        
        pasarALabel(consulta.getTelefonoPaciente(),labelTelfPaciente);
        pasarALabel(consulta.getOcupacionPaciente(),labelOcupacionPaciente);
        pasarALabel(Integer.toString(consulta.getEdadPaciente()),labelEdadPaciente);
        
        pasarALabel(consulta.isEsEstudiante(),labelEstudiantePaciente);
        
        pasarALabel(consulta.getReferencia(),labelReferenciaPaciente);
        
        pasarALabel(consulta.getDomicilioPaciente(),labelDomicilioPaciente);
    }
    
    public void llenarDatosPersonalPaciente(Paciente paciente, JLabel labelCedulaPaciente, JLabel labelNombrePaciente, JLabel labelHMPaciente, JLabel labelSexoPaciente, 
                                            JLabel labelLNPaciente){
        
        pasarALabel(Integer.toString(paciente.getCedula()),labelCedulaPaciente);
        pasarALabel(paciente.getNombre(),labelNombrePaciente);
        pasarALabel(Integer.toString(paciente.getHistoriaClinica()),labelHMPaciente);
        pasarALabel(Character.toString(paciente.getSexo()),labelSexoPaciente);
        pasarALabel(paciente.getLugarNacimiento(),labelLNPaciente);
        
    }
    
    
    public void llenarDatosExamenSubjetivo(Consulta consulta, JLabel labelMotivoPaciente, JLabel labelCursoEnfermedadPaciente,
                                            JLabel labelMedicamentoPaciente, JLabel labelCualMedicamentoPaciente, JLabel labelHospitalizadoPaciente,
                                            JLabel labelPorQuePaciente, JLabel labelQuirurgicamentePaciente, JRadioButton radioFuma,
                                            JLabel labelCuantosCigarrillosPaciente, JLabel labelDesdeCuandoPaciente, JRadioButton radioToma,
                                            JLabel labelQueCantidadPaciente){
        
        ExamenSubjetivo exSub = consulta.buscarExamenSubjetivo();
        
        pasarALabel(exSub.getMotivoConsulta(),labelMotivoPaciente);
        pasarALabel(exSub.getCursoEnfermedad(),labelCursoEnfermedadPaciente);
        pasarALabel(exSub.isTomandoMedicamento(),labelMedicamentoPaciente);
        pasarALabel(exSub.getMedicamentoQueToma(),labelCualMedicamentoPaciente);
        pasarALabel(exSub.isSidoHospitalizado(),labelHospitalizadoPaciente);
        pasarALabel(exSub.getMotivoHospitalizado(),labelPorQuePaciente);
        pasarALabel(exSub.isSidoIntervenidoQuirurgicamente(),labelQuirurgicamentePaciente);
        
        pasarARadio(exSub.isFuma(),radioFuma);
        pasarALabel(Integer.toString(exSub.getCantidadCigarrillos()),labelCuantosCigarrillosPaciente);
        pasarALabel(exSub.getTiempoFumando(),labelDesdeCuandoPaciente);
        
        pasarARadio(exSub.isToma(),radioToma);
        pasarALabel(exSub.getCantidadTomando(),labelQueCantidadPaciente);
    }
    
    public void llenarDatosExamenClinico(Consulta consulta, JTextArea txtLabios, JLabel labelFrenillosLabialesR, JLabel labelVestibuloBucal,
                                            JLabel txtMucosaPalatinaR, JTextArea txtMucosaPisoBoca, JLabel labelFrenilloLingualR,
                                            JLabel labelCaraDorsalR, JLabel labelCaraVentralR, JLabel labelBordesLateralesR,
                                            JLabel labelEnciasR, JTextArea txtDientes, JLabel labelPresentaTension, JLabel labelMaximaR, JLabel labelMinimaR,
                                            JLabel labelPresentaPalpacion, JRadioButton radioPalpables, JLabel labelLocalizacionR1, JLabel labelCaracteristicasR){
        
        ExamenClinico exCli = consulta.buscarExamenClinico();
        
        pasarATxtArea(exCli.getLabios(),txtLabios);
        pasarALabel(exCli.getFrenillosLabiales(),labelFrenillosLabialesR);
        pasarALabel(exCli.getVestibuloBocal(),labelVestibuloBucal);
        pasarALabel(exCli.getMucosaPalatina(),txtMucosaPalatinaR);
        pasarATxtArea(exCli.getMucosaPisoDeBoca(),txtMucosaPisoBoca);
        pasarALabel(exCli.getFrenilloLingual(),labelFrenilloLingualR);
        pasarALabel(exCli.getCaraDorsalLengua(),labelCaraDorsalR);
        pasarALabel(exCli.getCaraVentralLengua(),labelCaraVentralR);
        pasarALabel(exCli.getBordesLateralesLengua(),labelBordesLateralesR);
        pasarALabel(exCli.getEncia(),labelEnciasR);
        pasarATxtArea(exCli.getDientes(),txtDientes);
        
        if(exCli.isIncluirTensionArterial()){
            pasarALabel(Integer.toString(exCli.getTensionArterialMaxima()),labelMaximaR);
            pasarALabel(Integer.toString(exCli.getTensionArterialMinima()),labelMinimaR);
        }
        else pasarALabel("No se incluyó la tensión arterial del paciente.",labelPresentaTension);
        
        if(exCli.isIncluirPalpacion()){
            pasarARadio(exCli.isGangliosPalpables(),radioPalpables);
            pasarALabel(exCli.getUbicacionGanglios(),labelLocalizacionR1);
            pasarALabel(exCli.getCaracteristicasPalpacion(),labelCaracteristicasR);
        }
        else pasarALabel("No se incluyó la palpación de los ganglios del paciente.",labelPresentaTension);
        
        
    }
    
    public void llenarDatosExamenRadiografico(Consulta consulta, JLabel labelPresentaExamenExamenRad, JTextArea txtRxPanoramica, JTextArea txtRxPeriapical, JTextArea txtRxOclusal){
        
        ExamenRadiografico exRad;
        
        if(consulta.buscarExamenRadiografico()){
            exRad = consulta.buscarObjetoExamenRadiografico();
            pasarATxtArea(exRad.getRxPanoramica(),txtRxPanoramica);
            pasarATxtArea(exRad.getRxPeriapical(),txtRxPeriapical);
            pasarATxtArea(exRad.getRxOclusal(),txtRxOclusal);
        }    
        else pasarALabel("No se incluyó el examen radiográfico.",labelPresentaExamenExamenRad);
           
    }
    
    public void llenarDatosExamenLaboratorio(Consulta consulta, JLabel labelPresentaExamenLab, JLabel labelPHR1, JLabel labelPCR, JLabel labelGlicemiaR, JLabel labelVDRLR,
                                                JLabel labelVIHR){
        
        ExamenLaboratorio exLab;
        
        if(consulta.buscarExamenLaboratorio()){
            exLab = consulta.buscarObjetoExamenLaboratorio();
            pasarALabel(exLab.getPerfilHematologico(),labelPHR1);
            pasarALabel(exLab.getPerfilCoagulacion(),labelPCR);
            pasarALabel(Integer.toString(exLab.getGlicemia())+" mg/dl",labelGlicemiaR);
            pasarALabel(exLab.getVdrl(),labelVDRLR);
            pasarALabel(exLab.getVih(),labelVIHR);
        } 
        else pasarALabel("No se incluyó el examen de laboratorio.",labelPresentaExamenLab);
    }
    
    public void llenarDatosAntecedenteRenalGastro(Consulta consulta, JRadioButton radioEnfermedadRenal, JLabel labelVecesDiaR, JLabel labelColorOrinaPaciente, JRadioButton radioCalculosRenales1,
                                                    JRadioButton radioAcidezEstomacal1, JRadioButton radioUlcerPeptica1, JRadioButton radioDiarreasFrecuencia1){
        
        AntecedenteRenalGastroIntestinal antRG = consulta.buscarObjetoAntecedenteRG();
        pasarARadio(antRG.isTenidoEnfermedadRenal(),radioEnfermedadRenal);
        pasarALabel(Integer.toString(antRG.getCantidadOrinaAlDia()),labelVecesDiaR);
        pasarALabel(antRG.getColorOrina(),labelColorOrinaPaciente);
        pasarARadio(antRG.isSufridoCalculosRenales(),radioCalculosRenales1);
        pasarARadio(antRG.isTenidoAcidezEstomacal(),radioAcidezEstomacal1);
        pasarARadio(antRG.isTenidoUlceraPeptica(),radioUlcerPeptica1);
        pasarARadio(antRG.isTenidoDiarreaFrecuente(),radioDiarreasFrecuencia1);
        
    }
    
    public void llenarDatosAntecedenteFemenino(Consulta consulta, JRadioButton radioNoAplicaFemenino, JRadioButton radioRegular1, JRadioButton radioIrregular1,
                                                JRadioButton radioEmbarazada1, JLabel labelMesesEmbarazoR, JRadioButton radioPastillasAnticonceptivas1,
                                                JRadioButton radioMenopausia1){
        
        AntecedenteFemenino antFem;
        
        if(consulta.buscarAntecedenteFem()){
            antFem = consulta.buscarObjetoAntecedenteFem();
            if(antFem.getRegularidadMenstrual().equals("Regular"))
                radioRegular1.setSelected(true);
            else
                radioIrregular1.setSelected(true);
            pasarARadio(antFem.isEstaEmbarazada(),radioEmbarazada1);
            pasarALabel(Integer.toString(antFem.getMesesDeEmbarazo()),labelMesesEmbarazoR);
            pasarARadio(antFem.isTomaPastillasAnticonceptivas(),radioPastillasAnticonceptivas1);
            pasarARadio(antFem.isTieneMenopausia(),radioMenopausia1);
        }
        else radioNoAplicaFemenino.setSelected(true);
        
    }
    
    public void llenarDatosAntecedenteCardiovascular(Consulta consulta, JRadioButton radioNoAplicaCardiovasculares, JRadioButton radioSubirEscaleras, JRadioButton radioEdema,
                                                        JRadioButton radioPalpitaciones, JRadioButton radioDoloresPecho, JRadioButton radioInfarto, JLabel labelCuandoInfartoR,
                                                        JRadioButton radioEndocarditisBacteriana, JRadioButton radioValvulopatia, JRadioButton radioHipertenso,
                                                        JRadioButton radioHipotenso, JRadioButton radioTratamientoTension){
        
        AntecedenteCardiovascular antCardio;
        
        if(consulta.bucarAntecedenteCardio()){
            antCardio = consulta.buscarObjetoAntecedenteCardio();
            pasarARadio(antCardio.isCansaSubirEscaleras(),radioSubirEscaleras);
            pasarARadio(antCardio.isEdemaMiembrosInferiores(),radioEdema);
            pasarARadio(antCardio.isPalpitaciones(),radioPalpitaciones);
            pasarARadio(antCardio.isDoloresEnPecho(),radioDoloresPecho);
            pasarARadio(antCardio.isTenidoInfarto(),radioInfarto);
            pasarARadio(antCardio.isSufreEndocarnitisBacteriana(),radioEndocarditisBacteriana);
            pasarARadio(antCardio.isPresentaVulvopatia(),radioValvulopatia);
            pasarARadio(antCardio.isEsHipertenso(),radioHipertenso);
            pasarARadio(antCardio.isEsHipotenso(),radioHipotenso);
            pasarARadio(antCardio.isEstaEnTratamiento(),radioTratamientoTension);
        }
        else radioNoAplicaCardiovasculares.setSelected(true);
    }
    
    public void llenarDatosAntecedenteAlergico(Consulta consulta, JRadioButton radioNoAplicaAlergicos, JRadioButton radioAlergicoMedicamento, JLabel labelCualMedicamentoR,
                                                JRadioButton radioUrticaria, JRadioButton radioDificultadTragar, JRadioButton radioDificultadRespirar,
                                                JRadioButton radioSufreAsma, JLabel labelUltimaCrisisR, JLabel labelRA){
        
        AntecedenteAlergico antAlergico;
        
        if(consulta.buscarAntecedenteAlergico()){
            antAlergico = consulta.buscarObjetoAntecedenteAlergico();
            pasarARadio(antAlergico.isAlergicoAMedicamento(),radioAlergicoMedicamento);
            pasarALabel(antAlergico.getMedicamentosConAlergia(),labelCualMedicamentoR);
            pasarARadio(antAlergico.isTenidoUrticaria(),radioUrticaria);
            pasarARadio(antAlergico.isDificultadParaTragar(),radioDificultadTragar);
            pasarARadio(antAlergico.isDificultadParaRespirar(),radioDificultadRespirar);
            pasarARadio(antAlergico.isTenidoAsma(),radioSufreAsma);
            pasarALabel(antAlergico.getUltimaCrisisAsma(),labelUltimaCrisisR);
            pasarALabel(antAlergico.getReaccionAnestesia(),labelRA);
        }
        else radioNoAplicaAlergicos.setSelected(true);
    }
    
    public void llenarDatosAntecedenteNM(Consulta consulta, JRadioButton radioNoAplicaNM, JRadioButton radioAnemia, JRadioButton radioPerdidoPeso,
                                            JRadioButton radioDieta, JRadioButton radioSienteDecaimiento, JRadioButton radioFiebre, JRadioButton radioDiabetico,
                                            JRadioButton radioTratamientoDiabetico, JRadioButton radioOrinaNoche, JLabel labelOrinaNocheR, JRadioButton radioMuchaSed,
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
            pasarARadio(antNM.isOrinaDeNoche(),radioOrinaNoche);
            pasarALabel(Integer.toString(antNM.getVecesOrinaDeNoche()),labelOrinaNocheR);
            pasarARadio(antNM.isSienteMuchaSed(),radioMuchaSed);
            pasarARadio(antNM.isTieneInsomnio(),radioInsomnio);
            pasarARadio(antNM.isPadeceDeTiroides(),radioTiroides);
        }
        else radioNoAplicaNM.setSelected(true);
    }
    
    public void llenarDatosAntecedenteInfeccioso(Consulta consulta, JRadioButton radioNoAplicaInfecciosas, JRadioButton radioEnfermedadesVenereas,
                                                    JRadioButton radioTransfusion, JRadioButton radioHepatitis, JLabel labelHaceCuantoHepR1,
                                                    JLabel labelTipoHepatitisR1, JRadioButton radioOtraEnfermedadHepatica, JLabel labelOtraHepaticaR,
                                                    JRadioButton radioTuberculosis){
        
        AntecedenteInfeccioso antInf;
        
        if(consulta.bucarAntecedenteInf()){
            antInf = consulta.buscarObjetoAntecedenteInf();
            pasarARadio(antInf.isTenidoEnfermedadesVenereas(),radioEnfermedadesVenereas);
            pasarARadio(antInf.isTenidoTransfusionDeSangre(),radioTransfusion);
            pasarALabel(antInf.getTiempoHepatitis(),labelHaceCuantoHepR1);
            pasarALabel(Character.toString(antInf.getTipoHepatitis()),labelTipoHepatitisR1);
            pasarARadio(antInf.isTieneOtraEnfermedadHepatica(),radioOtraEnfermedadHepatica);
            pasarALabel(antInf.getEnfermedadHepatica(),labelOtraHepaticaR);
            pasarARadio(antInf.isTenidoTuberculosis(),radioTuberculosis);
        }
        else radioNoAplicaInfecciosas.setSelected(true);
        
    }
    
    public void llenarDatosAntecedenteNeurologico(Consulta consulta, JRadioButton radioNoAplicaNeurologicas, JRadioButton radioConvulsiones,
                                                    JLabel labelTiempoConvulsiones, JRadioButton radioEpilepsia, JLabel labelFechaCrisisR,
                                                    JRadioButton radioNeuralgiasNeuritis, JRadioButton radioParalisisFacial, JRadioButton radioParestesia,
                                                    JRadioButton radioSeAltera, JRadioButton radioCefaleas){
        
        AntecedenteNeurologico antNeuro;
        
        if(consulta.buscarAntecedenteNeurologico()){
            antNeuro = consulta.buscarObjetoAntecedenteNeurologico();
            pasarARadio(antNeuro.isTenidoConvulsiones(),radioConvulsiones);
            pasarALabel(antNeuro.getTiempoConvulsiones(),labelTiempoConvulsiones);
            pasarARadio(antNeuro.isTenidoEpilepsia(),radioEpilepsia);
            pasarALabel(antNeuro.getUltimaCrisisEpileptica(),labelFechaCrisisR);
            pasarARadio(antNeuro.isTenidoNeuritisEnCara(),radioNeuralgiasNeuritis);
            pasarARadio(antNeuro.isParalisisFacial(),radioParalisisFacial);
            pasarARadio(antNeuro.isParestesia(),radioParestesia);
            pasarARadio(antNeuro.isAlteraConFacilidad(),radioSeAltera);
            pasarARadio(antNeuro.isCefaleasFrecuentes(),radioCefaleas);
        }
        else radioNoAplicaNeurologicas.setSelected(true);
        
    }
    
    public void llenarDatosAntecedenteHematologico(Consulta consulta, JRadioButton radioNoAplicaHematologicas, JRadioButton radioHemorragias, 
                                                    JLabel labelCausaHemorragiaR, JLabel labelDuracionHemorragia, JRadioButton radioHematomas, 
                                                    JRadioButton radioSangranEncias, JRadioButton radioSangraNariz){
        
        AntecedenteHematologico antHem;
        
        if(consulta.buscarAntecedenteHematologico()){
            antHem = consulta.buscarObjetoAntecedenteHematologico();
            pasarARadio(antHem.isTenidoHemorragiasImportantes(),radioHemorragias);
            pasarALabel(antHem.getCausaHemorragia(),labelCausaHemorragiaR);
            pasarALabel(antHem.getDuracionHemorragia(),labelDuracionHemorragia);
            pasarARadio(antHem.isHematomas(),radioHematomas);
            pasarARadio(antHem.isSangranEncias(),radioSangranEncias);
            pasarARadio(antHem.isSangraPorNariz(),radioSangraNariz);
        }
        else radioNoAplicaHematologicas.setSelected(true);
        
    }
    
    public void llenarAntecedenteFamiliar(Consulta consulta, JRadioButton radioFamiliares, JRadioButton radioCancer, JRadioButton radioEnfPulmonares,
                                            JRadioButton radioDiabetes, JRadioButton radioEnfCardiovasculares, JRadioButton radioEnfHepaticas,
                                            JLabel labelTipoCanR, JLabel labelTipoPulR, JLabel labelTipoDR, JLabel labelTipoCardioR, JLabel labelTipoHR,
                                            JLabel labelOtrosR4){
        
        AntecedenteFamiliar antFam;
        
        if(consulta.buscarAntecedenteFamiliar()){
            antFam = consulta.buscarObjetoAntecedenteFamiliar();
            if(!antFam.getCancer().equals(null)){
                radioCancer.setSelected(true);
                pasarALabel(antFam.getCancer(),labelTipoCanR);
            }
            if(!antFam.getPulmonares().equals(null)){
                radioEnfPulmonares.setSelected(true);
                pasarALabel(antFam.getPulmonares(),labelTipoPulR);
            }
            if(!antFam.getDiabetes().equals(null)){
                radioDiabetes.setSelected(true);
                pasarALabel(antFam.getDiabetes(),labelTipoDR);
            }
            if(!antFam.getCardiovasculares().equals(null)){
                radioEnfCardiovasculares.setSelected(true);
                pasarALabel(antFam.getCardiovasculares(),labelTipoCardioR);
            }
            if(!antFam.getHepaticas().equals(null)){
                radioEnfHepaticas.setSelected(true);
                pasarALabel(antFam.getHepaticas(),labelTipoHR);
            }
            if(!antFam.getOtros().equals(null)){
                pasarALabel(antFam.getOtros(),labelOtrosR4);
            }
                
        }
        else radioFamiliares.setSelected(true);
        
    }
   
}
