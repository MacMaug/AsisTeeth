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
public class AntecedenteNutricional extends Antecedente{
    private boolean tenidoAnemia;
    private boolean perdidoPeso;
    private boolean enDieta;
    private boolean enDecaimiento;
    private boolean conMalestarGeneral;
    private boolean conFiebre;
    private boolean diabetico;
    private boolean estaEnTratamiento;
    private boolean orinaDeNoche;
    private int vecesOrinaDeNoche;
    private boolean sienteMuchaSed;
    private boolean tieneInsomnio;
    private boolean padeceDeTiroides;
    
    public AntecedenteNutricional(){
        nombre="Nutricional";
        tenidoAnemia=false;
        perdidoPeso=false;
        enDieta=false;
        enDecaimiento=false;
        conMalestarGeneral=false;
        conFiebre=false;
        estaEnTratamiento=false;
        orinaDeNoche=false;
        vecesOrinaDeNoche=0;
        sienteMuchaSed=false;
        tieneInsomnio=false;
        padeceDeTiroides=false;
    }

    public AntecedenteNutricional(boolean tenidoAnemia, boolean perdidoPeso, boolean enDieta, boolean enDecaimiento, boolean conMalestarGeneral, boolean conFiebre, boolean diabetico, boolean estaEnTratamiento, boolean orinaDeNoche, int vecesOrinaDeNoche, boolean sienteMuchaSed, boolean tieneInsomnio, boolean padeceDeTiroides, String nombre) {
        this.nombre=nombre;
        this.tenidoAnemia = tenidoAnemia;
        this.perdidoPeso = perdidoPeso;
        this.enDieta = enDieta;
        this.enDecaimiento = enDecaimiento;
        this.conMalestarGeneral = conMalestarGeneral;
        this.conFiebre = conFiebre;
        this.diabetico = diabetico;
        this.estaEnTratamiento = estaEnTratamiento;
        this.orinaDeNoche = orinaDeNoche;
        this.vecesOrinaDeNoche = vecesOrinaDeNoche;
        this.sienteMuchaSed = sienteMuchaSed;
        this.tieneInsomnio = tieneInsomnio;
        this.padeceDeTiroides = padeceDeTiroides;
    }
    
    

    public boolean isTenidoAnemia() {
        return tenidoAnemia;
    }

    public void setTenidoAnemia(boolean tenidoAnemia) {
        this.tenidoAnemia = tenidoAnemia;
    }

    public boolean isPerdidoPeso() {
        return perdidoPeso;
    }

    public void setPerdidoPeso(boolean perdidoPeso) {
        this.perdidoPeso = perdidoPeso;
    }

    public boolean isEnDieta() {
        return enDieta;
    }

    public void setEnDieta(boolean enDieta) {
        this.enDieta = enDieta;
    }

    public boolean isEnDecaimiento() {
        return enDecaimiento;
    }

    public void setEnDecaimiento(boolean enDecaimiento) {
        this.enDecaimiento = enDecaimiento;
    }

    public boolean isConMalestarGeneral() {
        return conMalestarGeneral;
    }

    public void setConMalestarGeneral(boolean conMalestarGeneral) {
        this.conMalestarGeneral = conMalestarGeneral;
    }

    public boolean isConFiebre() {
        return conFiebre;
    }

    public void setConFiebre(boolean conFiebre) {
        this.conFiebre = conFiebre;
    }

    public boolean isEstaEnTratamiento() {
        return estaEnTratamiento;
    }

    public void setEstaEnTratamiento(boolean estaEnTratamiento) {
        this.estaEnTratamiento = estaEnTratamiento;
    }

    public boolean isOrinaDeNoche() {
        return orinaDeNoche;
    }

    public void setOrinaDeNoche(boolean orinaDeNoche) {
        this.orinaDeNoche = orinaDeNoche;
    }

    public int getVecesOrinaDeNoche() {
        return vecesOrinaDeNoche;
    }

    public void setVecesOrinaDeNoche(int vecesOrinaDeNoche) {
        this.vecesOrinaDeNoche = vecesOrinaDeNoche;
    }

    public boolean isSienteMuchaSed() {
        return sienteMuchaSed;
    }

    public void setSienteMuchaSed(boolean sienteMuchaSed) {
        this.sienteMuchaSed = sienteMuchaSed;
    }

    public boolean isTieneInsomnio() {
        return tieneInsomnio;
    }

    public void setTieneInsomnio(boolean tieneInsomnio) {
        this.tieneInsomnio = tieneInsomnio;
    }

    public boolean isPadeceDeTiroides() {
        return padeceDeTiroides;
    }

    public void setPadeceDeTiroides(boolean padeceDeTiroides) {
        this.padeceDeTiroides = padeceDeTiroides;
    }

    public boolean isDiabetico() {
        return diabetico;
    }
    
    
}
