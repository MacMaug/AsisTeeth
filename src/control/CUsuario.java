/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.swing.JTextField;
import modelo.Datos;
import modelo.Odontologo;
/**
 *
 * @author macmaug <maug.lucas@gmail.com>
 */
public class CUsuario {
    
    public static void registrar(Odontologo odontologo){
        Datos.getListaOdontologos().add(odontologo);
    }
    
    public static boolean existe(ArrayList<Odontologo>listaOdontologos, Odontologo odontologo){
        for(Odontologo cadaOdontologo: listaOdontologos){
            if(cadaOdontologo.getUsuario().equals(odontologo.getUsuario())){
                return true;
            }
        }
        return false;
    }
    
    public static String validarDatosUsuario(JTextField nombre, JTextField cedula, JTextField usuario, JTextField clave, JTextField confirmacionClave){
        String error="";
        if(!esNombre(nombre.getText())){
            error+="El nombre no puede contener caracteres especiales o números.\n";
        }
        if(!esNumero(cedula.getText())){
            error+="La cédula solo puede contener números.\n";
        }
        if(!esNombreDeUsuario(usuario.getText())){
            error+="El nombre de usuario solo puede contener letras minúsculas y números.\n";
        }
        if(!esClave(clave.getText())){
            error+="Contraseña inválida. Debe tener mínimo 8 caracteres y contener 2 caracteres especiales <=>?@ como mínimo\n";
        }
        if(!sonTextosCoincidentes(clave.getText(), confirmacionClave.getText())){
            error+="Las contraseñas no coinciden.\n";
        }
        return error;
    }
     
    public static boolean esNombre(String texto){ //Devuelve true si solo tiene letras y espacios en blanco
        if(texto.length()==0){
            return false;
        }
        for(char letra: texto.toCharArray()){
            int codigo=letra;
            if(!((codigo>=65 && codigo<=90) || (codigo>=97 && codigo<=122)) && !(codigo==32)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean esNumero(String texto){ //Devuelve true si solo contiene números 
        if(texto.length()==0){
            return false;
        }
        for(char digito: texto.toCharArray()){
            int codigo=digito;
            if(!(codigo>=48 && codigo<=57)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean esNombreDeUsuario(String texto){ //Devuelve true si solo contiene letras minúsculas y números
        if(texto.length()==0){
            return false;
        }
        for(char letra: texto.toCharArray()){
            int codigo=letra;
            if(!((codigo>=48 && codigo<=57)||(codigo>=97 && codigo<=122))){
                return false; 
            }
        }
        return true;
    }
    
    public static boolean esClave(String texto){
        if(texto.length()<8){
            return false;
        }
        int contadorEspeciales=0;
        for(char letra: texto.toCharArray()){
            int codigo=letra;
            if(!((codigo>=48 && codigo<=57)||(codigo>=60 && codigo<=90)||(codigo>=97 && codigo<=122))){
                return false; 
            }
            if(codigo>=60 && codigo<=64){
                contadorEspeciales++;
            }
        }
        return (contadorEspeciales>=2);
    }
    
    public static boolean sonTextosCoincidentes(String texto1, String texto2){
        if(texto1.length()==0||texto2.length()==0){
            return false;
        }
        return texto1.equals(texto2);
    }
    
    public static boolean esEntero(String entrada) { //Indica si el número es entero
		for (int i = 0; i < entrada.length(); i++) {
			// Si algún dígito no es un número devolverá falso
			if (Character.isDigit(entrada.charAt(i)) == false) {
				return false;
			}
		}
		// Si logra completar el ciclo, devolverá verdadero
		return true;
	}

    
    public static int convertirAEntero(String entrada) { //Devuelve el valor entero o, en su defecto, -1
		// Comprueba que sea número y no sea vacío
		if (esEntero(entrada) && entrada.length() != 0) {
			// Si se cumple, devuelve el valor
			return Integer.parseInt(entrada);
		} else {
			// Si no se cumple, devuelve -1
			return -1;
		}
	}
}
