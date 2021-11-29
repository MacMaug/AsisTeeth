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
public class AntecedenteFemenino extends Antecedente {
    private String regularidadMenstrual;
    private String duracionMenstrual;
    private boolean estaEmbarazada;
    private int mesesDeEmbarazo;
    private boolean tomaPastillasAnticonceptivas;
    private boolean tieneMenopausia;
    
    public AntecedenteFemenino(){
        super("Antecedentes Femeninos");
        regularidadMenstrual="No Aplica";
        duracionMenstrual="No Aplica";
        estaEmbarazada=false;
        mesesDeEmbarazo=0;
        tomaPastillasAnticonceptivas=false;
        tieneMenopausia=false;
    }

    public AntecedenteFemenino(String regularidadMenstrual, boolean estaEmbarazada, int mesesDeEmbarazo, boolean tomaPastillasAnticonceptivas, boolean tieneMenopausia, String nombre) {
        super(nombre);
        this.regularidadMenstrual = regularidadMenstrual;
        this.estaEmbarazada = estaEmbarazada;
        this.mesesDeEmbarazo = mesesDeEmbarazo;
        this.tomaPastillasAnticonceptivas = tomaPastillasAnticonceptivas;
        this.tieneMenopausia = tieneMenopausia;
    }

    public String getRegularidadMenstrual() {
        return regularidadMenstrual;
    }

    public void setRegularidadMenstrual(String regularidadMenstrual) {
        this.regularidadMenstrual = regularidadMenstrual;
    }

    public String getDuracionMenstrual() {
        return duracionMenstrual;
    }

    public void setDuracionMenstrual(String duracionMenstrual) {
        this.duracionMenstrual = duracionMenstrual;
    }

    public boolean isEstaEmbarazada() {
        return estaEmbarazada;
    }

    public void setEstaEmbarazada(boolean estaEmbarazada) {
        this.estaEmbarazada = estaEmbarazada;
    }

    public int getMesesDeEmbarazo() {
        return mesesDeEmbarazo;
    }

    public void setMesesDeEmbarazo(int mesesDeEmbarazo) {
        this.mesesDeEmbarazo = mesesDeEmbarazo;
    }

    public boolean isTomaPastillasAnticonceptivas() {
        return tomaPastillasAnticonceptivas;
    }

    public void setTomaPastillasAnticonceptivas(boolean tomaPastillasAnticonceptivas) {
        this.tomaPastillasAnticonceptivas = tomaPastillasAnticonceptivas;
    }

    public boolean isTieneMenopausia() {
        return tieneMenopausia;
    }

    public void setTieneMenopausia(boolean tieneMenopausia) {
        this.tieneMenopausia = tieneMenopausia;
    }
    
}
