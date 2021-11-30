/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author macmaug <maug.lucas@gmail.com>
 */
public class Consulta {
    private Date fecha;
    private int edadPaciente;
    private String domicilioPaciente;
    private String telefonoPaciente;
    private String ocupacionPaciente;
    private boolean esEstudiante;
    private String referencia;
    private ArrayList<Examen> listaExamenes;
    private ArrayList<Antecedente> listaAntecedentes;
    private String diagnosticoPresuntivo;
    private String estudioHispatologico;
    private String diagnosticoDefinitivo;
    private String planDeTratamiento;
    private String observaciones;
    private int codigo;

    public Consulta(){
        //fecha=new
        edadPaciente=0;
        domicilioPaciente="No Aplica";
        //telefonoPaciente=0;
        ocupacionPaciente="No Aplica";
        esEstudiante=false;
        referencia="No Aplica";
        listaExamenes=new ArrayList<Examen>();
        listaAntecedentes=new ArrayList<Antecedente>();
    }

    public Consulta(Date fecha, int edadPaciente, String domicilioPaciente, String telefonoPaciente, String ocupacionPaciente, boolean esEstudiante, String referencia, String diagnosticoPresuntivo, String estudioHispatologico, String diagnosticoDefinitivo, String planDeTratamiento, String observaciones) {
        this.fecha = fecha;
        this.edadPaciente = edadPaciente;
        this.domicilioPaciente = domicilioPaciente;
        this.telefonoPaciente = telefonoPaciente;
        this.ocupacionPaciente = ocupacionPaciente;
        this.esEstudiante = esEstudiante;
        this.referencia = referencia;
        listaExamenes = new ArrayList<Examen>();
        listaAntecedentes = new ArrayList<Antecedente>();
        this.diagnosticoPresuntivo = diagnosticoPresuntivo;
        this.estudioHispatologico = estudioHispatologico;
        this.diagnosticoDefinitivo = diagnosticoDefinitivo;
        this.planDeTratamiento = planDeTratamiento;
        this.observaciones = observaciones;
    }
    
    public int getEdadPaciente() {
        return edadPaciente;
    }

    public void setEdadPaciente(int edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    public String getDomicilioPaciente() {
        return domicilioPaciente;
    }

    public void setDomicilioPaciente(String domicilioPaciente) {
        this.domicilioPaciente = domicilioPaciente;
    }

    public String getTelefonoPaciente() {
        return telefonoPaciente;
    }

    public void setTelefonoPaciente(String telefonoPaciente) {
        this.telefonoPaciente=telefonoPaciente;
    }

    public String getOcupacionPaciente() {
        return ocupacionPaciente;
    }

    public void setOcupacionPaciente(String ocupacionPaciente) {
        this.ocupacionPaciente = ocupacionPaciente;
    }

    public boolean isEsEstudiante() {
        return esEstudiante;
    }

    public void setEsEstudiante(boolean esEstudiante) {
        this.esEstudiante = esEstudiante;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public ArrayList<Examen> getListaExamenes() {
        return listaExamenes;
    }

    public void setListaExamenes(ArrayList<Examen> listaExamenes) {
        this.listaExamenes = listaExamenes;
    }

    public ArrayList<Antecedente> getListaAntecedentes() {
        return listaAntecedentes;
    }

    public void setListaAntecedentes(ArrayList<Antecedente> listaAntecedentes) {
        this.listaAntecedentes = listaAntecedentes;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public String getDiagnosticoPresuntivo() {
        return diagnosticoPresuntivo;
    }

    public String getEstudioHispatologico() {
        return estudioHispatologico;
    }

    public String getDiagnosticoDefinitivo() {
        return diagnosticoDefinitivo;
    }

    public String getPlanDeTratamiento() {
        return planDeTratamiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setDiagnosticoPresuntivo(String diagnosticoPresuntivo) {
        this.diagnosticoPresuntivo = diagnosticoPresuntivo;
    }

    public void setEstudioHispatologico(String estudioHispatologico) {
        this.estudioHispatologico = estudioHispatologico;
    }

    public void setDiagnosticoDefinitivo(String diagnosticoDefinitivo) {
        this.diagnosticoDefinitivo = diagnosticoDefinitivo;
    }

    public void setPlanDeTratamiento(String planDeTratamiento) {
        this.planDeTratamiento = planDeTratamiento;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
    //METODOS DE BUSQUEDA
    
    public ExamenSubjetivo buscarExamenSubjetivo(){
        for(Examen ex : listaExamenes){
            if(ex instanceof ExamenSubjetivo)
                return (ExamenSubjetivo) ex;
        }
        return null;
    }
    
    public ExamenClinico buscarExamenClinico(){
        for(Examen ex : listaExamenes){
            if(ex instanceof ExamenClinico)
                return (ExamenClinico) ex;
        }
        return null;
    }
    
    public boolean buscarExamenRadiografico(){
        for(Examen ex : listaExamenes){
            if(ex instanceof ExamenRadiografico)
                return true;
        }
        return false;
    }
    
    public ExamenRadiografico buscarObjetoExamenRadiografico(){
        for(Examen ex : listaExamenes){
            if(ex instanceof ExamenRadiografico)
                return (ExamenRadiografico) ex;
        }
        return null;
    }
    
    public boolean buscarExamenLaboratorio(){
        for(Examen ex : listaExamenes){
            if(ex instanceof ExamenLaboratorio)
                return true;
        }
        return false;
    }
    
    
    public ExamenLaboratorio buscarObjetoExamenLaboratorio(){
        for(Examen ex : listaExamenes){
            if(ex instanceof ExamenLaboratorio)
                return (ExamenLaboratorio) ex;
        }
        return null;
    }
    
    public AntecedenteRenalGastroIntestinal buscarObjetoAntecedenteRG(){
        for(Antecedente ant : listaAntecedentes){
            if(ant instanceof AntecedenteRenalGastroIntestinal)
                return (AntecedenteRenalGastroIntestinal) ant;
        }
        return null;
    }
    
    public boolean buscarAntecedenteFem(){
        for(Antecedente ant : listaAntecedentes){
            if(ant instanceof AntecedenteFemenino)
                return true;
        }
        return false;
    }
    
    public AntecedenteFemenino buscarObjetoAntecedenteFem(){
        for(Antecedente ant : listaAntecedentes){
            if(ant instanceof AntecedenteFemenino)
                return (AntecedenteFemenino) ant;
        }
        return null;
    }
    
    
    public boolean bucarAntecedenteCardio(){
        for(Antecedente ant : listaAntecedentes){
            if(ant instanceof AntecedenteCardiovascular)
                return true;
        }
        return false;
    }
    
    public AntecedenteCardiovascular buscarObjetoAntecedenteCardio(){
         for(Antecedente ant : listaAntecedentes){
            if(ant instanceof AntecedenteCardiovascular)
                return (AntecedenteCardiovascular) ant;
        }
        return null;
    }
    
    public boolean buscarAntecedenteAlergico(){
        for(Antecedente ant : listaAntecedentes){
            if(ant instanceof AntecedenteAlergico)
                return true;
        }
        return false;
    }
    
    public AntecedenteAlergico buscarObjetoAntecedenteAlergico(){
        for(Antecedente ant : listaAntecedentes){
            if(ant instanceof AntecedenteAlergico)
                return (AntecedenteAlergico) ant;
        }
        return null;
    }
    
    public boolean buscarAntecedenteNM(){
        for(Antecedente ant : listaAntecedentes){
            if(ant instanceof AntecedenteNutricional)
                return true;
        }
        return false;
    }
    
    public AntecedenteNutricional buscarObjetoAntecedenteNM(){
        for(Antecedente ant : listaAntecedentes){
            if(ant instanceof AntecedenteNutricional)
                return (AntecedenteNutricional) ant;
        }
        return null;
    }
    
    public boolean bucarAntecedenteInf(){
        for(Antecedente ant : listaAntecedentes){
            if(ant instanceof AntecedenteInfeccioso)
                return true;
        }
        return false;
    }
    
    public AntecedenteInfeccioso buscarObjetoAntecedenteInf(){
        for(Antecedente ant : listaAntecedentes){
            if(ant instanceof AntecedenteInfeccioso)
                return (AntecedenteInfeccioso) ant;
        }
        return null;
    }
    
    public boolean buscarAntecedenteNeurologico(){
        for(Antecedente ant : listaAntecedentes){
            if(ant instanceof AntecedenteNeurologico)
                return true;
        }
        return false;
    }
    
    public AntecedenteNeurologico buscarObjetoAntecedenteNeurologico(){
        for(Antecedente ant : listaAntecedentes){
            if(ant instanceof AntecedenteNeurologico)
                return (AntecedenteNeurologico) ant;
        }
        return null;
    }
    
    public boolean buscarAntecedenteHematologico(){
        for(Antecedente ant : listaAntecedentes){
            if(ant instanceof AntecedenteHematologico)
                return true;
        }
        return false;
    }
    
    public AntecedenteHematologico buscarObjetoAntecedenteHematologico(){
        for(Antecedente ant : listaAntecedentes){
            if(ant instanceof AntecedenteHematologico)
                return (AntecedenteHematologico) ant;
        }
        return null;
    }
    
    public boolean buscarAntecedenteFamiliar(){
        for(Antecedente ant : listaAntecedentes){
            if(ant instanceof AntecedenteFamiliar)
                return true;
        }
        return false;
    }
    
    public AntecedenteFamiliar buscarObjetoAntecedenteFamiliar(){
        for(Antecedente ant : listaAntecedentes){
            if(ant instanceof AntecedenteFamiliar)
                return (AntecedenteFamiliar) ant;
        }
        return null;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
