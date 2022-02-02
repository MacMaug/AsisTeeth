/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import control.*;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.*;
import persistencia.Guardar;

/**
 *
 * @author jdfer
 */
public class RegistrarConsulta extends javax.swing.JFrame {
    CVentana controlVentana = new CVentana();
    CEntrada controlEntrada = new CEntrada();
    CVerConsulta controlVer = new CVerConsulta();
    CModificarConsulta controlModificar;
    Odontologo odontologo;
    Paciente paciente;
    Consulta con;
    char accion = 'R';
    /**
     * Creates new form RegistrarConsulta
     */
    public RegistrarConsulta() {
        initComponents();  
    }
    
    //Constructor de Registrar Consulta
    public RegistrarConsulta(Odontologo odontologo) {
        initComponents();
        this.odontologo = odontologo;
        controlVentana.iniciarVentana(this);
        controlEntrada.fechaMaxima(new Date(), fechaUltimaCrisis);
        controlVentana.esconderAsteriscosDP(labelFaltanteCedula,labelFaltanteNombre,labelFaltanteTelefono,labelFaltanteEdad);
        controlVentana.esconderAsteriscosES(labelFaltanteMotivo,labelFaltanteMedicamento);
        controlVentana.esconderAsteriscosAntecedentes(labelFaltanteCardio,labelFaltanteAlergico,labelFaltanteHematologicas);
        controlVentana.esconderAsteriscosExC(labelECBFaltante,labelFaltanteMaxima,labelFaltanteMinima,labelFaltanteLocalizacion,labelFaltanteCaracteristicas);
        controlVentana.esconderAsteriscoDiagnostico(labelFaltantesDiagnostico);
        radioNoAplicaFemenino.setSelected(true);
        radioNoAplicaFemenino.setEnabled(false);
        botonDeshacer.setVisible(false);
        labelHistoriaMedica.setVisible(false);
        txtHM.setVisible(false);
        controlEntrada.habilitarAntecedenteFemenino(radioNoAplicaFemenino,comboMesesEmbarazo,radioRegular,radioIrregular,radioEmbarazada,radioPastillasAnticonceptivas,radioMenopausia);   
        controlVentana.colocarFechaUsuario(labelFecha, labelUsuario, odontologo);
    }
    
    //Constructor de Modificar Consulta
    public RegistrarConsulta(Paciente pac, Consulta con, Odontologo odontologo){
        initComponents();
        
        //Inicializar parte de registro
        this.odontologo = odontologo;
        this.accion = 'M';
        this.con = con;
        this.controlModificar = new CModificarConsulta();
        
        controlVentana.iniciarVentana(this);
        controlEntrada.fechaMaxima(new Date(), fechaUltimaCrisis);
        controlVentana.esconderAsteriscosDP(labelFaltanteCedula,labelFaltanteNombre,labelFaltanteTelefono,labelFaltanteEdad);
        controlVentana.esconderAsteriscosES(labelFaltanteMotivo,labelFaltanteMedicamento);
        controlVentana.esconderAsteriscosAntecedentes(labelFaltanteCardio,labelFaltanteAlergico,labelFaltanteHematologicas);
        controlVentana.esconderAsteriscosExC(labelECBFaltante,labelFaltanteMaxima,labelFaltanteMinima,labelFaltanteLocalizacion,labelFaltanteCaracteristicas);
        controlVentana.esconderAsteriscoDiagnostico(labelFaltantesDiagnostico);
        controlEntrada.pacienteRegistrado(pac, txtCedula, txtNombre, comboSexo, labelHistoriaMedica, txtHM, txtLugarNacimiento, 
                                            botonDeshacer, false);
        
        radioNoAplicaFemenino.setSelected(true);
        radioNoAplicaFemenino.setEnabled(false);
        botonDeshacer.setVisible(false);
        controlEntrada.habilitarAntecedenteFemenino(radioNoAplicaFemenino,comboMesesEmbarazo,radioRegular,radioIrregular,radioEmbarazada,radioPastillasAnticonceptivas,radioMenopausia);   
        controlVentana.colocarFechaUsuario(labelFecha, labelUsuario, odontologo);
        controlVentana.colocarTitulo(labelTitulo, "Modificar consulta");
        botonGuardar.setText("Guardar cambios");
        
        //Cargar datos
        controlVentana.colocarFechaUsuario(labelFecha, labelUsuario, odontologo);
        controlVentana.iniciarVentana(this);
        controlVer.llenarDiagnostico(con, txtPresuntivo, txtHistopatologico, txtDefinitivo, txtPlanTratamiento, txtObservaciones);
        
        controlVer.llenarDatosPersonalPaciente(pac,txtCedula,txtNombre,txtHM,comboSexo,txtLugarNacimiento);
        
        controlVer.llenarDatosPersonalesConsulta(con,txtTelf1,txtTelf2,txtOcupacion,txtEdad,radioEstudiante,txtReferencia,txtDomicilio);
        
        controlVer.llenarDatosExamenSubjetivo(con,txtMotivo,txtCurso,comboMedicamentos, 
                                                txtCualMed,comboHospitalizado,txtPorQueHospitalizado, 
                                                comboIntervenidoQuirurgicamente, radioFuma, txtCuantosCigarrillos, 
                                                txtDesdeFuma, radioToma,txtCantidadToma);
        
        controlVer.llenarDatosExamenClinico(con, txtLabios,txtFrenillosLabiales,txtVestibuloBucal,txtMucosaPalatina,txtMucosaPisoBoca,txtFrenilloLingual, 
                                                txtCaraDorsal,txtCaraVentral,txtBordesLaterales,txtEncias,txtDientes,radioIncluirTensionArterial,txtMaxima,txtMinima, 
                                                radioIncluirPalpacion, radioPalpables,txtLocalizacion,txtCaracteristicas);
        
        controlVer.llenarDatosExamenRadiografico(con,radioAgregarExamenRadiografico, txtRxPanoramica, txtRxPeriapical, txtRxOclusal);
        
        controlVer.llenarDatosExamenLaboratorio(con,radioAgregarExamenLaboratorio,txtPerfilHematologico,txtPerfilCoagulacion,
                                                txtGlicemia,comboVDRL,comboVIH);
        
        controlVer.llenarDatosAntecedenteRenalGastro(con,radioEnfermedadRenal,txtOrinaDia,txtColorOrina,radioCalculosRenales1, radioAcidezEstomacal1,
                                                        radioUlcerPeptica1, radioDiarreasFrecuencia1);
        
        controlVer.llenarDatosAntecedenteFemenino(con, radioNoAplicaFemenino, radioRegular, radioIrregular, radioEmbarazada, 
                                                    comboMesesEmbarazo, radioPastillasAnticonceptivas, radioMenopausia);
        
        controlVer.llenarDatosAntecedenteCardiovascular(con, radioNoAplicaCardiovasculares, radioSubirEscaleras, radioEdema, radioPalpitaciones, 
                                                        radioDoloresPecho, radioInfarto, txtCuandoInfarto, radioEndocarditisBacteriana, 
                                                        radioValvulopatia, radioHipertenso, radioHipertenso, radioTratamientoTension);
        
        controlVer.llenarDatosAntecedenteAlergico(con, radioNoAplicaAlergicos, radioAlergicoMedicamento,txtAlergicoMedicamento, 
                                                    radioUrticaria,radioDificultadTragar, radioDificultadRespirar, radioSufreAsma,
                                                    txtUltimaCrisisAsma,txtReaccionAnestesiaLocal);
        
        controlVer.llenarDatosAntecedenteNM(con, radioNoAplicaNM, radioAnemia, radioPerdidoPeso, radioDieta, 
                                            radioSienteDecaimiento, radioFiebre, radioDiabetico, radioTratamientoDiabetico, 
                                            radioOrinaNoche,txtOrinaNoche, radioMuchaSed, radioInsomnio, radioTiroides);
        
        controlVer.llenarDatosAntecedenteInfeccioso(con, radioNoAplicaInfecciosas, radioEnfermedadesVenereas,txtHaceCuantoVenereas,
                                                    radioTransfusion,radioHepatitis,txtHaceCuantoHepatitis,comboTipoHepatitis, 
                                                    radioOtraEnfermedadHepatica,txtCualOtraHepatica, radioTuberculosis);
        
        controlVer.llenarDatosAntecedenteNeurologico(con, radioNoAplicaNeurologicas, radioConvulsiones, txtCuantoTiempoConvulsiones, 
                                                        radioEpilepsia, txtFechaUltimaCrisis, radioNeuralgiasNeuritis, 
                                                        radioParalisisFacial, radioParestesia, radioSeAltera, radioCefaleas);
        
        controlVer.llenarDatosAntecedenteHematologico(con, radioNoAplicaHematologicas, radioHemorragiasImportantes,txtCausaHemorragia,txtDuracionHemorragia, 
                                                        radioHematomas, radioSangranEncias, radioSangraNariz);
        
        controlVer.llenarAntecedenteFamiliar(con, radioFamiliares, radioCancer, radioEnfPulmonares, radioDiabetes, radioEnfCardiovasculares, radioEnfHepaticas, 
                                                txtTipoCancer,txtTipoEnfPulmonares,comboTipoDiabetes, txtTipoEnfCardiovasculares, 
                                                txtTipoEnfHepaticas, txtOtros1);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRegularIrregular = new javax.swing.ButtonGroup();
        grupoTensionArterial = new javax.swing.ButtonGroup();
        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        panelBotones = new javax.swing.JPanel();
        botonDatosPersonales = new javax.swing.JButton();
        botonExamenSub = new javax.swing.JButton();
        botonAntecedentes = new javax.swing.JButton();
        botonExamenCli = new javax.swing.JButton();
        botonExamenCom = new javax.swing.JButton();
        botonDiaTra = new javax.swing.JButton();
        panelInfo = new javax.swing.JPanel();
        pestRegistrar = new javax.swing.JTabbedPane();
        pestDatosPersonales = new javax.swing.JPanel();
        labelDatosPersonales = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelSexo = new javax.swing.JLabel();
        labelEdad = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelOcupacion = new javax.swing.JLabel();
        labelLugarNacimiento = new javax.swing.JLabel();
        labelDomicilio = new javax.swing.JLabel();
        labelReferencia = new javax.swing.JLabel();
        labelHistoriaMedica = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelf1 = new javax.swing.JTextField();
        labelGuion = new javax.swing.JLabel();
        txtTelf2 = new javax.swing.JTextField();
        txtLugarNacimiento = new javax.swing.JTextField();
        comboSexo = new javax.swing.JComboBox<>();
        txtDomicilio = new javax.swing.JTextField();
        radioEstudiante = new javax.swing.JRadioButton();
        txtOcupacion = new javax.swing.JTextField();
        txtReferencia = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        labelFaltanteCedula = new javax.swing.JLabel();
        labelFaltanteNombre = new javax.swing.JLabel();
        labelFaltanteTelefono = new javax.swing.JLabel();
        labelFaltanteEdad = new javax.swing.JLabel();
        botonDeshacer = new javax.swing.JButton();
        txtHM = new javax.swing.JTextField();
        pestExamenSub = new javax.swing.JPanel();
        labelDatosPersonales1 = new javax.swing.JLabel();
        labelMotivo = new javax.swing.JLabel();
        labelCursoEnfermedad = new javax.swing.JLabel();
        labelMedicamento = new javax.swing.JLabel();
        labelCual = new javax.swing.JLabel();
        labelHospitalizado = new javax.swing.JLabel();
        labelPorQue = new javax.swing.JLabel();
        labelQuirurgicamente = new javax.swing.JLabel();
        labelDesdeCuando = new javax.swing.JLabel();
        labelCuantosCigarrillos = new javax.swing.JLabel();
        labelQueCantidad = new javax.swing.JLabel();
        radioFuma = new javax.swing.JRadioButton();
        txtMotivo = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        comboMedicamentos = new javax.swing.JComboBox<>();
        txtCualMed = new javax.swing.JTextField();
        comboHospitalizado = new javax.swing.JComboBox<>();
        txtPorQueHospitalizado = new javax.swing.JTextField();
        comboIntervenidoQuirurgicamente = new javax.swing.JComboBox<>();
        radioToma = new javax.swing.JRadioButton();
        txtCantidadToma = new javax.swing.JTextField();
        txtDesdeFuma = new javax.swing.JTextField();
        txtCuantosCigarrillos = new javax.swing.JTextField();
        labelFaltanteMotivo = new javax.swing.JLabel();
        labelFaltanteMedicamento = new javax.swing.JLabel();
        pestAntecedentes = new javax.swing.JPanel();
        labelAntecedentes = new javax.swing.JLabel();
        tabsAntecedentes = new javax.swing.JTabbedPane();
        panelRenalesGastrointestinales = new javax.swing.JPanel();
        labelRenalesGastrointestinales = new javax.swing.JLabel();
        radioEnfermedadRenal = new javax.swing.JRadioButton();
        labelCuantasVecesOrinaDia1 = new javax.swing.JLabel();
        labelColorOrina1 = new javax.swing.JLabel();
        txtColorOrina = new javax.swing.JTextField();
        radioCalculosRenales1 = new javax.swing.JRadioButton();
        radioAcidezEstomacal1 = new javax.swing.JRadioButton();
        radioUlcerPeptica1 = new javax.swing.JRadioButton();
        radioDiarreasFrecuencia1 = new javax.swing.JRadioButton();
        txtOrinaDia = new javax.swing.JTextField();
        panelFemenino = new javax.swing.JPanel();
        labelFemenino1 = new javax.swing.JLabel();
        labelMenstruacion1 = new javax.swing.JLabel();
        radioRegular = new javax.swing.JRadioButton();
        radioIrregular = new javax.swing.JRadioButton();
        radioEmbarazada = new javax.swing.JRadioButton();
        labelMesesEmbarazo1 = new javax.swing.JLabel();
        comboMesesEmbarazo = new javax.swing.JComboBox<>();
        radioPastillasAnticonceptivas = new javax.swing.JRadioButton();
        radioMenopausia = new javax.swing.JRadioButton();
        radioNoAplicaFemenino = new javax.swing.JRadioButton();
        panelCardiovasculares = new javax.swing.JPanel();
        labelCardiovasculares1 = new javax.swing.JLabel();
        radioNoAplicaCardiovasculares = new javax.swing.JRadioButton();
        radioSubirEscaleras = new javax.swing.JRadioButton();
        radioEdema = new javax.swing.JRadioButton();
        radioPalpitaciones = new javax.swing.JRadioButton();
        radioDoloresPecho = new javax.swing.JRadioButton();
        radioInfarto = new javax.swing.JRadioButton();
        labelCuandoInfarto1 = new javax.swing.JLabel();
        txtCuandoInfarto = new javax.swing.JTextField();
        radioEndocarditisBacteriana = new javax.swing.JRadioButton();
        radioValvulopatia = new javax.swing.JRadioButton();
        radioHipertenso = new javax.swing.JRadioButton();
        radioHipotenso = new javax.swing.JRadioButton();
        radioTratamientoTension = new javax.swing.JRadioButton();
        labelFaltanteCardio = new javax.swing.JLabel();
        panelAlergicos = new javax.swing.JPanel();
        labelAlérgicos1 = new javax.swing.JLabel();
        radioAlergicoMedicamento = new javax.swing.JRadioButton();
        radioNoAplicaAlergicos = new javax.swing.JRadioButton();
        labelCualMedicamento1 = new javax.swing.JLabel();
        txtAlergicoMedicamento = new javax.swing.JTextField();
        radioUrticaria = new javax.swing.JRadioButton();
        radioDificultadTragar = new javax.swing.JRadioButton();
        radioDificultadRespirar = new javax.swing.JRadioButton();
        radioSufreAsma = new javax.swing.JRadioButton();
        labelCrisisAsma2 = new javax.swing.JLabel();
        txtUltimaCrisisAsma = new javax.swing.JTextField();
        labelCrisisAsma3 = new javax.swing.JLabel();
        txtReaccionAnestesiaLocal = new javax.swing.JTextField();
        labelFaltanteAlergico = new javax.swing.JLabel();
        panelNutricionalesMetabolicos = new javax.swing.JPanel();
        labelNutricionalesMetabolicos1 = new javax.swing.JLabel();
        radioNoAplicaNM = new javax.swing.JRadioButton();
        radioAnemia = new javax.swing.JRadioButton();
        radioPerdidoPeso = new javax.swing.JRadioButton();
        radioDieta = new javax.swing.JRadioButton();
        radioSienteDecaimiento = new javax.swing.JRadioButton();
        radioMalestarGeneral = new javax.swing.JRadioButton();
        radioFiebre = new javax.swing.JRadioButton();
        radioDiabetico = new javax.swing.JRadioButton();
        radioTratamientoDiabetico = new javax.swing.JRadioButton();
        radioOrinaNoche = new javax.swing.JRadioButton();
        labelCuantasVecesOrinaNoche1 = new javax.swing.JLabel();
        radioMuchaSed = new javax.swing.JRadioButton();
        radioInsomnio = new javax.swing.JRadioButton();
        radioTiroides = new javax.swing.JRadioButton();
        txtOrinaNoche = new javax.swing.JTextField();
        panelInfecciosas = new javax.swing.JPanel();
        labelInfecciosas4 = new javax.swing.JLabel();
        radioNoAplicaInfecciosas = new javax.swing.JRadioButton();
        radioEnfermedadesVenereas = new javax.swing.JRadioButton();
        labelHaceCuantoVenereas1 = new javax.swing.JLabel();
        txtHaceCuantoVenereas = new javax.swing.JTextField();
        radioTransfusion = new javax.swing.JRadioButton();
        radioHepatitis = new javax.swing.JRadioButton();
        labelHaceCuantoHepatitis1 = new javax.swing.JLabel();
        txtHaceCuantoHepatitis = new javax.swing.JTextField();
        labelTipoHepatitis1 = new javax.swing.JLabel();
        comboTipoHepatitis = new javax.swing.JComboBox<>();
        radioOtraEnfermedadHepatica = new javax.swing.JRadioButton();
        labelCualOtraHepatica1 = new javax.swing.JLabel();
        txtCualOtraHepatica = new javax.swing.JTextField();
        radioTuberculosis = new javax.swing.JRadioButton();
        panelNeurologicas = new javax.swing.JPanel();
        labelInfecciosas5 = new javax.swing.JLabel();
        radioNoAplicaNeurologicas = new javax.swing.JRadioButton();
        radioConvulsiones = new javax.swing.JRadioButton();
        labelCuantoTiempoConvulsiones1 = new javax.swing.JLabel();
        txtCuantoTiempoConvulsiones = new javax.swing.JTextField();
        radioEpilepsia = new javax.swing.JRadioButton();
        labelFechaUltimaCrisis1 = new javax.swing.JLabel();
        fechaUltimaCrisis = new com.toedter.calendar.JDateChooser();
        radioNeuralgiasNeuritis = new javax.swing.JRadioButton();
        radioParalisisFacial = new javax.swing.JRadioButton();
        radioParestesia = new javax.swing.JRadioButton();
        radioSeAltera = new javax.swing.JRadioButton();
        radioCefaleas = new javax.swing.JRadioButton();
        txtFechaUltimaCrisis = new javax.swing.JTextField();
        panelHematologicas = new javax.swing.JPanel();
        labelInfecciosas6 = new javax.swing.JLabel();
        radioNoAplicaHematologicas = new javax.swing.JRadioButton();
        radioHemorragiasImportantes = new javax.swing.JRadioButton();
        labelCausaHemorragia1 = new javax.swing.JLabel();
        txtCausaHemorragia = new javax.swing.JTextField();
        labelDuracionHemorragia1 = new javax.swing.JLabel();
        txtDuracionHemorragia = new javax.swing.JTextField();
        radioHematomas = new javax.swing.JRadioButton();
        radioSangranEncias = new javax.swing.JRadioButton();
        radioSangraNariz = new javax.swing.JRadioButton();
        labelFaltanteHematologicas = new javax.swing.JLabel();
        panelFamiliares = new javax.swing.JPanel();
        labelFamiliares1 = new javax.swing.JLabel();
        radioFamiliares = new javax.swing.JRadioButton();
        radioCancer = new javax.swing.JRadioButton();
        labelTipoCancer1 = new javax.swing.JLabel();
        txtTipoCancer = new javax.swing.JTextField();
        radioEnfPulmonares = new javax.swing.JRadioButton();
        labelTipoEnfPulmonares1 = new javax.swing.JLabel();
        txtTipoEnfPulmonares = new javax.swing.JTextField();
        radioDiabetes = new javax.swing.JRadioButton();
        labelTipoDiabetes2 = new javax.swing.JLabel();
        comboTipoDiabetes = new javax.swing.JComboBox<>();
        radioEnfCardiovasculares = new javax.swing.JRadioButton();
        txtTipoEnfCardiovasculares = new javax.swing.JTextField();
        radioEnfHepaticas = new javax.swing.JRadioButton();
        labelTipoDiabetes3 = new javax.swing.JLabel();
        txtTipoEnfHepaticas = new javax.swing.JTextField();
        labelOtros1 = new javax.swing.JLabel();
        txtOtros1 = new javax.swing.JTextField();
        labelTipoEnfCardio = new javax.swing.JLabel();
        pestExamenClinico = new javax.swing.JPanel();
        tabExamenesClinicos = new javax.swing.JTabbedPane();
        scrollExamenCavidadBucal = new javax.swing.JScrollPane();
        tabExamenCavidadBucal = new javax.swing.JPanel();
        labelPalpacionGanglios2 = new javax.swing.JLabel();
        labelLabios = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLabios = new javax.swing.JTextArea();
        labelFrenillosLabiales = new javax.swing.JLabel();
        txtFrenillosLabiales = new javax.swing.JTextField();
        txtVestibuloBucal = new javax.swing.JTextField();
        labelVestibuloBucal = new javax.swing.JLabel();
        labelMucosaPalatina = new javax.swing.JLabel();
        txtMucosaPalatina = new javax.swing.JTextField();
        labelMucosaPisoBoca = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMucosaPisoBoca = new javax.swing.JTextArea();
        labelFrenilloLingual = new javax.swing.JLabel();
        txtFrenilloLingual = new javax.swing.JTextField();
        labelLengua = new javax.swing.JLabel();
        labelCaraDorsal = new javax.swing.JLabel();
        txtCaraDorsal = new javax.swing.JTextField();
        txtCaraVentral = new javax.swing.JTextField();
        labelCaraVentral = new javax.swing.JLabel();
        labelBordesLaterales = new javax.swing.JLabel();
        txtBordesLaterales = new javax.swing.JTextField();
        labelEncia = new javax.swing.JLabel();
        txtEncias = new javax.swing.JTextField();
        labelDientes = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDientes = new javax.swing.JTextArea();
        labelECBFaltante = new javax.swing.JLabel();
        tabTensionArterial = new javax.swing.JPanel();
        labelTensionArterial1 = new javax.swing.JLabel();
        labelMaxima1 = new javax.swing.JLabel();
        txtMaxima = new javax.swing.JTextField();
        labelMMHG2 = new javax.swing.JLabel();
        labelMinima1 = new javax.swing.JLabel();
        txtMinima = new javax.swing.JTextField();
        labelMMHG3 = new javax.swing.JLabel();
        radioIncluirTensionArterial = new javax.swing.JRadioButton();
        labelFaltanteMaxima = new javax.swing.JLabel();
        labelFaltanteMinima = new javax.swing.JLabel();
        tabPalpacion = new javax.swing.JPanel();
        labelPalpacionGanglios1 = new javax.swing.JLabel();
        labelLocalizacion1 = new javax.swing.JLabel();
        txtLocalizacion = new javax.swing.JTextField();
        labelCaracteristicas1 = new javax.swing.JLabel();
        txtCaracteristicas = new javax.swing.JTextField();
        radioPalpables = new javax.swing.JRadioButton();
        radioIncluirPalpacion = new javax.swing.JRadioButton();
        labelFaltanteLocalizacion = new javax.swing.JLabel();
        labelFaltanteCaracteristicas = new javax.swing.JLabel();
        labelExamenClinico3 = new javax.swing.JLabel();
        pestExamenCom = new javax.swing.JPanel();
        labelExamenCom = new javax.swing.JLabel();
        tabsExamenesCom = new javax.swing.JTabbedPane();
        tabExamenRadiografico = new javax.swing.JPanel();
        radioAgregarExamenRadiografico = new javax.swing.JRadioButton();
        labelRxPanoramica1 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtRxPanoramica = new javax.swing.JTextArea();
        labelRxPeriapical1 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtRxPeriapical = new javax.swing.JTextArea();
        labelRxOclusal1 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtRxOclusal = new javax.swing.JTextArea();
        tabExamenLab = new javax.swing.JPanel();
        radioAgregarExamenLaboratorio = new javax.swing.JRadioButton();
        labelPerfilHematologico1 = new javax.swing.JLabel();
        txtPerfilHematologico = new javax.swing.JTextField();
        labelPerfilCoagulacion1 = new javax.swing.JLabel();
        txtPerfilCoagulacion = new javax.swing.JTextField();
        labelMMGDL = new javax.swing.JLabel();
        txtGlicemia = new javax.swing.JTextField();
        labelVDRL1 = new javax.swing.JLabel();
        labelVIH = new javax.swing.JLabel();
        labelGlicemia = new javax.swing.JLabel();
        comboVDRL = new javax.swing.JComboBox<>();
        comboVIH = new javax.swing.JComboBox<>();
        pestDiaTra = new javax.swing.JPanel();
        labelExamenClinico2 = new javax.swing.JLabel();
        tabsDiaTra = new javax.swing.JTabbedPane();
        scrollDiagnostico = new javax.swing.JScrollPane();
        tabDiagnostico = new javax.swing.JPanel();
        labelPresuntivo = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtPresuntivo = new javax.swing.JTextArea();
        labelHistopatologico = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtHistopatologico = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtDefinitivo = new javax.swing.JTextArea();
        labelDefinitivo = new javax.swing.JLabel();
        labelRxPanoramica3 = new javax.swing.JLabel();
        labelFaltantesDiagnostico = new javax.swing.JLabel();
        tabPlanTratamiento = new javax.swing.JPanel();
        labelPlanTratamiento = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtPlanTratamiento = new javax.swing.JTextArea();
        tabObservaciones = new javax.swing.JPanel();
        labelObservaciones = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        botonGuardar = new javax.swing.JButton();
        botonOdontograma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitulo.setBackground(new java.awt.Color(0, 102, 204));

        labelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        labelTitulo.setFont(new java.awt.Font("Nirmala UI", 0, 60)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Registrar consulta");

        labelUsuario.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Nombre de usuario:");

        labelFecha.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha.setText("Fecha:");

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
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(23, 23, 23))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        panelBotones.setBackground(java.awt.SystemColor.activeCaption);
        panelBotones.setForeground(javax.swing.UIManager.getDefaults().getColor("TextArea.selectionBackground"));

        botonDatosPersonales.setBackground(new java.awt.Color(255, 255, 255));
        botonDatosPersonales.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        botonDatosPersonales.setText("Datos personales");
        botonDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDatosPersonalesActionPerformed(evt);
            }
        });

        botonExamenSub.setBackground(new java.awt.Color(255, 255, 255));
        botonExamenSub.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        botonExamenSub.setText("Examen subjetivo");
        botonExamenSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExamenSubActionPerformed(evt);
            }
        });

        botonAntecedentes.setBackground(new java.awt.Color(255, 255, 255));
        botonAntecedentes.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        botonAntecedentes.setText("Antecedentes");
        botonAntecedentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAntecedentesActionPerformed(evt);
            }
        });

        botonExamenCli.setBackground(new java.awt.Color(255, 255, 255));
        botonExamenCli.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        botonExamenCli.setText("Examen clínico");
        botonExamenCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExamenCliActionPerformed(evt);
            }
        });

        botonExamenCom.setBackground(new java.awt.Color(255, 255, 255));
        botonExamenCom.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        botonExamenCom.setText("Exámenes complementarios");
        botonExamenCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExamenComActionPerformed(evt);
            }
        });

        botonDiaTra.setBackground(new java.awt.Color(255, 255, 255));
        botonDiaTra.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        botonDiaTra.setText("Diagnóstico y Tratamiento");
        botonDiaTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDiaTraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botonDatosPersonales)
                .addGap(10, 10, 10)
                .addComponent(botonExamenSub)
                .addGap(10, 10, 10)
                .addComponent(botonAntecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(botonExamenCli, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(botonExamenCom)
                .addGap(10, 10, 10)
                .addComponent(botonDiaTra)
                .addContainerGap())
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonExamenSub)
                        .addComponent(botonDatosPersonales))
                    .addComponent(botonAntecedentes)
                    .addComponent(botonExamenCli)
                    .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonExamenCom)
                        .addComponent(botonDiaTra))))
        );

        getContentPane().add(panelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1200, 70));

        panelInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pestRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        pestRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pestRegistrarMouseClicked(evt);
            }
        });

        pestDatosPersonales.setBackground(new java.awt.Color(255, 255, 255));

        labelDatosPersonales.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        labelDatosPersonales.setText("I. Datos Personales");

        labelCedula.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCedula.setText("Cédula:");

        labelNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelNombre.setText("Nombre y apellido:");

        labelSexo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelSexo.setText("Sexo:");

        labelEdad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelEdad.setText("Edad (años):");

        labelTelefono.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelTelefono.setText("Teléfono:");

        labelOcupacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelOcupacion.setText("Ocupación:");

        labelLugarNacimiento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelLugarNacimiento.setText("Lugar de nacimiento:");

        labelDomicilio.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelDomicilio.setText("Domicilio:");

        labelReferencia.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelReferencia.setText("Referencia:");

        labelHistoriaMedica.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelHistoriaMedica.setText("Historia médica:");

        txtCedula.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });

        txtTelf1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtTelf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelf1FocusLost(evt);
            }
        });

        labelGuion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelGuion.setText("-");

        txtTelf2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtTelf2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelf2FocusLost(evt);
            }
        });

        txtLugarNacimiento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtLugarNacimiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLugarNacimientoFocusLost(evt);
            }
        });

        comboSexo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        comboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexoActionPerformed(evt);
            }
        });

        txtDomicilio.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        radioEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        radioEstudiante.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        radioEstudiante.setText("Estudiante");
        radioEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEstudianteActionPerformed(evt);
            }
        });

        txtOcupacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtOcupacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOcupacionFocusLost(evt);
            }
        });

        txtReferencia.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        txtEdad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtEdad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEdadFocusLost(evt);
            }
        });

        labelFaltanteCedula.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelFaltanteCedula.setForeground(new java.awt.Color(255, 0, 0));
        labelFaltanteCedula.setText("*");

        labelFaltanteNombre.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelFaltanteNombre.setForeground(new java.awt.Color(255, 0, 0));
        labelFaltanteNombre.setText("*");

        labelFaltanteTelefono.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelFaltanteTelefono.setForeground(new java.awt.Color(255, 0, 0));
        labelFaltanteTelefono.setText("*");

        labelFaltanteEdad.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelFaltanteEdad.setForeground(new java.awt.Color(255, 0, 0));
        labelFaltanteEdad.setText("*");

        botonDeshacer.setBackground(new java.awt.Color(204, 204, 204));
        botonDeshacer.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        botonDeshacer.setText("Deshacer");
        botonDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeshacerActionPerformed(evt);
            }
        });

        txtHM.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtHM.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHMFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pestDatosPersonalesLayout = new javax.swing.GroupLayout(pestDatosPersonales);
        pestDatosPersonales.setLayout(pestDatosPersonalesLayout);
        pestDatosPersonalesLayout.setHorizontalGroup(
            pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelDatosPersonales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pestDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(labelEdad)
                                .addGap(18, 18, 18)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelFaltanteEdad))
                            .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(labelTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelf1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelGuion, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelf2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelFaltanteTelefono))
                            .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(labelLugarNacimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                                        .addComponent(labelOcupacion)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(radioEstudiante)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pestDatosPersonalesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelReferencia)
                                .addGap(18, 18, 18)
                                .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pestDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(labelDomicilio)
                        .addGap(18, 18, 18)
                        .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pestDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(labelSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pestDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(labelNombre)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(labelFaltanteNombre)
                        .addGap(30, 30, 30)
                        .addComponent(labelHistoriaMedica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHM, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pestDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(labelCedula)
                        .addGap(18, 18, 18)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFaltanteCedula)
                        .addGap(32, 32, 32)
                        .addComponent(botonDeshacer)))
                .addContainerGap(336, Short.MAX_VALUE))
        );
        pestDatosPersonalesLayout.setVerticalGroup(
            pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelDatosPersonales)
                .addGap(27, 27, 27)
                .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFaltanteCedula)
                    .addComponent(botonDeshacer, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHistoriaMedica)
                    .addComponent(labelFaltanteNombre)
                    .addComponent(txtHM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSexo)
                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTelefono)
                            .addComponent(txtTelf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelGuion)
                            .addComponent(labelFaltanteTelefono))
                        .addGap(18, 18, 18)
                        .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEdad)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFaltanteEdad))
                        .addGap(18, 18, 18)
                        .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLugarNacimiento)
                            .addComponent(txtLugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelReferencia)
                            .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelOcupacion)
                            .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioEstudiante)))
                .addGap(18, 18, 18)
                .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDomicilio)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pestRegistrar.addTab("Datos personales", pestDatosPersonales);

        pestExamenSub.setBackground(new java.awt.Color(255, 255, 255));

        labelDatosPersonales1.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        labelDatosPersonales1.setText("II. Examen subjetivo");

        labelMotivo.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelMotivo.setText("Motivo de consulta:");

        labelCursoEnfermedad.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelCursoEnfermedad.setText("Curso de la enfermedad actual:");

        labelMedicamento.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelMedicamento.setText("¿Está tomando algún medicamento?:");

        labelCual.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelCual.setText("¿Cuál?:");

        labelHospitalizado.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelHospitalizado.setText("¿Ha sido hospitalizado alguna vez?:");

        labelPorQue.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelPorQue.setText("¿Por qué?:");

        labelQuirurgicamente.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelQuirurgicamente.setText("¿Ha sido intervenido quirúrgicamente?:");

        labelDesdeCuando.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelDesdeCuando.setText("¿Desde cuándo?:");

        labelCuantosCigarrillos.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelCuantosCigarrillos.setText("¿Cuántos cigarrillos?:");

        labelQueCantidad.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelQueCantidad.setText("¿Qué cantidad?:");

        radioFuma.setBackground(new java.awt.Color(255, 255, 255));
        radioFuma.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        radioFuma.setText("Fuma");
        radioFuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFumaActionPerformed(evt);
            }
        });

        txtMotivo.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        txtCurso.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        comboMedicamentos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        comboMedicamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Sí" }));
        comboMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMedicamentosActionPerformed(evt);
            }
        });

        txtCualMed.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        txtCualMed.setEnabled(false);

        comboHospitalizado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        comboHospitalizado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Sí" }));
        comboHospitalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHospitalizadoActionPerformed(evt);
            }
        });

        txtPorQueHospitalizado.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        txtPorQueHospitalizado.setEnabled(false);

        comboIntervenidoQuirurgicamente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        comboIntervenidoQuirurgicamente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Sí" }));

        radioToma.setBackground(new java.awt.Color(255, 255, 255));
        radioToma.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        radioToma.setText("Toma");
        radioToma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTomaActionPerformed(evt);
            }
        });

        txtCantidadToma.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        txtCantidadToma.setEnabled(false);

        txtDesdeFuma.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        txtDesdeFuma.setEnabled(false);

        txtCuantosCigarrillos.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        txtCuantosCigarrillos.setEnabled(false);
        txtCuantosCigarrillos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCuantosCigarrillosFocusLost(evt);
            }
        });

        labelFaltanteMotivo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelFaltanteMotivo.setForeground(new java.awt.Color(255, 0, 0));
        labelFaltanteMotivo.setText("*");

        labelFaltanteMedicamento.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelFaltanteMedicamento.setForeground(new java.awt.Color(255, 0, 0));
        labelFaltanteMedicamento.setText("*");

        javax.swing.GroupLayout pestExamenSubLayout = new javax.swing.GroupLayout(pestExamenSub);
        pestExamenSub.setLayout(pestExamenSubLayout);
        pestExamenSubLayout.setHorizontalGroup(
            pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestExamenSubLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestExamenSubLayout.createSequentialGroup()
                        .addComponent(labelCursoEnfermedad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pestExamenSubLayout.createSequentialGroup()
                        .addComponent(labelQuirurgicamente)
                        .addGap(18, 18, 18)
                        .addComponent(comboIntervenidoQuirurgicamente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pestExamenSubLayout.createSequentialGroup()
                        .addComponent(labelMotivo)
                        .addGap(18, 18, 18)
                        .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelFaltanteMotivo))
                    .addGroup(pestExamenSubLayout.createSequentialGroup()
                        .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioFuma)
                            .addComponent(radioToma))
                        .addGap(97, 97, 97)
                        .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pestExamenSubLayout.createSequentialGroup()
                                .addComponent(labelCuantosCigarrillos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCuantosCigarrillos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(labelDesdeCuando)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDesdeFuma, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pestExamenSubLayout.createSequentialGroup()
                                .addComponent(labelQueCantidad)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantidadToma, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pestExamenSubLayout.createSequentialGroup()
                            .addComponent(labelDatosPersonales1)
                            .addGap(701, 701, 701))
                        .addGroup(pestExamenSubLayout.createSequentialGroup()
                            .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pestExamenSubLayout.createSequentialGroup()
                                    .addComponent(labelMedicamento)
                                    .addGap(18, 18, 18)
                                    .addComponent(comboMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pestExamenSubLayout.createSequentialGroup()
                                    .addComponent(labelHospitalizado)
                                    .addGap(18, 18, 18)
                                    .addComponent(comboHospitalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pestExamenSubLayout.createSequentialGroup()
                                    .addComponent(labelCual)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCualMed, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelFaltanteMedicamento))
                                .addGroup(pestExamenSubLayout.createSequentialGroup()
                                    .addComponent(labelPorQue)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPorQueHospitalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        pestExamenSubLayout.setVerticalGroup(
            pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestExamenSubLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelDatosPersonales1)
                .addGap(47, 47, 47)
                .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMotivo)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFaltanteMotivo))
                .addGap(30, 30, 30)
                .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCursoEnfermedad)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestExamenSubLayout.createSequentialGroup()
                        .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCual)
                            .addComponent(txtCualMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFaltanteMedicamento))
                        .addGap(30, 30, 30)
                        .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPorQue)
                            .addComponent(txtPorQueHospitalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pestExamenSubLayout.createSequentialGroup()
                        .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMedicamento)
                            .addComponent(comboMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelHospitalizado)
                            .addComponent(comboHospitalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuirurgicamente)
                    .addComponent(comboIntervenidoQuirurgicamente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDesdeCuando)
                    .addComponent(labelCuantosCigarrillos)
                    .addComponent(radioFuma)
                    .addComponent(txtDesdeFuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCuantosCigarrillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioToma)
                    .addComponent(labelQueCantidad)
                    .addComponent(txtCantidadToma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pestRegistrar.addTab("Examen subjetivo", pestExamenSub);

        pestAntecedentes.setBackground(new java.awt.Color(255, 255, 255));

        labelAntecedentes.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        labelAntecedentes.setText("III. Antecedentes");

        tabsAntecedentes.setBackground(new java.awt.Color(255, 255, 255));
        tabsAntecedentes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        panelRenalesGastrointestinales.setBackground(new java.awt.Color(255, 255, 255));

        labelRenalesGastrointestinales.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelRenalesGastrointestinales.setText("Renales y gastrointestinales");

        radioEnfermedadRenal.setBackground(new java.awt.Color(255, 255, 255));
        radioEnfermedadRenal.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioEnfermedadRenal.setText("Ha padecido alguna enfermedad renal");
        radioEnfermedadRenal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEnfermedadRenalActionPerformed(evt);
            }
        });

        labelCuantasVecesOrinaDia1.setBackground(new java.awt.Color(255, 255, 255));
        labelCuantasVecesOrinaDia1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCuantasVecesOrinaDia1.setText("¿Cuántas orina al día veces?:");

        labelColorOrina1.setBackground(new java.awt.Color(255, 255, 255));
        labelColorOrina1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelColorOrina1.setText("¿De qué color?:");

        txtColorOrina.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtColorOrina.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtColorOrinaFocusLost(evt);
            }
        });

        radioCalculosRenales1.setBackground(new java.awt.Color(255, 255, 255));
        radioCalculosRenales1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioCalculosRenales1.setText("Ha sufrido cálculos renales");
        radioCalculosRenales1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCalculosRenales1ActionPerformed(evt);
            }
        });

        radioAcidezEstomacal1.setBackground(new java.awt.Color(255, 255, 255));
        radioAcidezEstomacal1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioAcidezEstomacal1.setText("Sufre de acidez estomacal");
        radioAcidezEstomacal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAcidezEstomacal1ActionPerformed(evt);
            }
        });

        radioUlcerPeptica1.setBackground(new java.awt.Color(255, 255, 255));
        radioUlcerPeptica1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioUlcerPeptica1.setText("Ha tenido o tiene úlcera péptica");
        radioUlcerPeptica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUlcerPeptica1ActionPerformed(evt);
            }
        });

        radioDiarreasFrecuencia1.setBackground(new java.awt.Color(255, 255, 255));
        radioDiarreasFrecuencia1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioDiarreasFrecuencia1.setText("Sufre diarreas con frecuencia");
        radioDiarreasFrecuencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDiarreasFrecuencia1ActionPerformed(evt);
            }
        });

        txtOrinaDia.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtOrinaDia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOrinaDiaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelRenalesGastrointestinalesLayout = new javax.swing.GroupLayout(panelRenalesGastrointestinales);
        panelRenalesGastrointestinales.setLayout(panelRenalesGastrointestinalesLayout);
        panelRenalesGastrointestinalesLayout.setHorizontalGroup(
            panelRenalesGastrointestinalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRenalesGastrointestinalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRenalesGastrointestinalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioDiarreasFrecuencia1)
                    .addComponent(radioUlcerPeptica1)
                    .addComponent(radioAcidezEstomacal1)
                    .addComponent(radioCalculosRenales1)
                    .addComponent(radioEnfermedadRenal)
                    .addComponent(labelRenalesGastrointestinales)
                    .addGroup(panelRenalesGastrointestinalesLayout.createSequentialGroup()
                        .addComponent(labelCuantasVecesOrinaDia1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOrinaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(labelColorOrina1)
                        .addGap(18, 18, 18)
                        .addComponent(txtColorOrina, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(352, Short.MAX_VALUE))
        );
        panelRenalesGastrointestinalesLayout.setVerticalGroup(
            panelRenalesGastrointestinalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRenalesGastrointestinalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRenalesGastrointestinales)
                .addGap(18, 18, 18)
                .addComponent(radioEnfermedadRenal)
                .addGap(18, 18, 18)
                .addGroup(panelRenalesGastrointestinalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCuantasVecesOrinaDia1)
                    .addComponent(labelColorOrina1)
                    .addComponent(txtColorOrina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrinaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(radioCalculosRenales1)
                .addGap(18, 18, 18)
                .addComponent(radioAcidezEstomacal1)
                .addGap(18, 18, 18)
                .addComponent(radioUlcerPeptica1)
                .addGap(18, 18, 18)
                .addComponent(radioDiarreasFrecuencia1)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        tabsAntecedentes.addTab("Renales y gastrointestinales", panelRenalesGastrointestinales);

        panelFemenino.setBackground(new java.awt.Color(255, 255, 255));

        labelFemenino1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelFemenino1.setText("Femenino");

        labelMenstruacion1.setBackground(new java.awt.Color(255, 255, 255));
        labelMenstruacion1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelMenstruacion1.setText("Menstruación:");

        radioRegular.setBackground(new java.awt.Color(255, 255, 255));
        grupoRegularIrregular.add(radioRegular);
        radioRegular.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioRegular.setText("Regular");
        radioRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioRegularActionPerformed(evt);
            }
        });

        radioIrregular.setBackground(new java.awt.Color(255, 255, 255));
        grupoRegularIrregular.add(radioIrregular);
        radioIrregular.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioIrregular.setText("Irregular");
        radioIrregular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioIrregularActionPerformed(evt);
            }
        });

        radioEmbarazada.setBackground(new java.awt.Color(255, 255, 255));
        radioEmbarazada.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioEmbarazada.setText("Está embarazada");
        radioEmbarazada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEmbarazadaActionPerformed(evt);
            }
        });

        labelMesesEmbarazo1.setBackground(new java.awt.Color(255, 255, 255));
        labelMesesEmbarazo1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelMesesEmbarazo1.setText("¿Cuántos meses?:");

        comboMesesEmbarazo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        comboMesesEmbarazo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        comboMesesEmbarazo.setEnabled(false);

        radioPastillasAnticonceptivas.setBackground(new java.awt.Color(255, 255, 255));
        radioPastillasAnticonceptivas.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioPastillasAnticonceptivas.setText("Toma pastillas anticonceptivas");
        radioPastillasAnticonceptivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPastillasAnticonceptivasActionPerformed(evt);
            }
        });

        radioMenopausia.setBackground(new java.awt.Color(255, 255, 255));
        radioMenopausia.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioMenopausia.setText("Presenta la menopausia");
        radioMenopausia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMenopausiaActionPerformed(evt);
            }
        });

        radioNoAplicaFemenino.setBackground(new java.awt.Color(255, 255, 255));
        radioNoAplicaFemenino.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioNoAplicaFemenino.setText("No aplica");
        radioNoAplicaFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoAplicaFemeninoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFemeninoLayout = new javax.swing.GroupLayout(panelFemenino);
        panelFemenino.setLayout(panelFemeninoLayout);
        panelFemeninoLayout.setHorizontalGroup(
            panelFemeninoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFemeninoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFemeninoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFemeninoLayout.createSequentialGroup()
                        .addComponent(radioPastillasAnticonceptivas)
                        .addGap(18, 18, 18)
                        .addComponent(radioMenopausia))
                    .addGroup(panelFemeninoLayout.createSequentialGroup()
                        .addComponent(labelMenstruacion1)
                        .addGap(47, 47, 47)
                        .addComponent(radioRegular)
                        .addGap(18, 18, 18)
                        .addComponent(radioIrregular))
                    .addGroup(panelFemeninoLayout.createSequentialGroup()
                        .addComponent(labelFemenino1)
                        .addGap(18, 18, 18)
                        .addComponent(radioNoAplicaFemenino))
                    .addGroup(panelFemeninoLayout.createSequentialGroup()
                        .addComponent(radioEmbarazada)
                        .addGap(18, 18, 18)
                        .addComponent(labelMesesEmbarazo1)
                        .addGap(18, 18, 18)
                        .addComponent(comboMesesEmbarazo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(638, Short.MAX_VALUE))
        );
        panelFemeninoLayout.setVerticalGroup(
            panelFemeninoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFemeninoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFemeninoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFemenino1)
                    .addComponent(radioNoAplicaFemenino))
                .addGap(18, 18, 18)
                .addGroup(panelFemeninoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioRegular)
                    .addComponent(labelMenstruacion1)
                    .addComponent(radioIrregular))
                .addGap(18, 18, 18)
                .addGroup(panelFemeninoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioEmbarazada)
                    .addComponent(labelMesesEmbarazo1)
                    .addComponent(comboMesesEmbarazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFemeninoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioPastillasAnticonceptivas)
                    .addComponent(radioMenopausia))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        tabsAntecedentes.addTab("Femenino", panelFemenino);

        panelCardiovasculares.setBackground(new java.awt.Color(255, 255, 255));

        labelCardiovasculares1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelCardiovasculares1.setText("Cardiovasculares");

        radioNoAplicaCardiovasculares.setBackground(new java.awt.Color(255, 255, 255));
        radioNoAplicaCardiovasculares.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioNoAplicaCardiovasculares.setText("No aplica");
        radioNoAplicaCardiovasculares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoAplicaCardiovascularesActionPerformed(evt);
            }
        });

        radioSubirEscaleras.setBackground(new java.awt.Color(255, 255, 255));
        radioSubirEscaleras.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioSubirEscaleras.setText("Se cansa al subir escaleras");
        radioSubirEscaleras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSubirEscalerasActionPerformed(evt);
            }
        });

        radioEdema.setBackground(new java.awt.Color(255, 255, 255));
        radioEdema.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioEdema.setText("Ha presentado edema de los miembros inferiores");
        radioEdema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEdemaActionPerformed(evt);
            }
        });

        radioPalpitaciones.setBackground(new java.awt.Color(255, 255, 255));
        radioPalpitaciones.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioPalpitaciones.setText("Ha tenido palpitaciones");
        radioPalpitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPalpitacionesActionPerformed(evt);
            }
        });

        radioDoloresPecho.setBackground(new java.awt.Color(255, 255, 255));
        radioDoloresPecho.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioDoloresPecho.setText("Dolores en el pecho");
        radioDoloresPecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDoloresPechoActionPerformed(evt);
            }
        });

        radioInfarto.setBackground(new java.awt.Color(255, 255, 255));
        radioInfarto.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioInfarto.setText("Ha sufrido algún infarto");
        radioInfarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInfartoActionPerformed(evt);
            }
        });

        labelCuandoInfarto1.setBackground(new java.awt.Color(255, 255, 255));
        labelCuandoInfarto1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCuandoInfarto1.setText("¿Cuándo?:");

        txtCuandoInfarto.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCuandoInfarto.setEnabled(false);

        radioEndocarditisBacteriana.setBackground(new java.awt.Color(255, 255, 255));
        radioEndocarditisBacteriana.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioEndocarditisBacteriana.setText("Ha sufrido o sufre Endocarditis Bacteriana");
        radioEndocarditisBacteriana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEndocarditisBacterianaActionPerformed(evt);
            }
        });

        radioValvulopatia.setBackground(new java.awt.Color(255, 255, 255));
        radioValvulopatia.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioValvulopatia.setText("Presenta alguna valvulopatía (soplos, prolapso valvular)");
        radioValvulopatia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioValvulopatiaActionPerformed(evt);
            }
        });

        radioHipertenso.setBackground(new java.awt.Color(255, 255, 255));
        grupoTensionArterial.add(radioHipertenso);
        radioHipertenso.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioHipertenso.setText("Es Hipertenso");
        radioHipertenso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHipertensoActionPerformed(evt);
            }
        });

        radioHipotenso.setBackground(new java.awt.Color(255, 255, 255));
        grupoTensionArterial.add(radioHipotenso);
        radioHipotenso.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioHipotenso.setText("Es Hipotenso");
        radioHipotenso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHipotensoActionPerformed(evt);
            }
        });

        radioTratamientoTension.setBackground(new java.awt.Color(255, 255, 255));
        radioTratamientoTension.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioTratamientoTension.setText("Está en tratamiento");
        radioTratamientoTension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTratamientoTensionActionPerformed(evt);
            }
        });

        labelFaltanteCardio.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelFaltanteCardio.setForeground(new java.awt.Color(255, 0, 0));
        labelFaltanteCardio.setText("*");

        javax.swing.GroupLayout panelCardiovascularesLayout = new javax.swing.GroupLayout(panelCardiovasculares);
        panelCardiovasculares.setLayout(panelCardiovascularesLayout);
        panelCardiovascularesLayout.setHorizontalGroup(
            panelCardiovascularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardiovascularesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCardiovascularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCardiovascularesLayout.createSequentialGroup()
                        .addComponent(radioHipertenso)
                        .addGap(18, 18, 18)
                        .addComponent(radioHipotenso)
                        .addGap(18, 18, 18)
                        .addComponent(radioTratamientoTension))
                    .addGroup(panelCardiovascularesLayout.createSequentialGroup()
                        .addComponent(radioInfarto)
                        .addGap(18, 18, 18)
                        .addComponent(labelCuandoInfarto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCuandoInfarto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCardiovascularesLayout.createSequentialGroup()
                        .addComponent(radioPalpitaciones)
                        .addGap(18, 18, 18)
                        .addComponent(radioDoloresPecho))
                    .addComponent(radioEdema)
                    .addComponent(radioSubirEscaleras)
                    .addGroup(panelCardiovascularesLayout.createSequentialGroup()
                        .addComponent(labelCardiovasculares1)
                        .addGap(18, 18, 18)
                        .addComponent(radioNoAplicaCardiovasculares))
                    .addComponent(radioEndocarditisBacteriana, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioValvulopatia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFaltanteCardio)
                .addContainerGap(551, Short.MAX_VALUE))
        );
        panelCardiovascularesLayout.setVerticalGroup(
            panelCardiovascularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardiovascularesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCardiovascularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCardiovasculares1)
                    .addComponent(radioNoAplicaCardiovasculares))
                .addGap(19, 19, 19)
                .addComponent(radioSubirEscaleras)
                .addGap(18, 18, 18)
                .addComponent(radioEdema)
                .addGap(18, 18, 18)
                .addGroup(panelCardiovascularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioPalpitaciones)
                    .addComponent(radioDoloresPecho))
                .addGap(18, 18, 18)
                .addGroup(panelCardiovascularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioInfarto)
                    .addComponent(labelCuandoInfarto1)
                    .addComponent(txtCuandoInfarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFaltanteCardio))
                .addGap(18, 18, 18)
                .addComponent(radioEndocarditisBacteriana)
                .addGap(18, 18, 18)
                .addComponent(radioValvulopatia)
                .addGap(18, 18, 18)
                .addGroup(panelCardiovascularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioHipertenso)
                    .addComponent(radioHipotenso)
                    .addComponent(radioTratamientoTension))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabsAntecedentes.addTab("Cardiovasculares", panelCardiovasculares);

        panelAlergicos.setBackground(new java.awt.Color(255, 255, 255));

        labelAlérgicos1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelAlérgicos1.setText("Alérgicos");

        radioAlergicoMedicamento.setBackground(new java.awt.Color(255, 255, 255));
        radioAlergicoMedicamento.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioAlergicoMedicamento.setText("Es alérgico a algún medicamento");
        radioAlergicoMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAlergicoMedicamentoActionPerformed(evt);
            }
        });

        radioNoAplicaAlergicos.setBackground(new java.awt.Color(255, 255, 255));
        radioNoAplicaAlergicos.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioNoAplicaAlergicos.setText("No aplica");
        radioNoAplicaAlergicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoAplicaAlergicosActionPerformed(evt);
            }
        });

        labelCualMedicamento1.setBackground(new java.awt.Color(255, 255, 255));
        labelCualMedicamento1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCualMedicamento1.setText("¿Cuál?:");

        txtAlergicoMedicamento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAlergicoMedicamento.setEnabled(false);

        radioUrticaria.setBackground(new java.awt.Color(255, 255, 255));
        radioUrticaria.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioUrticaria.setText("Ha presentado urticaria");
        radioUrticaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUrticariaActionPerformed(evt);
            }
        });

        radioDificultadTragar.setBackground(new java.awt.Color(255, 255, 255));
        radioDificultadTragar.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioDificultadTragar.setText("Dificultad para tragar");
        radioDificultadTragar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDificultadTragarActionPerformed(evt);
            }
        });

        radioDificultadRespirar.setBackground(new java.awt.Color(255, 255, 255));
        radioDificultadRespirar.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioDificultadRespirar.setText("Dificultad para respirar");
        radioDificultadRespirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDificultadRespirarActionPerformed(evt);
            }
        });

        radioSufreAsma.setBackground(new java.awt.Color(255, 255, 255));
        radioSufreAsma.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioSufreAsma.setText("Ha sufrido o sufre de Asma");
        radioSufreAsma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSufreAsmaActionPerformed(evt);
            }
        });

        labelCrisisAsma2.setBackground(new java.awt.Color(255, 255, 255));
        labelCrisisAsma2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCrisisAsma2.setText("última crisis:");

        txtUltimaCrisisAsma.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUltimaCrisisAsma.setEnabled(false);

        labelCrisisAsma3.setBackground(new java.awt.Color(255, 255, 255));
        labelCrisisAsma3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCrisisAsma3.setText("Ha tenido alguna reacción a la anestesia local:");

        txtReaccionAnestesiaLocal.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelFaltanteAlergico.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelFaltanteAlergico.setForeground(new java.awt.Color(255, 0, 0));
        labelFaltanteAlergico.setText("*");

        javax.swing.GroupLayout panelAlergicosLayout = new javax.swing.GroupLayout(panelAlergicos);
        panelAlergicos.setLayout(panelAlergicosLayout);
        panelAlergicosLayout.setHorizontalGroup(
            panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlergicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelAlergicosLayout.createSequentialGroup()
                        .addComponent(labelCrisisAsma3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtReaccionAnestesiaLocal))
                    .addGroup(panelAlergicosLayout.createSequentialGroup()
                        .addComponent(radioAlergicoMedicamento)
                        .addGap(18, 18, 18)
                        .addComponent(labelCualMedicamento1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAlergicoMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFaltanteAlergico))
                    .addGroup(panelAlergicosLayout.createSequentialGroup()
                        .addComponent(labelAlérgicos1)
                        .addGap(18, 18, 18)
                        .addComponent(radioNoAplicaAlergicos))
                    .addGroup(panelAlergicosLayout.createSequentialGroup()
                        .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioUrticaria)
                            .addComponent(radioDificultadRespirar))
                        .addGap(18, 18, 18)
                        .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAlergicosLayout.createSequentialGroup()
                                .addComponent(radioSufreAsma)
                                .addGap(42, 42, 42)
                                .addComponent(labelCrisisAsma2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUltimaCrisisAsma, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(radioDificultadTragar))))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        panelAlergicosLayout.setVerticalGroup(
            panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlergicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlérgicos1)
                    .addComponent(radioNoAplicaAlergicos))
                .addGap(18, 18, 18)
                .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioAlergicoMedicamento)
                    .addComponent(labelCualMedicamento1)
                    .addComponent(txtAlergicoMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFaltanteAlergico))
                .addGap(18, 18, 18)
                .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioUrticaria)
                    .addComponent(radioDificultadTragar))
                .addGap(18, 18, 18)
                .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioDificultadRespirar)
                    .addComponent(radioSufreAsma)
                    .addComponent(labelCrisisAsma2)
                    .addComponent(txtUltimaCrisisAsma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCrisisAsma3)
                    .addComponent(txtReaccionAnestesiaLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        tabsAntecedentes.addTab("Alérgicos", panelAlergicos);

        panelNutricionalesMetabolicos.setBackground(new java.awt.Color(255, 255, 255));

        labelNutricionalesMetabolicos1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelNutricionalesMetabolicos1.setText("Nutricionales y Metabólicos");

        radioNoAplicaNM.setBackground(new java.awt.Color(255, 255, 255));
        radioNoAplicaNM.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioNoAplicaNM.setText("No aplica");
        radioNoAplicaNM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoAplicaNMActionPerformed(evt);
            }
        });

        radioAnemia.setBackground(new java.awt.Color(255, 255, 255));
        radioAnemia.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioAnemia.setText("Ha padecido de anemia alguna vez");
        radioAnemia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAnemiaActionPerformed(evt);
            }
        });

        radioPerdidoPeso.setBackground(new java.awt.Color(255, 255, 255));
        radioPerdidoPeso.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioPerdidoPeso.setText("Ha perdido peso");
        radioPerdidoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPerdidoPesoActionPerformed(evt);
            }
        });

        radioDieta.setBackground(new java.awt.Color(255, 255, 255));
        radioDieta.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioDieta.setText("Se encuentra realizando alguna dieta");
        radioDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDietaActionPerformed(evt);
            }
        });

        radioSienteDecaimiento.setBackground(new java.awt.Color(255, 255, 255));
        radioSienteDecaimiento.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioSienteDecaimiento.setText("Siente decaimiento");
        radioSienteDecaimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSienteDecaimientoActionPerformed(evt);
            }
        });

        radioMalestarGeneral.setBackground(new java.awt.Color(255, 255, 255));
        radioMalestarGeneral.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioMalestarGeneral.setText("Malestar General");
        radioMalestarGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMalestarGeneralActionPerformed(evt);
            }
        });

        radioFiebre.setBackground(new java.awt.Color(255, 255, 255));
        radioFiebre.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioFiebre.setText("Fiebre");
        radioFiebre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFiebreActionPerformed(evt);
            }
        });

        radioDiabetico.setBackground(new java.awt.Color(255, 255, 255));
        radioDiabetico.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioDiabetico.setText("Es Diabético");
        radioDiabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDiabeticoActionPerformed(evt);
            }
        });

        radioTratamientoDiabetico.setBackground(new java.awt.Color(255, 255, 255));
        radioTratamientoDiabetico.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioTratamientoDiabetico.setText("Está en tratamiento");
        radioTratamientoDiabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTratamientoDiabeticoActionPerformed(evt);
            }
        });

        radioOrinaNoche.setBackground(new java.awt.Color(255, 255, 255));
        radioOrinaNoche.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioOrinaNoche.setText("Se levanta a orinar de noche");
        radioOrinaNoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOrinaNocheActionPerformed(evt);
            }
        });

        labelCuantasVecesOrinaNoche1.setBackground(new java.awt.Color(255, 255, 255));
        labelCuantasVecesOrinaNoche1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCuantasVecesOrinaNoche1.setText("¿Cuántas veces?:");

        radioMuchaSed.setBackground(new java.awt.Color(255, 255, 255));
        radioMuchaSed.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioMuchaSed.setText("Siente mucha sed");
        radioMuchaSed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMuchaSedActionPerformed(evt);
            }
        });

        radioInsomnio.setBackground(new java.awt.Color(255, 255, 255));
        radioInsomnio.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioInsomnio.setText("Sufre de insomnio");
        radioInsomnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInsomnioActionPerformed(evt);
            }
        });

        radioTiroides.setBackground(new java.awt.Color(255, 255, 255));
        radioTiroides.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioTiroides.setText("Ha padecido de la Tiroides");
        radioTiroides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTiroidesActionPerformed(evt);
            }
        });

        txtOrinaNoche.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtOrinaNoche.setEnabled(false);
        txtOrinaNoche.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOrinaNocheFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelNutricionalesMetabolicosLayout = new javax.swing.GroupLayout(panelNutricionalesMetabolicos);
        panelNutricionalesMetabolicos.setLayout(panelNutricionalesMetabolicosLayout);
        panelNutricionalesMetabolicosLayout.setHorizontalGroup(
            panelNutricionalesMetabolicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNutricionalesMetabolicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNutricionalesMetabolicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNutricionalesMetabolicosLayout.createSequentialGroup()
                        .addComponent(radioInsomnio)
                        .addGap(18, 18, 18)
                        .addComponent(radioTiroides))
                    .addGroup(panelNutricionalesMetabolicosLayout.createSequentialGroup()
                        .addComponent(labelNutricionalesMetabolicos1)
                        .addGap(18, 18, 18)
                        .addComponent(radioNoAplicaNM))
                    .addGroup(panelNutricionalesMetabolicosLayout.createSequentialGroup()
                        .addGroup(panelNutricionalesMetabolicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNutricionalesMetabolicosLayout.createSequentialGroup()
                                .addComponent(radioSienteDecaimiento)
                                .addGap(18, 18, 18)
                                .addComponent(radioMalestarGeneral))
                            .addGroup(panelNutricionalesMetabolicosLayout.createSequentialGroup()
                                .addComponent(radioDiabetico)
                                .addGap(18, 18, 18)
                                .addComponent(radioTratamientoDiabetico)))
                        .addGap(18, 18, 18)
                        .addComponent(radioFiebre))
                    .addGroup(panelNutricionalesMetabolicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelNutricionalesMetabolicosLayout.createSequentialGroup()
                            .addComponent(radioOrinaNoche)
                            .addGap(21, 21, 21)
                            .addComponent(labelCuantasVecesOrinaNoche1)
                            .addGap(18, 18, 18)
                            .addComponent(txtOrinaNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioMuchaSed))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelNutricionalesMetabolicosLayout.createSequentialGroup()
                            .addComponent(radioAnemia)
                            .addGap(18, 18, 18)
                            .addComponent(radioPerdidoPeso)
                            .addGap(18, 18, 18)
                            .addComponent(radioDieta))))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        panelNutricionalesMetabolicosLayout.setVerticalGroup(
            panelNutricionalesMetabolicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNutricionalesMetabolicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNutricionalesMetabolicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNutricionalesMetabolicos1)
                    .addComponent(radioNoAplicaNM))
                .addGap(18, 18, 18)
                .addGroup(panelNutricionalesMetabolicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioAnemia)
                    .addComponent(radioPerdidoPeso)
                    .addComponent(radioDieta))
                .addGap(18, 18, 18)
                .addGroup(panelNutricionalesMetabolicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSienteDecaimiento)
                    .addComponent(radioMalestarGeneral)
                    .addComponent(radioFiebre))
                .addGap(18, 18, 18)
                .addGroup(panelNutricionalesMetabolicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioDiabetico)
                    .addComponent(radioTratamientoDiabetico))
                .addGap(18, 18, 18)
                .addGroup(panelNutricionalesMetabolicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioOrinaNoche)
                    .addComponent(labelCuantasVecesOrinaNoche1)
                    .addComponent(radioMuchaSed)
                    .addComponent(txtOrinaNoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNutricionalesMetabolicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioInsomnio)
                    .addComponent(radioTiroides))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        tabsAntecedentes.addTab("Nutricionales y Metabólicos", panelNutricionalesMetabolicos);

        panelInfecciosas.setBackground(new java.awt.Color(255, 255, 255));

        labelInfecciosas4.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelInfecciosas4.setText("Infecciosas");

        radioNoAplicaInfecciosas.setBackground(new java.awt.Color(255, 255, 255));
        radioNoAplicaInfecciosas.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioNoAplicaInfecciosas.setText("No aplica");
        radioNoAplicaInfecciosas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoAplicaInfecciosasActionPerformed(evt);
            }
        });

        radioEnfermedadesVenereas.setBackground(new java.awt.Color(255, 255, 255));
        radioEnfermedadesVenereas.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioEnfermedadesVenereas.setText("Ha padecido enfermedades venéreas");
        radioEnfermedadesVenereas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEnfermedadesVenereasActionPerformed(evt);
            }
        });

        labelHaceCuantoVenereas1.setBackground(new java.awt.Color(255, 255, 255));
        labelHaceCuantoVenereas1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelHaceCuantoVenereas1.setText("¿Hace cuánto tiempo?:");

        txtHaceCuantoVenereas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        radioTransfusion.setBackground(new java.awt.Color(255, 255, 255));
        radioTransfusion.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioTransfusion.setText("Ha recibido alguna transfusión de sangre");
        radioTransfusion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTransfusionActionPerformed(evt);
            }
        });

        radioHepatitis.setBackground(new java.awt.Color(255, 255, 255));
        radioHepatitis.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioHepatitis.setText("Ha sufrido Hepatitis");
        radioHepatitis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHepatitisActionPerformed(evt);
            }
        });

        labelHaceCuantoHepatitis1.setBackground(new java.awt.Color(255, 255, 255));
        labelHaceCuantoHepatitis1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelHaceCuantoHepatitis1.setText("¿Hace cuánto tiempo?:");

        txtHaceCuantoHepatitis.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelTipoHepatitis1.setBackground(new java.awt.Color(255, 255, 255));
        labelTipoHepatitis1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelTipoHepatitis1.setText("¿Qué tipo?:");

        comboTipoHepatitis.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        comboTipoHepatitis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));

        radioOtraEnfermedadHepatica.setBackground(new java.awt.Color(255, 255, 255));
        radioOtraEnfermedadHepatica.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioOtraEnfermedadHepatica.setText("Ha padecido alguna otra enfermedad hepatica");
        radioOtraEnfermedadHepatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOtraEnfermedadHepaticaActionPerformed(evt);
            }
        });

        labelCualOtraHepatica1.setBackground(new java.awt.Color(255, 255, 255));
        labelCualOtraHepatica1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCualOtraHepatica1.setText("¿Cuál?:");

        txtCualOtraHepatica.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        radioTuberculosis.setBackground(new java.awt.Color(255, 255, 255));
        radioTuberculosis.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioTuberculosis.setText("Ha padecido de tuberculosis");
        radioTuberculosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTuberculosisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInfecciosasLayout = new javax.swing.GroupLayout(panelInfecciosas);
        panelInfecciosas.setLayout(panelInfecciosasLayout);
        panelInfecciosasLayout.setHorizontalGroup(
            panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfecciosasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioTuberculosis)
                    .addComponent(radioTransfusion)
                    .addGroup(panelInfecciosasLayout.createSequentialGroup()
                        .addComponent(radioEnfermedadesVenereas)
                        .addGap(18, 18, 18)
                        .addComponent(labelHaceCuantoVenereas1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHaceCuantoVenereas, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInfecciosasLayout.createSequentialGroup()
                        .addComponent(labelInfecciosas4)
                        .addGap(18, 18, 18)
                        .addComponent(radioNoAplicaInfecciosas))
                    .addGroup(panelInfecciosasLayout.createSequentialGroup()
                        .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfecciosasLayout.createSequentialGroup()
                                .addComponent(radioHepatitis)
                                .addGap(18, 18, 18)
                                .addComponent(labelHaceCuantoHepatitis1))
                            .addComponent(radioOtraEnfermedadHepatica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelInfecciosasLayout.createSequentialGroup()
                                .addComponent(labelCualOtraHepatica1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCualOtraHepatica))
                            .addGroup(panelInfecciosasLayout.createSequentialGroup()
                                .addComponent(txtHaceCuantoHepatitis, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(labelTipoHepatitis1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboTipoHepatitis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInfecciosasLayout.setVerticalGroup(
            panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfecciosasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInfecciosas4)
                    .addComponent(radioNoAplicaInfecciosas))
                .addGap(18, 18, 18)
                .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioEnfermedadesVenereas)
                    .addComponent(labelHaceCuantoVenereas1)
                    .addComponent(txtHaceCuantoVenereas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(radioTransfusion)
                .addGap(18, 18, 18)
                .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioHepatitis)
                    .addComponent(labelHaceCuantoHepatitis1)
                    .addComponent(txtHaceCuantoHepatitis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTipoHepatitis1)
                    .addComponent(comboTipoHepatitis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioOtraEnfermedadHepatica)
                    .addComponent(labelCualOtraHepatica1)
                    .addComponent(txtCualOtraHepatica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(radioTuberculosis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabsAntecedentes.addTab("Infecciosas", panelInfecciosas);

        panelNeurologicas.setBackground(new java.awt.Color(255, 255, 255));

        labelInfecciosas5.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelInfecciosas5.setText("Neurológicas");

        radioNoAplicaNeurologicas.setBackground(new java.awt.Color(255, 255, 255));
        radioNoAplicaNeurologicas.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioNoAplicaNeurologicas.setText("No aplica");
        radioNoAplicaNeurologicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoAplicaNeurologicasActionPerformed(evt);
            }
        });

        radioConvulsiones.setBackground(new java.awt.Color(255, 255, 255));
        radioConvulsiones.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioConvulsiones.setText("Ha sufrido alguna vez convulsiones");
        radioConvulsiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioConvulsionesActionPerformed(evt);
            }
        });

        labelCuantoTiempoConvulsiones1.setBackground(new java.awt.Color(255, 255, 255));
        labelCuantoTiempoConvulsiones1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCuantoTiempoConvulsiones1.setText("¿Hace cuánto tiempo?:");

        txtCuantoTiempoConvulsiones.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        radioEpilepsia.setBackground(new java.awt.Color(255, 255, 255));
        radioEpilepsia.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioEpilepsia.setText("Sufre de epilepsia");
        radioEpilepsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEpilepsiaActionPerformed(evt);
            }
        });

        labelFechaUltimaCrisis1.setBackground(new java.awt.Color(255, 255, 255));
        labelFechaUltimaCrisis1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelFechaUltimaCrisis1.setText("Fecha de la última crisis:");

        radioNeuralgiasNeuritis.setBackground(new java.awt.Color(255, 255, 255));
        radioNeuralgiasNeuritis.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioNeuralgiasNeuritis.setText("Ha sentido neuralgias o neuritis en la cara");
        radioNeuralgiasNeuritis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNeuralgiasNeuritisActionPerformed(evt);
            }
        });

        radioParalisisFacial.setBackground(new java.awt.Color(255, 255, 255));
        radioParalisisFacial.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioParalisisFacial.setText("Ha tenido alguna vez una parálisis facial");
        radioParalisisFacial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioParalisisFacialActionPerformed(evt);
            }
        });

        radioParestesia.setBackground(new java.awt.Color(255, 255, 255));
        radioParestesia.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioParestesia.setText("Ha sentido alguna vez parestesia en la cara");
        radioParestesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioParestesiaActionPerformed(evt);
            }
        });

        radioSeAltera.setBackground(new java.awt.Color(255, 255, 255));
        radioSeAltera.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioSeAltera.setText("Se altera con facilidad");
        radioSeAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSeAlteraActionPerformed(evt);
            }
        });

        radioCefaleas.setBackground(new java.awt.Color(255, 255, 255));
        radioCefaleas.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioCefaleas.setText("Presenta cefaleas frecuentes");
        radioCefaleas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCefaleasActionPerformed(evt);
            }
        });

        txtFechaUltimaCrisis.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelNeurologicasLayout = new javax.swing.GroupLayout(panelNeurologicas);
        panelNeurologicas.setLayout(panelNeurologicasLayout);
        panelNeurologicasLayout.setHorizontalGroup(
            panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNeurologicasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNeurologicasLayout.createSequentialGroup()
                        .addComponent(labelInfecciosas5)
                        .addGap(18, 18, 18)
                        .addComponent(radioNoAplicaNeurologicas))
                    .addGroup(panelNeurologicasLayout.createSequentialGroup()
                        .addComponent(radioConvulsiones)
                        .addGap(18, 18, 18)
                        .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNeurologicasLayout.createSequentialGroup()
                                .addComponent(labelFechaUltimaCrisis1)
                                .addGap(18, 18, 18)
                                .addComponent(fechaUltimaCrisis, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFechaUltimaCrisis, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelNeurologicasLayout.createSequentialGroup()
                                .addComponent(labelCuantoTiempoConvulsiones1)
                                .addGap(18, 18, 18)
                                .addComponent(txtCuantoTiempoConvulsiones, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(radioEpilepsia)
                    .addComponent(radioCefaleas)
                    .addGroup(panelNeurologicasLayout.createSequentialGroup()
                        .addComponent(radioParestesia)
                        .addGap(18, 18, 18)
                        .addComponent(radioSeAltera))
                    .addGroup(panelNeurologicasLayout.createSequentialGroup()
                        .addComponent(radioNeuralgiasNeuritis)
                        .addGap(18, 18, 18)
                        .addComponent(radioParalisisFacial)))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        panelNeurologicasLayout.setVerticalGroup(
            panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNeurologicasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelInfecciosas5)
                    .addComponent(radioNoAplicaNeurologicas))
                .addGap(18, 18, 18)
                .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioConvulsiones)
                    .addComponent(labelCuantoTiempoConvulsiones1)
                    .addComponent(txtCuantoTiempoConvulsiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fechaUltimaCrisis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioEpilepsia)
                            .addComponent(labelFechaUltimaCrisis1)))
                    .addGroup(panelNeurologicasLayout.createSequentialGroup()
                        .addComponent(txtFechaUltimaCrisis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGap(18, 18, 18)
                .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioNeuralgiasNeuritis)
                    .addComponent(radioParalisisFacial))
                .addGap(18, 18, 18)
                .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioParestesia)
                    .addComponent(radioSeAltera))
                .addGap(18, 18, 18)
                .addComponent(radioCefaleas)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        tabsAntecedentes.addTab("Neurológicas", panelNeurologicas);

        panelHematologicas.setBackground(new java.awt.Color(255, 255, 255));

        labelInfecciosas6.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelInfecciosas6.setText("Hematológicas");

        radioNoAplicaHematologicas.setBackground(new java.awt.Color(255, 255, 255));
        radioNoAplicaHematologicas.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioNoAplicaHematologicas.setText("No aplica");
        radioNoAplicaHematologicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoAplicaHematologicasActionPerformed(evt);
            }
        });

        radioHemorragiasImportantes.setBackground(new java.awt.Color(255, 255, 255));
        radioHemorragiasImportantes.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioHemorragiasImportantes.setText("Ha sufrido alguna hemorragias importantes");
        radioHemorragiasImportantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHemorragiasImportantesActionPerformed(evt);
            }
        });

        labelCausaHemorragia1.setBackground(new java.awt.Color(255, 255, 255));
        labelCausaHemorragia1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCausaHemorragia1.setText("Causa:");

        txtCausaHemorragia.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelDuracionHemorragia1.setBackground(new java.awt.Color(255, 255, 255));
        labelDuracionHemorragia1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelDuracionHemorragia1.setText("Duración:");

        txtDuracionHemorragia.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        radioHematomas.setBackground(new java.awt.Color(255, 255, 255));
        radioHematomas.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioHematomas.setText("Presenta hematomas espontáneos en la piel");
        radioHematomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHematomasActionPerformed(evt);
            }
        });

        radioSangranEncias.setBackground(new java.awt.Color(255, 255, 255));
        radioSangranEncias.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioSangranEncias.setText("Le sangran las encías espontáneamente");
        radioSangranEncias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSangranEnciasActionPerformed(evt);
            }
        });

        radioSangraNariz.setBackground(new java.awt.Color(255, 255, 255));
        radioSangraNariz.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioSangraNariz.setText("Sangra por la nariz frecuentemente");
        radioSangraNariz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSangraNarizActionPerformed(evt);
            }
        });

        labelFaltanteHematologicas.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelFaltanteHematologicas.setForeground(new java.awt.Color(255, 0, 0));
        labelFaltanteHematologicas.setText("*");

        javax.swing.GroupLayout panelHematologicasLayout = new javax.swing.GroupLayout(panelHematologicas);
        panelHematologicas.setLayout(panelHematologicasLayout);
        panelHematologicasLayout.setHorizontalGroup(
            panelHematologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHematologicasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHematologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioSangraNariz)
                    .addGroup(panelHematologicasLayout.createSequentialGroup()
                        .addGroup(panelHematologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioHemorragiasImportantes)
                            .addGroup(panelHematologicasLayout.createSequentialGroup()
                                .addComponent(labelInfecciosas6)
                                .addGap(18, 18, 18)
                                .addComponent(radioNoAplicaHematologicas)))
                        .addGap(18, 18, 18)
                        .addComponent(labelCausaHemorragia1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCausaHemorragia, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFaltanteHematologicas, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(labelDuracionHemorragia1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDuracionHemorragia, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHematologicasLayout.createSequentialGroup()
                        .addComponent(radioHematomas)
                        .addGap(18, 18, 18)
                        .addComponent(radioSangranEncias)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        panelHematologicasLayout.setVerticalGroup(
            panelHematologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHematologicasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHematologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInfecciosas6)
                    .addComponent(radioNoAplicaHematologicas))
                .addGap(18, 18, 18)
                .addGroup(panelHematologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioHemorragiasImportantes)
                    .addComponent(labelCausaHemorragia1)
                    .addComponent(txtCausaHemorragia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDuracionHemorragia1)
                    .addComponent(txtDuracionHemorragia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFaltanteHematologicas))
                .addGap(18, 18, 18)
                .addGroup(panelHematologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioHematomas)
                    .addComponent(radioSangranEncias))
                .addGap(18, 18, 18)
                .addComponent(radioSangraNariz)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        tabsAntecedentes.addTab("Hematológicas", panelHematologicas);

        panelFamiliares.setBackground(new java.awt.Color(255, 255, 255));

        labelFamiliares1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelFamiliares1.setText("Familiares");

        radioFamiliares.setBackground(new java.awt.Color(255, 255, 255));
        radioFamiliares.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioFamiliares.setText("No aplica");
        radioFamiliares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFamiliaresActionPerformed(evt);
            }
        });

        radioCancer.setBackground(new java.awt.Color(255, 255, 255));
        radioCancer.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioCancer.setText("Cáncer");
        radioCancer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCancerActionPerformed(evt);
            }
        });

        labelTipoCancer1.setBackground(new java.awt.Color(255, 255, 255));
        labelTipoCancer1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelTipoCancer1.setText("Tipo:");

        txtTipoCancer.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        radioEnfPulmonares.setBackground(new java.awt.Color(255, 255, 255));
        radioEnfPulmonares.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioEnfPulmonares.setText("Enf. Pulmonares");
        radioEnfPulmonares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEnfPulmonaresActionPerformed(evt);
            }
        });

        labelTipoEnfPulmonares1.setBackground(new java.awt.Color(255, 255, 255));
        labelTipoEnfPulmonares1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelTipoEnfPulmonares1.setText("Tipo:");

        txtTipoEnfPulmonares.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        radioDiabetes.setBackground(new java.awt.Color(255, 255, 255));
        radioDiabetes.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioDiabetes.setText("Diabetes");
        radioDiabetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDiabetesActionPerformed(evt);
            }
        });

        labelTipoDiabetes2.setBackground(new java.awt.Color(255, 255, 255));
        labelTipoDiabetes2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelTipoDiabetes2.setText("Tipo:");

        comboTipoDiabetes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        comboTipoDiabetes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        comboTipoDiabetes.setEnabled(false);

        radioEnfCardiovasculares.setBackground(new java.awt.Color(255, 255, 255));
        radioEnfCardiovasculares.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioEnfCardiovasculares.setText("Enf. Cardiovasculares");
        radioEnfCardiovasculares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEnfCardiovascularesActionPerformed(evt);
            }
        });

        txtTipoEnfCardiovasculares.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        radioEnfHepaticas.setBackground(new java.awt.Color(255, 255, 255));
        radioEnfHepaticas.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioEnfHepaticas.setText("Enf. Hepáticas");
        radioEnfHepaticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEnfHepaticasActionPerformed(evt);
            }
        });

        labelTipoDiabetes3.setBackground(new java.awt.Color(255, 255, 255));
        labelTipoDiabetes3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelTipoDiabetes3.setText("Tipo:");

        txtTipoEnfHepaticas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelOtros1.setBackground(new java.awt.Color(255, 255, 255));
        labelOtros1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelOtros1.setText("Otros:");

        txtOtros1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelTipoEnfCardio.setBackground(new java.awt.Color(255, 255, 255));
        labelTipoEnfCardio.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelTipoEnfCardio.setText("Tipo:");

        javax.swing.GroupLayout panelFamiliaresLayout = new javax.swing.GroupLayout(panelFamiliares);
        panelFamiliares.setLayout(panelFamiliaresLayout);
        panelFamiliaresLayout.setHorizontalGroup(
            panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFamiliaresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFamiliaresLayout.createSequentialGroup()
                        .addComponent(radioEnfHepaticas)
                        .addGap(18, 18, 18)
                        .addComponent(labelTipoDiabetes3)
                        .addGap(18, 18, 18)
                        .addComponent(txtTipoEnfHepaticas, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFamiliaresLayout.createSequentialGroup()
                        .addComponent(radioDiabetes)
                        .addGap(18, 18, 18)
                        .addComponent(labelTipoDiabetes2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboTipoDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFamiliaresLayout.createSequentialGroup()
                        .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFamiliares1)
                            .addComponent(radioCancer))
                        .addGap(18, 18, 18)
                        .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioFamiliares)
                            .addGroup(panelFamiliaresLayout.createSequentialGroup()
                                .addComponent(labelTipoCancer1)
                                .addGap(18, 18, 18)
                                .addComponent(txtTipoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38)
                .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFamiliaresLayout.createSequentialGroup()
                        .addComponent(radioEnfCardiovasculares)
                        .addGap(18, 18, 18)
                        .addComponent(labelTipoEnfCardio)
                        .addGap(18, 18, 18)
                        .addComponent(txtTipoEnfCardiovasculares, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFamiliaresLayout.createSequentialGroup()
                        .addComponent(radioEnfPulmonares)
                        .addGap(18, 18, 18)
                        .addComponent(labelTipoEnfPulmonares1)
                        .addGap(18, 18, 18)
                        .addComponent(txtTipoEnfPulmonares, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFamiliaresLayout.createSequentialGroup()
                        .addComponent(labelOtros1)
                        .addGap(18, 18, 18)
                        .addComponent(txtOtros1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        panelFamiliaresLayout.setVerticalGroup(
            panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFamiliaresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFamiliares1)
                    .addComponent(radioFamiliares))
                .addGap(18, 18, 18)
                .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioCancer)
                    .addComponent(labelTipoCancer1)
                    .addComponent(txtTipoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioEnfPulmonares)
                    .addComponent(labelTipoEnfPulmonares1)
                    .addComponent(txtTipoEnfPulmonares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioDiabetes)
                    .addComponent(labelTipoDiabetes2)
                    .addComponent(comboTipoDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioEnfCardiovasculares)
                    .addComponent(txtTipoEnfCardiovasculares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTipoEnfCardio))
                .addGap(18, 18, 18)
                .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioEnfHepaticas)
                    .addComponent(labelTipoDiabetes3)
                    .addComponent(txtTipoEnfHepaticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOtros1)
                    .addComponent(txtOtros1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        tabsAntecedentes.addTab("Familiares", panelFamiliares);

        javax.swing.GroupLayout pestAntecedentesLayout = new javax.swing.GroupLayout(pestAntecedentes);
        pestAntecedentes.setLayout(pestAntecedentesLayout);
        pestAntecedentesLayout.setHorizontalGroup(
            pestAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestAntecedentesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pestAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabsAntecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, 1154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAntecedentes))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        pestAntecedentesLayout.setVerticalGroup(
            pestAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestAntecedentesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelAntecedentes)
                .addGap(18, 18, 18)
                .addComponent(tabsAntecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pestRegistrar.addTab("Antecedentes", pestAntecedentes);

        pestExamenClinico.setBackground(new java.awt.Color(255, 255, 255));

        tabExamenesClinicos.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        tabExamenCavidadBucal.setBackground(new java.awt.Color(255, 255, 255));
        tabExamenCavidadBucal.setAutoscrolls(true);

        labelPalpacionGanglios2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelPalpacionGanglios2.setText("Examen de la Cavidad Bucal:");

        labelLabios.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelLabios.setText("Labios:");

        txtLabios.setColumns(20);
        txtLabios.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtLabios.setRows(5);
        jScrollPane2.setViewportView(txtLabios);

        labelFrenillosLabiales.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelFrenillosLabiales.setText("Frenillos labiales:");

        txtFrenillosLabiales.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        txtVestibuloBucal.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelVestibuloBucal.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelVestibuloBucal.setText("Vestíbulo bucal:");

        labelMucosaPalatina.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelMucosaPalatina.setText("Mucosa palatina:");

        txtMucosaPalatina.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelMucosaPisoBoca.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelMucosaPisoBoca.setText("Mucosa del piso de la boca:");

        txtMucosaPisoBoca.setColumns(20);
        txtMucosaPisoBoca.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtMucosaPisoBoca.setRows(5);
        jScrollPane3.setViewportView(txtMucosaPisoBoca);

        labelFrenilloLingual.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelFrenilloLingual.setText("Frenillo lingual:");

        txtFrenilloLingual.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelLengua.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelLengua.setText("Lengua");

        labelCaraDorsal.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelCaraDorsal.setText("Cara dorsal:");

        txtCaraDorsal.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        txtCaraVentral.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelCaraVentral.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelCaraVentral.setText("Cara ventral:");

        labelBordesLaterales.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelBordesLaterales.setText("Bordes laterales:");

        txtBordesLaterales.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelEncia.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelEncia.setText("Encía:");

        txtEncias.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelDientes.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelDientes.setText("Dientes:");

        txtDientes.setColumns(20);
        txtDientes.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtDientes.setRows(5);
        jScrollPane4.setViewportView(txtDientes);

        labelECBFaltante.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelECBFaltante.setForeground(new java.awt.Color(255, 0, 51));
        labelECBFaltante.setText("*");

        javax.swing.GroupLayout tabExamenCavidadBucalLayout = new javax.swing.GroupLayout(tabExamenCavidadBucal);
        tabExamenCavidadBucal.setLayout(tabExamenCavidadBucalLayout);
        tabExamenCavidadBucalLayout.setHorizontalGroup(
            tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                        .addComponent(labelLengua)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabExamenCavidadBucalLayout.createSequentialGroup()
                        .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabExamenCavidadBucalLayout.createSequentialGroup()
                                .addComponent(labelEncia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEncias))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabExamenCavidadBucalLayout.createSequentialGroup()
                                .addComponent(labelBordesLaterales)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBordesLaterales))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabExamenCavidadBucalLayout.createSequentialGroup()
                                .addComponent(labelCaraVentral)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCaraVentral))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabExamenCavidadBucalLayout.createSequentialGroup()
                                .addComponent(labelCaraDorsal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCaraDorsal))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabExamenCavidadBucalLayout.createSequentialGroup()
                                .addComponent(labelFrenilloLingual)
                                .addGap(18, 18, 18)
                                .addComponent(txtFrenilloLingual))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabExamenCavidadBucalLayout.createSequentialGroup()
                                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelLabios)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                                            .addComponent(labelFrenillosLabiales)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtFrenillosLabiales))
                                        .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                                            .addComponent(labelVestibuloBucal)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtVestibuloBucal))
                                        .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                                            .addComponent(labelMucosaPalatina)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtMucosaPalatina))
                                        .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(labelPalpacionGanglios2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(labelECBFaltante)))
                                    .addComponent(labelMucosaPisoBoca, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 20, Short.MAX_VALUE)))
                        .addGap(23, 23, 23))
                    .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                        .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDientes))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        tabExamenCavidadBucalLayout.setVerticalGroup(
            tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPalpacionGanglios2)
                    .addComponent(labelECBFaltante))
                .addGap(18, 18, 18)
                .addComponent(labelLabios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFrenillosLabiales)
                    .addComponent(txtFrenillosLabiales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVestibuloBucal)
                    .addComponent(txtVestibuloBucal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMucosaPalatina)
                    .addComponent(txtMucosaPalatina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMucosaPisoBoca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFrenilloLingual)
                    .addComponent(txtFrenilloLingual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(labelLengua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCaraDorsal)
                    .addComponent(txtCaraDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCaraVentral)
                    .addComponent(txtCaraVentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBordesLaterales)
                    .addComponent(txtBordesLaterales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEncia)
                    .addComponent(txtEncias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(labelDientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollExamenCavidadBucal.setViewportView(tabExamenCavidadBucal);

        tabExamenesClinicos.addTab("Examen de la Cavidad Bucal", scrollExamenCavidadBucal);

        tabTensionArterial.setBackground(new java.awt.Color(255, 255, 255));

        labelTensionArterial1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelTensionArterial1.setText("Tensión arterial");

        labelMaxima1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelMaxima1.setText("Máxima:");

        txtMaxima.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtMaxima.setEnabled(false);
        txtMaxima.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaximaFocusLost(evt);
            }
        });

        labelMMHG2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelMMHG2.setText("mmHg");

        labelMinima1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelMinima1.setText("Mínima:");

        txtMinima.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtMinima.setEnabled(false);
        txtMinima.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMinimaFocusLost(evt);
            }
        });

        labelMMHG3.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelMMHG3.setText("mmHg");

        radioIncluirTensionArterial.setBackground(new java.awt.Color(255, 255, 255));
        radioIncluirTensionArterial.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioIncluirTensionArterial.setText("Incluir");
        radioIncluirTensionArterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioIncluirTensionArterialActionPerformed(evt);
            }
        });

        labelFaltanteMaxima.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelFaltanteMaxima.setForeground(new java.awt.Color(255, 0, 51));
        labelFaltanteMaxima.setText("*");

        labelFaltanteMinima.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelFaltanteMinima.setForeground(new java.awt.Color(255, 0, 51));
        labelFaltanteMinima.setText("*");

        javax.swing.GroupLayout tabTensionArterialLayout = new javax.swing.GroupLayout(tabTensionArterial);
        tabTensionArterial.setLayout(tabTensionArterialLayout);
        tabTensionArterialLayout.setHorizontalGroup(
            tabTensionArterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTensionArterialLayout.createSequentialGroup()
                .addGroup(tabTensionArterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabTensionArterialLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(labelTensionArterial1)
                        .addGap(18, 18, 18)
                        .addComponent(radioIncluirTensionArterial))
                    .addGroup(tabTensionArterialLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelMaxima1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMMHG2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFaltanteMaxima)
                        .addGap(45, 45, 45)
                        .addComponent(labelMinima1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMMHG3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFaltanteMinima)))
                .addContainerGap(538, Short.MAX_VALUE))
        );
        tabTensionArterialLayout.setVerticalGroup(
            tabTensionArterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTensionArterialLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(tabTensionArterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTensionArterial1)
                    .addComponent(radioIncluirTensionArterial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabTensionArterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaxima1)
                    .addComponent(txtMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMMHG2)
                    .addComponent(labelMinima1)
                    .addComponent(txtMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMMHG3)
                    .addComponent(labelFaltanteMaxima)
                    .addComponent(labelFaltanteMinima))
                .addContainerGap(308, Short.MAX_VALUE))
        );

        tabExamenesClinicos.addTab("Tensión Arterial", tabTensionArterial);

        tabPalpacion.setBackground(new java.awt.Color(255, 255, 255));

        labelPalpacionGanglios1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelPalpacionGanglios1.setText("Palpación de los ganglios");

        labelLocalizacion1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelLocalizacion1.setText("Localización:");

        txtLocalizacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtLocalizacion.setEnabled(false);

        labelCaracteristicas1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelCaracteristicas1.setText("Características:");

        txtCaracteristicas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCaracteristicas.setEnabled(false);

        radioPalpables.setBackground(new java.awt.Color(255, 255, 255));
        radioPalpables.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        radioPalpables.setText("Palpables");
        radioPalpables.setEnabled(false);
        radioPalpables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPalpablesActionPerformed(evt);
            }
        });

        radioIncluirPalpacion.setBackground(new java.awt.Color(255, 255, 255));
        radioIncluirPalpacion.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioIncluirPalpacion.setText("Incluir");
        radioIncluirPalpacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioIncluirPalpacionActionPerformed(evt);
            }
        });

        labelFaltanteLocalizacion.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelFaltanteLocalizacion.setForeground(new java.awt.Color(255, 0, 0));
        labelFaltanteLocalizacion.setText("*");

        labelFaltanteCaracteristicas.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelFaltanteCaracteristicas.setForeground(new java.awt.Color(255, 0, 0));
        labelFaltanteCaracteristicas.setText("*");

        javax.swing.GroupLayout tabPalpacionLayout = new javax.swing.GroupLayout(tabPalpacion);
        tabPalpacion.setLayout(tabPalpacionLayout);
        tabPalpacionLayout.setHorizontalGroup(
            tabPalpacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPalpacionLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(tabPalpacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabPalpacionLayout.createSequentialGroup()
                        .addComponent(labelPalpacionGanglios1)
                        .addGap(18, 18, 18)
                        .addComponent(radioIncluirPalpacion)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tabPalpacionLayout.createSequentialGroup()
                        .addGroup(tabPalpacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCaracteristicas1)
                            .addComponent(radioPalpables))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabPalpacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabPalpacionLayout.createSequentialGroup()
                                .addComponent(labelLocalizacion1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLocalizacion, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE))
                            .addComponent(txtCaracteristicas))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabPalpacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFaltanteLocalizacion)
                    .addComponent(labelFaltanteCaracteristicas))
                .addGap(109, 109, 109))
        );
        tabPalpacionLayout.setVerticalGroup(
            tabPalpacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPalpacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPalpacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPalpacionGanglios1)
                    .addComponent(radioIncluirPalpacion))
                .addGap(18, 18, 18)
                .addGroup(tabPalpacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLocalizacion1)
                    .addComponent(txtLocalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioPalpables)
                    .addComponent(labelFaltanteLocalizacion))
                .addGap(18, 18, 18)
                .addGroup(tabPalpacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCaracteristicas1)
                    .addComponent(txtCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFaltanteCaracteristicas))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        tabExamenesClinicos.addTab("Palpación de los ganglios", tabPalpacion);

        labelExamenClinico3.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        labelExamenClinico3.setText("IV. Examen clínico");

        javax.swing.GroupLayout pestExamenClinicoLayout = new javax.swing.GroupLayout(pestExamenClinico);
        pestExamenClinico.setLayout(pestExamenClinicoLayout);
        pestExamenClinicoLayout.setHorizontalGroup(
            pestExamenClinicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestExamenClinicoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pestExamenClinicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabExamenesClinicos, javax.swing.GroupLayout.PREFERRED_SIZE, 1132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelExamenClinico3))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        pestExamenClinicoLayout.setVerticalGroup(
            pestExamenClinicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestExamenClinicoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelExamenClinico3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabExamenesClinicos, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pestRegistrar.addTab("Examen clínico", pestExamenClinico);

        pestExamenCom.setBackground(new java.awt.Color(255, 255, 255));

        labelExamenCom.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        labelExamenCom.setText("V. Exámenes complementarios");

        tabsExamenesCom.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        tabExamenRadiografico.setBackground(new java.awt.Color(255, 255, 255));
        tabExamenRadiografico.setAutoscrolls(true);

        radioAgregarExamenRadiografico.setBackground(new java.awt.Color(255, 255, 255));
        radioAgregarExamenRadiografico.setFont(new java.awt.Font("Nirmala UI", 1, 20)); // NOI18N
        radioAgregarExamenRadiografico.setText("Agregar Examen Radiográfico ");
        radioAgregarExamenRadiografico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAgregarExamenRadiograficoActionPerformed(evt);
            }
        });

        labelRxPanoramica1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelRxPanoramica1.setText("Rx. Panorámica");

        txtRxPanoramica.setColumns(20);
        txtRxPanoramica.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtRxPanoramica.setRows(5);
        txtRxPanoramica.setEnabled(false);
        jScrollPane9.setViewportView(txtRxPanoramica);

        labelRxPeriapical1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelRxPeriapical1.setText("Rx. Periapical");

        txtRxPeriapical.setColumns(20);
        txtRxPeriapical.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtRxPeriapical.setRows(5);
        txtRxPeriapical.setEnabled(false);
        jScrollPane10.setViewportView(txtRxPeriapical);

        labelRxOclusal1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelRxOclusal1.setText("Rx. Oclusal");

        txtRxOclusal.setColumns(20);
        txtRxOclusal.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtRxOclusal.setRows(5);
        txtRxOclusal.setEnabled(false);
        jScrollPane11.setViewportView(txtRxOclusal);

        javax.swing.GroupLayout tabExamenRadiograficoLayout = new javax.swing.GroupLayout(tabExamenRadiografico);
        tabExamenRadiografico.setLayout(tabExamenRadiograficoLayout);
        tabExamenRadiograficoLayout.setHorizontalGroup(
            tabExamenRadiograficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabExamenRadiograficoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioAgregarExamenRadiografico)
                .addContainerGap(813, Short.MAX_VALUE))
            .addGroup(tabExamenRadiograficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabExamenRadiograficoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(tabExamenRadiograficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelRxOclusal1)
                        .addComponent(labelRxPeriapical1)
                        .addComponent(labelRxPanoramica1)
                        .addGroup(tabExamenRadiograficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1113, Short.MAX_VALUE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        tabExamenRadiograficoLayout.setVerticalGroup(
            tabExamenRadiograficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabExamenRadiograficoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioAgregarExamenRadiografico)
                .addContainerGap(418, Short.MAX_VALUE))
            .addGroup(tabExamenRadiograficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabExamenRadiograficoLayout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(labelRxPanoramica1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(labelRxPeriapical1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(labelRxOclusal1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tabsExamenesCom.addTab("Examen Radiográfico", tabExamenRadiografico);

        tabExamenLab.setBackground(new java.awt.Color(255, 255, 255));

        radioAgregarExamenLaboratorio.setBackground(new java.awt.Color(255, 255, 255));
        radioAgregarExamenLaboratorio.setFont(new java.awt.Font("Nirmala UI", 1, 20)); // NOI18N
        radioAgregarExamenLaboratorio.setText("Agregar Examen de Laboratorio");
        radioAgregarExamenLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAgregarExamenLaboratorioActionPerformed(evt);
            }
        });

        labelPerfilHematologico1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelPerfilHematologico1.setText("Perfil hematológico:");

        txtPerfilHematologico.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPerfilHematologico.setEnabled(false);

        labelPerfilCoagulacion1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelPerfilCoagulacion1.setText("Perfil coagulación:");

        txtPerfilCoagulacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPerfilCoagulacion.setEnabled(false);

        labelMMGDL.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelMMGDL.setText("mg/dl");

        txtGlicemia.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtGlicemia.setEnabled(false);
        txtGlicemia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGlicemiaFocusLost(evt);
            }
        });

        labelVDRL1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelVDRL1.setText("VDRL:");

        labelVIH.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelVIH.setText("VIH:");

        labelGlicemia.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelGlicemia.setText("Glicemia:");

        comboVDRL.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        comboVDRL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negativo", "Positivo" }));
        comboVDRL.setEnabled(false);

        comboVIH.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        comboVIH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negativo", "Positivo" }));
        comboVIH.setEnabled(false);

        javax.swing.GroupLayout tabExamenLabLayout = new javax.swing.GroupLayout(tabExamenLab);
        tabExamenLab.setLayout(tabExamenLabLayout);
        tabExamenLabLayout.setHorizontalGroup(
            tabExamenLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabExamenLabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tabExamenLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tabExamenLabLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(labelGlicemia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGlicemia, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMMGDL)
                        .addGap(50, 50, 50)
                        .addComponent(labelVDRL1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboVDRL, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(labelVIH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboVIH, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabExamenLabLayout.createSequentialGroup()
                        .addComponent(labelPerfilCoagulacion1)
                        .addGap(18, 18, 18)
                        .addComponent(txtPerfilCoagulacion))
                    .addGroup(tabExamenLabLayout.createSequentialGroup()
                        .addComponent(labelPerfilHematologico1)
                        .addGap(18, 18, 18)
                        .addComponent(txtPerfilHematologico, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(radioAgregarExamenLaboratorio))
                .addGap(67, 67, 67))
        );
        tabExamenLabLayout.setVerticalGroup(
            tabExamenLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabExamenLabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioAgregarExamenLaboratorio)
                .addGap(18, 18, 18)
                .addGroup(tabExamenLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPerfilHematologico1)
                    .addComponent(txtPerfilHematologico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(tabExamenLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPerfilCoagulacion1)
                    .addComponent(txtPerfilCoagulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(tabExamenLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabExamenLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelVIH)
                        .addComponent(comboVIH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabExamenLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelMMGDL)
                        .addComponent(txtGlicemia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelVDRL1)
                        .addComponent(labelGlicemia)
                        .addComponent(comboVDRL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
        );

        tabsExamenesCom.addTab("Examen de Laboratorio", tabExamenLab);

        javax.swing.GroupLayout pestExamenComLayout = new javax.swing.GroupLayout(pestExamenCom);
        pestExamenCom.setLayout(pestExamenComLayout);
        pestExamenComLayout.setHorizontalGroup(
            pestExamenComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestExamenComLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pestExamenComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pestExamenComLayout.createSequentialGroup()
                        .addComponent(labelExamenCom)
                        .addGap(701, 701, 701))
                    .addComponent(tabsExamenesCom, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        pestExamenComLayout.setVerticalGroup(
            pestExamenComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestExamenComLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelExamenCom)
                .addGap(30, 30, 30)
                .addComponent(tabsExamenesCom, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pestRegistrar.addTab("Exámenes complementarios", pestExamenCom);

        pestDiaTra.setBackground(new java.awt.Color(255, 255, 255));

        labelExamenClinico2.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        labelExamenClinico2.setText("VI. Diagnóstico y tratamiento");

        tabsDiaTra.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        tabDiagnostico.setBackground(new java.awt.Color(255, 255, 255));

        labelPresuntivo.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelPresuntivo.setText("Presuntivo:");

        txtPresuntivo.setColumns(20);
        txtPresuntivo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtPresuntivo.setRows(5);
        jScrollPane12.setViewportView(txtPresuntivo);

        labelHistopatologico.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelHistopatologico.setText("Estudio histopatológico:");

        txtHistopatologico.setColumns(20);
        txtHistopatologico.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtHistopatologico.setRows(5);
        jScrollPane13.setViewportView(txtHistopatologico);

        txtDefinitivo.setColumns(20);
        txtDefinitivo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtDefinitivo.setRows(5);
        jScrollPane14.setViewportView(txtDefinitivo);

        labelDefinitivo.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelDefinitivo.setText("Definitivo:");

        labelRxPanoramica3.setFont(new java.awt.Font("Nirmala UI", 1, 25)); // NOI18N
        labelRxPanoramica3.setText("Diagnóstico");

        labelFaltantesDiagnostico.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelFaltantesDiagnostico.setForeground(new java.awt.Color(255, 0, 0));
        labelFaltantesDiagnostico.setText("*");

        javax.swing.GroupLayout tabDiagnosticoLayout = new javax.swing.GroupLayout(tabDiagnostico);
        tabDiagnostico.setLayout(tabDiagnosticoLayout);
        tabDiagnosticoLayout.setHorizontalGroup(
            tabDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDiagnosticoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabDiagnosticoLayout.createSequentialGroup()
                        .addGroup(tabDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelHistopatologico)
                            .addComponent(labelDefinitivo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabDiagnosticoLayout.createSequentialGroup()
                        .addGroup(tabDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabDiagnosticoLayout.createSequentialGroup()
                                .addComponent(labelPresuntivo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE))
                        .addGap(30, 30, 30))
                    .addGroup(tabDiagnosticoLayout.createSequentialGroup()
                        .addComponent(labelRxPanoramica3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelFaltantesDiagnostico)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        tabDiagnosticoLayout.setVerticalGroup(
            tabDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabDiagnosticoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRxPanoramica3)
                    .addComponent(labelFaltantesDiagnostico))
                .addGap(30, 30, 30)
                .addComponent(labelPresuntivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelHistopatologico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelDefinitivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        scrollDiagnostico.setViewportView(tabDiagnostico);

        tabsDiaTra.addTab("Diagnóstico", scrollDiagnostico);

        tabPlanTratamiento.setBackground(new java.awt.Color(255, 255, 255));

        labelPlanTratamiento.setFont(new java.awt.Font("Nirmala UI", 1, 25)); // NOI18N
        labelPlanTratamiento.setText("Plan de tratamiento");

        txtPlanTratamiento.setColumns(20);
        txtPlanTratamiento.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtPlanTratamiento.setRows(5);
        jScrollPane15.setViewportView(txtPlanTratamiento);

        javax.swing.GroupLayout tabPlanTratamientoLayout = new javax.swing.GroupLayout(tabPlanTratamiento);
        tabPlanTratamiento.setLayout(tabPlanTratamientoLayout);
        tabPlanTratamientoLayout.setHorizontalGroup(
            tabPlanTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPlanTratamientoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(tabPlanTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPlanTratamiento))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        tabPlanTratamientoLayout.setVerticalGroup(
            tabPlanTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPlanTratamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPlanTratamiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabsDiaTra.addTab("Plan de tratamiento", tabPlanTratamiento);

        tabObservaciones.setBackground(new java.awt.Color(255, 255, 255));

        labelObservaciones.setFont(new java.awt.Font("Nirmala UI", 1, 25)); // NOI18N
        labelObservaciones.setText("Observaciones");

        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtObservaciones.setRows(5);
        jScrollPane16.setViewportView(txtObservaciones);

        javax.swing.GroupLayout tabObservacionesLayout = new javax.swing.GroupLayout(tabObservaciones);
        tabObservaciones.setLayout(tabObservacionesLayout);
        tabObservacionesLayout.setHorizontalGroup(
            tabObservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabObservacionesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(tabObservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelObservaciones)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        tabObservacionesLayout.setVerticalGroup(
            tabObservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabObservacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelObservaciones)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabsDiaTra.addTab("Observaciones", tabObservaciones);

        botonGuardar.setBackground(new java.awt.Color(102, 153, 255));
        botonGuardar.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save icon.png"))); // NOI18N
        botonGuardar.setText("Guardar consulta");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonOdontograma.setBackground(new java.awt.Color(255, 51, 51));
        botonOdontograma.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        botonOdontograma.setForeground(new java.awt.Color(255, 255, 255));
        botonOdontograma.setText("Odontograma");
        botonOdontograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOdontogramaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pestDiaTraLayout = new javax.swing.GroupLayout(pestDiaTra);
        pestDiaTra.setLayout(pestDiaTraLayout);
        pestDiaTraLayout.setHorizontalGroup(
            pestDiaTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestDiaTraLayout.createSequentialGroup()
                .addGroup(pestDiaTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pestDiaTraLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonOdontograma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pestDiaTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pestDiaTraLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(labelExamenClinico2))
                        .addGroup(pestDiaTraLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(tabsDiaTra, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        pestDiaTraLayout.setVerticalGroup(
            pestDiaTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestDiaTraLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelExamenClinico2)
                .addGap(31, 31, 31)
                .addComponent(tabsDiaTra, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pestDiaTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonOdontograma, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pestRegistrar.addTab("Diagnóstico y tratamiento", pestDiaTra);

        panelInfo.add(pestRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -29, 1250, 670));

        getContentPane().add(panelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1200, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAntecedentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAntecedentesActionPerformed
        pestRegistrar.setSelectedIndex(2);
    }//GEN-LAST:event_botonAntecedentesActionPerformed

    private void botonExamenSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExamenSubActionPerformed
        pestRegistrar.setSelectedIndex(1);
    }//GEN-LAST:event_botonExamenSubActionPerformed

    private void botonExamenCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExamenCliActionPerformed
        pestRegistrar.setSelectedIndex(3);
    }//GEN-LAST:event_botonExamenCliActionPerformed

    private void botonExamenComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExamenComActionPerformed
        pestRegistrar.setSelectedIndex(4);
    }//GEN-LAST:event_botonExamenComActionPerformed

    private void botonDiaTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDiaTraActionPerformed
        pestRegistrar.setSelectedIndex(5);
    }//GEN-LAST:event_botonDiaTraActionPerformed

    private void botonDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDatosPersonalesActionPerformed
        pestRegistrar.setSelectedIndex(0);
    }//GEN-LAST:event_botonDatosPersonalesActionPerformed

    private void radioEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioEstudianteActionPerformed

    private void radioFumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFumaActionPerformed
        controlEntrada.habilitarTxt(radioFuma,txtCuantosCigarrillos,txtDesdeFuma);
    }//GEN-LAST:event_radioFumaActionPerformed

    private void radioTomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTomaActionPerformed
        controlEntrada.habilitarTxt(radioToma, txtCantidadToma);
    }//GEN-LAST:event_radioTomaActionPerformed

    private void radioNoAplicaCardiovascularesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoAplicaCardiovascularesActionPerformed
        controlEntrada.habilitarAntecedenteCardiovasculares(radioNoAplicaCardiovasculares,txtCuandoInfarto,radioSubirEscaleras,radioEdema,radioPalpitaciones,radioDoloresPecho,radioInfarto,radioEndocarditisBacteriana,radioValvulopatia,radioHipertenso,radioHipotenso,radioTratamientoTension);
    }//GEN-LAST:event_radioNoAplicaCardiovascularesActionPerformed

    private void radioSubirEscalerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSubirEscalerasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSubirEscalerasActionPerformed

    private void radioEdemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEdemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioEdemaActionPerformed

    private void radioPalpitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPalpitacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPalpitacionesActionPerformed

    private void radioDoloresPechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDoloresPechoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDoloresPechoActionPerformed

    private void radioInfartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInfartoActionPerformed
        controlEntrada.habilitarTxt(radioInfarto,txtCuandoInfarto);
        if(!radioInfarto.isSelected()) txtCuandoInfarto.setText(null);
    }//GEN-LAST:event_radioInfartoActionPerformed

    private void radioEndocarditisBacterianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEndocarditisBacterianaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioEndocarditisBacterianaActionPerformed

    private void radioValvulopatiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioValvulopatiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioValvulopatiaActionPerformed

    private void radioHipertensoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHipertensoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioHipertensoActionPerformed

    private void radioHipotensoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHipotensoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioHipotensoActionPerformed

    private void radioTratamientoTensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTratamientoTensionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTratamientoTensionActionPerformed

    private void radioAlergicoMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAlergicoMedicamentoActionPerformed
        controlEntrada.habilitarTxt(radioAlergicoMedicamento,txtAlergicoMedicamento);
        if(!radioAlergicoMedicamento.isSelected()) txtAlergicoMedicamento.setText(null);
    }//GEN-LAST:event_radioAlergicoMedicamentoActionPerformed

    private void radioNoAplicaAlergicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoAplicaAlergicosActionPerformed
        controlEntrada.habilitarAntecedenteAlergicos(radioNoAplicaAlergicos,txtAlergicoMedicamento,txtUltimaCrisisAsma,txtReaccionAnestesiaLocal,radioAlergicoMedicamento,radioUrticaria,radioDificultadTragar,radioDificultadRespirar,radioSufreAsma);
    }//GEN-LAST:event_radioNoAplicaAlergicosActionPerformed

    private void radioUrticariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUrticariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioUrticariaActionPerformed

    private void radioDificultadTragarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDificultadTragarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDificultadTragarActionPerformed

    private void radioDificultadRespirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDificultadRespirarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDificultadRespirarActionPerformed

    private void radioSufreAsmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSufreAsmaActionPerformed
        controlEntrada.habilitarTxt(radioSufreAsma,txtUltimaCrisisAsma);
    }//GEN-LAST:event_radioSufreAsmaActionPerformed

    private void radioNoAplicaNMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoAplicaNMActionPerformed
        controlEntrada.habilitarAntecedenteNM(radioNoAplicaNM,txtOrinaNoche,radioAnemia,radioPerdidoPeso,radioDieta,radioSienteDecaimiento,radioMalestarGeneral,radioFiebre,radioDiabetico,radioTratamientoDiabetico,radioOrinaNoche,radioMuchaSed,radioInsomnio,radioTiroides);
    }//GEN-LAST:event_radioNoAplicaNMActionPerformed

    private void radioAnemiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAnemiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioAnemiaActionPerformed

    private void radioPerdidoPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPerdidoPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPerdidoPesoActionPerformed

    private void radioDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDietaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDietaActionPerformed

    private void radioSienteDecaimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSienteDecaimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSienteDecaimientoActionPerformed

    private void radioMalestarGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMalestarGeneralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMalestarGeneralActionPerformed

    private void radioFiebreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFiebreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFiebreActionPerformed

    private void radioDiabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDiabeticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDiabeticoActionPerformed

    private void radioTratamientoDiabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTratamientoDiabeticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTratamientoDiabeticoActionPerformed

    private void radioOrinaNocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOrinaNocheActionPerformed
        controlEntrada.habilitarTxt(radioOrinaNoche,txtOrinaNoche);
    }//GEN-LAST:event_radioOrinaNocheActionPerformed

    private void radioMuchaSedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMuchaSedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMuchaSedActionPerformed

    private void radioInsomnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInsomnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioInsomnioActionPerformed

    private void radioTiroidesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTiroidesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTiroidesActionPerformed

    private void radioNoAplicaInfecciosasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoAplicaInfecciosasActionPerformed
        controlEntrada.habilitarAntecedenteInfecciosas(radioNoAplicaInfecciosas,comboTipoHepatitis,txtHaceCuantoVenereas,txtHaceCuantoHepatitis,txtCualOtraHepatica,radioEnfermedadesVenereas,radioTransfusion,radioHepatitis,radioOtraEnfermedadHepatica,radioTuberculosis);
    }//GEN-LAST:event_radioNoAplicaInfecciosasActionPerformed

    private void radioEnfermedadesVenereasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEnfermedadesVenereasActionPerformed
        controlEntrada.habilitarTxt(radioEnfermedadesVenereas,txtHaceCuantoVenereas);
    }//GEN-LAST:event_radioEnfermedadesVenereasActionPerformed

    private void radioTransfusionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTransfusionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTransfusionActionPerformed

    private void radioHepatitisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHepatitisActionPerformed
        controlEntrada.habilitarTxt(radioHepatitis,txtHaceCuantoHepatitis);
        controlEntrada.habilitarCombo(radioHepatitis,comboTipoHepatitis);
    }//GEN-LAST:event_radioHepatitisActionPerformed

    private void radioOtraEnfermedadHepaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOtraEnfermedadHepaticaActionPerformed
        controlEntrada.habilitarTxt(radioOtraEnfermedadHepatica,txtCualOtraHepatica);
    }//GEN-LAST:event_radioOtraEnfermedadHepaticaActionPerformed

    private void radioTuberculosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTuberculosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTuberculosisActionPerformed

    private void radioEnfermedadRenalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEnfermedadRenalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioEnfermedadRenalActionPerformed

    private void radioCalculosRenales1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCalculosRenales1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCalculosRenales1ActionPerformed

    private void radioAcidezEstomacal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAcidezEstomacal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioAcidezEstomacal1ActionPerformed

    private void radioUlcerPeptica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUlcerPeptica1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioUlcerPeptica1ActionPerformed

    private void radioDiarreasFrecuencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDiarreasFrecuencia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDiarreasFrecuencia1ActionPerformed

    private void radioNoAplicaNeurologicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoAplicaNeurologicasActionPerformed
        controlEntrada.habilitarAntecedenteNeurologicos(radioNoAplicaNeurologicas,txtCuantoTiempoConvulsiones,fechaUltimaCrisis,radioConvulsiones,radioEpilepsia,radioNeuralgiasNeuritis,radioParalisisFacial,radioParestesia,radioSeAltera,radioCefaleas);
    }//GEN-LAST:event_radioNoAplicaNeurologicasActionPerformed

    private void radioConvulsionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioConvulsionesActionPerformed
        controlEntrada.habilitarTxt(radioConvulsiones,txtCuantoTiempoConvulsiones);
    }//GEN-LAST:event_radioConvulsionesActionPerformed

    private void radioEpilepsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEpilepsiaActionPerformed
        controlEntrada.habilitarCalendario(radioEpilepsia,fechaUltimaCrisis);
    }//GEN-LAST:event_radioEpilepsiaActionPerformed

    private void radioNeuralgiasNeuritisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNeuralgiasNeuritisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNeuralgiasNeuritisActionPerformed

    private void radioParalisisFacialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioParalisisFacialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioParalisisFacialActionPerformed

    private void radioParestesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioParestesiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioParestesiaActionPerformed

    private void radioSeAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSeAlteraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSeAlteraActionPerformed

    private void radioCefaleasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCefaleasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCefaleasActionPerformed

    private void radioNoAplicaHematologicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoAplicaHematologicasActionPerformed
        controlEntrada.habilitarAntecedenteHematologicos(radioNoAplicaHematologicas,txtCausaHemorragia,txtDuracionHemorragia,radioHemorragiasImportantes,radioHematomas,radioSangranEncias,radioSangraNariz);
    }//GEN-LAST:event_radioNoAplicaHematologicasActionPerformed

    private void radioHemorragiasImportantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHemorragiasImportantesActionPerformed
        controlEntrada.habilitarTxt(radioHemorragiasImportantes,txtCausaHemorragia,txtDuracionHemorragia);
        if(!radioHemorragiasImportantes.isSelected()){
            txtCausaHemorragia.setText(null);
            txtDuracionHemorragia.setText(null);
        }
    }//GEN-LAST:event_radioHemorragiasImportantesActionPerformed

    private void radioHematomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHematomasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioHematomasActionPerformed

    private void radioSangranEnciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSangranEnciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSangranEnciasActionPerformed

    private void radioSangraNarizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSangraNarizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSangraNarizActionPerformed

    private void radioFamiliaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFamiliaresActionPerformed
        controlEntrada.habilitarAntecedenteFamiliares(radioFamiliares,txtTipoCancer,txtTipoEnfPulmonares,txtTipoEnfPulmonares,txtTipoEnfHepaticas,txtTipoEnfCardiovasculares,txtOtros1,comboTipoDiabetes,radioCancer,radioEnfPulmonares,radioDiabetes,radioEnfCardiovasculares,radioEnfHepaticas);
    }//GEN-LAST:event_radioFamiliaresActionPerformed

    private void radioCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCancerActionPerformed
        controlEntrada.habilitarTxt(radioCancer,txtTipoCancer);
    }//GEN-LAST:event_radioCancerActionPerformed

    private void radioEnfPulmonaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEnfPulmonaresActionPerformed
        controlEntrada.habilitarTxt(radioEnfPulmonares,txtTipoEnfPulmonares);
    }//GEN-LAST:event_radioEnfPulmonaresActionPerformed

    private void radioDiabetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDiabetesActionPerformed
        controlEntrada.habilitarCombo(radioDiabetes,comboTipoDiabetes);
    }//GEN-LAST:event_radioDiabetesActionPerformed

    private void radioEnfCardiovascularesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEnfCardiovascularesActionPerformed
        controlEntrada.habilitarTxt(radioEnfCardiovasculares,txtTipoEnfCardiovasculares);
    }//GEN-LAST:event_radioEnfCardiovascularesActionPerformed

    private void radioEnfHepaticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEnfHepaticasActionPerformed
        controlEntrada.habilitarTxt(radioEnfHepaticas,txtTipoEnfHepaticas);
    }//GEN-LAST:event_radioEnfHepaticasActionPerformed

    private void radioRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioRegularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioRegularActionPerformed

    private void radioIrregularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioIrregularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioIrregularActionPerformed

    private void radioEmbarazadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEmbarazadaActionPerformed
        controlEntrada.habilitarCombo(radioEmbarazada,comboMesesEmbarazo);
    }//GEN-LAST:event_radioEmbarazadaActionPerformed

    private void radioPastillasAnticonceptivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPastillasAnticonceptivasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPastillasAnticonceptivasActionPerformed

    private void radioMenopausiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMenopausiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMenopausiaActionPerformed

    private void radioAgregarExamenRadiograficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAgregarExamenRadiograficoActionPerformed
        controlEntrada.habilitarTxtArea(radioAgregarExamenRadiografico,txtRxPanoramica,txtRxPeriapical,txtRxOclusal);
    }//GEN-LAST:event_radioAgregarExamenRadiograficoActionPerformed

    private void radioAgregarExamenLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAgregarExamenLaboratorioActionPerformed
        controlEntrada.habilitarTxt(radioAgregarExamenLaboratorio,txtPerfilHematologico,txtPerfilCoagulacion,txtGlicemia);
        controlEntrada.habilitarCombo(radioAgregarExamenLaboratorio,comboVDRL,comboVIH);
    }//GEN-LAST:event_radioAgregarExamenLaboratorioActionPerformed

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost
        if(!controlEntrada.datoEsNumerico(txtCedula)) 
            txtCedula.setText(null);
        else if(!txtCedula.getText().isEmpty()){
            int reply;
            if(odontologo.buscarPaciente(Integer.parseInt(txtCedula.getText()))){
                reply = JOptionPane.showConfirmDialog(null, "Este paciente ya se encuentra registrado como "+(odontologo.buscarObjetoPaciente(Integer.parseInt(txtCedula.getText()))).getNombre(),"¿Desea continuar con este paciente?", JOptionPane.YES_NO_OPTION);
                    if(reply == JOptionPane.YES_OPTION){
                        controlEntrada.pacienteRegistrado(odontologo.buscarObjetoPaciente(Integer.parseInt(txtCedula.getText())), txtCedula, 
                                                            txtNombre, comboSexo, labelHistoriaMedica, txtHM, txtLugarNacimiento, botonDeshacer, true);
                    }   
                    else txtCedula.setText(null);
            }
        }             
    }//GEN-LAST:event_txtCedulaFocusLost

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        MenuPrincipal menu = new MenuPrincipal(odontologo);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        if(!controlEntrada.validarNombreApellido(txtNombre)) txtNombre.setText(null);
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtTelf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelf1FocusLost
        if(!controlEntrada.validarTelf(txtTelf1,4)) txtTelf1.setText(null);
    }//GEN-LAST:event_txtTelf1FocusLost

    private void txtTelf2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelf2FocusLost
        if(!controlEntrada.validarTelf(txtTelf2,7)) txtTelf2.setText(null);
    }//GEN-LAST:event_txtTelf2FocusLost

    private void txtOcupacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOcupacionFocusLost
        if(!controlEntrada.validarOcupacion(txtOcupacion)) txtOcupacion.setText(null);
    }//GEN-LAST:event_txtOcupacionFocusLost

    private void txtEdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdadFocusLost
        if(!controlEntrada.validarEdad(txtEdad)) txtEdad.setText(null);
    }//GEN-LAST:event_txtEdadFocusLost

    private void txtLugarNacimientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLugarNacimientoFocusLost
        if(!controlEntrada.validarLugarNacimiento(txtLugarNacimiento)) txtLugarNacimiento.setText(null);
    }//GEN-LAST:event_txtLugarNacimientoFocusLost

    private void txtCuantosCigarrillosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCuantosCigarrillosFocusLost
        if(!controlEntrada.datoEsNumerico(txtCuantosCigarrillos)) txtCuantosCigarrillos.setText(null);
    }//GEN-LAST:event_txtCuantosCigarrillosFocusLost

    private void txtOrinaDiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOrinaDiaFocusLost
        if(!controlEntrada.datoEsNumerico(txtOrinaDia)) txtOrinaDia.setText(null);
    }//GEN-LAST:event_txtOrinaDiaFocusLost

    private void txtColorOrinaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtColorOrinaFocusLost
        if(!controlEntrada.validarColorOrina(txtColorOrina)) txtColorOrina.setText(null);
    }//GEN-LAST:event_txtColorOrinaFocusLost

    private void radioNoAplicaFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoAplicaFemeninoActionPerformed
        controlEntrada.habilitarAntecedenteFemenino(radioNoAplicaFemenino,comboMesesEmbarazo,radioRegular,radioIrregular,radioEmbarazada,radioPastillasAnticonceptivas,radioMenopausia);
    }//GEN-LAST:event_radioNoAplicaFemeninoActionPerformed

    private void txtOrinaNocheFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOrinaNocheFocusLost
        if(!controlEntrada.datoEsNumerico(txtOrinaNoche)) txtOrinaNoche.setText(null);
    }//GEN-LAST:event_txtOrinaNocheFocusLost

    private void pestRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pestRegistrarMouseClicked

    }//GEN-LAST:event_pestRegistrarMouseClicked

    private void radioIncluirTensionArterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioIncluirTensionArterialActionPerformed
        controlEntrada.habilitarTxt(radioIncluirTensionArterial,txtMaxima,txtMinima);
        if(!radioIncluirTensionArterial.isSelected()) {
            txtMaxima.setText(null);
            txtMinima.setText(null);
        }
    }//GEN-LAST:event_radioIncluirTensionArterialActionPerformed

    private void radioIncluirPalpacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioIncluirPalpacionActionPerformed
        radioPalpables.setEnabled(radioIncluirPalpacion.isSelected());
        controlEntrada.habilitarTxt(radioIncluirPalpacion,txtLocalizacion,txtCaracteristicas);
    }//GEN-LAST:event_radioIncluirPalpacionActionPerformed

    private void txtMaximaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaximaFocusLost
        if(!controlEntrada.datoEsNumerico(txtMaxima)) txtMaxima.setText(null);
    }//GEN-LAST:event_txtMaximaFocusLost

    private void txtMinimaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMinimaFocusLost
        if(!controlEntrada.datoEsNumerico(txtMinima)) txtMinima.setText(null);
    }//GEN-LAST:event_txtMinimaFocusLost

    private void comboMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMedicamentosActionPerformed
        controlEntrada.habilitarTxt(comboMedicamentos, txtCualMed);
        if(comboMedicamentos.getSelectedItem().equals("No"))
            txtCualMed.setText(null);
    }//GEN-LAST:event_comboMedicamentosActionPerformed

    private void comboHospitalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHospitalizadoActionPerformed
        controlEntrada.habilitarTxt(comboHospitalizado,txtPorQueHospitalizado);
    }//GEN-LAST:event_comboHospitalizadoActionPerformed

    private void txtGlicemiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGlicemiaFocusLost
        if (!controlEntrada.datoEsNumerico(txtGlicemia)) txtGlicemia.setText(null);
    }//GEN-LAST:event_txtGlicemiaFocusLost

    private void radioPalpablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPalpablesActionPerformed

    }//GEN-LAST:event_radioPalpablesActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        Consulta consulta;
        ExamenSubjetivo exSub; ExamenClinico exCli; ExamenRadiografico exRad; ExamenLaboratorio exLab;
        AntecedenteRenalGastroIntestinal antRG; AntecedenteFemenino antFem; AntecedenteCardiovascular antCardio;
        AntecedenteAlergico antAlergico; AntecedenteNutricional antNM; AntecedenteInfeccioso antInf;
        AntecedenteNeurologico antNeuro; AntecedenteHematologico antHem; AntecedenteFamiliar antFam;
        int codigo;
        
        
        boolean fDP = controlEntrada.revisarFaltantesDP(txtCedula,txtNombre,txtTelf1,txtTelf2,txtEdad,labelFaltanteCedula,labelFaltanteNombre,
                                                            labelFaltanteTelefono,labelFaltanteEdad);
        
        boolean fES = controlEntrada.revisarFaltantesES(txtMotivo,txtCualMed,comboMedicamentos,labelFaltanteMotivo,labelFaltanteMedicamento);
        
        boolean fAntecedentes = controlEntrada.revisarFaltantesAntecedentes(txtCuandoInfarto,txtAlergicoMedicamento,txtCausaHemorragia,
                                                                            labelFaltanteCardio,labelFaltanteAlergico,labelFaltanteHematologicas,
                                                                            radioNoAplicaCardiovasculares,radioNoAplicaAlergicos,
                                                                            radioNoAplicaHematologicas,radioInfarto,radioAlergicoMedicamento,
                                                                            radioHemorragiasImportantes);
        
        boolean fExC = controlEntrada.revisarFaltantesExC(txtLabios,txtFrenillosLabiales,txtVestibuloBucal,txtMucosaPalatina,txtMucosaPisoBoca,
                                                            txtFrenilloLingual,txtCaraDorsal,txtCaraVentral,txtBordesLaterales,txtEncias,
                                                            txtDientes,txtMaxima,txtMinima,txtLocalizacion,txtCaracteristicas,
                                                            radioIncluirTensionArterial,radioIncluirPalpacion,radioPalpables,labelECBFaltante,
                                                            labelFaltanteMaxima,labelFaltanteMinima,labelFaltanteCaracteristicas,
                                                            labelFaltanteLocalizacion);
        
        boolean fDiagnostico = controlEntrada.revisarFaltantesDiagnostico(txtPresuntivo,txtHistopatologico,txtDefinitivo,
                                                                            labelFaltantesDiagnostico);
        if(fDP || fES || fExC || fDiagnostico) 
            JOptionPane.showMessageDialog(null,"Aún falta información esencial por llenar (*).","Error", JOptionPane.ERROR_MESSAGE);
        else{
            
            consulta = controlEntrada.crearConsulta(txtEdad, txtDomicilio, txtTelf1, txtTelf2, txtOcupacion, radioEstudiante, txtReferencia, 
                                            txtPresuntivo, txtHistopatologico, txtDefinitivo, txtPlanTratamiento, txtObservaciones);
            
            exSub = controlEntrada.crearExamenSubjetivo(txtMotivo,txtCurso,comboMedicamentos,comboHospitalizado,comboIntervenidoQuirurgicamente, 
                                                radioFuma,radioToma,txtCualMed,txtPorQueHospitalizado,txtCuantosCigarrillos,txtDesdeFuma,
                                                txtCantidadToma);
            consulta.getListaExamenes().add(exSub);
            
            exCli = controlEntrada.crearExamenClinico(txtLabios, txtFrenillosLabiales, txtVestibuloBucal, txtMucosaPalatina, txtMucosaPalatina, 
                                                txtFrenilloLingual, txtCaraDorsal, txtCaraVentral, txtBordesLaterales, txtEncias, 
                                                txtDientes, radioIncluirTensionArterial, txtMaxima, txtMinima, radioIncluirPalpacion, 
                                                radioPalpables, txtLocalizacion, txtCaracteristicas);
            consulta.getListaExamenes().add(exCli);
            
            if(radioAgregarExamenRadiografico.isSelected()){
                exRad = controlEntrada.crearExamenRadiografico(txtRxPanoramica, txtRxPeriapical, txtRxOclusal);
                consulta.getListaExamenes().add(exRad);
            }
            if(radioAgregarExamenLaboratorio.isSelected()){
                exLab = controlEntrada.crearExamenLaboratorio(txtPerfilHematologico, txtPerfilCoagulacion, txtGlicemia, comboVDRL, comboVIH);
                 consulta.getListaExamenes().add(exLab);
            }
            
            antRG = controlEntrada.crearAntRN(radioEnfermedadRenal, radioCalculosRenales1, radioAcidezEstomacal1, radioUlcerPeptica1, 
                                        radioDiarreasFrecuencia1, txtOrinaDia, txtColorOrina);
            consulta.getListaAntecedentes().add(antRG);
            
            if(!radioNoAplicaFemenino.isSelected()){
                antFem = controlEntrada.crearAntFem(radioRegular, radioIrregular, radioEmbarazada, comboMesesEmbarazo, radioPastillasAnticonceptivas, 
                                            radioMenopausia);
                consulta.getListaAntecedentes().add(antFem);
            }
            
            if(!radioNoAplicaCardiovasculares.isSelected()){
               antCardio = controlEntrada.crearAntCardio(radioSubirEscaleras, radioEdema, radioPalpitaciones, radioDoloresPecho, radioInfarto, 
                                             txtCuandoInfarto, radioEndocarditisBacteriana, radioValvulopatia, radioHipertenso, radioHipotenso, 
                                             radioTratamientoTension);
               consulta.getListaAntecedentes().add(antCardio);
            }
            if(!radioNoAplicaAlergicos.isSelected()){
                antAlergico = controlEntrada.crearAntAlergico(radioAlergicoMedicamento, txtAlergicoMedicamento, radioUrticaria, radioDificultadTragar, 
                                                radioDificultadRespirar, radioSufreAsma, txtUltimaCrisisAsma, txtReaccionAnestesiaLocal);
                consulta.getListaAntecedentes().add(antAlergico);
            }
            if(!radioNoAplicaNM.isSelected()){
                antNM = controlEntrada.crearAntNutricional(radioAnemia, radioPerdidoPeso, radioDieta, radioSienteDecaimiento, radioMalestarGeneral, 
                                                    radioFiebre, radioDiabetico, radioTratamientoDiabetico, radioOrinaNoche, txtOrinaNoche, 
                                                    radioMuchaSed, radioInsomnio, radioTiroides);
                consulta.getListaAntecedentes().add(antNM);
            }
            if(!radioNoAplicaInfecciosas.isSelected()){
                antInf = controlEntrada.crearAntInfeccioso(radioEnfermedadesVenereas, txtHaceCuantoVenereas, radioTransfusion, radioHepatitis, 
                                                    txtHaceCuantoHepatitis, comboTipoHepatitis, radioOtraEnfermedadHepatica, txtCualOtraHepatica, 
                                                    radioTuberculosis);
                consulta.getListaAntecedentes().add(antInf);
            }
            if(!radioNoAplicaNeurologicas.isSelected()){
                antNeuro = controlEntrada.crearAntNeurologico(radioConvulsiones, txtCuantoTiempoConvulsiones, radioEpilepsia, fechaUltimaCrisis, 
                                                    radioNeuralgiasNeuritis, radioParalisisFacial, radioParestesia, radioSeAltera, radioCefaleas);
                consulta.getListaAntecedentes().add(antNeuro);
            }
            if(!radioNoAplicaHematologicas.isSelected()){
                antHem = controlEntrada.crearAntHematologico(radioHemorragiasImportantes, txtCausaHemorragia, txtDuracionHemorragia, 
                                                    radioHematomas, radioSangranEncias, radioSangraNariz);
                consulta.getListaAntecedentes().add(antHem);
            }
            if(!radioFamiliares.isSelected()){
                antFam = controlEntrada.crearAntFamiliar(txtTipoCancer,txtTipoEnfPulmonares,comboTipoDiabetes,txtTipoEnfCardiovasculares,
                                                txtTipoEnfHepaticas, txtOtros1);
                consulta.getListaAntecedentes().add(antFam);
            }
            
            if(accion=='R'){
                if(odontologo.buscarPaciente(Integer.parseInt(txtCedula.getText()))){
                    paciente = odontologo.buscarObjetoPaciente(Integer.parseInt(txtCedula.getText()));
                    codigo = paciente.getListaConsultas().size()+1;
                    consulta.setCodigo(codigo);
                    paciente.agregarConsulta(consulta);
                }
                else{ 
                    paciente = controlEntrada.crearPaciente(odontologo, txtCedula, txtNombre, txtLugarNacimiento, comboSexo);
                    consulta.setCodigo(1);
                    paciente.agregarConsulta(consulta);
                    odontologo.getListaPacientes().add(paciente);
                    Guardar.enJSON();
                }
                JOptionPane.showMessageDialog(null,"Se ha registrado la consulta exitosamente.","Guardado", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(accion=='M'){
                controlModificar.copiarConsulta(con,consulta);
                JOptionPane.showMessageDialog(null,"Se han guardado los cambios a la consulta exitosamente.","Guardado", JOptionPane.INFORMATION_MESSAGE);
            }
            
            MenuPrincipal menu = new MenuPrincipal(odontologo);
            menu.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed
        if(comboSexo.getSelectedItem().equals("M")){ 
            radioNoAplicaFemenino.setSelected(true);
            radioNoAplicaFemenino.setEnabled(false);
        }
        if(comboSexo.getSelectedItem().equals("F")){ 
            radioNoAplicaFemenino.setSelected(false);
            radioNoAplicaFemenino.setEnabled(true);
        }
        controlEntrada.habilitarAntecedenteFemenino(radioNoAplicaFemenino,comboMesesEmbarazo,radioRegular,radioIrregular,radioEmbarazada,
                                                        radioPastillasAnticonceptivas,radioMenopausia);   

    }//GEN-LAST:event_comboSexoActionPerformed

    private void botonDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeshacerActionPerformed
        controlEntrada.deshacerBusqueda(txtCedula, txtNombre, comboSexo, labelHistoriaMedica, txtLugarNacimiento, botonDeshacer);
    }//GEN-LAST:event_botonDeshacerActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtHMFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHMFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHMFocusLost

    private void botonOdontogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOdontogramaActionPerformed
        Odontograma odontograma = new Odontograma(odontologo,txtCedula.getText(),txtNombre.getText(),txtEdad.getText());
        
    }//GEN-LAST:event_botonOdontogramaActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAntecedentes;
    private javax.swing.JButton botonDatosPersonales;
    private javax.swing.JButton botonDeshacer;
    private javax.swing.JButton botonDiaTra;
    private javax.swing.JButton botonExamenCli;
    private javax.swing.JButton botonExamenCom;
    private javax.swing.JButton botonExamenSub;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonOdontograma;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> comboHospitalizado;
    private javax.swing.JComboBox<String> comboIntervenidoQuirurgicamente;
    private javax.swing.JComboBox<String> comboMedicamentos;
    private javax.swing.JComboBox<String> comboMesesEmbarazo;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JComboBox<String> comboTipoDiabetes;
    private javax.swing.JComboBox<String> comboTipoHepatitis;
    private javax.swing.JComboBox<String> comboVDRL;
    private javax.swing.JComboBox<String> comboVIH;
    private com.toedter.calendar.JDateChooser fechaUltimaCrisis;
    private javax.swing.ButtonGroup grupoRegularIrregular;
    private javax.swing.ButtonGroup grupoTensionArterial;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel labelAlérgicos1;
    private javax.swing.JLabel labelAntecedentes;
    private javax.swing.JLabel labelBordesLaterales;
    private javax.swing.JLabel labelCaraDorsal;
    private javax.swing.JLabel labelCaraVentral;
    private javax.swing.JLabel labelCaracteristicas1;
    private javax.swing.JLabel labelCardiovasculares1;
    private javax.swing.JLabel labelCausaHemorragia1;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelColorOrina1;
    private javax.swing.JLabel labelCrisisAsma2;
    private javax.swing.JLabel labelCrisisAsma3;
    private javax.swing.JLabel labelCual;
    private javax.swing.JLabel labelCualMedicamento1;
    private javax.swing.JLabel labelCualOtraHepatica1;
    private javax.swing.JLabel labelCuandoInfarto1;
    private javax.swing.JLabel labelCuantasVecesOrinaDia1;
    private javax.swing.JLabel labelCuantasVecesOrinaNoche1;
    private javax.swing.JLabel labelCuantoTiempoConvulsiones1;
    private javax.swing.JLabel labelCuantosCigarrillos;
    private javax.swing.JLabel labelCursoEnfermedad;
    private javax.swing.JLabel labelDatosPersonales;
    private javax.swing.JLabel labelDatosPersonales1;
    private javax.swing.JLabel labelDefinitivo;
    private javax.swing.JLabel labelDesdeCuando;
    private javax.swing.JLabel labelDientes;
    private javax.swing.JLabel labelDomicilio;
    private javax.swing.JLabel labelDuracionHemorragia1;
    private javax.swing.JLabel labelECBFaltante;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelEncia;
    private javax.swing.JLabel labelExamenClinico2;
    private javax.swing.JLabel labelExamenClinico3;
    private javax.swing.JLabel labelExamenCom;
    private javax.swing.JLabel labelFaltanteAlergico;
    private javax.swing.JLabel labelFaltanteCaracteristicas;
    private javax.swing.JLabel labelFaltanteCardio;
    private javax.swing.JLabel labelFaltanteCedula;
    private javax.swing.JLabel labelFaltanteEdad;
    private javax.swing.JLabel labelFaltanteHematologicas;
    private javax.swing.JLabel labelFaltanteLocalizacion;
    private javax.swing.JLabel labelFaltanteMaxima;
    private javax.swing.JLabel labelFaltanteMedicamento;
    private javax.swing.JLabel labelFaltanteMinima;
    private javax.swing.JLabel labelFaltanteMotivo;
    private javax.swing.JLabel labelFaltanteNombre;
    private javax.swing.JLabel labelFaltanteTelefono;
    private javax.swing.JLabel labelFaltantesDiagnostico;
    private javax.swing.JLabel labelFamiliares1;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelFechaUltimaCrisis1;
    private javax.swing.JLabel labelFemenino1;
    private javax.swing.JLabel labelFrenilloLingual;
    private javax.swing.JLabel labelFrenillosLabiales;
    private javax.swing.JLabel labelGlicemia;
    private javax.swing.JLabel labelGuion;
    private javax.swing.JLabel labelHaceCuantoHepatitis1;
    private javax.swing.JLabel labelHaceCuantoVenereas1;
    private javax.swing.JLabel labelHistopatologico;
    private javax.swing.JLabel labelHistoriaMedica;
    private javax.swing.JLabel labelHospitalizado;
    private javax.swing.JLabel labelInfecciosas4;
    private javax.swing.JLabel labelInfecciosas5;
    private javax.swing.JLabel labelInfecciosas6;
    private javax.swing.JLabel labelLabios;
    private javax.swing.JLabel labelLengua;
    private javax.swing.JLabel labelLocalizacion1;
    private javax.swing.JLabel labelLugarNacimiento;
    private javax.swing.JLabel labelMMGDL;
    private javax.swing.JLabel labelMMHG2;
    private javax.swing.JLabel labelMMHG3;
    private javax.swing.JLabel labelMaxima1;
    private javax.swing.JLabel labelMedicamento;
    private javax.swing.JLabel labelMenstruacion1;
    private javax.swing.JLabel labelMesesEmbarazo1;
    private javax.swing.JLabel labelMinima1;
    private javax.swing.JLabel labelMotivo;
    private javax.swing.JLabel labelMucosaPalatina;
    private javax.swing.JLabel labelMucosaPisoBoca;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNutricionalesMetabolicos1;
    private javax.swing.JLabel labelObservaciones;
    private javax.swing.JLabel labelOcupacion;
    private javax.swing.JLabel labelOtros1;
    private javax.swing.JLabel labelPalpacionGanglios1;
    private javax.swing.JLabel labelPalpacionGanglios2;
    private javax.swing.JLabel labelPerfilCoagulacion1;
    private javax.swing.JLabel labelPerfilHematologico1;
    private javax.swing.JLabel labelPlanTratamiento;
    private javax.swing.JLabel labelPorQue;
    private javax.swing.JLabel labelPresuntivo;
    private javax.swing.JLabel labelQueCantidad;
    private javax.swing.JLabel labelQuirurgicamente;
    private javax.swing.JLabel labelReferencia;
    private javax.swing.JLabel labelRenalesGastrointestinales;
    private javax.swing.JLabel labelRxOclusal1;
    private javax.swing.JLabel labelRxPanoramica1;
    private javax.swing.JLabel labelRxPanoramica3;
    private javax.swing.JLabel labelRxPeriapical1;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTensionArterial1;
    private javax.swing.JLabel labelTipoCancer1;
    private javax.swing.JLabel labelTipoDiabetes2;
    private javax.swing.JLabel labelTipoDiabetes3;
    private javax.swing.JLabel labelTipoEnfCardio;
    private javax.swing.JLabel labelTipoEnfPulmonares1;
    private javax.swing.JLabel labelTipoHepatitis1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel labelVDRL1;
    private javax.swing.JLabel labelVIH;
    private javax.swing.JLabel labelVestibuloBucal;
    private javax.swing.JPanel panelAlergicos;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelCardiovasculares;
    private javax.swing.JPanel panelFamiliares;
    private javax.swing.JPanel panelFemenino;
    private javax.swing.JPanel panelHematologicas;
    private javax.swing.JPanel panelInfecciosas;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelNeurologicas;
    private javax.swing.JPanel panelNutricionalesMetabolicos;
    private javax.swing.JPanel panelRenalesGastrointestinales;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel pestAntecedentes;
    private javax.swing.JPanel pestDatosPersonales;
    private javax.swing.JPanel pestDiaTra;
    private javax.swing.JPanel pestExamenClinico;
    private javax.swing.JPanel pestExamenCom;
    private javax.swing.JPanel pestExamenSub;
    private javax.swing.JTabbedPane pestRegistrar;
    private javax.swing.JRadioButton radioAcidezEstomacal1;
    private javax.swing.JRadioButton radioAgregarExamenLaboratorio;
    private javax.swing.JRadioButton radioAgregarExamenRadiografico;
    private javax.swing.JRadioButton radioAlergicoMedicamento;
    private javax.swing.JRadioButton radioAnemia;
    private javax.swing.JRadioButton radioCalculosRenales1;
    private javax.swing.JRadioButton radioCancer;
    private javax.swing.JRadioButton radioCefaleas;
    private javax.swing.JRadioButton radioConvulsiones;
    private javax.swing.JRadioButton radioDiabetes;
    private javax.swing.JRadioButton radioDiabetico;
    private javax.swing.JRadioButton radioDiarreasFrecuencia1;
    private javax.swing.JRadioButton radioDieta;
    private javax.swing.JRadioButton radioDificultadRespirar;
    private javax.swing.JRadioButton radioDificultadTragar;
    private javax.swing.JRadioButton radioDoloresPecho;
    private javax.swing.JRadioButton radioEdema;
    private javax.swing.JRadioButton radioEmbarazada;
    private javax.swing.JRadioButton radioEndocarditisBacteriana;
    private javax.swing.JRadioButton radioEnfCardiovasculares;
    private javax.swing.JRadioButton radioEnfHepaticas;
    private javax.swing.JRadioButton radioEnfPulmonares;
    private javax.swing.JRadioButton radioEnfermedadRenal;
    private javax.swing.JRadioButton radioEnfermedadesVenereas;
    private javax.swing.JRadioButton radioEpilepsia;
    private javax.swing.JRadioButton radioEstudiante;
    private javax.swing.JRadioButton radioFamiliares;
    private javax.swing.JRadioButton radioFiebre;
    private javax.swing.JRadioButton radioFuma;
    private javax.swing.JRadioButton radioHematomas;
    private javax.swing.JRadioButton radioHemorragiasImportantes;
    private javax.swing.JRadioButton radioHepatitis;
    private javax.swing.JRadioButton radioHipertenso;
    private javax.swing.JRadioButton radioHipotenso;
    private javax.swing.JRadioButton radioIncluirPalpacion;
    private javax.swing.JRadioButton radioIncluirTensionArterial;
    private javax.swing.JRadioButton radioInfarto;
    private javax.swing.JRadioButton radioInsomnio;
    private javax.swing.JRadioButton radioIrregular;
    private javax.swing.JRadioButton radioMalestarGeneral;
    private javax.swing.JRadioButton radioMenopausia;
    private javax.swing.JRadioButton radioMuchaSed;
    private javax.swing.JRadioButton radioNeuralgiasNeuritis;
    private javax.swing.JRadioButton radioNoAplicaAlergicos;
    private javax.swing.JRadioButton radioNoAplicaCardiovasculares;
    private javax.swing.JRadioButton radioNoAplicaFemenino;
    private javax.swing.JRadioButton radioNoAplicaHematologicas;
    private javax.swing.JRadioButton radioNoAplicaInfecciosas;
    private javax.swing.JRadioButton radioNoAplicaNM;
    private javax.swing.JRadioButton radioNoAplicaNeurologicas;
    private javax.swing.JRadioButton radioOrinaNoche;
    private javax.swing.JRadioButton radioOtraEnfermedadHepatica;
    private javax.swing.JRadioButton radioPalpables;
    private javax.swing.JRadioButton radioPalpitaciones;
    private javax.swing.JRadioButton radioParalisisFacial;
    private javax.swing.JRadioButton radioParestesia;
    private javax.swing.JRadioButton radioPastillasAnticonceptivas;
    private javax.swing.JRadioButton radioPerdidoPeso;
    private javax.swing.JRadioButton radioRegular;
    private javax.swing.JRadioButton radioSangraNariz;
    private javax.swing.JRadioButton radioSangranEncias;
    private javax.swing.JRadioButton radioSeAltera;
    private javax.swing.JRadioButton radioSienteDecaimiento;
    private javax.swing.JRadioButton radioSubirEscaleras;
    private javax.swing.JRadioButton radioSufreAsma;
    private javax.swing.JRadioButton radioTiroides;
    private javax.swing.JRadioButton radioToma;
    private javax.swing.JRadioButton radioTransfusion;
    private javax.swing.JRadioButton radioTratamientoDiabetico;
    private javax.swing.JRadioButton radioTratamientoTension;
    private javax.swing.JRadioButton radioTuberculosis;
    private javax.swing.JRadioButton radioUlcerPeptica1;
    private javax.swing.JRadioButton radioUrticaria;
    private javax.swing.JRadioButton radioValvulopatia;
    private javax.swing.JScrollPane scrollDiagnostico;
    private javax.swing.JScrollPane scrollExamenCavidadBucal;
    private javax.swing.JPanel tabDiagnostico;
    private javax.swing.JPanel tabExamenCavidadBucal;
    private javax.swing.JPanel tabExamenLab;
    private javax.swing.JPanel tabExamenRadiografico;
    private javax.swing.JTabbedPane tabExamenesClinicos;
    private javax.swing.JPanel tabObservaciones;
    private javax.swing.JPanel tabPalpacion;
    private javax.swing.JPanel tabPlanTratamiento;
    private javax.swing.JPanel tabTensionArterial;
    private javax.swing.JTabbedPane tabsAntecedentes;
    private javax.swing.JTabbedPane tabsDiaTra;
    private javax.swing.JTabbedPane tabsExamenesCom;
    private javax.swing.JTextField txtAlergicoMedicamento;
    private javax.swing.JTextField txtBordesLaterales;
    private javax.swing.JTextField txtCantidadToma;
    private javax.swing.JTextField txtCaraDorsal;
    private javax.swing.JTextField txtCaraVentral;
    private javax.swing.JTextField txtCaracteristicas;
    private javax.swing.JTextField txtCausaHemorragia;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtColorOrina;
    private javax.swing.JTextField txtCualMed;
    private javax.swing.JTextField txtCualOtraHepatica;
    private javax.swing.JTextField txtCuandoInfarto;
    private javax.swing.JTextField txtCuantoTiempoConvulsiones;
    private javax.swing.JTextField txtCuantosCigarrillos;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextArea txtDefinitivo;
    private javax.swing.JTextField txtDesdeFuma;
    private javax.swing.JTextArea txtDientes;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtDuracionHemorragia;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEncias;
    private javax.swing.JTextField txtFechaUltimaCrisis;
    private javax.swing.JTextField txtFrenilloLingual;
    private javax.swing.JTextField txtFrenillosLabiales;
    private javax.swing.JTextField txtGlicemia;
    private javax.swing.JTextField txtHM;
    private javax.swing.JTextField txtHaceCuantoHepatitis;
    private javax.swing.JTextField txtHaceCuantoVenereas;
    private javax.swing.JTextArea txtHistopatologico;
    private javax.swing.JTextArea txtLabios;
    private javax.swing.JTextField txtLocalizacion;
    private javax.swing.JTextField txtLugarNacimiento;
    private javax.swing.JTextField txtMaxima;
    private javax.swing.JTextField txtMinima;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtMucosaPalatina;
    private javax.swing.JTextArea txtMucosaPisoBoca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtOcupacion;
    private javax.swing.JTextField txtOrinaDia;
    private javax.swing.JTextField txtOrinaNoche;
    private javax.swing.JTextField txtOtros1;
    private javax.swing.JTextField txtPerfilCoagulacion;
    private javax.swing.JTextField txtPerfilHematologico;
    private javax.swing.JTextArea txtPlanTratamiento;
    private javax.swing.JTextField txtPorQueHospitalizado;
    private javax.swing.JTextArea txtPresuntivo;
    private javax.swing.JTextField txtReaccionAnestesiaLocal;
    private javax.swing.JTextField txtReferencia;
    private javax.swing.JTextArea txtRxOclusal;
    private javax.swing.JTextArea txtRxPanoramica;
    private javax.swing.JTextArea txtRxPeriapical;
    private javax.swing.JTextField txtTelf1;
    private javax.swing.JTextField txtTelf2;
    private javax.swing.JTextField txtTipoCancer;
    private javax.swing.JTextField txtTipoEnfCardiovasculares;
    private javax.swing.JTextField txtTipoEnfHepaticas;
    private javax.swing.JTextField txtTipoEnfPulmonares;
    private javax.swing.JTextField txtUltimaCrisisAsma;
    private javax.swing.JTextField txtVestibuloBucal;
    // End of variables declaration//GEN-END:variables
}
