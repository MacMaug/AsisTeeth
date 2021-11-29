/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import modelo.Datos;
import gui.Inicio;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;
import persistencia.Leer;
/**
 *
 * @author macmaug <maug.lucas@gmail.com>
 */
public class Principal {
    public static void main(String[] args){
        Datos datos=new Datos();
        try {
            Leer.deJSON();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Inicio ventanaInicio=new Inicio();
        ventanaInicio.setVisible(true);
    }
}
