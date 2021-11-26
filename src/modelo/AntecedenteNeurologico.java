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
public class AntecedenteNeurologico extends Antecedente {
    private boolean tenidoConvulsiones;
    private String tiempoConvulsiones;
    private boolean tenidoEpilepsia;
    private String ultimaCrisisEpileptica;
    private boolean tenidoNeuritisEnCara;
    private boolean alteraConFacilidad;
    private boolean cefaleasFrecuentes;
    
    public AntecedenteNeurologico (){
        super("Antecedentes Neurológicos");
        tenidoConvulsiones=false;
        tiempoConvulsiones="No Aplica";
        tenidoEpilepsia=false;
        ultimaCrisisEpileptica="No Aplica";
        tenidoNeuritisEnCara=false;
        alteraConFacilidad=false;
        cefaleasFrecuentes=false;  
    }

    public boolean isTenidoConvulsiones() {
        return tenidoConvulsiones;
    }

    public void setTenidoConvulsiones(boolean tenidoConvulsiones) {
        this.tenidoConvulsiones = tenidoConvulsiones;
    }

    public String getTiempoConvulsiones() {
        return tiempoConvulsiones;
    }

    public void setTiempoConvulsiones(String tiempoConvulsiones) {
        this.tiempoConvulsiones = tiempoConvulsiones;
    }

    public boolean isTenidoEpilepsia() {
        return tenidoEpilepsia;
    }

    public void setTenidoEpilepsia(boolean tenidoEpilepsia) {
        this.tenidoEpilepsia = tenidoEpilepsia;
    }

    public String getUltimaCrisisEpileptica() {
        return ultimaCrisisEpileptica;
    }

    public void setUltimaCrisisEpileptica(String ultimaCrisisEpileptica) {
        this.ultimaCrisisEpileptica = ultimaCrisisEpileptica;
    }

    public boolean isTenidoNeuritisEnCara() {
        return tenidoNeuritisEnCara;
    }

    public void setTenidoNeuritisEnCara(boolean tenidoNeuritisEnCara) {
        this.tenidoNeuritisEnCara = tenidoNeuritisEnCara;
    }

    public boolean isAlteraConFacilidad() {
        return alteraConFacilidad;
    }

    public void setAlteraConFacilidad(boolean alteraConFacilidad) {
        this.alteraConFacilidad = alteraConFacilidad;
    }

    public boolean isCefaleasFrecuentes() {
        return cefaleasFrecuentes;
    }

    public void setCefaleasFrecuentes(boolean cefaleasFrecuentes) {
        this.cefaleasFrecuentes = cefaleasFrecuentes;
    }
    
}
