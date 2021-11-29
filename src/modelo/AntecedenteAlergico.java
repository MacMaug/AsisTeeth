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
public class AntecedenteAlergico extends Antecedente{
    private boolean alergicoAMedicamento;
    private String medicamentosConAlergia;
    private boolean tenidoUrticaria;
    private boolean dificultadParaTragar;
    private boolean dificultadParaRespirar;
    private boolean tenidoAsma;
    private String ultimaCrisisAsma;
    private String reaccionAnestesia;
    
    public AntecedenteAlergico(){
        super("Antecedentes Alérgicos");
        alergicoAMedicamento=false;
        medicamentosConAlergia="No Aplica";
        tenidoUrticaria=false;
        dificultadParaTragar=false;
        dificultadParaRespirar=false;
        tenidoAsma=false;
        ultimaCrisisAsma="No Aplica";
        reaccionAnestesia="No Aplica";
    }

    public AntecedenteAlergico(boolean alergicoAMedicamento, String medicamentosConAlergia, boolean tenidoUrticaria, boolean dificultadParaTragar, boolean dificultadParaRespirar, boolean tenidoAsma, String ultimaCrisisAsma, String reaccionAnestesia, String nombre) {
        super(nombre);
        this.alergicoAMedicamento = alergicoAMedicamento;
        this.medicamentosConAlergia = medicamentosConAlergia;
        this.tenidoUrticaria = tenidoUrticaria;
        this.dificultadParaTragar = dificultadParaTragar;
        this.dificultadParaRespirar = dificultadParaRespirar;
        this.tenidoAsma = tenidoAsma;
        this.ultimaCrisisAsma = ultimaCrisisAsma;
        this.reaccionAnestesia = reaccionAnestesia;
    }
    
    public boolean isAlergicoAMedicamento() {
        return alergicoAMedicamento;
    }

    public void setAlergicoAMedicamento(boolean alergicoAMedicamento) {
        this.alergicoAMedicamento = alergicoAMedicamento;
    }

    public String getMedicamentosConAlergia() {
        return medicamentosConAlergia;
    }

    public void setMedicamentosConAlergia(String medicamentosConAlergia) {
        this.medicamentosConAlergia = medicamentosConAlergia;
    }

    public boolean isTenidoUrticaria() {
        return tenidoUrticaria;
    }

    public void setTenidoUrticaria(boolean tenidoUrticaria) {
        this.tenidoUrticaria = tenidoUrticaria;
    }

    public boolean isDificultadParaTragar() {
        return dificultadParaTragar;
    }

    public void setDificultadParaTragar(boolean dificultadParaTragar) {
        this.dificultadParaTragar = dificultadParaTragar;
    }

    public boolean isDificultadParaRespirar() {
        return dificultadParaRespirar;
    }

    public void setDificultadParaRespirar(boolean dificultadParaRespirar) {
        this.dificultadParaRespirar = dificultadParaRespirar;
    }

    public boolean isTenidoAsma() {
        return tenidoAsma;
    }

    public void setTenidoAsma(boolean tenidoAsma) {
        this.tenidoAsma = tenidoAsma;
    }

    public String getUltimaCrisisAsma() {
        return ultimaCrisisAsma;
    }

    public void setUltimaCrisisAsma(String ultimaCrisisAsma) {
        this.ultimaCrisisAsma = ultimaCrisisAsma;
    }

    public String getReaccionAnestesia() {
        return reaccionAnestesia;
    }

    public void setReaccionAnestesia(String reaccionAnestesia) {
        this.reaccionAnestesia = reaccionAnestesia;
    }
    
    
}
