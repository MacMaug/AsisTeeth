/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Consulta;

/**
 *
 * @author jdfer
 */
public class CModificarConsulta {
    
   public void copiarConsulta(Consulta con1, Consulta con2){
       con1.setFecha(con2.getFecha());
       con1.setEdadPaciente(con2.getEdadPaciente());
       con1.setDomicilioPaciente(con2.getDomicilioPaciente());
       con1.setTelefonoPaciente(con2.getTelefonoPaciente());
       con1.setOcupacionPaciente(con2.getOcupacionPaciente());
       con1.setEsEstudiante(con2.isEsEstudiante());
       con1.setReferencia(con2.getReferencia());
       con1.setListaExamenes(con2.getListaExamenes());
       con1.setListaAntecedentes(con2.getListaAntecedentes());
       con1.setDiagnosticoPresuntivo(con2.getDiagnosticoPresuntivo());
       con1.setEstudioHispatologico(con2.getEstudioHispatologico());
       con1.setDiagnosticoDefinitivo(con2.getDiagnosticoDefinitivo());
       con1.setPlanDeTratamiento(con2.getPlanDeTratamiento());
       con1.setObservaciones(con2.getObservaciones());
   }
    
}
