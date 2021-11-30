/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Datos;
import modelo.Odontologo;

/**
 *
 * @author macmaug <maug.lucas@gmail.com>
 */
public class Guardar {

    public static void enJSON() {
        Gson gson = new Gson();
        Encriptar encriptacion = new Encriptar();
        encriptacion.encriptarClaves();
        java.lang.reflect.Type listType = new TypeToken<ArrayList<Odontologo>>() {}.getType();
        String json = gson.toJson(Datos.getListaOdontologos(), listType);
        encriptacion.desencriptarClaves();
        try {
            FileWriter writer = new FileWriter("src/files/usuarios.json");
            writer.write(json);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
