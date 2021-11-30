/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import modelo.Odontologo;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author macmaug <maug.lucas@gmail.com>
 */
public class Leer {

    public static void deJSON() throws IOException {
        JSONArray jsonLista;
        JSONParser lectura = new JSONParser();
        try ( FileReader reader = new FileReader("src/files/usuarios.json")) {
            Object objetoLectura = lectura.parse(reader);
            jsonLista = (JSONArray) objetoLectura;
            //---------Lectura--------------
            //----------------------Odontólogo---------------------------
            for (int objeto = 0; objeto < jsonLista.size(); objeto++) {
                JSONObject odontologoJSON = new JSONObject();
                Odontologo odontologo = new Odontologo();
                Encriptar encriptacion = new Encriptar();
                odontologoJSON = (JSONObject) jsonLista.get(objeto);
                //Agregar
                odontologo.setNombre((String) odontologoJSON.get("nombre"));
                odontologo.setCedula(Math.toIntExact((long) odontologoJSON.get("cedula")));
                odontologo.setClave((String) odontologoJSON.get("clave"));
                odontologo.setUsuario((String) odontologoJSON.get("usuario"));
                JSONArray pacientesJSON = new JSONArray();
                pacientesJSON = (JSONArray) odontologoJSON.get("listaPacientes");
                //--------------------------Paciente----------------------------
                for (int cadaPaciente = 0; cadaPaciente < pacientesJSON.size(); cadaPaciente++) {
                    Paciente paciente = new Paciente();
                    JSONObject pacienteJSON = new JSONObject();
                    pacienteJSON = (JSONObject) pacientesJSON.get(cadaPaciente);
                    paciente.setNombre((String) pacienteJSON.get(("nombre")));
                    paciente.setHistoriaClinica(Math.toIntExact((long) pacienteJSON.get(("historiaClinica"))));
                    paciente.setCedula(Math.toIntExact((long) pacienteJSON.get(("cedula"))));
                    paciente.setSexo(((String) pacienteJSON.get("sexo")).charAt(0));
                    paciente.setLugarNacimiento((String) pacienteJSON.get("lugarNacimiento"));
                    JSONArray consultasJSON = new JSONArray();
                    consultasJSON = (JSONArray) pacienteJSON.get("listaConsultas");
                    //------------------------Consulta-------------------------------------
                    for (int cadaConsulta = 0; cadaConsulta < consultasJSON.size(); cadaConsulta++) {
                        Consulta consulta = new Consulta();
                        JSONObject consultaJSON = new JSONObject();
                        consultaJSON = (JSONObject) consultasJSON.get(cadaConsulta);
                        consulta.setCodigo(Math.toIntExact((long) consultaJSON.get("codigo")));
                        consulta.setDiagnosticoDefinitivo((String) consultaJSON.get("diagnosticoDefinitivo"));
                        consulta.setDomicilioPaciente((String) consultaJSON.get("domicilioPaciente"));
                        consulta.setEdadPaciente(Math.toIntExact((long) consultaJSON.get("edadPaciente")));
                        consulta.setEsEstudiante((boolean) consultaJSON.get("esEstudiante"));
                        consulta.setOcupacionPaciente((String) consultaJSON.get("ocupacionPaciente"));
                        consulta.setReferencia((String) consultaJSON.get("referencia"));
                        consulta.setTelefonoPaciente((String) consultaJSON.get("telefonoPaciente"));
                        consulta.setDiagnosticoPresuntivo((String) consultaJSON.get("diagnosticoPresuntivo"));
                        consulta.setEstudioHispatologico((String) consultaJSON.get("estudioHispatologico"));
                        String sDate1=(String)consultaJSON.get("fecha");
                        Date date1=new Date();
                        consulta.setFecha(date1);
                        consulta.setObservaciones((String) consultaJSON.get("observaciones"));
                        consulta.setPlanDeTratamiento((String) consultaJSON.get("planDeTratamiento"));
                        JSONArray examenesJSON = new JSONArray();
                        examenesJSON = (JSONArray) consultaJSON.get("listaExamenes");
                        JSONArray antecedentesJSON = new JSONArray();
                        antecedentesJSON = (JSONArray) consultaJSON.get("listaAntecedentes");
                        //----------------------Examenes-----------------------------------
                        for (int cadaExamen = 0; cadaExamen < examenesJSON.size(); cadaExamen++) {
                            JSONObject examenJSON = new JSONObject();
                            examenJSON = (JSONObject) examenesJSON.get(cadaExamen);
                            if ("Subjetivo".equals((String) examenJSON.get("nombre"))) {
                                ExamenSubjetivo subjetivo = new ExamenSubjetivo();
                                subjetivo.setCantidadCigarrillos(Math.toIntExact((long) examenJSON.get("cantidadCigarrillos")));
                                subjetivo.setCantidadTomando((String) examenJSON.get("cantidadTomando"));
                                subjetivo.setCursoEnfermedad((String) examenJSON.get("cursoEnfermedad"));
                                subjetivo.setFuma((boolean) examenJSON.get("fuma"));
                                subjetivo.setMedicamentoQueToma((String) examenJSON.get("medicamentoQueToma"));
                                subjetivo.setMotivoConsulta((String) examenJSON.get("motivoConsulta"));
                                subjetivo.setMotivoHospitalizado((String) examenJSON.get("motivoHospitalizado"));
                                subjetivo.setSidoIntervenidoQuirurgicamente((boolean) examenJSON.get("sidoIntervenidoQuirurgicamente"));
                                subjetivo.setTiempoFumando((String) examenJSON.get("tiempoFumando"));
                                subjetivo.setToma((boolean) examenJSON.get("toma"));
                                subjetivo.setSidoHospitalizado((boolean) examenJSON.get("sidoHospitalizado"));
                                subjetivo.setTomandoMedicamento((boolean) examenJSON.get("tomandoMedicamento"));
                                consulta.getListaExamenes().add(subjetivo);
                            }
                            if ("Radiografico".equals((String) examenJSON.get("nombre"))) {
                                ExamenRadiografico radiografico = new ExamenRadiografico();
                                radiografico.setOtraRadiografica((String) examenJSON.get("otraRadiografica"));
                                radiografico.setRxOclusal((String) examenJSON.get("rxOclusal"));
                                radiografico.setRxPanoramica((String) examenJSON.get("rxPanoramica"));
                                radiografico.setRxPeriapical((String) examenJSON.get("rxPeriapical"));
                                consulta.getListaExamenes().add(radiografico);
                            }
                            if ("Laboratorio".equals((String) examenJSON.get("nombre"))) {
                                ExamenLaboratorio laboratorio = new ExamenLaboratorio();
                                laboratorio.setGlicemia(Math.toIntExact((long) examenJSON.get("glicemia")));
                                laboratorio.setOtraLaboratorio((String) examenJSON.get("otraLaboratorio"));
                                laboratorio.setPerfilCoagulacion((String) examenJSON.get("perfilCoagulacion"));
                                laboratorio.setPerfilHematologico((String) examenJSON.get("perfilHematologico"));
                                laboratorio.setVdrl((String) examenJSON.get("vdrl"));
                                laboratorio.setVih((String) examenJSON.get("vih"));
                                consulta.getListaExamenes().add(laboratorio);
                            }
                            if ("Clinico".equals((String) examenJSON.get("nombre"))) {
                                ExamenClinico clinico = new ExamenClinico();
                                clinico.setBordesLateralesLengua((String) examenJSON.get("bordesLateralesLengua"));
                                clinico.setCaraDorsalLengua((String) examenJSON.get("caraDorsalLengua"));
                                clinico.setCaraVentralLengua((String) examenJSON.get("caraVentralLengua"));
                                clinico.setDientes((String) examenJSON.get("dientes"));
                                clinico.setEncia((String) examenJSON.get("encia"));
                                clinico.setFrenilloLingual((String) examenJSON.get("frenilloLingual"));
                                clinico.setFrenillosLabiales((String) examenJSON.get("frenillosLabiales"));
                                clinico.setGangliosPalpables((boolean) examenJSON.get("gangliosPalpables"));
                                clinico.setLabios((String) examenJSON.get("labios"));
                                clinico.setMucosaPalatina((String) examenJSON.get("mucosaPalatina"));
                                clinico.setMucosaPisoDeBoca((String) examenJSON.get("mucosaPisoDeBoca"));
                                clinico.setTensionArterialMaxima(Math.toIntExact((long) examenJSON.get("tensionArterialMaxima")));
                                clinico.setTensionArterialMinima(Math.toIntExact((long) examenJSON.get("tensionArterialMinima")));
                                clinico.setUbicacionGanglios((String) examenJSON.get("ubicacionGanglios"));
                                clinico.setVestibuloBocal((String) examenJSON.get("vestibuloBocal"));
                                clinico.setIncluirTensionArterial((boolean) examenJSON.get("incluirTensionArterial"));
                                clinico.setIncluirPalpacion((boolean) examenJSON.get("incluirPalpacion"));
                                clinico.setCaracteristicasPalpacion((String) examenJSON.get("caracteristicasPalpacion"));                        
                                consulta.getListaExamenes().add(clinico);
                            }
                        }//-----------------------Antecedentes------------------------------------
                        for (int cadaAntecedente = 0; cadaAntecedente < antecedentesJSON.size(); cadaAntecedente++) {
                            JSONObject antecedenteJSON = new JSONObject();
                            antecedenteJSON = (JSONObject) antecedentesJSON.get(cadaAntecedente);
                            if ("Alergico".equals((String) antecedenteJSON.get("nombre"))) {
                                AntecedenteAlergico alergico = new AntecedenteAlergico();
                                alergico.setAlergicoAMedicamento((boolean) antecedenteJSON.get("alergicoAMedicamento"));
                                alergico.setDificultadParaRespirar((boolean) antecedenteJSON.get("dificultadParaRespirar"));
                                alergico.setDificultadParaTragar((boolean) antecedenteJSON.get("dificultadParaTragar"));
                                alergico.setMedicamentosConAlergia((String) antecedenteJSON.get("medicamentosConAlergia"));
                                alergico.setReaccionAnestesia((String) antecedenteJSON.get("reaccionAnestesia"));
                                alergico.setTenidoAsma((boolean) antecedenteJSON.get("tenidoAsma"));
                                alergico.setTenidoUrticaria((boolean) antecedenteJSON.get("tenidoUrticaria"));
                                alergico.setUltimaCrisisAsma((String) antecedenteJSON.get("ultimaCrisisAsma"));
                                consulta.getListaAntecedentes().add(alergico);
                            }
                            if ("Cardiovascular".equals((String) antecedenteJSON.get("nombre"))) {
                                AntecedenteCardiovascular cardiovascular = new AntecedenteCardiovascular();
                                cardiovascular.setCansaSubirEscaleras((boolean) antecedenteJSON.get("cansaSubirEscaleras"));
                                cardiovascular.setCuandoInfarto((String) antecedenteJSON.get("cuandoInfarto"));
                                cardiovascular.setDoloresEnPecho((boolean) antecedenteJSON.get("doloresEnPecho"));
                                cardiovascular.setEdemaMiembrosInferiores((boolean) antecedenteJSON.get("edemaMiembrosInferiores"));
                                cardiovascular.setEsHipertenso((boolean) antecedenteJSON.get("esHipertenso"));
                                cardiovascular.setEsHipotenso((boolean) antecedenteJSON.get("esHipotenso"));
                                cardiovascular.setEstaEnTratamiento((boolean) antecedenteJSON.get("estaEnTratamiento"));
                                cardiovascular.setPalpitaciones((boolean) antecedenteJSON.get("palpitaciones"));
                                cardiovascular.setPresentaVulvopatia((boolean) antecedenteJSON.get("presentaVulvopatia"));
                                cardiovascular.setSufreEndocarnitisBacteriana((boolean) antecedenteJSON.get("sufreEndocarnitisBacteriana"));
                                cardiovascular.setTenidoInfarto((boolean) antecedenteJSON.get("tenidoInfarto"));
                                consulta.getListaAntecedentes().add(cardiovascular);
                            }
                            if ("Familiar".equals((String) antecedenteJSON.get("nombre"))) {
                                AntecedenteFamiliar familiar = new AntecedenteFamiliar();
                                familiar.setCancer((String) antecedenteJSON.get("cancer"));
                                familiar.setCardiovasculares((String) antecedenteJSON.get("cardiovasculares"));
                                familiar.setDiabetes((String) antecedenteJSON.get("diabetes"));
                                familiar.setHepaticas((String) antecedenteJSON.get("hepaticas"));
                                familiar.setOtros((String) antecedenteJSON.get("otros"));
                                familiar.setPulmonares((String) antecedenteJSON.get("pulmonares"));
                                consulta.getListaAntecedentes().add(familiar);
                            }
                            if ("Femenino".equals((String) antecedenteJSON.get("nombre"))) {
                                AntecedenteFemenino femenino = new AntecedenteFemenino();
                                femenino.setDuracionMenstrual((String) antecedenteJSON.get("duracionMenstrual"));
                                femenino.setMesesDeEmbarazo((Math.toIntExact((long)antecedenteJSON.get("mesesDeEmbarazo"))));
                                femenino.setRegularidadMenstrual((String) antecedenteJSON.get("regularidadMenstrual"));
                                femenino.setEstaEmbarazada((boolean) antecedenteJSON.get("estaEmbarazada"));
                                femenino.setTomaPastillasAnticonceptivas((boolean) antecedenteJSON.get("tomaPastillasAnticonceptivas"));
                                femenino.setTieneMenopausia((boolean) antecedenteJSON.get("tieneMenopausia"));                                
                                consulta.getListaAntecedentes().add(femenino);
                            }
                            if ("Hematologico".equals((String) antecedenteJSON.get("nombre"))) {
                                AntecedenteHematologico hematologico = new AntecedenteHematologico();
                                hematologico.setCausaHemorragia((String) antecedenteJSON.get("causaHemorragia"));
                                hematologico.setDuracionHemorragia((String) antecedenteJSON.get("duracionHemorragia"));
                                hematologico.setSangraPorNariz((boolean) antecedenteJSON.get("sangraPorNariz"));
                                hematologico.setSangranEncias((boolean) antecedenteJSON.get("sangranEncias"));
                                hematologico.setTenidoHemorragiasImportantes((boolean) antecedenteJSON.get("tenidoHemorragiasImportantes"));
                                hematologico.setHematomas((boolean) antecedenteJSON.get("hematomas"));
                                consulta.getListaAntecedentes().add(hematologico);
                            }
                            if ("Infeccioso".equals((String) antecedenteJSON.get("nombre"))) {
                                AntecedenteInfeccioso infeccioso = new AntecedenteInfeccioso();
                                infeccioso.setEnfermedadHepatica((String) antecedenteJSON.get("enfermedadHepatica"));
                                infeccioso.setTenidoEnfermedadesVenereas((boolean) antecedenteJSON.get("tenidoEnfermedadesVenereas"));
                                infeccioso.setTenidoHepatitis((boolean) antecedenteJSON.get("tenidoHepatitis"));
                                infeccioso.setTenidoTransfusionDeSangre((boolean) antecedenteJSON.get("tenidoTransfusionDeSangre"));
                                infeccioso.setTenidoTuberculosis((boolean) antecedenteJSON.get("tenidoTuberculosis"));
                                infeccioso.setTiempoEnfermedadesVenereas((String) antecedenteJSON.get("tiempoEnfermedadesVenereas"));
                                infeccioso.setTiempoHepatitis((String) antecedenteJSON.get("tiempoHepatitis"));
                                infeccioso.setTieneOtraEnfermedadHepatica((boolean) antecedenteJSON.get("tieneOtraEnfermedadHepatica"));
                                infeccioso.setTipoHepatitis(((String) antecedenteJSON.get("tipoHepatitis")).charAt(0));
                                consulta.getListaAntecedentes().add(infeccioso);
                            }
                            if ("Neurologico".equals((String) antecedenteJSON.get("nombre"))) {
                                AntecedenteNeurologico neurologico = new AntecedenteNeurologico();
                                neurologico.setAlteraConFacilidad((boolean) antecedenteJSON.get("alteraConFacilidad"));
                                neurologico.setCefaleasFrecuentes((boolean) antecedenteJSON.get("cefaleasFrecuentes"));
                                neurologico.setTenidoConvulsiones((boolean) antecedenteJSON.get("tenidoConvulsiones"));
                                neurologico.setTenidoEpilepsia((boolean) antecedenteJSON.get("tenidoEpilepsia"));
                                neurologico.setTenidoNeuritisEnCara((boolean) antecedenteJSON.get("tenidoNeuritisEnCara"));
                                neurologico.setTiempoConvulsiones((String) antecedenteJSON.get("tiempoConvulsiones"));
                                neurologico.setUltimaCrisisEpileptica((String) antecedenteJSON.get("ultimaCrisisEpileptica"));
                                neurologico.setParestesia((boolean) antecedenteJSON.get("parestesia"));
                                neurologico.setParalisisFacial((boolean) antecedenteJSON.get("paralisisFacial"));
                                consulta.getListaAntecedentes().add(neurologico);
                            }
                            if ("Nutricional".equals((String) antecedenteJSON.get("nombre"))) {
                                AntecedenteNutricional nutricional = new AntecedenteNutricional();
                                nutricional.setConFiebre((boolean) antecedenteJSON.get("conFiebre"));
                                nutricional.setConMalestarGeneral((boolean) antecedenteJSON.get("conMalestarGeneral"));
                                nutricional.setEnDecaimiento((boolean) antecedenteJSON.get("enDecaimiento"));
                                nutricional.setEnDieta((boolean) antecedenteJSON.get("enDieta"));
                                nutricional.setEstaEnTratamiento((boolean) antecedenteJSON.get("estaEnTratamiento"));
                                nutricional.setOrinaDeNoche((boolean) antecedenteJSON.get("orinaDeNoche"));
                                nutricional.setPadeceDeTiroides((boolean) antecedenteJSON.get("padeceDeTiroides"));
                                nutricional.setPerdidoPeso((boolean) antecedenteJSON.get("perdidoPeso"));
                                nutricional.setSienteMuchaSed((boolean) antecedenteJSON.get("sienteMuchaSed"));
                                nutricional.setTenidoAnemia((boolean) antecedenteJSON.get("tenidoAnemia"));
                                nutricional.setTieneInsomnio((boolean) antecedenteJSON.get("tieneInsomnio"));
                                nutricional.setVecesOrinaDeNoche(Math.toIntExact((long) antecedenteJSON.get("vecesOrinaDeNoche")));
                                nutricional.setDiabetico((boolean) antecedenteJSON.get("diabetico"));
                                consulta.getListaAntecedentes().add(nutricional);
                            }
                            if ("RN".equals((String) antecedenteJSON.get("nombre"))) {
                                AntecedenteRenalGastroIntestinal rn = new AntecedenteRenalGastroIntestinal();
                                rn.setCantidadOrinaAlDia(Math.toIntExact((long) antecedenteJSON.get("cantidadOrinaAlDia")));
                                rn.setColorOrina((String) antecedenteJSON.get("colorOrina"));
                                rn.setSufridoCalculosRenales((boolean) antecedenteJSON.get("sufridoCalculosRenales"));
                                rn.setTenidoAcidezEstomacal((boolean) antecedenteJSON.get("tenidoAcidezEstomacal"));
                                rn.setTenidoDiarreaFrecuente((boolean) antecedenteJSON.get("tenidoDiarreaFrecuente"));
                                rn.setTenidoEnfermedadRenal((boolean) antecedenteJSON.get("tenidoEnfermedadRenal"));
                                rn.setTenidoUlceraPeptica((boolean) antecedenteJSON.get("tenidoUlceraPeptica"));
                                consulta.getListaAntecedentes().add(rn);
                            }
                        }
                        paciente.getListaConsultas().add(consulta);
                    }
                    odontologo.getListaPacientes().add(paciente);
                }
                Datos.getListaOdontologos().add(odontologo);
            }
            reader.close();
            Encriptar encriptacion = new Encriptar();
            encriptacion.desencriptarClaves();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } catch (org.json.simple.parser.ParseException ex) {
            Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
