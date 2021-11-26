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
public class ExamenSubjetivo extends Examen{
    private String motivoConsulta;
    private String cursoEnfermedad;
    private boolean tomandoMedicamento;
    private String medicamentoQueToma;
    private boolean sidoHospitalizado;
    private String motivoHospitalizado;
    private boolean sidoIntervenidoQuirurgicamente;
    private String motivoIntervencion;
    private boolean fuma;
    private int cantidadCigarrillos;
    private String tiempoFumando;
    private boolean toma;
    private String cantidadTomando;
    
    public ExamenSubjetivo (){
        super("Examen Subjetivo");
        motivoConsulta="No Aplica";
        cursoEnfermedad="No Aplica";
        tomandoMedicamento=false;
        medicamentoQueToma="No Aplica";
        sidoHospitalizado=false;
        motivoHospitalizado="No Aplica";
        sidoIntervenidoQuirurgicamente=false;
        motivoIntervencion="No Aplica";
        fuma=false;
        cantidadCigarrillos=0;
        tiempoFumando="No Aplica";
        toma=false;
        cantidadTomando="No Aplica";
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getCursoEnfermedad() {
        return cursoEnfermedad;
    }

    public void setCursoEnfermedad(String cursoEnfermedad) {
        this.cursoEnfermedad = cursoEnfermedad;
    }

    public boolean isTomandoMedicamento() {
        return tomandoMedicamento;
    }

    public void setTomandoMedicamento(boolean tomandoMedicamento) {
        this.tomandoMedicamento = tomandoMedicamento;
    }

    public String getMedicamentoQueToma() {
        return medicamentoQueToma;
    }

    public void setMedicamentoQueToma(String medicamentoQueToma) {
        this.medicamentoQueToma = medicamentoQueToma;
    }

    public boolean isSidoHospitalizado() {
        return sidoHospitalizado;
    }

    public void setSidoHospitalizado(boolean sidoHospitalizado) {
        this.sidoHospitalizado = sidoHospitalizado;
    }

    public String getMotivoHospitalizado() {
        return motivoHospitalizado;
    }

    public void setMotivoHospitalizado(String motivoHospitalizado) {
        this.motivoHospitalizado = motivoHospitalizado;
    }

    public boolean isSidoIntervenidoQuirurgicamente() {
        return sidoIntervenidoQuirurgicamente;
    }

    public void setSidoIntervenidoQuirurgicamente(boolean sidoIntervenidoQuirurgicamente) {
        this.sidoIntervenidoQuirurgicamente = sidoIntervenidoQuirurgicamente;
    }

    public String getMotivoIntervencion() {
        return motivoIntervencion;
    }

    public void setMotivoIntervencion(String motivoIntervencion) {
        this.motivoIntervencion = motivoIntervencion;
    }

    public boolean isFuma() {
        return fuma;
    }

    public void setFuma(boolean fuma) {
        this.fuma = fuma;
    }

    public int getCantidadCigarrillos() {
        return cantidadCigarrillos;
    }

    public void setCantidadCigarrillos(int cantidadCigarrillos) {
        this.cantidadCigarrillos = cantidadCigarrillos;
    }

    public String getTiempoFumando() {
        return tiempoFumando;
    }

    public void setTiempoFumando(String tiempoFumando) {
        this.tiempoFumando = tiempoFumando;
    }

    public boolean isToma() {
        return toma;
    }

    public void setToma(boolean toma) {
        this.toma = toma;
    }

    public String getCantidadTomando() {
        return cantidadTomando;
    }

    public void setCantidadTomando(String cantidadTomando) {
        this.cantidadTomando = cantidadTomando;
    }
    
}
