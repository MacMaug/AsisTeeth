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
public class AntecedenteRenalGastroIntestinal extends Antecedente{
    private boolean tenidoEnfermedadRenal;
    private int cantidadOrinaAlDia;
    private String colorOrina;
    private boolean tenidoAcidezEstomacal;
    private boolean tenidoUlceraPeptica;
    private boolean tenidoDiarreaFrecuente;
    private boolean sufridoCalculosRenales;
    
    public AntecedenteRenalGastroIntestinal(){
        nombre="RN";
        tenidoEnfermedadRenal=false;
        cantidadOrinaAlDia=0;
        colorOrina="No Aplica";
        tenidoAcidezEstomacal=false;
        tenidoUlceraPeptica=false;
        tenidoDiarreaFrecuente=false;
        sufridoCalculosRenales=false;
    }

    public AntecedenteRenalGastroIntestinal(boolean tenidoEnfermedadRenal, int cantidadOrinaAlDia, String colorOrina, boolean tenidoAcidezEstomacal, boolean tenidoUlceraPeptica, boolean tenidoDiarreaFrecuente, boolean sufridoCalculosRenales, String nombre) {
        this.nombre=nombre;
        this.tenidoEnfermedadRenal = tenidoEnfermedadRenal;
        this.cantidadOrinaAlDia = cantidadOrinaAlDia;
        this.colorOrina = colorOrina;
        this.tenidoAcidezEstomacal = tenidoAcidezEstomacal;
        this.tenidoUlceraPeptica = tenidoUlceraPeptica;
        this.tenidoDiarreaFrecuente = tenidoDiarreaFrecuente;
        this.sufridoCalculosRenales = sufridoCalculosRenales;
    }

    public boolean isTenidoEnfermedadRenal() {
        return tenidoEnfermedadRenal;
    }

    public void setTenidoEnfermedadRenal(boolean tenidoEnfermedadRenal) {
        this.tenidoEnfermedadRenal = tenidoEnfermedadRenal;
    }

    public int getCantidadOrinaAlDia() {
        return cantidadOrinaAlDia;
    }

    public void setCantidadOrinaAlDia(int cantidadOrinaAlDia) {
        this.cantidadOrinaAlDia = cantidadOrinaAlDia;
    }

    public String getColorOrina() {
        return colorOrina;
    }

    public void setColorOrina(String colorOrina) {
        this.colorOrina = colorOrina;
    }

    public boolean isTenidoAcidezEstomacal() {
        return tenidoAcidezEstomacal;
    }

    public void setTenidoAcidezEstomacal(boolean tenidoAcidezEstomacal) {
        this.tenidoAcidezEstomacal = tenidoAcidezEstomacal;
    }

    public boolean isTenidoUlceraPeptica() {
        return tenidoUlceraPeptica;
    }

    public void setTenidoUlceraPeptica(boolean tenidoUlceraPeptica) {
        this.tenidoUlceraPeptica = tenidoUlceraPeptica;
    }

    public boolean isTenidoDiarreaFrecuente() {
        return tenidoDiarreaFrecuente;
    }

    public void setTenidoDiarreaFrecuente(boolean tenidoDiarreaFrecuente) {
        this.tenidoDiarreaFrecuente = tenidoDiarreaFrecuente;
    }

    public boolean isSufridoCalculosRenales() {
        return sufridoCalculosRenales;
    }

    public void setSufridoCalculosRenales(boolean sufridoCalculosRenales) {
        this.sufridoCalculosRenales = sufridoCalculosRenales;
    }
    
}
