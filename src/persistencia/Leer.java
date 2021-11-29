/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import modelo.Odontologo;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import modelo.Datos;
/**
 *
 * @author macmaug <maug.lucas@gmail.com>
 */
public class Leer {

    public static void deJSON() throws IOException{
        Gson gson = new Gson();
        java.lang.reflect.Type listType = new TypeToken<ArrayList<Odontologo>>() {}.getType();
        FileReader reader = new FileReader("src/files/usuarios.json");
        ArrayList<Odontologo> lista = gson.fromJson(reader, listType);
        Datos.setListaOdontologos(lista);
        if(Datos.getListaOdontologos().size()>0){
            Encriptar encriptacion = new Encriptar();
            encriptacion.desencriptarClaves();
        }
    }
}

