/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import modelo.Odontologo;

/**
 *
 * @author macmaug <maug.lucas@gmail.com>
 */
public class Datos {
    private static ArrayList<Odontologo>listaOdontologos;
    
    public Datos(){
        listaOdontologos=new ArrayList<Odontologo>();
    }

    public static ArrayList<Odontologo> getListaOdontologos() {
        return listaOdontologos;
    }

    public static void setListaOdontologos(ArrayList<Odontologo> listaOdontologos) {
        Datos.listaOdontologos = listaOdontologos;
    }
    
}
