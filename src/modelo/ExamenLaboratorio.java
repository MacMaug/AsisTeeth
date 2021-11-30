/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author macmaug <maug.lucas@gmail.com>
 */
public class ExamenLaboratorio extends Examen{
    private String perfilHematologico;
    private String perfilCoagulacion;
    private int glicemia;
    private String vdrl;
    private String vih;
    private String otraLaboratorio;
    
    
    public ExamenLaboratorio(){
        super("Exámenes de Laboratorio");
        perfilHematologico="No Aplica";
        glicemia=0;
        vdrl="No Aplica";
        vih="No Aplica";
        otraLaboratorio="No Aplica";
    }

    public ExamenLaboratorio(String perfilHematologico, String perfilCoagulacion, int glicemia, String vdrl, String vih, String nombre) {
        super(nombre);
        this.perfilHematologico = perfilHematologico;
        this.perfilCoagulacion = perfilCoagulacion;
        this.glicemia = glicemia;
        this.vdrl = vdrl;
        this.vih = vih;
        this.otraLaboratorio = otraLaboratorio;
    }
    

    public String getPerfilHematologico() {
        return perfilHematologico;
    }

    public void setPerfilHematologico(String perfilHematologico) {
        this.perfilHematologico = perfilHematologico;
    }

    public int getGlicemia() {
        return glicemia;
    }

    public void setGlicemia(int glicemia) {
        this.glicemia = glicemia;
    }

    public String getVdrl() {
        return vdrl;
    }

    public void setVdrl(String vdrl) {
        this.vdrl = vdrl;
    }

    public String getVih() {
        return vih;
    }

    public void setVih(String vih) {
        this.vih = vih;
    }

    public String getOtraLaboratorio() {
        return otraLaboratorio;
    }

    public void setOtraLaboratorio(String otraLaboratorio) {
        this.otraLaboratorio = otraLaboratorio;
    }

    public String getPerfilCoagulacion() {
        return perfilCoagulacion;
    }

    public void setPerfilCoagulacion(String perfilCoagulacion) {
        this.perfilCoagulacion = perfilCoagulacion;
    }


    
}
