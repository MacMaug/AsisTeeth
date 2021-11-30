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
public class AntecedenteHematologico extends Antecedente{
    
    private boolean tenidoHemorragiasImportantes;
    private String causaHemorragia;
    private String duracionHemorragia;
    private boolean sangranEncias;
    private boolean sangraPorNariz;
    private boolean hematomas;
    
    public AntecedenteHematologico(){
        nombre="Hematologico";
        tenidoHemorragiasImportantes=false;
        causaHemorragia="No Aplica";
        duracionHemorragia="No Aplica";
        sangranEncias=false;
        sangraPorNariz=false;
    }

    public AntecedenteHematologico(boolean tenidoHemorragiasImportantes, String causaHemorragia, String duracionHemorragia, boolean sangranEncias, boolean sangraPorNariz, boolean hematomas, String nombre) {
        this.nombre=nombre;
        this.tenidoHemorragiasImportantes = tenidoHemorragiasImportantes;
        this.causaHemorragia = causaHemorragia;
        this.duracionHemorragia = duracionHemorragia;
        this.sangranEncias = sangranEncias;
        this.sangraPorNariz = sangraPorNariz;
        this.hematomas = hematomas;
    }

    public void setHematomas(boolean hematomas) {
        this.hematomas = hematomas;
    }
    
    public boolean isTenidoHemorragiasImportantes() {
        return tenidoHemorragiasImportantes;
    }

    public void setTenidoHemorragiasImportantes(boolean tenidoHemorragiasImportantes) {
        this.tenidoHemorragiasImportantes = tenidoHemorragiasImportantes;
    }

    public String getCausaHemorragia() {
        return causaHemorragia;
    }

    public void setCausaHemorragia(String causaHemorragia) {
        this.causaHemorragia = causaHemorragia;
    }

    public String getDuracionHemorragia() {
        return duracionHemorragia;
    }

    public void setDuracionHemorragia(String duracionHemorragia) {
        this.duracionHemorragia = duracionHemorragia;
    }

    public boolean isSangranEncias() {
        return sangranEncias;
    }

    public void setSangranEncias(boolean sangranEncias) {
        this.sangranEncias = sangranEncias;
    }

    public boolean isSangraPorNariz() {
        return sangraPorNariz;
    }

    public void setSangraPorNariz(boolean sangraPorNariz) {
        this.sangraPorNariz = sangraPorNariz;
    }

    public boolean isHematomas() {
        return hematomas;
    }
    
    
}
