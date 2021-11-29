/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Datos;
import modelo.Odontologo;

/**
 *
 * @author macmaug <maug.lucas@gmail.com>
 */
public class CInicioSesion {

    public static String validarInicio(String nombreUsuario, String clave) {
        String error = "";
        if (CUsuario.existe(Datos.getListaOdontologos(), nombreUsuario)) {//Comprueba que exista
            Odontologo odontologo = CUsuario.obtenerOdontologo(Datos.getListaOdontologos(), nombreUsuario); //lo busca
            if (odontologo.getClave().equals(clave)) { //compara las claves
                return "";
            } else {
                error += "Contraseña incorrecta.\n";
            }
        } else {
            error += "El nombre de usuario no se encuentra registrado.";
        }
        return error;
    }
}
