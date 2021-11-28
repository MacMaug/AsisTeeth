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
public class Odontologo {
    private String nombre;
    private String clave;
    private String usuario;
    private int cedula;
    public Odontologo(){
        nombre="";
        clave="";
        usuario="";
        cedula=0;
    }

    public Odontologo(String nombre, int cedula, String usuario, String clave  ) {
        this.nombre = nombre;
        this.clave = clave;
        this.usuario = usuario;
        this.cedula = cedula;
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
    
}
