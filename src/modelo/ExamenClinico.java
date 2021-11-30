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
public class ExamenClinico extends Examen{
    private boolean incluirTensionArterial;
    private int tensionArterialMinima;
    private int tensionArterialMaxima;
    private boolean incluirPalpacion;
    private boolean gangliosPalpables;
    private String ubicacionGanglios;
    private String caracteristicasPalpacion;
    private String labios;
    private String frenillosLabiales;
    private String vestibuloBocal;
    private String mucosaPalatina;
    private String mucosaPisoDeBoca;
    private String frenilloLingual;
    private String caraDorsalLengua;
    private String caraVentralLengua;
    private String bordesLateralesLengua;
    private String encia;
    private String dientes;
    
    public ExamenClinico(){
        super("Examen Clínico");
        tensionArterialMinima=0;
        tensionArterialMaxima=0;
        gangliosPalpables=false;
        ubicacionGanglios="No Aplica";
        labios="No Aplica";
        frenillosLabiales="No Aplica";
        caraDorsalLengua="No Aplica";
        caraVentralLengua="No Aplica";     
        bordesLateralesLengua="No Aplica";            
        encia="No Aplica";
        dientes="No Aplica";
    }

    public ExamenClinico(boolean inlcuirTensionArterial,int tensionArterialMinima, int tensionArterialMaxima, boolean incluirPalpacion, boolean gangliosPalpables, String ubicacionGanglios, String caracteristicasPalpacion, String labios, String frenillosLabiales, String vestibuloBocal, String mucosaPalatina, String mucosaPisoDeBoca, String frenilloLingual, String caraDorsalLengua, String caraVentralLengua, String bordesLateralesLengua, String encia, String dientes, String nombre) {
        super(nombre);
        this.incluirTensionArterial = inlcuirTensionArterial;
        this.tensionArterialMinima = tensionArterialMinima;
        this.tensionArterialMaxima = tensionArterialMaxima;
        this.incluirPalpacion = incluirPalpacion;
        this.gangliosPalpables = gangliosPalpables;
        this.ubicacionGanglios = ubicacionGanglios;
        this.caracteristicasPalpacion = caracteristicasPalpacion;
        this.labios = labios;
        this.frenillosLabiales = frenillosLabiales;
        this.vestibuloBocal = vestibuloBocal;
        this.mucosaPalatina = mucosaPalatina;
        this.mucosaPisoDeBoca = mucosaPisoDeBoca;
        this.frenilloLingual = frenilloLingual;
        this.caraDorsalLengua = caraDorsalLengua;
        this.caraVentralLengua = caraVentralLengua;
        this.bordesLateralesLengua = bordesLateralesLengua;
        this.encia = encia;
        this.dientes = dientes;
    }

    public void setIncluirTensionArterial(boolean incluirTensionArterial) {
        this.incluirTensionArterial = incluirTensionArterial;
    }

    public void setIncluirPalpacion(boolean incluirPalpacion) {
        this.incluirPalpacion = incluirPalpacion;
    }

    public void setCaracteristicasPalpacion(String caracteristicasPalpacion) {
        this.caracteristicasPalpacion = caracteristicasPalpacion;
    }

    
    
    public int getTensionArterialMinima() {
        return tensionArterialMinima;
    }

    public void setTensionArterialMinima(int tensionArterialMinima) {
        this.tensionArterialMinima = tensionArterialMinima;
    }

    public int getTensionArterialMaxima() {
        return tensionArterialMaxima;
    }

    public void setTensionArterialMaxima(int tensionArterialMaxima) {
        this.tensionArterialMaxima = tensionArterialMaxima;
    }

    public boolean isGangliosPalpables() {
        return gangliosPalpables;
    }

    public void setGangliosPalpables(boolean gangliosPalpables) {
        this.gangliosPalpables = gangliosPalpables;
    }

    public String getUbicacionGanglios() {
        return ubicacionGanglios;
    }

    public void setUbicacionGanglios(String ubicacionGanglios) {
        this.ubicacionGanglios = ubicacionGanglios;
    }

    public String getLabios() {
        return labios;
    }

    public void setLabios(String labios) {
        this.labios = labios;
    }

    public String getFrenillosLabiales() {
        return frenillosLabiales;
    }

    public void setFrenillosLabiales(String frenillosLabiales) {
        this.frenillosLabiales = frenillosLabiales;
    }

    public String getVestibuloBocal() {
        return vestibuloBocal;
    }

    public void setVestibuloBocal(String vestibuloBocal) {
        this.vestibuloBocal = vestibuloBocal;
    }

    public String getMucosaPalatina() {
        return mucosaPalatina;
    }

    public void setMucosaPalatina(String mucosaPalatina) {
        this.mucosaPalatina = mucosaPalatina;
    }

    public String getMucosaPisoDeBoca() {
        return mucosaPisoDeBoca;
    }

    public void setMucosaPisoDeBoca(String mucosaPisoDeBoca) {
        this.mucosaPisoDeBoca = mucosaPisoDeBoca;
    }

    public String getFrenilloLingual() {
        return frenilloLingual;
    }

    public void setFrenilloLingual(String frenilloLingual) {
        this.frenilloLingual = frenilloLingual;
    }

    public String getCaraDorsalLengua() {
        return caraDorsalLengua;
    }

    public void setCaraDorsalLengua(String caraDorsalLengua) {
        this.caraDorsalLengua = caraDorsalLengua;
    }

    public String getCaraVentralLengua() {
        return caraVentralLengua;
    }

    public void setCaraVentralLengua(String caraVentralLengua) {
        this.caraVentralLengua = caraVentralLengua;
    }

    public String getBordesLateralesLengua() {
        return bordesLateralesLengua;
    }

    public void setBordesLateralesLengua(String bordesLateralesLengua) {
        this.bordesLateralesLengua = bordesLateralesLengua;
    }

    public String getEncia() {
        return encia;
    }

    public void setEncia(String encia) {
        this.encia = encia;
    }

    public String getDientes() {
        return dientes;
    }

    public void setDientes(String dientes) {
        this.dientes = dientes;
    }

    public boolean isIncluirTensionArterial() {
        return incluirTensionArterial;
    }

    public boolean isIncluirPalpacion() {
        return incluirPalpacion;
    }

    public String getCaracteristicasPalpacion() {
        return caracteristicasPalpacion;
    }
    
    
    
}
