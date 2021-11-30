/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author macmaug <maug.lucas@gmail.com>
 */
public class Odontologo {
    private String nombre;
    private String clave;
    private String usuario;
    private int cedula;
    ArrayList<Paciente> listaPacientes;
    public Odontologo(){
        nombre="";
        clave="";
        usuario="";
        cedula=0;
        listaPacientes=new ArrayList<Paciente>();
    }

    public Odontologo(String nombre, int cedula, String usuario, String clave, ArrayList<Paciente> listaPacientes) {
        this.nombre = nombre;
        this.clave = clave;
        this.usuario = usuario;
        this.cedula = cedula;
        this.listaPacientes=listaPacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    public boolean buscarPaciente(int cedula){
        for(Paciente pac : listaPacientes){
            if(cedula == pac.getCedula())
                return true;
        }
        return false;
    }
    
    public Paciente buscarObjetoPaciente(int cedula){
        for(Paciente pac : listaPacientes){
            if(cedula == pac.getCedula())
                return pac;
        }
        return null;
    }

    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }
    
    
    
}
