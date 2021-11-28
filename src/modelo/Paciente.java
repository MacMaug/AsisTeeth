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
public class Paciente {
    private String nombre;
    private int cedula;
    private String lugarNacimiento;
    private int historiaClinica;
    private char sexo;
    //private ArrayList<Consulta> listaConsultas;
    
    public Paciente(){
        nombre="";
        cedula=0;
        lugarNacimiento="";
        historiaClinica=0;
        sexo='M';
    }

    public Paciente(String nombre, int cedula, String lugarNacimiento, int historiaClinica, char sexo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.lugarNacimiento = lugarNacimiento;
        this.historiaClinica = historiaClinica;
        this.sexo = sexo;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public void setHistoriaClinica(int historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public int getHistoriaClinica() {
        return historiaClinica;
    }

    public char getSexo() {
        return sexo;
    }
}
