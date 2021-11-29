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
public class AntecedenteFamiliar extends Antecedente{
    private String cancer;
    private String diabetes;
    private String pulmonares;
    private String cardiovasculares;
    private String hepaticas;
    private String otros;
    
    public AntecedenteFamiliar (){
        super("Antecedentes Familiares");
        cancer="No Aplica";
        diabetes="No Aplica";
        pulmonares="No Aplica";
        cardiovasculares="No Aplica";
        hepaticas="No Aplica";
        otros="No Aplica";
    }

    public AntecedenteFamiliar(String cancer, String diabetes, String pulmonares, String cardiovasculares, String hepaticas, String otros, String nombre) {
        super(nombre);
        this.cancer = cancer;
        this.diabetes = diabetes;
        this.pulmonares = pulmonares;
        this.cardiovasculares = cardiovasculares;
        this.hepaticas = hepaticas;
        this.otros = otros;
    }
    
    

    public String getCancer() {
        return cancer;
    }

    public void setCancer(String cancer) {
        this.cancer = cancer;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getPulmonares() {
        return pulmonares;
    }

    public void setPulmonares(String pulmonares) {
        this.pulmonares = pulmonares;
    }

    public String getCardiovasculares() {
        return cardiovasculares;
    }

    public void setCardiovasculares(String cardiovasculares) {
        this.cardiovasculares = cardiovasculares;
    }

    public String getHepaticas() {
        return hepaticas;
    }

    public void setHepaticas(String hepaticas) {
        this.hepaticas = hepaticas;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }
    
}
