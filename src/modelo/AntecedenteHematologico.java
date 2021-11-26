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
    
    public AntecedenteHematologico(){
        super("Antecedentes Hematológicos");
        tenidoHemorragiasImportantes=false;
        causaHemorragia="No Aplica";
        duracionHemorragia="No Aplica";
        sangranEncias=false;
        sangraPorNariz=false;
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
    
}
