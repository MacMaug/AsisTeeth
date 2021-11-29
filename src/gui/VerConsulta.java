/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import control.CVerConsulta;
import modelo.Consulta;

/**
 *
 * @author jdfer
 */
public class VerConsulta extends javax.swing.JFrame {
        CVerConsulta controlVer = new CVerConsulta();
    /**
     * Creates new form VerConsulta
     */
    public VerConsulta() {
        initComponents();
    }
    
    public VerConsulta(Consulta consulta) {
        initComponents();
        controlVer.llenarDiagnostico(consulta, txtPresuntivo, txtHistopatologico, txtDefinitivo, txtPlanTratamiento, txtObservaciones);
        
        controlVer.llenarDatosPersonalesConsulta(consulta, labelTelfPaciente, labelOcupacionPaciente, labelEdadPaciente, labelEstudiantePaciente, labelReferenciaPaciente, labelDomicilioPaciente);
        
        controlVer.llenarDatosExamenSubjetivo(consulta, labelMotivoPaciente, labelCursoEnfermedadPaciente, labelMedicamentoPaciente, 
                                                labelCualMedicamentoPaciente, labelHospitalizadoPaciente, labelPorQuePaciente, 
                                                labelQuirurgicamentePaciente, radioFuma, labelCuantosCigarrillosPaciente, 
                                                labelDesdeCuandoPaciente, radioToma, labelQueCantidadPaciente);
        
        controlVer.llenarDatosExamenClinico(consulta, txtLabios, labelFrenillosLabialesR, labelVestibuloBucal, labelMucosaPalatinaR, txtMucosaPisoBoca, labelFrenilloLingualR, 
                                                labelCaraDorsalR, labelCaraVentral, labelBordesLateralesR, labelEnciasR, txtDientes, labelPresentaTension, labelMaximaR, labelMinimaR, 
                                                labelPresentaPalpacion, radioPalpables, labelLocalizacionR1, labelCaracteristicasR);
        
        controlVer.llenarDatosExamenRadiografico(consulta, labelPresentaExamenRad, txtRxPanoramica, txtRxPeriapical, txtRxOclusal);
        
        controlVer.llenarDatosExamenLaboratorio(consulta, labelPresentaExamenLab, labelPHR1, labelPCR, labelGlicemiaR, labelVDRLR, labelVIHR);
        
        controlVer.llenarDatosAntecedenteRenalGastro(consulta, radioEnfermedadRenal, labelVecesDiaR, labelColorOrinaPaciente, radioCalculosRenales1, radioAcidezEstomacal1,
                                                        radioUlcerPeptica1, radioDiarreasFrecuencia1);
        
        controlVer.llenarDatosAntecedenteFemenino(consulta, radioNoAplicaFemenino, radioRegular1, radioIrregular1, radioEmbarazada1, 
                                                    labelMesesEmbarazoR, radioPastillasAnticonceptivas1, radioMenopausia1);
        
        controlVer.llenarDatosAntecedenteCardiovascular(consulta, radioNoAplicaCardiovasculares, radioSubirEscaleras, radioEdema, radioPalpitaciones, 
                                                        radioDoloresPecho, radioInfarto, labelCuandoInfartoR, radioEndocarditisBacteriana, 
                                                        radioValvulopatia, radioHipertenso, radioHipertenso, radioTratamientoTension);
        
        controlVer.llenarDatosAntecedenteAlergico(consulta, radioNoAplicaAlergicos, radioAlergicoMedicamento, labelCualMedicamentoR, radioUrticaria, 
                                                    radioDificultadTragar, radioDificultadRespirar, radioAsma, labelUltimaCrisisR, labelRA);
        
        controlVer.llenarDatosAntecedenteNM(consulta, radioNoAplicaNM, radioAnemia, radioPerdidoPeso, radioDieta, 
                                            radioSienteDecaimiento, radioFiebre, radioDiabetico, radioTratamientoDiabetico, 
                                            radioOrinaNoche, labelOrinaNocheR, radioMuchaSed, radioInsomnio, radioTiroides);
        controlVer.llenarDatosAntecedenteInfeccioso(consulta, radioNoAplicaInfecciosas, radioEnfermedadesVenereas, radioTransfusion, 
                                                    radioHepatitis, labelHaceCuantoHepR1, labelTipoHepatitisR1, 
                                                    radioOtraEnfermedadHepatica, labelOtraHepaticaR, radioTuberculosis);
        
        controlVer.llenarDatosAntecedenteNeurologico(consulta, radioNoAplicaNeurologicas, radioConvulsiones, labelTiempoConvulsiones, 
                                                        radioEpilepsia, labelFechaCrisisR, radioNeuralgiasNeuritis, 
                                                        radioParalisisFacial, radioParestesia, radioSeAltera, radioCefaleas);
        
        controlVer.llenarDatosAntecedenteHematologico(consulta, radioNoAplicaHematologicas, radioHemorragias, labelCausaHemorragiaR, labelDuracionHemorragia, 
                                                        radioHematomas, radioSangranEncias, radioSangraNariz);
        
        controlVer.llenarAntecedenteFamiliar(consulta, radioFamiliares, radioCancer, radioEnfPulmonares, radioDiabetes, radioEnfCardiovasculares, radioEnfHepaticas, 
                                                labelTipoCanR, labelTipoPulR, labelTipoDR, labelTipoCardioR, labelTipoHR, labelOtrosR4);
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
        botonSalir = new javax.swing.JButton();
        panelBotones = new javax.swing.JPanel();
        botonDatosPersonales = new javax.swing.JButton();
        botonExamenSub = new javax.swing.JButton();
        botonAntecedentes = new javax.swing.JButton();
        botonExamenCli = new javax.swing.JButton();
        botonExamenCom = new javax.swing.JButton();
        botonDiaTra = new javax.swing.JButton();
        panelInfo = new javax.swing.JPanel();
        pestVer = new javax.swing.JTabbedPane();
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
        labelCedulaPaciente = new javax.swing.JLabel();
        labelNombrePaciente = new javax.swing.JLabel();
        labelHMPaciente = new javax.swing.JLabel();
        labelOcupacionPaciente = new javax.swing.JLabel();
        labelSexoPaciente = new javax.swing.JLabel();
        labelEstudiantePaciente = new javax.swing.JLabel();
        labelTelfPaciente = new javax.swing.JLabel();
        labelEstudiante = new javax.swing.JLabel();
        labelEdadPaciente = new javax.swing.JLabel();
        labelReferenciaPaciente = new javax.swing.JLabel();
        labelLNPaciente = new javax.swing.JLabel();
        labelReferenciaPaciente2 = new javax.swing.JLabel();
        labelDomicilioPaciente = new javax.swing.JLabel();
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
        radioToma = new javax.swing.JRadioButton();
        labelMotivoPaciente = new javax.swing.JLabel();
        labelCualMedicamentoPaciente = new javax.swing.JLabel();
        labelHospitalizadoPaciente = new javax.swing.JLabel();
        labelCursoEnfermedadPaciente = new javax.swing.JLabel();
        labelMedicamentoPaciente = new javax.swing.JLabel();
        labelDesdeCuandoPaciente = new javax.swing.JLabel();
        labelCuantosCigarrillosPaciente = new javax.swing.JLabel();
        labelQuirurgicamentePaciente = new javax.swing.JLabel();
        labelPorQuePaciente = new javax.swing.JLabel();
        labelQueCantidadPaciente = new javax.swing.JLabel();
        pestAntecedentes = new javax.swing.JPanel();
        labelAntecedentes = new javax.swing.JLabel();
        tabsAntecedentes = new javax.swing.JTabbedPane();
        panelRenalesGastrointestinales = new javax.swing.JPanel();
        labelRenalesGastrointestinales = new javax.swing.JLabel();
        radioEnfermedadRenal = new javax.swing.JRadioButton();
        labelCuantasVecesOrinaDia = new javax.swing.JLabel();
        labelColorOrina = new javax.swing.JLabel();
        radioCalculosRenales1 = new javax.swing.JRadioButton();
        radioAcidezEstomacal1 = new javax.swing.JRadioButton();
        radioUlcerPeptica1 = new javax.swing.JRadioButton();
        radioDiarreasFrecuencia1 = new javax.swing.JRadioButton();
        labelVecesDiaR = new javax.swing.JLabel();
        labelColorOrinaPaciente = new javax.swing.JLabel();
        panelFemenino = new javax.swing.JPanel();
        labelFemenino = new javax.swing.JLabel();
        labelMenstruacion1 = new javax.swing.JLabel();
        radioRegular1 = new javax.swing.JRadioButton();
        radioIrregular1 = new javax.swing.JRadioButton();
        radioEmbarazada1 = new javax.swing.JRadioButton();
        labelMesesEmbarazo1 = new javax.swing.JLabel();
        radioPastillasAnticonceptivas1 = new javax.swing.JRadioButton();
        radioMenopausia1 = new javax.swing.JRadioButton();
        labelMesesEmbarazoR = new javax.swing.JLabel();
        radioNoAplicaFemenino = new javax.swing.JRadioButton();
        panelCardiovasculares = new javax.swing.JPanel();
        labelCardiovasculares = new javax.swing.JLabel();
        radioNoAplicaCardiovasculares = new javax.swing.JRadioButton();
        radioSubirEscaleras = new javax.swing.JRadioButton();
        radioEdema = new javax.swing.JRadioButton();
        radioPalpitaciones = new javax.swing.JRadioButton();
        radioDoloresPecho = new javax.swing.JRadioButton();
        radioInfarto = new javax.swing.JRadioButton();
        labelCuandoInfarto = new javax.swing.JLabel();
        radioEndocarditisBacteriana = new javax.swing.JRadioButton();
        radioValvulopatia = new javax.swing.JRadioButton();
        radioHipertenso = new javax.swing.JRadioButton();
        labelHipotenso = new javax.swing.JRadioButton();
        radioTratamientoTension = new javax.swing.JRadioButton();
        labelCuandoInfartoR = new javax.swing.JLabel();
        panelAlergicos = new javax.swing.JPanel();
        labelAlérgicos = new javax.swing.JLabel();
        radioAlergicoMedicamento = new javax.swing.JRadioButton();
        radioNoAplicaAlergicos = new javax.swing.JRadioButton();
        labelCualMedicamento = new javax.swing.JLabel();
        radioUrticaria = new javax.swing.JRadioButton();
        radioDificultadTragar = new javax.swing.JRadioButton();
        radioDificultadRespirar = new javax.swing.JRadioButton();
        radioAsma = new javax.swing.JRadioButton();
        labelCrisisAsma = new javax.swing.JLabel();
        labelRA = new javax.swing.JLabel();
        labelCualMedicamentoR = new javax.swing.JLabel();
        labelRAR = new javax.swing.JLabel();
        labelUltimaCrisisR = new javax.swing.JLabel();
        panelNutricionalesMetabolicos = new javax.swing.JPanel();
        labelNutricionalesMetabolicos = new javax.swing.JLabel();
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
        labelCuantasVecesOrinaNoche = new javax.swing.JLabel();
        radioMuchaSed = new javax.swing.JRadioButton();
        radioInsomnio = new javax.swing.JRadioButton();
        radioTiroides = new javax.swing.JRadioButton();
        labelOrinaNocheR = new javax.swing.JLabel();
        panelInfecciosas = new javax.swing.JPanel();
        labelInfecciosas = new javax.swing.JLabel();
        radioNoAplicaInfecciosas = new javax.swing.JRadioButton();
        radioEnfermedadesVenereas = new javax.swing.JRadioButton();
        labelHaceCuantoVenereas = new javax.swing.JLabel();
        radioTransfusion = new javax.swing.JRadioButton();
        radioHepatitis = new javax.swing.JRadioButton();
        labelHaceCuantoHepatitis = new javax.swing.JLabel();
        labelTipoHepatitis = new javax.swing.JLabel();
        radioOtraEnfermedadHepatica = new javax.swing.JRadioButton();
        labelCualOtraHepatica = new javax.swing.JLabel();
        radioTuberculosis = new javax.swing.JRadioButton();
        labelOtraHepaticaR = new javax.swing.JLabel();
        labelHaceCuantoVenereasR1 = new javax.swing.JLabel();
        labelHaceCuantoHepR1 = new javax.swing.JLabel();
        labelTipoHepatitisR1 = new javax.swing.JLabel();
        panelNeurologicas = new javax.swing.JPanel();
        labelNeurológicas = new javax.swing.JLabel();
        radioNoAplicaNeurologicas = new javax.swing.JRadioButton();
        radioConvulsiones = new javax.swing.JRadioButton();
        labelCuantoTiempoConvulsiones = new javax.swing.JLabel();
        radioEpilepsia = new javax.swing.JRadioButton();
        labelFechaUltimaCrisis = new javax.swing.JLabel();
        radioNeuralgiasNeuritis = new javax.swing.JRadioButton();
        radioParalisisFacial = new javax.swing.JRadioButton();
        radioParestesia = new javax.swing.JRadioButton();
        radioSeAltera = new javax.swing.JRadioButton();
        radioCefaleas = new javax.swing.JRadioButton();
        labelFechaCrisisR = new javax.swing.JLabel();
        labelTiempoConvulsiones = new javax.swing.JLabel();
        panelHematologicas = new javax.swing.JPanel();
        labelHematologicas = new javax.swing.JLabel();
        radioNoAplicaHematologicas = new javax.swing.JRadioButton();
        radioHemorragias = new javax.swing.JRadioButton();
        labelCausaHemorragia = new javax.swing.JLabel();
        labelDuracionHemorragia1 = new javax.swing.JLabel();
        radioHematomas = new javax.swing.JRadioButton();
        radioSangranEncias = new javax.swing.JRadioButton();
        radioSangraNariz = new javax.swing.JRadioButton();
        labelCausaHemorragiaR = new javax.swing.JLabel();
        labelDuracionHemorragia = new javax.swing.JLabel();
        panelFamiliares = new javax.swing.JPanel();
        labelFamiliares = new javax.swing.JLabel();
        radioFamiliares = new javax.swing.JRadioButton();
        radioCancer = new javax.swing.JRadioButton();
        labelTipoCancer = new javax.swing.JLabel();
        radioEnfPulmonares = new javax.swing.JRadioButton();
        labelTipoEnfPulmonares = new javax.swing.JLabel();
        radioDiabetes = new javax.swing.JRadioButton();
        radioEnfCardiovasculares = new javax.swing.JRadioButton();
        radioEnfHepaticas = new javax.swing.JRadioButton();
        labelTipoEnfHepaticas = new javax.swing.JLabel();
        labelOtros = new javax.swing.JLabel();
        labelTipoEnfCardiovasculares = new javax.swing.JLabel();
        labelTipoHR = new javax.swing.JLabel();
        labelTipoCardioR = new javax.swing.JLabel();
        labelTipoDR = new javax.swing.JLabel();
        labelTipoPulR = new javax.swing.JLabel();
        labelTipoCanR = new javax.swing.JLabel();
        labelOtrosR4 = new javax.swing.JLabel();
        pestExamenCli = new javax.swing.JPanel();
        tabExamenesClinicos = new javax.swing.JTabbedPane();
        scrollExamenCavidadBucal = new javax.swing.JScrollPane();
        tabExamenCavidadBucal = new javax.swing.JPanel();
        labelPalpacionGanglios2 = new javax.swing.JLabel();
        labelLabios = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLabios = new javax.swing.JTextArea();
        labelFrenillosLabiales = new javax.swing.JLabel();
        labelVestibuloBucal = new javax.swing.JLabel();
        labelMucosaPalatina = new javax.swing.JLabel();
        labelMucosaPisoBoca = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMucosaPisoBoca = new javax.swing.JTextArea();
        labelFrenilloLingual = new javax.swing.JLabel();
        labelLengua = new javax.swing.JLabel();
        labelCaraDorsal = new javax.swing.JLabel();
        labelCaraVentral = new javax.swing.JLabel();
        labelBordesLaterales = new javax.swing.JLabel();
        labelEncia = new javax.swing.JLabel();
        labelDientes = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDientes = new javax.swing.JTextArea();
        labelFrenillosLabialesR = new javax.swing.JLabel();
        labelVestibuloBucalR = new javax.swing.JLabel();
        labelMucosaPalatinaR = new javax.swing.JLabel();
        labelBordesLateralesR = new javax.swing.JLabel();
        labelFrenilloLingualR = new javax.swing.JLabel();
        labelCaraDorsalR = new javax.swing.JLabel();
        labelCaraVentralR1 = new javax.swing.JLabel();
        labelEnciasR = new javax.swing.JLabel();
        tabTensionArterial = new javax.swing.JPanel();
        labelTensionArterial = new javax.swing.JLabel();
        labelMaxima = new javax.swing.JLabel();
        labelMMHG = new javax.swing.JLabel();
        labelMinima = new javax.swing.JLabel();
        labelMMHG1 = new javax.swing.JLabel();
        labelMinimaR = new javax.swing.JLabel();
        labelMaximaR = new javax.swing.JLabel();
        labelPresentaTension = new javax.swing.JLabel();
        tabPalpacion = new javax.swing.JPanel();
        labelPalpacionGanglios = new javax.swing.JLabel();
        labelLocalizacion = new javax.swing.JLabel();
        radioPalpables = new javax.swing.JRadioButton();
        labelCaracteristicas = new javax.swing.JLabel();
        labelCaracteristicasR = new javax.swing.JLabel();
        labelLocalizacionR1 = new javax.swing.JLabel();
        labelPresentaPalpacion = new javax.swing.JLabel();
        labelExamenClinico3 = new javax.swing.JLabel();
        pestExamenCom = new javax.swing.JPanel();
        labelExamenCom = new javax.swing.JLabel();
        tabsExamenesCom = new javax.swing.JTabbedPane();
        tabExamenRadiografico = new javax.swing.JPanel();
        labelRxPanoramica = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtRxPanoramica = new javax.swing.JTextArea();
        labelRxPeriapical = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtRxPeriapical = new javax.swing.JTextArea();
        labelRxOclusal = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtRxOclusal = new javax.swing.JTextArea();
        labelPresentaExamenRad = new javax.swing.JLabel();
        tabExamenLab = new javax.swing.JPanel();
        labelPerfilHematologico = new javax.swing.JLabel();
        labelPerfilCoagulacion = new javax.swing.JLabel();
        labelGlicemia = new javax.swing.JLabel();
        labelVDRL = new javax.swing.JLabel();
        labelVIH = new javax.swing.JLabel();
        labelPCR = new javax.swing.JLabel();
        labelPresentaExamenLab = new javax.swing.JLabel();
        labelPHR1 = new javax.swing.JLabel();
        labelGlicemiaR = new javax.swing.JLabel();
        labelVDRLR = new javax.swing.JLabel();
        labelVIHR = new javax.swing.JLabel();
        pestDiaTra = new javax.swing.JPanel();
        labelDiaTra = new javax.swing.JLabel();
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
        tabPlanTratamiento = new javax.swing.JPanel();
        labelPlanTratamiento = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtPlanTratamiento = new javax.swing.JTextArea();
        tabObservaciones = new javax.swing.JPanel();
        labelObservaciones = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitulo.setBackground(javax.swing.UIManager.getDefaults().getColor("Tree.selectionBackground"));

        labelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        labelTitulo.setFont(new java.awt.Font("Nirmala UI", 0, 60)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Ver consulta");

        labelUsuario.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Nombre de usuario");

        labelFecha.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha.setText("Fecha");

        botonSalir.setBackground(new java.awt.Color(255, 51, 51));
        botonSalir.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(botonSalir)
                .addContainerGap())
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
                        .addComponent(botonDiaTra)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(panelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1200, 70));

        panelInfo.setBackground(new java.awt.Color(255, 255, 255));
        panelInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        labelCedulaPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelNombrePaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelHMPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelOcupacionPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelSexoPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelEstudiantePaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelTelfPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelEstudiante.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelEstudiante.setText("Estudiante:");

        labelEdadPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelReferenciaPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelLNPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelReferenciaPaciente2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelDomicilioPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pestDatosPersonalesLayout = new javax.swing.GroupLayout(pestDatosPersonales);
        pestDatosPersonales.setLayout(pestDatosPersonalesLayout);
        pestDatosPersonalesLayout.setHorizontalGroup(
            pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(labelEdad)
                                .addGap(18, 18, 18)
                                .addComponent(labelEdadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(labelTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelTelfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(labelLugarNacimiento)
                                .addGap(18, 18, 18)
                                .addComponent(labelLNPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(labelEstudiante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelEstudiantePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(labelOcupacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelOcupacionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(labelReferencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelReferenciaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(labelDomicilio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDomicilioPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(labelSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelSexoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(labelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelHistoriaMedica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelHMPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(labelCedula)
                        .addGap(18, 18, 18)
                        .addComponent(labelCedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(175, Short.MAX_VALUE))
            .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pestDatosPersonalesLayout.createSequentialGroup()
                    .addContainerGap(720, Short.MAX_VALUE)
                    .addComponent(labelReferenciaPaciente2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(281, 281, 281)))
        );
        pestDatosPersonalesLayout.setVerticalGroup(
            pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(labelDatosPersonales)
                        .addGap(40, 40, 40)
                        .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCedula)
                            .addComponent(labelCedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombre)
                            .addComponent(labelHistoriaMedica)))
                    .addComponent(labelNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHMPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelSexo)
                    .addComponent(labelSexoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTelefono)
                            .addComponent(labelTelfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelOcupacion)
                                    .addComponent(labelOcupacionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEdad)
                            .addGroup(pestDatosPersonalesLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(labelEstudiante))
                            .addComponent(labelEdadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelEstudiantePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLugarNacimiento)
                    .addComponent(labelReferencia)
                    .addComponent(labelLNPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelReferenciaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelDomicilio)
                    .addComponent(labelDomicilioPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(337, Short.MAX_VALUE))
            .addGroup(pestDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pestDatosPersonalesLayout.createSequentialGroup()
                    .addContainerGap(502, Short.MAX_VALUE)
                    .addComponent(labelReferenciaPaciente2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(251, 251, 251)))
        );

        pestVer.addTab("Datos personales", pestDatosPersonales);

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
        radioFuma.setEnabled(false);
        radioFuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFumaActionPerformed(evt);
            }
        });

        radioToma.setBackground(new java.awt.Color(255, 255, 255));
        radioToma.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        radioToma.setText("Toma");
        radioToma.setEnabled(false);
        radioToma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTomaActionPerformed(evt);
            }
        });

        labelMotivoPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelCualMedicamentoPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelHospitalizadoPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelCursoEnfermedadPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelMedicamentoPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelDesdeCuandoPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelCuantosCigarrillosPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelQuirurgicamentePaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelPorQuePaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelQueCantidadPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pestExamenSubLayout = new javax.swing.GroupLayout(pestExamenSub);
        pestExamenSub.setLayout(pestExamenSubLayout);
        pestExamenSubLayout.setHorizontalGroup(
            pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestExamenSubLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestExamenSubLayout.createSequentialGroup()
                        .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioFuma)
                            .addComponent(radioToma))
                        .addGap(97, 97, 97)
                        .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pestExamenSubLayout.createSequentialGroup()
                                .addComponent(labelQueCantidad)
                                .addGap(18, 18, 18)
                                .addComponent(labelQueCantidadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pestExamenSubLayout.createSequentialGroup()
                                .addComponent(labelCuantosCigarrillos)
                                .addGap(18, 18, 18)
                                .addComponent(labelCuantosCigarrillosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(labelDesdeCuando)
                                .addGap(18, 18, 18)
                                .addComponent(labelDesdeCuandoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pestExamenSubLayout.createSequentialGroup()
                        .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pestExamenSubLayout.createSequentialGroup()
                                .addComponent(labelHospitalizado)
                                .addGap(18, 18, 18)
                                .addComponent(labelHospitalizadoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pestExamenSubLayout.createSequentialGroup()
                                .addComponent(labelMedicamento)
                                .addGap(18, 18, 18)
                                .addComponent(labelMedicamentoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pestExamenSubLayout.createSequentialGroup()
                                .addComponent(labelCual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelCualMedicamentoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pestExamenSubLayout.createSequentialGroup()
                                .addComponent(labelPorQue)
                                .addGap(18, 18, 18)
                                .addComponent(labelPorQuePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pestExamenSubLayout.createSequentialGroup()
                        .addComponent(labelQuirurgicamente)
                        .addGap(18, 18, 18)
                        .addComponent(labelQuirurgicamentePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelDatosPersonales1)
                    .addGroup(pestExamenSubLayout.createSequentialGroup()
                        .addComponent(labelCursoEnfermedad)
                        .addGap(18, 18, 18)
                        .addComponent(labelCursoEnfermedadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pestExamenSubLayout.createSequentialGroup()
                        .addComponent(labelMotivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelMotivoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        pestExamenSubLayout.setVerticalGroup(
            pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestExamenSubLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelDatosPersonales1)
                .addGap(50, 50, 50)
                .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMotivo)
                    .addComponent(labelMotivoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCursoEnfermedad)
                    .addComponent(labelCursoEnfermedadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestExamenSubLayout.createSequentialGroup()
                        .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelMedicamento)
                                .addComponent(labelCual))
                            .addComponent(labelCualMedicamentoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelHospitalizadoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelHospitalizado)
                                .addComponent(labelPorQue))
                            .addComponent(labelPorQuePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelMedicamentoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestExamenSubLayout.createSequentialGroup()
                        .addComponent(labelQuirurgicamente)
                        .addGap(32, 32, 32)
                        .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelDesdeCuando)
                                .addComponent(labelCuantosCigarrillos)
                                .addComponent(radioFuma))
                            .addComponent(labelDesdeCuandoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCuantosCigarrillosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pestExamenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radioToma)
                                .addComponent(labelQueCantidad))
                            .addComponent(labelQueCantidadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelQuirurgicamentePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(281, Short.MAX_VALUE))
        );

        pestVer.addTab("Examen subjetivo", pestExamenSub);

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
        radioEnfermedadRenal.setEnabled(false);
        radioEnfermedadRenal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEnfermedadRenalActionPerformed(evt);
            }
        });

        labelCuantasVecesOrinaDia.setBackground(new java.awt.Color(255, 255, 255));
        labelCuantasVecesOrinaDia.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCuantasVecesOrinaDia.setText("¿Cuántas orina al día veces?:");

        labelColorOrina.setBackground(new java.awt.Color(255, 255, 255));
        labelColorOrina.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelColorOrina.setText("¿De qué color?:");

        radioCalculosRenales1.setBackground(new java.awt.Color(255, 255, 255));
        radioCalculosRenales1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioCalculosRenales1.setText("Ha sufrido cálculos renales");
        radioCalculosRenales1.setEnabled(false);
        radioCalculosRenales1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCalculosRenales1ActionPerformed(evt);
            }
        });

        radioAcidezEstomacal1.setBackground(new java.awt.Color(255, 255, 255));
        radioAcidezEstomacal1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioAcidezEstomacal1.setText("Sufre Ud. de acidez estomacal");
        radioAcidezEstomacal1.setEnabled(false);
        radioAcidezEstomacal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAcidezEstomacal1ActionPerformed(evt);
            }
        });

        radioUlcerPeptica1.setBackground(new java.awt.Color(255, 255, 255));
        radioUlcerPeptica1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioUlcerPeptica1.setText("Ha tenido o tiene úlcera péptica");
        radioUlcerPeptica1.setEnabled(false);
        radioUlcerPeptica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUlcerPeptica1ActionPerformed(evt);
            }
        });

        radioDiarreasFrecuencia1.setBackground(new java.awt.Color(255, 255, 255));
        radioDiarreasFrecuencia1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioDiarreasFrecuencia1.setText("Sufre Ud. diarreas con frecuencia");
        radioDiarreasFrecuencia1.setEnabled(false);
        radioDiarreasFrecuencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDiarreasFrecuencia1ActionPerformed(evt);
            }
        });

        labelVecesDiaR.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelColorOrinaPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

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
                        .addComponent(labelCuantasVecesOrinaDia)
                        .addGap(18, 18, 18)
                        .addComponent(labelVecesDiaR, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(labelColorOrina)
                        .addGap(18, 18, 18)
                        .addComponent(labelColorOrinaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(348, Short.MAX_VALUE))
        );
        panelRenalesGastrointestinalesLayout.setVerticalGroup(
            panelRenalesGastrointestinalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRenalesGastrointestinalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRenalesGastrointestinales)
                .addGap(18, 18, 18)
                .addComponent(radioEnfermedadRenal)
                .addGap(18, 18, 18)
                .addGroup(panelRenalesGastrointestinalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRenalesGastrointestinalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCuantasVecesOrinaDia)
                        .addComponent(labelColorOrina))
                    .addComponent(labelVecesDiaR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelColorOrinaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(radioCalculosRenales1)
                .addGap(18, 18, 18)
                .addComponent(radioAcidezEstomacal1)
                .addGap(18, 18, 18)
                .addComponent(radioUlcerPeptica1)
                .addGap(18, 18, 18)
                .addComponent(radioDiarreasFrecuencia1)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        tabsAntecedentes.addTab("Renales y gastrointestinales", panelRenalesGastrointestinales);

        panelFemenino.setBackground(new java.awt.Color(255, 255, 255));

        labelFemenino.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelFemenino.setText("Femenino");

        labelMenstruacion1.setBackground(new java.awt.Color(255, 255, 255));
        labelMenstruacion1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelMenstruacion1.setText("Menstruación:");

        radioRegular1.setBackground(new java.awt.Color(255, 255, 255));
        radioRegular1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioRegular1.setText("Regular");
        radioRegular1.setEnabled(false);
        radioRegular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioRegular1ActionPerformed(evt);
            }
        });

        radioIrregular1.setBackground(new java.awt.Color(255, 255, 255));
        radioIrregular1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioIrregular1.setText("Irregular");
        radioIrregular1.setEnabled(false);
        radioIrregular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioIrregular1ActionPerformed(evt);
            }
        });

        radioEmbarazada1.setBackground(new java.awt.Color(255, 255, 255));
        radioEmbarazada1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioEmbarazada1.setText("Está embarazada");
        radioEmbarazada1.setEnabled(false);
        radioEmbarazada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEmbarazada1ActionPerformed(evt);
            }
        });

        labelMesesEmbarazo1.setBackground(new java.awt.Color(255, 255, 255));
        labelMesesEmbarazo1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelMesesEmbarazo1.setText("¿Cuántos meses?:");
        labelMesesEmbarazo1.setEnabled(false);

        radioPastillasAnticonceptivas1.setBackground(new java.awt.Color(255, 255, 255));
        radioPastillasAnticonceptivas1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioPastillasAnticonceptivas1.setText("Toma pastillas anticonceptivas");
        radioPastillasAnticonceptivas1.setEnabled(false);
        radioPastillasAnticonceptivas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPastillasAnticonceptivas1ActionPerformed(evt);
            }
        });

        radioMenopausia1.setBackground(new java.awt.Color(255, 255, 255));
        radioMenopausia1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioMenopausia1.setText("Presenta la menopausia");
        radioMenopausia1.setEnabled(false);
        radioMenopausia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMenopausia1ActionPerformed(evt);
            }
        });

        labelMesesEmbarazoR.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        radioNoAplicaFemenino.setBackground(new java.awt.Color(255, 255, 255));
        radioNoAplicaFemenino.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioNoAplicaFemenino.setText("No aplica");
        radioNoAplicaFemenino.setEnabled(false);
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
                        .addComponent(radioPastillasAnticonceptivas1)
                        .addGap(18, 18, 18)
                        .addComponent(radioMenopausia1))
                    .addGroup(panelFemeninoLayout.createSequentialGroup()
                        .addComponent(labelMenstruacion1)
                        .addGap(47, 47, 47)
                        .addComponent(radioRegular1)
                        .addGap(18, 18, 18)
                        .addComponent(radioIrregular1))
                    .addGroup(panelFemeninoLayout.createSequentialGroup()
                        .addComponent(labelFemenino)
                        .addGap(18, 18, 18)
                        .addComponent(radioNoAplicaFemenino))
                    .addGroup(panelFemeninoLayout.createSequentialGroup()
                        .addComponent(radioEmbarazada1)
                        .addGap(18, 18, 18)
                        .addComponent(labelMesesEmbarazo1)
                        .addGap(18, 18, 18)
                        .addComponent(labelMesesEmbarazoR, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(651, Short.MAX_VALUE))
        );
        panelFemeninoLayout.setVerticalGroup(
            panelFemeninoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFemeninoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFemeninoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFemenino)
                    .addComponent(radioNoAplicaFemenino))
                .addGap(18, 18, 18)
                .addGroup(panelFemeninoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioRegular1)
                    .addComponent(labelMenstruacion1)
                    .addComponent(radioIrregular1))
                .addGap(18, 18, 18)
                .addGroup(panelFemeninoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFemeninoLayout.createSequentialGroup()
                        .addGroup(panelFemeninoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioEmbarazada1)
                            .addComponent(labelMesesEmbarazo1))
                        .addGap(18, 18, 18)
                        .addGroup(panelFemeninoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioPastillasAnticonceptivas1)
                            .addComponent(radioMenopausia1)))
                    .addComponent(labelMesesEmbarazoR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(234, Short.MAX_VALUE))
        );

        tabsAntecedentes.addTab("Femenino", panelFemenino);

        panelCardiovasculares.setBackground(new java.awt.Color(255, 255, 255));

        labelCardiovasculares.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelCardiovasculares.setText("Cardiovasculares");

        radioNoAplicaCardiovasculares.setBackground(new java.awt.Color(255, 255, 255));
        radioNoAplicaCardiovasculares.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioNoAplicaCardiovasculares.setText("No aplica");
        radioNoAplicaCardiovasculares.setEnabled(false);
        radioNoAplicaCardiovasculares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoAplicaCardiovascularesActionPerformed(evt);
            }
        });

        radioSubirEscaleras.setBackground(new java.awt.Color(255, 255, 255));
        radioSubirEscaleras.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioSubirEscaleras.setText("Se cansa al subir escaleras");
        radioSubirEscaleras.setEnabled(false);
        radioSubirEscaleras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSubirEscalerasActionPerformed(evt);
            }
        });

        radioEdema.setBackground(new java.awt.Color(255, 255, 255));
        radioEdema.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioEdema.setText("Ha presentado edema de los miembros inferiores");
        radioEdema.setEnabled(false);
        radioEdema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEdemaActionPerformed(evt);
            }
        });

        radioPalpitaciones.setBackground(new java.awt.Color(255, 255, 255));
        radioPalpitaciones.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioPalpitaciones.setText("Ha tenido palpitaciones");
        radioPalpitaciones.setEnabled(false);
        radioPalpitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPalpitacionesActionPerformed(evt);
            }
        });

        radioDoloresPecho.setBackground(new java.awt.Color(255, 255, 255));
        radioDoloresPecho.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioDoloresPecho.setText("Dolores en el pecho");
        radioDoloresPecho.setEnabled(false);
        radioDoloresPecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDoloresPechoActionPerformed(evt);
            }
        });

        radioInfarto.setBackground(new java.awt.Color(255, 255, 255));
        radioInfarto.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioInfarto.setText("Ha sufrido algún infarto");
        radioInfarto.setEnabled(false);
        radioInfarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInfartoActionPerformed(evt);
            }
        });

        labelCuandoInfarto.setBackground(new java.awt.Color(255, 255, 255));
        labelCuandoInfarto.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCuandoInfarto.setText("¿Cuándo?:");

        radioEndocarditisBacteriana.setBackground(new java.awt.Color(255, 255, 255));
        radioEndocarditisBacteriana.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioEndocarditisBacteriana.setText("Ha sufrido o sufre Endocarditis Bacteriana");
        radioEndocarditisBacteriana.setEnabled(false);
        radioEndocarditisBacteriana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEndocarditisBacterianaActionPerformed(evt);
            }
        });

        radioValvulopatia.setBackground(new java.awt.Color(255, 255, 255));
        radioValvulopatia.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioValvulopatia.setText("Presenta alguna valvulopatía (soplos, prolapso valvular)");
        radioValvulopatia.setEnabled(false);
        radioValvulopatia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioValvulopatiaActionPerformed(evt);
            }
        });

        radioHipertenso.setBackground(new java.awt.Color(255, 255, 255));
        radioHipertenso.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioHipertenso.setText("Es Hipertenso");
        radioHipertenso.setEnabled(false);
        radioHipertenso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHipertensoActionPerformed(evt);
            }
        });

        labelHipotenso.setBackground(new java.awt.Color(255, 255, 255));
        labelHipotenso.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        labelHipotenso.setText("Es Hipotenso");
        labelHipotenso.setEnabled(false);
        labelHipotenso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelHipotensoActionPerformed(evt);
            }
        });

        radioTratamientoTension.setBackground(new java.awt.Color(255, 255, 255));
        radioTratamientoTension.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioTratamientoTension.setText("Está en tratamiento");
        radioTratamientoTension.setEnabled(false);
        radioTratamientoTension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTratamientoTensionActionPerformed(evt);
            }
        });

        labelCuandoInfartoR.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelCardiovascularesLayout = new javax.swing.GroupLayout(panelCardiovasculares);
        panelCardiovasculares.setLayout(panelCardiovascularesLayout);
        panelCardiovascularesLayout.setHorizontalGroup(
            panelCardiovascularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardiovascularesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCardiovascularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCardiovascularesLayout.createSequentialGroup()
                        .addComponent(radioHipertenso)
                        .addGap(18, 18, 18)
                        .addComponent(labelHipotenso)
                        .addGap(18, 18, 18)
                        .addComponent(radioTratamientoTension))
                    .addGroup(panelCardiovascularesLayout.createSequentialGroup()
                        .addComponent(radioPalpitaciones)
                        .addGap(18, 18, 18)
                        .addComponent(radioDoloresPecho))
                    .addComponent(radioEdema)
                    .addComponent(radioSubirEscaleras)
                    .addGroup(panelCardiovascularesLayout.createSequentialGroup()
                        .addComponent(labelCardiovasculares)
                        .addGap(18, 18, 18)
                        .addComponent(radioNoAplicaCardiovasculares))
                    .addComponent(radioEndocarditisBacteriana, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioValvulopatia)
                    .addGroup(panelCardiovascularesLayout.createSequentialGroup()
                        .addComponent(radioInfarto)
                        .addGap(18, 18, 18)
                        .addComponent(labelCuandoInfarto)
                        .addGap(18, 18, 18)
                        .addComponent(labelCuandoInfartoR, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(565, Short.MAX_VALUE))
        );
        panelCardiovascularesLayout.setVerticalGroup(
            panelCardiovascularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardiovascularesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCardiovascularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCardiovasculares)
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
                .addGroup(panelCardiovascularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCardiovascularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioInfarto)
                        .addComponent(labelCuandoInfarto))
                    .addComponent(labelCuandoInfartoR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(radioEndocarditisBacteriana)
                .addGap(18, 18, 18)
                .addComponent(radioValvulopatia)
                .addGap(18, 18, 18)
                .addGroup(panelCardiovascularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioHipertenso)
                    .addComponent(labelHipotenso)
                    .addComponent(radioTratamientoTension))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tabsAntecedentes.addTab("Cardiovasculares", panelCardiovasculares);

        panelAlergicos.setBackground(new java.awt.Color(255, 255, 255));
        panelAlergicos.setEnabled(false);

        labelAlérgicos.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelAlérgicos.setText("Alérgicos");

        radioAlergicoMedicamento.setBackground(new java.awt.Color(255, 255, 255));
        radioAlergicoMedicamento.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioAlergicoMedicamento.setText("Es alérgico a algún medicamento");
        radioAlergicoMedicamento.setEnabled(false);
        radioAlergicoMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAlergicoMedicamentoActionPerformed(evt);
            }
        });

        radioNoAplicaAlergicos.setBackground(new java.awt.Color(255, 255, 255));
        radioNoAplicaAlergicos.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioNoAplicaAlergicos.setText("No aplica");
        radioNoAplicaAlergicos.setEnabled(false);
        radioNoAplicaAlergicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoAplicaAlergicosActionPerformed(evt);
            }
        });

        labelCualMedicamento.setBackground(new java.awt.Color(255, 255, 255));
        labelCualMedicamento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCualMedicamento.setText("¿Cuál?:");

        radioUrticaria.setBackground(new java.awt.Color(255, 255, 255));
        radioUrticaria.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioUrticaria.setText("Ha presentado urticaria");
        radioUrticaria.setEnabled(false);
        radioUrticaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUrticariaActionPerformed(evt);
            }
        });

        radioDificultadTragar.setBackground(new java.awt.Color(255, 255, 255));
        radioDificultadTragar.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioDificultadTragar.setText("Dificultad para tragar");
        radioDificultadTragar.setEnabled(false);
        radioDificultadTragar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDificultadTragarActionPerformed(evt);
            }
        });

        radioDificultadRespirar.setBackground(new java.awt.Color(255, 255, 255));
        radioDificultadRespirar.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioDificultadRespirar.setText("Dificultad para respirar");
        radioDificultadRespirar.setEnabled(false);
        radioDificultadRespirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDificultadRespirarActionPerformed(evt);
            }
        });

        radioAsma.setBackground(new java.awt.Color(255, 255, 255));
        radioAsma.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioAsma.setText("Ha sufrido o sufre de Asma");
        radioAsma.setEnabled(false);
        radioAsma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAsmaActionPerformed(evt);
            }
        });

        labelCrisisAsma.setBackground(new java.awt.Color(255, 255, 255));
        labelCrisisAsma.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCrisisAsma.setText("última crisis:");

        labelRA.setBackground(new java.awt.Color(255, 255, 255));
        labelRA.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelRA.setText("Ha tenido alguna reacción a la anestesia local:");
        labelRA.setEnabled(false);

        labelCualMedicamentoR.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelRAR.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelUltimaCrisisR.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelAlergicosLayout = new javax.swing.GroupLayout(panelAlergicos);
        panelAlergicos.setLayout(panelAlergicosLayout);
        panelAlergicosLayout.setHorizontalGroup(
            panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlergicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlergicosLayout.createSequentialGroup()
                        .addComponent(labelRA)
                        .addGap(18, 18, 18)
                        .addComponent(labelRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAlergicosLayout.createSequentialGroup()
                        .addComponent(radioAlergicoMedicamento)
                        .addGap(18, 18, 18)
                        .addComponent(labelCualMedicamento)
                        .addGap(18, 18, 18)
                        .addComponent(labelCualMedicamentoR, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAlergicosLayout.createSequentialGroup()
                        .addComponent(labelAlérgicos)
                        .addGap(18, 18, 18)
                        .addComponent(radioNoAplicaAlergicos))
                    .addGroup(panelAlergicosLayout.createSequentialGroup()
                        .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioUrticaria)
                            .addComponent(radioDificultadRespirar))
                        .addGap(18, 18, 18)
                        .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAlergicosLayout.createSequentialGroup()
                                .addComponent(radioAsma)
                                .addGap(42, 42, 42)
                                .addComponent(labelCrisisAsma)
                                .addGap(18, 18, 18)
                                .addComponent(labelUltimaCrisisR, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(radioDificultadTragar))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        panelAlergicosLayout.setVerticalGroup(
            panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlergicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlérgicos)
                    .addComponent(radioNoAplicaAlergicos))
                .addGap(18, 18, 18)
                .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioAlergicoMedicamento)
                        .addComponent(labelCualMedicamento))
                    .addComponent(labelCualMedicamentoR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioUrticaria)
                    .addComponent(radioDificultadTragar))
                .addGap(18, 18, 18)
                .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlergicosLayout.createSequentialGroup()
                        .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioDificultadRespirar)
                            .addComponent(radioAsma)
                            .addComponent(labelCrisisAsma))
                        .addGap(18, 18, 18)
                        .addGroup(panelAlergicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRA)
                            .addComponent(labelRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelUltimaCrisisR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        tabsAntecedentes.addTab("Alérgicos", panelAlergicos);

        panelNutricionalesMetabolicos.setBackground(new java.awt.Color(255, 255, 255));

        labelNutricionalesMetabolicos.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelNutricionalesMetabolicos.setText("Nutricionales y Metabólicos");

        radioNoAplicaNM.setBackground(new java.awt.Color(255, 255, 255));
        radioNoAplicaNM.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioNoAplicaNM.setText("No aplica");
        radioNoAplicaNM.setEnabled(false);
        radioNoAplicaNM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoAplicaNMActionPerformed(evt);
            }
        });

        radioAnemia.setBackground(new java.awt.Color(255, 255, 255));
        radioAnemia.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioAnemia.setText("Ha padecido de anemia alguna vez");
        radioAnemia.setEnabled(false);
        radioAnemia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAnemiaActionPerformed(evt);
            }
        });

        radioPerdidoPeso.setBackground(new java.awt.Color(255, 255, 255));
        radioPerdidoPeso.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioPerdidoPeso.setText("Ha perdido peso");
        radioPerdidoPeso.setEnabled(false);
        radioPerdidoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPerdidoPesoActionPerformed(evt);
            }
        });

        radioDieta.setBackground(new java.awt.Color(255, 255, 255));
        radioDieta.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioDieta.setText("Se encuentra realizando alguna dieta");
        radioDieta.setEnabled(false);
        radioDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDietaActionPerformed(evt);
            }
        });

        radioSienteDecaimiento.setBackground(new java.awt.Color(255, 255, 255));
        radioSienteDecaimiento.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioSienteDecaimiento.setText("Siente decaimiento");
        radioSienteDecaimiento.setEnabled(false);
        radioSienteDecaimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSienteDecaimientoActionPerformed(evt);
            }
        });

        radioMalestarGeneral.setBackground(new java.awt.Color(255, 255, 255));
        radioMalestarGeneral.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioMalestarGeneral.setText("Malestar General");
        radioMalestarGeneral.setEnabled(false);
        radioMalestarGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMalestarGeneralActionPerformed(evt);
            }
        });

        radioFiebre.setBackground(new java.awt.Color(255, 255, 255));
        radioFiebre.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioFiebre.setText("Fiebre");
        radioFiebre.setEnabled(false);
        radioFiebre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFiebreActionPerformed(evt);
            }
        });

        radioDiabetico.setBackground(new java.awt.Color(255, 255, 255));
        radioDiabetico.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioDiabetico.setText("Es Diabético");
        radioDiabetico.setEnabled(false);
        radioDiabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDiabeticoActionPerformed(evt);
            }
        });

        radioTratamientoDiabetico.setBackground(new java.awt.Color(255, 255, 255));
        radioTratamientoDiabetico.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioTratamientoDiabetico.setText("Está en tratamiento");
        radioTratamientoDiabetico.setEnabled(false);
        radioTratamientoDiabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTratamientoDiabeticoActionPerformed(evt);
            }
        });

        radioOrinaNoche.setBackground(new java.awt.Color(255, 255, 255));
        radioOrinaNoche.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioOrinaNoche.setText("Se levanta a orinar de noche");
        radioOrinaNoche.setEnabled(false);
        radioOrinaNoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOrinaNocheActionPerformed(evt);
            }
        });

        labelCuantasVecesOrinaNoche.setBackground(new java.awt.Color(255, 255, 255));
        labelCuantasVecesOrinaNoche.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCuantasVecesOrinaNoche.setText("¿Cuántas veces?:");

        radioMuchaSed.setBackground(new java.awt.Color(255, 255, 255));
        radioMuchaSed.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioMuchaSed.setText("Siente mucha sed");
        radioMuchaSed.setEnabled(false);
        radioMuchaSed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMuchaSedActionPerformed(evt);
            }
        });

        radioInsomnio.setBackground(new java.awt.Color(255, 255, 255));
        radioInsomnio.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioInsomnio.setText("Sufre de insomnio");
        radioInsomnio.setEnabled(false);
        radioInsomnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInsomnioActionPerformed(evt);
            }
        });

        radioTiroides.setBackground(new java.awt.Color(255, 255, 255));
        radioTiroides.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioTiroides.setText("Ha padecido de la Tiroides");
        radioTiroides.setEnabled(false);
        radioTiroides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTiroidesActionPerformed(evt);
            }
        });

        labelOrinaNocheR.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

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
                        .addComponent(radioOrinaNoche)
                        .addGap(21, 21, 21)
                        .addComponent(labelCuantasVecesOrinaNoche)
                        .addGap(18, 18, 18)
                        .addComponent(labelOrinaNocheR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(radioMuchaSed))
                    .addGroup(panelNutricionalesMetabolicosLayout.createSequentialGroup()
                        .addComponent(radioAnemia)
                        .addGap(18, 18, 18)
                        .addComponent(radioPerdidoPeso)
                        .addGap(18, 18, 18)
                        .addComponent(radioDieta))
                    .addGroup(panelNutricionalesMetabolicosLayout.createSequentialGroup()
                        .addComponent(labelNutricionalesMetabolicos)
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
                        .addComponent(radioFiebre)))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        panelNutricionalesMetabolicosLayout.setVerticalGroup(
            panelNutricionalesMetabolicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNutricionalesMetabolicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNutricionalesMetabolicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNutricionalesMetabolicos)
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
                .addGroup(panelNutricionalesMetabolicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNutricionalesMetabolicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioOrinaNoche)
                        .addComponent(labelCuantasVecesOrinaNoche)
                        .addComponent(radioMuchaSed))
                    .addComponent(labelOrinaNocheR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNutricionalesMetabolicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioInsomnio)
                    .addComponent(radioTiroides))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        tabsAntecedentes.addTab("Nutricionales y Metabólicos", panelNutricionalesMetabolicos);

        panelInfecciosas.setBackground(new java.awt.Color(255, 255, 255));

        labelInfecciosas.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelInfecciosas.setText("Infecciosas");

        radioNoAplicaInfecciosas.setBackground(new java.awt.Color(255, 255, 255));
        radioNoAplicaInfecciosas.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioNoAplicaInfecciosas.setText("No aplica");
        radioNoAplicaInfecciosas.setEnabled(false);
        radioNoAplicaInfecciosas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoAplicaInfecciosasActionPerformed(evt);
            }
        });

        radioEnfermedadesVenereas.setBackground(new java.awt.Color(255, 255, 255));
        radioEnfermedadesVenereas.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioEnfermedadesVenereas.setText("Ha padecido enfermedades venéreas");
        radioEnfermedadesVenereas.setEnabled(false);
        radioEnfermedadesVenereas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEnfermedadesVenereasActionPerformed(evt);
            }
        });

        labelHaceCuantoVenereas.setBackground(new java.awt.Color(255, 255, 255));
        labelHaceCuantoVenereas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelHaceCuantoVenereas.setText("¿Hace cuánto tiempo?:");

        radioTransfusion.setBackground(new java.awt.Color(255, 255, 255));
        radioTransfusion.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioTransfusion.setText("Ha recibido alguna transfusión de sangre");
        radioTransfusion.setEnabled(false);
        radioTransfusion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTransfusionActionPerformed(evt);
            }
        });

        radioHepatitis.setBackground(new java.awt.Color(255, 255, 255));
        radioHepatitis.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioHepatitis.setText("Ha sufrido Hepatitis");
        radioHepatitis.setEnabled(false);
        radioHepatitis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHepatitisActionPerformed(evt);
            }
        });

        labelHaceCuantoHepatitis.setBackground(new java.awt.Color(255, 255, 255));
        labelHaceCuantoHepatitis.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelHaceCuantoHepatitis.setText("¿Hace cuánto tiempo?:");

        labelTipoHepatitis.setBackground(new java.awt.Color(255, 255, 255));
        labelTipoHepatitis.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelTipoHepatitis.setText("¿Qué tipo?:");

        radioOtraEnfermedadHepatica.setBackground(new java.awt.Color(255, 255, 255));
        radioOtraEnfermedadHepatica.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioOtraEnfermedadHepatica.setText("Ha padecido alguna otra enfermedad hepatica");
        radioOtraEnfermedadHepatica.setEnabled(false);
        radioOtraEnfermedadHepatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOtraEnfermedadHepaticaActionPerformed(evt);
            }
        });

        labelCualOtraHepatica.setBackground(new java.awt.Color(255, 255, 255));
        labelCualOtraHepatica.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCualOtraHepatica.setText("¿Cuál?:");

        radioTuberculosis.setBackground(new java.awt.Color(255, 255, 255));
        radioTuberculosis.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioTuberculosis.setText("Ha padecido de tuberculosis");
        radioTuberculosis.setEnabled(false);
        radioTuberculosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTuberculosisActionPerformed(evt);
            }
        });

        labelOtraHepaticaR.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelHaceCuantoVenereasR1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelHaceCuantoHepR1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelTipoHepatitisR1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelInfecciosasLayout = new javax.swing.GroupLayout(panelInfecciosas);
        panelInfecciosas.setLayout(panelInfecciosasLayout);
        panelInfecciosasLayout.setHorizontalGroup(
            panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfecciosasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioTuberculosis)
                    .addGroup(panelInfecciosasLayout.createSequentialGroup()
                        .addComponent(radioEnfermedadesVenereas)
                        .addGap(18, 18, 18)
                        .addComponent(labelHaceCuantoVenereas)
                        .addGap(18, 18, 18)
                        .addComponent(labelHaceCuantoVenereasR1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInfecciosasLayout.createSequentialGroup()
                        .addComponent(labelInfecciosas)
                        .addGap(18, 18, 18)
                        .addComponent(radioNoAplicaInfecciosas))
                    .addGroup(panelInfecciosasLayout.createSequentialGroup()
                        .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfecciosasLayout.createSequentialGroup()
                                .addComponent(radioHepatitis)
                                .addGap(18, 18, 18)
                                .addComponent(labelHaceCuantoHepatitis))
                            .addComponent(radioOtraEnfermedadHepatica)
                            .addComponent(radioTransfusion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfecciosasLayout.createSequentialGroup()
                                .addComponent(labelHaceCuantoHepR1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(labelTipoHepatitis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelTipoHepatitisR1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInfecciosasLayout.createSequentialGroup()
                                .addComponent(labelCualOtraHepatica)
                                .addGap(18, 18, 18)
                                .addComponent(labelOtraHepaticaR, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        panelInfecciosasLayout.setVerticalGroup(
            panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfecciosasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInfecciosas)
                    .addComponent(radioNoAplicaInfecciosas))
                .addGap(18, 18, 18)
                .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioEnfermedadesVenereas)
                        .addComponent(labelHaceCuantoVenereas))
                    .addComponent(labelHaceCuantoVenereasR1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(radioTransfusion)
                .addGap(18, 18, 18)
                .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfecciosasLayout.createSequentialGroup()
                        .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radioHepatitis)
                                .addComponent(labelHaceCuantoHepatitis)
                                .addComponent(labelTipoHepatitis))
                            .addComponent(labelTipoHepatitisR1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfecciosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radioOtraEnfermedadHepatica)
                                .addComponent(labelCualOtraHepatica))
                            .addComponent(labelOtraHepaticaR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(radioTuberculosis))
                    .addComponent(labelHaceCuantoHepR1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        tabsAntecedentes.addTab("Infecciosas", panelInfecciosas);

        panelNeurologicas.setBackground(new java.awt.Color(255, 255, 255));

        labelNeurológicas.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelNeurológicas.setText("Neurológicas");

        radioNoAplicaNeurologicas.setBackground(new java.awt.Color(255, 255, 255));
        radioNoAplicaNeurologicas.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioNoAplicaNeurologicas.setText("No aplica");
        radioNoAplicaNeurologicas.setEnabled(false);
        radioNoAplicaNeurologicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoAplicaNeurologicasActionPerformed(evt);
            }
        });

        radioConvulsiones.setBackground(new java.awt.Color(255, 255, 255));
        radioConvulsiones.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioConvulsiones.setText("Ha sufrido alguna vez convulsiones");
        radioConvulsiones.setEnabled(false);
        radioConvulsiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioConvulsionesActionPerformed(evt);
            }
        });

        labelCuantoTiempoConvulsiones.setBackground(new java.awt.Color(255, 255, 255));
        labelCuantoTiempoConvulsiones.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCuantoTiempoConvulsiones.setText("¿Hace cuánto tiempo?:");

        radioEpilepsia.setBackground(new java.awt.Color(255, 255, 255));
        radioEpilepsia.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioEpilepsia.setText("Sufre de epilepsia");
        radioEpilepsia.setEnabled(false);
        radioEpilepsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEpilepsiaActionPerformed(evt);
            }
        });

        labelFechaUltimaCrisis.setBackground(new java.awt.Color(255, 255, 255));
        labelFechaUltimaCrisis.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelFechaUltimaCrisis.setText("Fecha de la última crisis:");

        radioNeuralgiasNeuritis.setBackground(new java.awt.Color(255, 255, 255));
        radioNeuralgiasNeuritis.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioNeuralgiasNeuritis.setText("Ha sentido neuralgias o neuritis en la cara");
        radioNeuralgiasNeuritis.setEnabled(false);
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
        radioParestesia.setEnabled(false);
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
        radioCefaleas.setEnabled(false);
        radioCefaleas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCefaleasActionPerformed(evt);
            }
        });

        labelFechaCrisisR.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelTiempoConvulsiones.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelNeurologicasLayout = new javax.swing.GroupLayout(panelNeurologicas);
        panelNeurologicas.setLayout(panelNeurologicasLayout);
        panelNeurologicasLayout.setHorizontalGroup(
            panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNeurologicasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNeurologicasLayout.createSequentialGroup()
                        .addComponent(labelNeurológicas)
                        .addGap(18, 18, 18)
                        .addComponent(radioNoAplicaNeurologicas))
                    .addGroup(panelNeurologicasLayout.createSequentialGroup()
                        .addComponent(radioConvulsiones)
                        .addGap(18, 18, 18)
                        .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNeurologicasLayout.createSequentialGroup()
                                .addComponent(labelFechaUltimaCrisis)
                                .addGap(18, 18, 18)
                                .addComponent(labelFechaCrisisR, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelNeurologicasLayout.createSequentialGroup()
                                .addComponent(labelCuantoTiempoConvulsiones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelTiempoConvulsiones, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addContainerGap(398, Short.MAX_VALUE))
        );
        panelNeurologicasLayout.setVerticalGroup(
            panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNeurologicasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNeurológicas)
                    .addComponent(radioNoAplicaNeurologicas))
                .addGap(18, 18, 18)
                .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNeurologicasLayout.createSequentialGroup()
                        .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioConvulsiones)
                            .addComponent(labelCuantoTiempoConvulsiones))
                        .addGap(18, 18, 18)
                        .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNeurologicasLayout.createSequentialGroup()
                                .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioEpilepsia)
                                    .addComponent(labelFechaUltimaCrisis))
                                .addGap(18, 18, 18)
                                .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioNeuralgiasNeuritis)
                                    .addComponent(radioParalisisFacial))
                                .addGap(18, 18, 18)
                                .addGroup(panelNeurologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioParestesia)
                                    .addComponent(radioSeAltera))
                                .addGap(18, 18, 18)
                                .addComponent(radioCefaleas))
                            .addComponent(labelFechaCrisisR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelTiempoConvulsiones, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        tabsAntecedentes.addTab("Neurológicas", panelNeurologicas);

        panelHematologicas.setBackground(new java.awt.Color(255, 255, 255));

        labelHematologicas.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelHematologicas.setText("Hematológicas");

        radioNoAplicaHematologicas.setBackground(new java.awt.Color(255, 255, 255));
        radioNoAplicaHematologicas.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioNoAplicaHematologicas.setText("No aplica");
        radioNoAplicaHematologicas.setEnabled(false);
        radioNoAplicaHematologicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoAplicaHematologicasActionPerformed(evt);
            }
        });

        radioHemorragias.setBackground(new java.awt.Color(255, 255, 255));
        radioHemorragias.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioHemorragias.setText("Ha sufrido alguna hemorragias importantes");
        radioHemorragias.setEnabled(false);
        radioHemorragias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHemorragiasActionPerformed(evt);
            }
        });

        labelCausaHemorragia.setBackground(new java.awt.Color(255, 255, 255));
        labelCausaHemorragia.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelCausaHemorragia.setText("Causa:");

        labelDuracionHemorragia1.setBackground(new java.awt.Color(255, 255, 255));
        labelDuracionHemorragia1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelDuracionHemorragia1.setText("Duración:");

        radioHematomas.setBackground(new java.awt.Color(255, 255, 255));
        radioHematomas.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioHematomas.setText("Presenta hematomas espontáneos en la piel");
        radioHematomas.setEnabled(false);
        radioHematomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHematomasActionPerformed(evt);
            }
        });

        radioSangranEncias.setBackground(new java.awt.Color(255, 255, 255));
        radioSangranEncias.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioSangranEncias.setText("Le sangran las encías espontáneamente");
        radioSangranEncias.setEnabled(false);
        radioSangranEncias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSangranEnciasActionPerformed(evt);
            }
        });

        radioSangraNariz.setBackground(new java.awt.Color(255, 255, 255));
        radioSangraNariz.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioSangraNariz.setText("Sangra por la nariz frecuentemente");
        radioSangraNariz.setEnabled(false);
        radioSangraNariz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSangraNarizActionPerformed(evt);
            }
        });

        labelCausaHemorragiaR.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelDuracionHemorragia.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

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
                            .addComponent(radioHemorragias)
                            .addGroup(panelHematologicasLayout.createSequentialGroup()
                                .addComponent(labelHematologicas)
                                .addGap(18, 18, 18)
                                .addComponent(radioNoAplicaHematologicas)))
                        .addGap(18, 18, 18)
                        .addComponent(labelCausaHemorragia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelCausaHemorragiaR, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(labelDuracionHemorragia1)
                        .addGap(18, 18, 18)
                        .addComponent(labelDuracionHemorragia, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(labelHematologicas)
                    .addComponent(radioNoAplicaHematologicas))
                .addGap(18, 18, 18)
                .addGroup(panelHematologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHematologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioHemorragias)
                        .addComponent(labelCausaHemorragia)
                        .addComponent(labelDuracionHemorragia1))
                    .addComponent(labelCausaHemorragiaR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDuracionHemorragia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelHematologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioHematomas)
                    .addComponent(radioSangranEncias))
                .addGap(18, 18, 18)
                .addComponent(radioSangraNariz)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        tabsAntecedentes.addTab("Hematológicas", panelHematologicas);

        panelFamiliares.setBackground(new java.awt.Color(255, 255, 255));

        labelFamiliares.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelFamiliares.setText("Familiares");

        radioFamiliares.setBackground(new java.awt.Color(255, 255, 255));
        radioFamiliares.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioFamiliares.setText("No aplica");
        radioFamiliares.setEnabled(false);
        radioFamiliares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFamiliaresActionPerformed(evt);
            }
        });

        radioCancer.setBackground(new java.awt.Color(255, 255, 255));
        radioCancer.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioCancer.setText("Cáncer");
        radioCancer.setEnabled(false);
        radioCancer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCancerActionPerformed(evt);
            }
        });

        labelTipoCancer.setBackground(new java.awt.Color(255, 255, 255));
        labelTipoCancer.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelTipoCancer.setText("Tipo:");

        radioEnfPulmonares.setBackground(new java.awt.Color(255, 255, 255));
        radioEnfPulmonares.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioEnfPulmonares.setText("Enf. Pulmonares");
        radioEnfPulmonares.setEnabled(false);
        radioEnfPulmonares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEnfPulmonaresActionPerformed(evt);
            }
        });

        labelTipoEnfPulmonares.setBackground(new java.awt.Color(255, 255, 255));
        labelTipoEnfPulmonares.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelTipoEnfPulmonares.setText("Tipo:");

        radioDiabetes.setBackground(new java.awt.Color(255, 255, 255));
        radioDiabetes.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioDiabetes.setText("Diabetes");
        radioDiabetes.setEnabled(false);
        radioDiabetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDiabetesActionPerformed(evt);
            }
        });

        radioEnfCardiovasculares.setBackground(new java.awt.Color(255, 255, 255));
        radioEnfCardiovasculares.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioEnfCardiovasculares.setText("Enf. Cardiovasculares");
        radioEnfCardiovasculares.setEnabled(false);
        radioEnfCardiovasculares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEnfCardiovascularesActionPerformed(evt);
            }
        });

        radioEnfHepaticas.setBackground(new java.awt.Color(255, 255, 255));
        radioEnfHepaticas.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        radioEnfHepaticas.setText("Enf. Hepáticas");
        radioEnfHepaticas.setEnabled(false);
        radioEnfHepaticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEnfHepaticasActionPerformed(evt);
            }
        });

        labelTipoEnfHepaticas.setBackground(new java.awt.Color(255, 255, 255));
        labelTipoEnfHepaticas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelTipoEnfHepaticas.setText("Tipo:");

        labelOtros.setBackground(new java.awt.Color(255, 255, 255));
        labelOtros.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelOtros.setText("Otros:");

        labelTipoEnfCardiovasculares.setBackground(new java.awt.Color(255, 255, 255));
        labelTipoEnfCardiovasculares.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelTipoEnfCardiovasculares.setText("Tipo:");

        labelTipoHR.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelTipoCardioR.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelTipoDR.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelTipoPulR.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelTipoCanR.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelOtrosR4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelFamiliaresLayout = new javax.swing.GroupLayout(panelFamiliares);
        panelFamiliares.setLayout(panelFamiliaresLayout);
        panelFamiliaresLayout.setHorizontalGroup(
            panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFamiliaresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFamiliaresLayout.createSequentialGroup()
                        .addComponent(radioDiabetes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelTipoDR, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFamiliaresLayout.createSequentialGroup()
                        .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFamiliares)
                            .addComponent(radioCancer))
                        .addGap(18, 18, 18)
                        .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioFamiliares)
                            .addGroup(panelFamiliaresLayout.createSequentialGroup()
                                .addComponent(labelTipoCancer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelTipoCanR, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelFamiliaresLayout.createSequentialGroup()
                        .addComponent(radioEnfHepaticas)
                        .addGap(18, 18, 18)
                        .addComponent(labelTipoEnfHepaticas)
                        .addGap(18, 18, 18)
                        .addComponent(labelTipoHR, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFamiliaresLayout.createSequentialGroup()
                        .addComponent(radioEnfCardiovasculares)
                        .addGap(18, 18, 18)
                        .addComponent(labelTipoEnfCardiovasculares)
                        .addGap(18, 18, 18)
                        .addComponent(labelTipoCardioR, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFamiliaresLayout.createSequentialGroup()
                        .addComponent(radioEnfPulmonares)
                        .addGap(18, 18, 18)
                        .addComponent(labelTipoEnfPulmonares)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelTipoPulR, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFamiliaresLayout.createSequentialGroup()
                        .addComponent(labelOtros)
                        .addGap(18, 18, 18)
                        .addComponent(labelOtrosR4, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        panelFamiliaresLayout.setVerticalGroup(
            panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFamiliaresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFamiliares)
                    .addComponent(radioFamiliares))
                .addGap(18, 18, 18)
                .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioCancer)
                        .addComponent(labelTipoCancer)
                        .addComponent(radioEnfPulmonares)
                        .addComponent(labelTipoEnfPulmonares))
                    .addComponent(labelTipoPulR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTipoCanR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioDiabetes)
                        .addComponent(radioEnfCardiovasculares)
                        .addComponent(labelTipoEnfCardiovasculares))
                    .addComponent(labelTipoCardioR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTipoDR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioEnfHepaticas)
                        .addComponent(labelTipoEnfHepaticas)
                        .addComponent(labelOtros))
                    .addComponent(labelTipoHR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOtrosR4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(234, 234, 234))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pestAntecedentesLayout.setVerticalGroup(
            pestAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestAntecedentesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelAntecedentes)
                .addGap(18, 18, 18)
                .addComponent(tabsAntecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        pestVer.addTab("Antecedentes", pestAntecedentes);

        pestExamenCli.setBackground(new java.awt.Color(255, 255, 255));

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
        txtLabios.setEnabled(false);
        jScrollPane2.setViewportView(txtLabios);

        labelFrenillosLabiales.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelFrenillosLabiales.setText("Frenillos labiales:");

        labelVestibuloBucal.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelVestibuloBucal.setText("Vestíbulo bucal:");

        labelMucosaPalatina.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelMucosaPalatina.setText("Mucosa palatina:");

        labelMucosaPisoBoca.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelMucosaPisoBoca.setText("Mucosa del piso de la boca:");

        txtMucosaPisoBoca.setColumns(20);
        txtMucosaPisoBoca.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtMucosaPisoBoca.setRows(5);
        txtMucosaPisoBoca.setEnabled(false);
        jScrollPane3.setViewportView(txtMucosaPisoBoca);

        labelFrenilloLingual.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelFrenilloLingual.setText("Frenillo lingual:");

        labelLengua.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelLengua.setText("Lengua");

        labelCaraDorsal.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelCaraDorsal.setText("Cara dorsal:");

        labelCaraVentral.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelCaraVentral.setText("Cara ventral:");

        labelBordesLaterales.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelBordesLaterales.setText("Bordes laterales:");

        labelEncia.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelEncia.setText("Encía:");

        labelDientes.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelDientes.setText("Dientes:");

        txtDientes.setColumns(20);
        txtDientes.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtDientes.setRows(5);
        txtDientes.setEnabled(false);
        jScrollPane4.setViewportView(txtDientes);

        labelFrenillosLabialesR.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        labelVestibuloBucalR.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        labelMucosaPalatinaR.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        labelBordesLateralesR.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        labelFrenilloLingualR.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        labelCaraDorsalR.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        labelCaraVentralR1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        labelEnciasR.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        javax.swing.GroupLayout tabExamenCavidadBucalLayout = new javax.swing.GroupLayout(tabExamenCavidadBucal);
        tabExamenCavidadBucal.setLayout(tabExamenCavidadBucalLayout);
        tabExamenCavidadBucalLayout.setHorizontalGroup(
            tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                        .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDientes))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                        .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLengua)
                            .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                                .addComponent(labelEncia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelEnciasR, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                                .addComponent(labelBordesLaterales)
                                .addGap(18, 18, 18)
                                .addComponent(labelBordesLateralesR, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                                .addComponent(labelCaraVentral)
                                .addGap(18, 18, 18)
                                .addComponent(labelCaraVentralR1, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                                .addComponent(labelCaraDorsal)
                                .addGap(18, 18, 18)
                                .addComponent(labelCaraDorsalR, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                                .addComponent(labelFrenilloLingual)
                                .addGap(18, 18, 18)
                                .addComponent(labelFrenilloLingualR, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelPalpacionGanglios2)
                                .addComponent(labelLabios)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                                    .addComponent(labelFrenillosLabiales)
                                    .addGap(18, 18, 18)
                                    .addComponent(labelFrenillosLabialesR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                                    .addComponent(labelVestibuloBucal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(labelVestibuloBucalR, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelMucosaPisoBoca)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                                .addComponent(labelMucosaPalatina)
                                .addGap(18, 18, 18)
                                .addComponent(labelMucosaPalatinaR, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 56, Short.MAX_VALUE))))
        );
        tabExamenCavidadBucalLayout.setVerticalGroup(
            tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPalpacionGanglios2)
                .addGap(18, 18, 18)
                .addComponent(labelLabios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFrenillosLabiales)
                    .addComponent(labelFrenillosLabialesR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelVestibuloBucal)
                    .addComponent(labelVestibuloBucalR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                        .addComponent(labelMucosaPalatina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelMucosaPisoBoca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelMucosaPalatinaR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFrenilloLingual)
                    .addComponent(labelFrenilloLingualR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(labelLengua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCaraDorsal)
                    .addComponent(labelCaraDorsalR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                        .addComponent(labelCaraVentral)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelBordesLaterales)
                            .addComponent(labelBordesLateralesR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(tabExamenCavidadBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabExamenCavidadBucalLayout.createSequentialGroup()
                                .addComponent(labelEncia)
                                .addGap(27, 27, 27)
                                .addComponent(labelDientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelEnciasR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelCaraVentralR1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        scrollExamenCavidadBucal.setViewportView(tabExamenCavidadBucal);

        tabExamenesClinicos.addTab("Examen de la Cavidad Bucal", scrollExamenCavidadBucal);

        tabTensionArterial.setBackground(new java.awt.Color(255, 255, 255));

        labelTensionArterial.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelTensionArterial.setText("Tensión arterial:");

        labelMaxima.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelMaxima.setText("Máxima:");

        labelMMHG.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelMMHG.setText("mmHg");

        labelMinima.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelMinima.setText("Mínima:");

        labelMMHG1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelMMHG1.setText("mmHg");

        labelMinimaR.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        labelMaximaR.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        labelPresentaTension.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        javax.swing.GroupLayout tabTensionArterialLayout = new javax.swing.GroupLayout(tabTensionArterial);
        tabTensionArterial.setLayout(tabTensionArterialLayout);
        tabTensionArterialLayout.setHorizontalGroup(
            tabTensionArterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTensionArterialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabTensionArterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTensionArterial)
                    .addGroup(tabTensionArterialLayout.createSequentialGroup()
                        .addComponent(labelMaxima)
                        .addGap(18, 18, 18)
                        .addComponent(labelMaximaR, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(labelMMHG)
                        .addGap(30, 30, 30)
                        .addComponent(labelMinima)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelMinimaR, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMMHG1))
                    .addComponent(labelPresentaTension, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(413, Short.MAX_VALUE))
        );
        tabTensionArterialLayout.setVerticalGroup(
            tabTensionArterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTensionArterialLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(labelPresentaTension, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTensionArterial)
                .addGap(18, 18, 18)
                .addGroup(tabTensionArterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMaximaR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMinimaR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabTensionArterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelMaxima)
                        .addComponent(labelMMHG)
                        .addComponent(labelMinima)
                        .addComponent(labelMMHG1)))
                .addContainerGap(381, Short.MAX_VALUE))
        );

        tabExamenesClinicos.addTab("Tensión Arterial", tabTensionArterial);

        tabPalpacion.setBackground(new java.awt.Color(255, 255, 255));

        labelPalpacionGanglios.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelPalpacionGanglios.setText("Palpación de los ganglios:");

        labelLocalizacion.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelLocalizacion.setText("Localización:");

        radioPalpables.setBackground(new java.awt.Color(255, 255, 255));
        radioPalpables.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        radioPalpables.setText("Palpables");
        radioPalpables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPalpablesActionPerformed(evt);
            }
        });

        labelCaracteristicas.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelCaracteristicas.setText("Características:");

        labelCaracteristicasR.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        labelLocalizacionR1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        labelPresentaPalpacion.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        javax.swing.GroupLayout tabPalpacionLayout = new javax.swing.GroupLayout(tabPalpacion);
        tabPalpacion.setLayout(tabPalpacionLayout);
        tabPalpacionLayout.setHorizontalGroup(
            tabPalpacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPalpacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPalpacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabPalpacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(tabPalpacionLayout.createSequentialGroup()
                            .addComponent(radioPalpables)
                            .addGap(18, 18, 18)
                            .addComponent(labelLocalizacion)
                            .addGap(18, 18, 18)
                            .addComponent(labelLocalizacionR1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labelPalpacionGanglios)
                        .addGroup(tabPalpacionLayout.createSequentialGroup()
                            .addComponent(labelCaracteristicas)
                            .addGap(18, 18, 18)
                            .addComponent(labelCaracteristicasR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(labelPresentaPalpacion, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        tabPalpacionLayout.setVerticalGroup(
            tabPalpacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPalpacionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelPresentaPalpacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPalpacionGanglios)
                .addGap(18, 18, 18)
                .addGroup(tabPalpacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabPalpacionLayout.createSequentialGroup()
                        .addGroup(tabPalpacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioPalpables)
                            .addComponent(labelLocalizacion))
                        .addGap(18, 18, 18)
                        .addGroup(tabPalpacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCaracteristicas)
                            .addComponent(labelCaracteristicasR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelLocalizacionR1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(320, Short.MAX_VALUE))
        );

        tabExamenesClinicos.addTab("Palpación de los ganglios", tabPalpacion);

        labelExamenClinico3.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        labelExamenClinico3.setText("IV. Examen clínico");

        javax.swing.GroupLayout pestExamenCliLayout = new javax.swing.GroupLayout(pestExamenCli);
        pestExamenCli.setLayout(pestExamenCliLayout);
        pestExamenCliLayout.setHorizontalGroup(
            pestExamenCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestExamenCliLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pestExamenCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelExamenClinico3)
                    .addComponent(tabExamenesClinicos, javax.swing.GroupLayout.PREFERRED_SIZE, 1132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        pestExamenCliLayout.setVerticalGroup(
            pestExamenCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestExamenCliLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelExamenClinico3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabExamenesClinicos, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pestVer.addTab("Examen clínico", pestExamenCli);

        pestExamenCom.setBackground(new java.awt.Color(255, 255, 255));

        labelExamenCom.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        labelExamenCom.setText("V. Exámenes complementarios");

        tabsExamenesCom.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        tabExamenRadiografico.setBackground(new java.awt.Color(255, 255, 255));
        tabExamenRadiografico.setAutoscrolls(true);

        labelRxPanoramica.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelRxPanoramica.setText("Rx. Panorámica");

        txtRxPanoramica.setColumns(20);
        txtRxPanoramica.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtRxPanoramica.setRows(5);
        txtRxPanoramica.setEnabled(false);
        jScrollPane9.setViewportView(txtRxPanoramica);

        labelRxPeriapical.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelRxPeriapical.setText("Rx. Periapical");

        txtRxPeriapical.setColumns(20);
        txtRxPeriapical.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtRxPeriapical.setRows(5);
        txtRxPeriapical.setEnabled(false);
        jScrollPane10.setViewportView(txtRxPeriapical);

        labelRxOclusal.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelRxOclusal.setText("Rx. Oclusal");

        txtRxOclusal.setColumns(20);
        txtRxOclusal.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtRxOclusal.setRows(5);
        txtRxOclusal.setEnabled(false);
        jScrollPane11.setViewportView(txtRxOclusal);

        labelPresentaExamenRad.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N

        javax.swing.GroupLayout tabExamenRadiograficoLayout = new javax.swing.GroupLayout(tabExamenRadiografico);
        tabExamenRadiografico.setLayout(tabExamenRadiograficoLayout);
        tabExamenRadiograficoLayout.setHorizontalGroup(
            tabExamenRadiograficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabExamenRadiograficoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabExamenRadiograficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRxOclusal)
                    .addComponent(labelRxPeriapical)
                    .addComponent(labelRxPanoramica)
                    .addGroup(tabExamenRadiograficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1113, Short.MAX_VALUE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(labelPresentaExamenRad, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        tabExamenRadiograficoLayout.setVerticalGroup(
            tabExamenRadiograficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabExamenRadiograficoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPresentaExamenRad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(labelRxPanoramica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(labelRxPeriapical)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(labelRxOclusal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        tabsExamenesCom.addTab("Examen Radiográfico", tabExamenRadiografico);

        tabExamenLab.setBackground(new java.awt.Color(255, 255, 255));

        labelPerfilHematologico.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelPerfilHematologico.setText("Perfil hematológico:");

        labelPerfilCoagulacion.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelPerfilCoagulacion.setText("Perfil coagulación:");

        labelGlicemia.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelGlicemia.setText("Glicemia:");

        labelVDRL.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelVDRL.setText("VDRL:");

        labelVIH.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelVIH.setText("VIH:");

        labelPCR.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        labelPresentaExamenLab.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N

        labelPHR1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        labelGlicemiaR.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        labelVDRLR.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        labelVIHR.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        javax.swing.GroupLayout tabExamenLabLayout = new javax.swing.GroupLayout(tabExamenLab);
        tabExamenLab.setLayout(tabExamenLabLayout);
        tabExamenLabLayout.setHorizontalGroup(
            tabExamenLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabExamenLabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tabExamenLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabExamenLabLayout.createSequentialGroup()
                        .addComponent(labelPerfilCoagulacion)
                        .addGap(18, 18, 18)
                        .addComponent(labelPCR, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabExamenLabLayout.createSequentialGroup()
                        .addComponent(labelGlicemia)
                        .addGap(18, 18, 18)
                        .addComponent(labelGlicemiaR, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(labelVDRL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelVDRLR, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(labelVIH)
                        .addGap(18, 18, 18)
                        .addComponent(labelVIHR, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabExamenLabLayout.createSequentialGroup()
                        .addComponent(labelPerfilHematologico)
                        .addGap(18, 18, 18)
                        .addComponent(labelPHR1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(163, 163, 163))
            .addGroup(tabExamenLabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPresentaExamenLab, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabExamenLabLayout.setVerticalGroup(
            tabExamenLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabExamenLabLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelPresentaExamenLab, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tabExamenLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPerfilHematologico)
                    .addComponent(labelPHR1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(tabExamenLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPerfilCoagulacion)
                    .addComponent(labelPCR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(tabExamenLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelVIH)
                    .addGroup(tabExamenLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelGlicemia)
                        .addComponent(labelVDRL))
                    .addComponent(labelGlicemiaR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVDRLR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVIHR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(402, Short.MAX_VALUE))
        );

        tabsExamenesCom.addTab("Examen Laboratorios", tabExamenLab);

        javax.swing.GroupLayout pestExamenComLayout = new javax.swing.GroupLayout(pestExamenCom);
        pestExamenCom.setLayout(pestExamenComLayout);
        pestExamenComLayout.setHorizontalGroup(
            pestExamenComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestExamenComLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pestExamenComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelExamenCom)
                    .addComponent(tabsExamenesCom, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pestExamenComLayout.setVerticalGroup(
            pestExamenComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestExamenComLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelExamenCom)
                .addGap(30, 30, 30)
                .addComponent(tabsExamenesCom, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pestVer.addTab("Exámenes complementarios", pestExamenCom);

        pestDiaTra.setBackground(new java.awt.Color(255, 255, 255));

        labelDiaTra.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        labelDiaTra.setText("VI. Diagnóstico y tratamiento");

        tabsDiaTra.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        tabDiagnostico.setBackground(new java.awt.Color(255, 255, 255));

        labelPresuntivo.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelPresuntivo.setText("Presuntivo:");

        txtPresuntivo.setColumns(20);
        txtPresuntivo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtPresuntivo.setRows(5);
        txtPresuntivo.setEnabled(false);
        jScrollPane12.setViewportView(txtPresuntivo);

        labelHistopatologico.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelHistopatologico.setText("Estudio histopatológico:");

        txtHistopatologico.setColumns(20);
        txtHistopatologico.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtHistopatologico.setRows(5);
        txtHistopatologico.setEnabled(false);
        jScrollPane13.setViewportView(txtHistopatologico);

        txtDefinitivo.setColumns(20);
        txtDefinitivo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtDefinitivo.setRows(5);
        txtDefinitivo.setEnabled(false);
        jScrollPane14.setViewportView(txtDefinitivo);

        labelDefinitivo.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        labelDefinitivo.setText("Definitivo:");

        labelRxPanoramica3.setFont(new java.awt.Font("Nirmala UI", 1, 25)); // NOI18N
        labelRxPanoramica3.setText("Diagnóstico");

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
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        tabDiagnosticoLayout.setVerticalGroup(
            tabDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabDiagnosticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRxPanoramica3)
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
        txtPlanTratamiento.setEnabled(false);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        txtObservaciones.setEnabled(false);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout pestDiaTraLayout = new javax.swing.GroupLayout(pestDiaTra);
        pestDiaTra.setLayout(pestDiaTraLayout);
        pestDiaTraLayout.setHorizontalGroup(
            pestDiaTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestDiaTraLayout.createSequentialGroup()
                .addGroup(pestDiaTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestDiaTraLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(labelDiaTra))
                    .addGroup(pestDiaTraLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(tabsDiaTra, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        pestDiaTraLayout.setVerticalGroup(
            pestDiaTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestDiaTraLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelDiaTra)
                .addGap(31, 31, 31)
                .addComponent(tabsDiaTra, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        pestVer.addTab("Diagnóstico y tratamiento", pestDiaTra);

        panelInfo.add(pestVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -28, 1200, 810));

        getContentPane().add(panelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1200, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioFumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFumaActionPerformed

    private void radioTomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTomaActionPerformed

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

    private void radioRegular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioRegular1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioRegular1ActionPerformed

    private void radioIrregular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioIrregular1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioIrregular1ActionPerformed

    private void radioEmbarazada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEmbarazada1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioEmbarazada1ActionPerformed

    private void radioPastillasAnticonceptivas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPastillasAnticonceptivas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPastillasAnticonceptivas1ActionPerformed

    private void radioMenopausia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMenopausia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMenopausia1ActionPerformed

    private void radioNoAplicaCardiovascularesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoAplicaCardiovascularesActionPerformed
        // TODO add your handling code here:
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
        // TODO add your handling code here:
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

    private void labelHipotensoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelHipotensoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelHipotensoActionPerformed

    private void radioTratamientoTensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTratamientoTensionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTratamientoTensionActionPerformed

    private void radioNoAplicaNMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoAplicaNMActionPerformed
        // TODO add your handling code here:
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
        // TODO add your handling code here:
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

    private void radioNoAplicaNeurologicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoAplicaNeurologicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNoAplicaNeurologicasActionPerformed

    private void radioConvulsionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioConvulsionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioConvulsionesActionPerformed

    private void radioEpilepsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEpilepsiaActionPerformed
        // TODO add your handling code here:
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
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNoAplicaHematologicasActionPerformed

    private void radioHemorragiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHemorragiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioHemorragiasActionPerformed

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
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFamiliaresActionPerformed

    private void radioEnfPulmonaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEnfPulmonaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioEnfPulmonaresActionPerformed

    private void radioDiabetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDiabetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDiabetesActionPerformed

    private void radioEnfCardiovascularesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEnfCardiovascularesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioEnfCardiovascularesActionPerformed

    private void radioEnfHepaticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEnfHepaticasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioEnfHepaticasActionPerformed

    private void radioAsmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAsmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioAsmaActionPerformed

    private void radioDificultadRespirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDificultadRespirarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDificultadRespirarActionPerformed

    private void radioDificultadTragarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDificultadTragarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDificultadTragarActionPerformed

    private void radioUrticariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUrticariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioUrticariaActionPerformed

    private void radioNoAplicaAlergicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoAplicaAlergicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNoAplicaAlergicosActionPerformed

    private void radioAlergicoMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAlergicoMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioAlergicoMedicamentoActionPerformed

    private void radioPalpablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPalpablesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPalpablesActionPerformed

    private void botonDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDatosPersonalesActionPerformed
        pestVer.setSelectedIndex(0);
    }//GEN-LAST:event_botonDatosPersonalesActionPerformed

    private void botonExamenSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExamenSubActionPerformed
        pestVer.setSelectedIndex(1);
    }//GEN-LAST:event_botonExamenSubActionPerformed

    private void botonAntecedentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAntecedentesActionPerformed
        pestVer.setSelectedIndex(2);
    }//GEN-LAST:event_botonAntecedentesActionPerformed

    private void botonExamenCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExamenCliActionPerformed
        pestVer.setSelectedIndex(3);
    }//GEN-LAST:event_botonExamenCliActionPerformed

    private void botonExamenComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExamenComActionPerformed
        pestVer.setSelectedIndex(4);
    }//GEN-LAST:event_botonExamenComActionPerformed

    private void botonDiaTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDiaTraActionPerformed
        pestVer.setSelectedIndex(5);
    }//GEN-LAST:event_botonDiaTraActionPerformed

    private void radioNoAplicaFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoAplicaFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNoAplicaFemeninoActionPerformed

    private void radioTuberculosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTuberculosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTuberculosisActionPerformed

    private void radioOtraEnfermedadHepaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOtraEnfermedadHepaticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOtraEnfermedadHepaticaActionPerformed

    private void radioHepatitisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHepatitisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioHepatitisActionPerformed

    private void radioTransfusionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTransfusionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTransfusionActionPerformed

    private void radioEnfermedadesVenereasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEnfermedadesVenereasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioEnfermedadesVenereasActionPerformed

    private void radioNoAplicaInfecciosasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoAplicaInfecciosasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNoAplicaInfecciosasActionPerformed

    private void radioCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCancerActionPerformed

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
            java.util.logging.Logger.getLogger(VerConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAntecedentes;
    private javax.swing.JButton botonDatosPersonales;
    private javax.swing.JButton botonDiaTra;
    private javax.swing.JButton botonExamenCli;
    private javax.swing.JButton botonExamenCom;
    private javax.swing.JButton botonExamenSub;
    private javax.swing.JButton botonSalir;
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
    private javax.swing.JLabel labelAlérgicos;
    private javax.swing.JLabel labelAntecedentes;
    private javax.swing.JLabel labelBordesLaterales;
    private javax.swing.JLabel labelBordesLateralesR;
    private javax.swing.JLabel labelCaraDorsal;
    private javax.swing.JLabel labelCaraDorsalR;
    private javax.swing.JLabel labelCaraVentral;
    private javax.swing.JLabel labelCaraVentralR1;
    private javax.swing.JLabel labelCaracteristicas;
    private javax.swing.JLabel labelCaracteristicasR;
    private javax.swing.JLabel labelCardiovasculares;
    private javax.swing.JLabel labelCausaHemorragia;
    private javax.swing.JLabel labelCausaHemorragiaR;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelCedulaPaciente;
    private javax.swing.JLabel labelColorOrina;
    private javax.swing.JLabel labelColorOrinaPaciente;
    private javax.swing.JLabel labelCrisisAsma;
    private javax.swing.JLabel labelCual;
    private javax.swing.JLabel labelCualMedicamento;
    private javax.swing.JLabel labelCualMedicamentoPaciente;
    private javax.swing.JLabel labelCualMedicamentoR;
    private javax.swing.JLabel labelCualOtraHepatica;
    private javax.swing.JLabel labelCuandoInfarto;
    private javax.swing.JLabel labelCuandoInfartoR;
    private javax.swing.JLabel labelCuantasVecesOrinaDia;
    private javax.swing.JLabel labelCuantasVecesOrinaNoche;
    private javax.swing.JLabel labelCuantoTiempoConvulsiones;
    private javax.swing.JLabel labelCuantosCigarrillos;
    private javax.swing.JLabel labelCuantosCigarrillosPaciente;
    private javax.swing.JLabel labelCursoEnfermedad;
    private javax.swing.JLabel labelCursoEnfermedadPaciente;
    private javax.swing.JLabel labelDatosPersonales;
    private javax.swing.JLabel labelDatosPersonales1;
    private javax.swing.JLabel labelDefinitivo;
    private javax.swing.JLabel labelDesdeCuando;
    private javax.swing.JLabel labelDesdeCuandoPaciente;
    private javax.swing.JLabel labelDiaTra;
    private javax.swing.JLabel labelDientes;
    private javax.swing.JLabel labelDomicilio;
    private javax.swing.JLabel labelDomicilioPaciente;
    private javax.swing.JLabel labelDuracionHemorragia;
    private javax.swing.JLabel labelDuracionHemorragia1;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelEdadPaciente;
    private javax.swing.JLabel labelEncia;
    private javax.swing.JLabel labelEnciasR;
    private javax.swing.JLabel labelEstudiante;
    private javax.swing.JLabel labelEstudiantePaciente;
    private javax.swing.JLabel labelExamenClinico3;
    private javax.swing.JLabel labelExamenCom;
    private javax.swing.JLabel labelFamiliares;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelFechaCrisisR;
    private javax.swing.JLabel labelFechaUltimaCrisis;
    private javax.swing.JLabel labelFemenino;
    private javax.swing.JLabel labelFrenilloLingual;
    private javax.swing.JLabel labelFrenilloLingualR;
    private javax.swing.JLabel labelFrenillosLabiales;
    private javax.swing.JLabel labelFrenillosLabialesR;
    private javax.swing.JLabel labelGlicemia;
    private javax.swing.JLabel labelGlicemiaR;
    private javax.swing.JLabel labelHMPaciente;
    private javax.swing.JLabel labelHaceCuantoHepR1;
    private javax.swing.JLabel labelHaceCuantoHepatitis;
    private javax.swing.JLabel labelHaceCuantoVenereas;
    private javax.swing.JLabel labelHaceCuantoVenereasR1;
    private javax.swing.JLabel labelHematologicas;
    private javax.swing.JRadioButton labelHipotenso;
    private javax.swing.JLabel labelHistopatologico;
    private javax.swing.JLabel labelHistoriaMedica;
    private javax.swing.JLabel labelHospitalizado;
    private javax.swing.JLabel labelHospitalizadoPaciente;
    private javax.swing.JLabel labelInfecciosas;
    private javax.swing.JLabel labelLNPaciente;
    private javax.swing.JLabel labelLabios;
    private javax.swing.JLabel labelLengua;
    private javax.swing.JLabel labelLocalizacion;
    private javax.swing.JLabel labelLocalizacionR1;
    private javax.swing.JLabel labelLugarNacimiento;
    private javax.swing.JLabel labelMMHG;
    private javax.swing.JLabel labelMMHG1;
    private javax.swing.JLabel labelMaxima;
    private javax.swing.JLabel labelMaximaR;
    private javax.swing.JLabel labelMedicamento;
    private javax.swing.JLabel labelMedicamentoPaciente;
    private javax.swing.JLabel labelMenstruacion1;
    private javax.swing.JLabel labelMesesEmbarazo1;
    private javax.swing.JLabel labelMesesEmbarazoR;
    private javax.swing.JLabel labelMinima;
    private javax.swing.JLabel labelMinimaR;
    private javax.swing.JLabel labelMotivo;
    private javax.swing.JLabel labelMotivoPaciente;
    private javax.swing.JLabel labelMucosaPalatina;
    private javax.swing.JLabel labelMucosaPalatinaR;
    private javax.swing.JLabel labelMucosaPisoBoca;
    private javax.swing.JLabel labelNeurológicas;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombrePaciente;
    private javax.swing.JLabel labelNutricionalesMetabolicos;
    private javax.swing.JLabel labelObservaciones;
    private javax.swing.JLabel labelOcupacion;
    private javax.swing.JLabel labelOcupacionPaciente;
    private javax.swing.JLabel labelOrinaNocheR;
    private javax.swing.JLabel labelOtraHepaticaR;
    private javax.swing.JLabel labelOtros;
    private javax.swing.JLabel labelOtrosR4;
    private javax.swing.JLabel labelPCR;
    private javax.swing.JLabel labelPHR1;
    private javax.swing.JLabel labelPalpacionGanglios;
    private javax.swing.JLabel labelPalpacionGanglios2;
    private javax.swing.JLabel labelPerfilCoagulacion;
    private javax.swing.JLabel labelPerfilHematologico;
    private javax.swing.JLabel labelPlanTratamiento;
    private javax.swing.JLabel labelPorQue;
    private javax.swing.JLabel labelPorQuePaciente;
    private javax.swing.JLabel labelPresentaExamenLab;
    private javax.swing.JLabel labelPresentaExamenRad;
    private javax.swing.JLabel labelPresentaPalpacion;
    private javax.swing.JLabel labelPresentaTension;
    private javax.swing.JLabel labelPresuntivo;
    private javax.swing.JLabel labelQueCantidad;
    private javax.swing.JLabel labelQueCantidadPaciente;
    private javax.swing.JLabel labelQuirurgicamente;
    private javax.swing.JLabel labelQuirurgicamentePaciente;
    private javax.swing.JLabel labelRA;
    private javax.swing.JLabel labelRAR;
    private javax.swing.JLabel labelReferencia;
    private javax.swing.JLabel labelReferenciaPaciente;
    private javax.swing.JLabel labelReferenciaPaciente2;
    private javax.swing.JLabel labelRenalesGastrointestinales;
    private javax.swing.JLabel labelRxOclusal;
    private javax.swing.JLabel labelRxPanoramica;
    private javax.swing.JLabel labelRxPanoramica3;
    private javax.swing.JLabel labelRxPeriapical;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelSexoPaciente;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTelfPaciente;
    private javax.swing.JLabel labelTensionArterial;
    private javax.swing.JLabel labelTiempoConvulsiones;
    private javax.swing.JLabel labelTipoCanR;
    private javax.swing.JLabel labelTipoCancer;
    private javax.swing.JLabel labelTipoCardioR;
    private javax.swing.JLabel labelTipoDR;
    private javax.swing.JLabel labelTipoEnfCardiovasculares;
    private javax.swing.JLabel labelTipoEnfHepaticas;
    private javax.swing.JLabel labelTipoEnfPulmonares;
    private javax.swing.JLabel labelTipoHR;
    private javax.swing.JLabel labelTipoHepatitis;
    private javax.swing.JLabel labelTipoHepatitisR1;
    private javax.swing.JLabel labelTipoPulR;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUltimaCrisisR;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel labelVDRL;
    private javax.swing.JLabel labelVDRLR;
    private javax.swing.JLabel labelVIH;
    private javax.swing.JLabel labelVIHR;
    private javax.swing.JLabel labelVecesDiaR;
    private javax.swing.JLabel labelVestibuloBucal;
    private javax.swing.JLabel labelVestibuloBucalR;
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
    private javax.swing.JPanel pestExamenCli;
    private javax.swing.JPanel pestExamenCom;
    private javax.swing.JPanel pestExamenSub;
    private javax.swing.JTabbedPane pestVer;
    private javax.swing.JRadioButton radioAcidezEstomacal1;
    private javax.swing.JRadioButton radioAlergicoMedicamento;
    private javax.swing.JRadioButton radioAnemia;
    private javax.swing.JRadioButton radioAsma;
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
    private javax.swing.JRadioButton radioEmbarazada1;
    private javax.swing.JRadioButton radioEndocarditisBacteriana;
    private javax.swing.JRadioButton radioEnfCardiovasculares;
    private javax.swing.JRadioButton radioEnfHepaticas;
    private javax.swing.JRadioButton radioEnfPulmonares;
    private javax.swing.JRadioButton radioEnfermedadRenal;
    private javax.swing.JRadioButton radioEnfermedadesVenereas;
    private javax.swing.JRadioButton radioEpilepsia;
    private javax.swing.JRadioButton radioFamiliares;
    private javax.swing.JRadioButton radioFiebre;
    private javax.swing.JRadioButton radioFuma;
    private javax.swing.JRadioButton radioHematomas;
    private javax.swing.JRadioButton radioHemorragias;
    private javax.swing.JRadioButton radioHepatitis;
    private javax.swing.JRadioButton radioHipertenso;
    private javax.swing.JRadioButton radioInfarto;
    private javax.swing.JRadioButton radioInsomnio;
    private javax.swing.JRadioButton radioIrregular1;
    private javax.swing.JRadioButton radioMalestarGeneral;
    private javax.swing.JRadioButton radioMenopausia1;
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
    private javax.swing.JRadioButton radioPastillasAnticonceptivas1;
    private javax.swing.JRadioButton radioPerdidoPeso;
    private javax.swing.JRadioButton radioRegular1;
    private javax.swing.JRadioButton radioSangraNariz;
    private javax.swing.JRadioButton radioSangranEncias;
    private javax.swing.JRadioButton radioSeAltera;
    private javax.swing.JRadioButton radioSienteDecaimiento;
    private javax.swing.JRadioButton radioSubirEscaleras;
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
    private javax.swing.JTextArea txtDefinitivo;
    private javax.swing.JTextArea txtDientes;
    private javax.swing.JTextArea txtHistopatologico;
    private javax.swing.JTextArea txtLabios;
    private javax.swing.JTextArea txtMucosaPisoBoca;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextArea txtPlanTratamiento;
    private javax.swing.JTextArea txtPresuntivo;
    private javax.swing.JTextArea txtRxOclusal;
    private javax.swing.JTextArea txtRxPanoramica;
    private javax.swing.JTextArea txtRxPeriapical;
    // End of variables declaration//GEN-END:variables
}
