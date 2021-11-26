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
public class ExamenRadiografico extends Examen{
    private String rxPanoramica;
    private String rxPeriapical;
    private String rxOclusal;
    private String otraRadiografica;
    
    public ExamenRadiografico(){
        super("Exámenes Radiográficos");
        rxPanoramica="No Aplica";
        rxPeriapical="No Aplica";
        rxOclusal="No Aplica";
        otraRadiografica="No Aplica";
    }

    public String getRxPanoramica() {
        return rxPanoramica;
    }

    public void setRxPanoramica(String rxPanoramica) {
        this.rxPanoramica = rxPanoramica;
    }

    public String getRxPeriapical() {
        return rxPeriapical;
    }

    public void setRxPeriapical(String rxPeriapical) {
        this.rxPeriapical = rxPeriapical;
    }

    public String getRxOclusal() {
        return rxOclusal;
    }

    public void setRxOclusal(String rxOclusal) {
        this.rxOclusal = rxOclusal;
    }

    public String getOtraRadiografica() {
        return otraRadiografica;
    }

    public void setOtraRadiografica(String otraRadiografica) {
        this.otraRadiografica = otraRadiografica;
    }
    
    
}
