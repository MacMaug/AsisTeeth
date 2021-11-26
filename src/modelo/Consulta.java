/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author macmaug <maug.lucas@gmail.com>
 */
public class Consulta {
    //JCalendar fecha;
    private int edadPaciente;
    private String domicilioPaciente;
    private int telefonoPaciente;
    private String ocupacionPaciente;
    private boolean esEstudiante;
    private String referencia;
    private ArrayList<Examen> listaExamenes;
    private ArrayList<Antecedente> listaAntecedentes;

    public Consulta(){
        //fecha=hoy
        edadPaciente=0;
        domicilioPaciente="No Aplica";
        telefonoPaciente=0;
        ocupacionPaciente="No Aplica";
        esEstudiante=false;
        referencia="No Aplica";
        listaExamenes=new ArrayList<Examen>();
        listaAntecedentes=new ArrayList<Antecedente>();
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

    public int getTelefonoPaciente() {
        return telefonoPaciente;
    }

    public void setTelefonoPaciente(int telefonoPaciente) {
        this.telefonoPaciente = telefonoPaciente;
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
    
    
}
