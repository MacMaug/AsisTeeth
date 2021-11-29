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
public class AntecedenteCardiovascular extends Antecedente{
    private boolean cansaSubirEscaleras;
    private boolean edemaMiembrosInferiores;
    private boolean palpitaciones;
    private boolean doloresEnPecho;
    private boolean tenidoInfarto;
    private String cuandoInfarto;
    private boolean sufreEndocarnitisBacteriana;
    private boolean presentaVulvopatia;
    private boolean esHipertenso;
    private boolean esHipotenso;
    private boolean estaEnTratamiento;
    
    public AntecedenteCardiovascular(){
        super("Antecedentes Cardiovasculares");
        cansaSubirEscaleras=false;
        edemaMiembrosInferiores=false;
        palpitaciones=false;
        doloresEnPecho=false;
        tenidoInfarto=false;
        cuandoInfarto="No Aplica";
        sufreEndocarnitisBacteriana=false;
        presentaVulvopatia=false;
        esHipertenso=false;
        esHipotenso=false;
        estaEnTratamiento=false;
    }

    public AntecedenteCardiovascular(boolean cansaSubirEscaleras, boolean edemaMiembrosInferiores, boolean palpitaciones, boolean doloresEnPecho, boolean tenidoInfarto, String cuandoInfarto, boolean sufreEndocarnitisBacteriana, boolean presentaVulvopatia, boolean esHipertenso, boolean esHipotenso, boolean estaEnTratamiento, String nombre) {
        super(nombre);
        this.cansaSubirEscaleras = cansaSubirEscaleras;
        this.edemaMiembrosInferiores = edemaMiembrosInferiores;
        this.palpitaciones = palpitaciones;
        this.doloresEnPecho = doloresEnPecho;
        this.tenidoInfarto = tenidoInfarto;
        this.cuandoInfarto = cuandoInfarto;
        this.sufreEndocarnitisBacteriana = sufreEndocarnitisBacteriana;
        this.presentaVulvopatia = presentaVulvopatia;
        this.esHipertenso = esHipertenso;
        this.esHipotenso = esHipotenso;
        this.estaEnTratamiento = estaEnTratamiento;
    }

    public boolean isCansaSubirEscaleras() {
        return cansaSubirEscaleras;
    }

    public void setCansaSubirEscaleras(boolean cansaSubirEscaleras) {
        this.cansaSubirEscaleras = cansaSubirEscaleras;
    }

    public boolean isEdemaMiembrosInferiores() {
        return edemaMiembrosInferiores;
    }

    public void setEdemaMiembrosInferiores(boolean edemaMiembrosInferiores) {
        this.edemaMiembrosInferiores = edemaMiembrosInferiores;
    }

    public boolean isPalpitaciones() {
        return palpitaciones;
    }

    public void setPalpitaciones(boolean palpitaciones) {
        this.palpitaciones = palpitaciones;
    }

    public boolean isDoloresEnPecho() {
        return doloresEnPecho;
    }

    public void setDoloresEnPecho(boolean doloresEnPecho) {
        this.doloresEnPecho = doloresEnPecho;
    }

    public boolean isTenidoInfarto() {
        return tenidoInfarto;
    }

    public void setTenidoInfarto(boolean tenidoInfarto) {
        this.tenidoInfarto = tenidoInfarto;
    }

    public String getCuandoInfarto() {
        return cuandoInfarto;
    }

    public void setCuandoInfarto(String cuandoInfarto) {
        this.cuandoInfarto = cuandoInfarto;
    }

    public boolean isSufreEndocarnitisBacteriana() {
        return sufreEndocarnitisBacteriana;
    }

    public void setSufreEndocarnitisBacteriana(boolean sufreEndocarnitisBacteriana) {
        this.sufreEndocarnitisBacteriana = sufreEndocarnitisBacteriana;
    }

    public boolean isPresentaVulvopatia() {
        return presentaVulvopatia;
    }

    public void setPresentaVulvopatia(boolean presentaVulvopatia) {
        this.presentaVulvopatia = presentaVulvopatia;
    }

    public boolean isEsHipertenso() {
        return esHipertenso;
    }

    public void setEsHipertenso(boolean esHipertenso) {
        this.esHipertenso = esHipertenso;
    }

    public boolean isEsHipotenso() {
        return esHipotenso;
    }

    public void setEsHipotenso(boolean esHipotenso) {
        this.esHipotenso = esHipotenso;
    }

    public boolean isEstaEnTratamiento() {
        return estaEnTratamiento;
    }

    public void setEstaEnTratamiento(boolean estaEnTratamiento) {
        this.estaEnTratamiento = estaEnTratamiento;
    }
    
}
