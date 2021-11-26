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
public class AntecedenteInfeccioso extends Antecedente {
    private boolean tenidoEnfermedadesVenereas;
    private String tiempoEnfermedadesVenereas;
    private boolean tenidoTransfusionDeSangre;
    private boolean tenidoHepatitis;
    private String tiempoHepatitis;
    private char tipoHepatitis; 
    private boolean tieneOtraEnfermedadHepatica;
    private String enfermedadHepatica;
    private boolean tenidoTuberculosis;
    
    public AntecedenteInfeccioso(){
        super("Antecedentes Infecciosos");
        tenidoEnfermedadesVenereas=false;
        tiempoEnfermedadesVenereas="No Aplica";
        tenidoTransfusionDeSangre=false;
        tenidoHepatitis=false;
        tipoHepatitis=' ';
        tieneOtraEnfermedadHepatica=false;
        enfermedadHepatica="No Aplica";
        tenidoTuberculosis=false;
    }

    public boolean isTenidoEnfermedadesVenereas() {
        return tenidoEnfermedadesVenereas;
    }

    public void setTenidoEnfermedadesVenereas(boolean tenidoEnfermedadesVenereas) {
        this.tenidoEnfermedadesVenereas = tenidoEnfermedadesVenereas;
    }

    public String getTiempoEnfermedadesVenereas() {
        return tiempoEnfermedadesVenereas;
    }

    public void setTiempoEnfermedadesVenereas(String tiempoEnfermedadesVenereas) {
        this.tiempoEnfermedadesVenereas = tiempoEnfermedadesVenereas;
    }

    public boolean isTenidoTransfusionDeSangre() {
        return tenidoTransfusionDeSangre;
    }

    public void setTenidoTransfusionDeSangre(boolean tenidoTransfusionDeSangre) {
        this.tenidoTransfusionDeSangre = tenidoTransfusionDeSangre;
    }

    public boolean isTenidoHepatitis() {
        return tenidoHepatitis;
    }

    public void setTenidoHepatitis(boolean tenidoHepatitis) {
        this.tenidoHepatitis = tenidoHepatitis;
    }

    public String getTiempoHepatitis() {
        return tiempoHepatitis;
    }

    public void setTiempoHepatitis(String tiempoHepatitis) {
        this.tiempoHepatitis = tiempoHepatitis;
    }

    public char getTipoHepatitis() {
        return tipoHepatitis;
    }

    public void setTipoHepatitis(char tipoHepatitis) {
        this.tipoHepatitis = tipoHepatitis;
    }

    public boolean isTieneOtraEnfermedadHepatica() {
        return tieneOtraEnfermedadHepatica;
    }

    public void setTieneOtraEnfermedadHepatica(boolean tieneOtraEnfermedadHepatica) {
        this.tieneOtraEnfermedadHepatica = tieneOtraEnfermedadHepatica;
    }

    public String getEnfermedadHepatica() {
        return enfermedadHepatica;
    }

    public void setEnfermedadHepatica(String enfermedadHepatica) {
        this.enfermedadHepatica = enfermedadHepatica;
    }

    public boolean isTenidoTuberculosis() {
        return tenidoTuberculosis;
    }

    public void setTenidoTuberculosis(boolean tenidoTuberculosis) {
        this.tenidoTuberculosis = tenidoTuberculosis;
    }
    
    
}
