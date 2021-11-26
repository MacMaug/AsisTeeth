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
    private String glicemia;
    private String vdrl;
    private String vih;
    private String otraLaboratorio;
    
    public ExamenLaboratorio(){
        super("Exámenes de Laboratorio");
        perfilHematologico="No Aplica";
        glicemia="No Aplica";
        vdrl="No Aplica";
        vih="No Aplica";
        otraLaboratorio="No Aplica";
    }

    public String getPerfilHematologico() {
        return perfilHematologico;
    }

    public void setPerfilHematologico(String perfilHematologico) {
        this.perfilHematologico = perfilHematologico;
    }

    public String getGlicemia() {
        return glicemia;
    }

    public void setGlicemia(String glicemia) {
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
    
    
}
