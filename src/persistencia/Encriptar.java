/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.security.spec.KeySpec;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import modelo.Datos;
import modelo.Odontologo;

/**
 *
 * @author macmaug <maug.lucas@gmail.com>
 */
public class Encriptar {

    /**
     * Atributos para el funcionamiento de la clase, entre ellos key y salt los
     * cuales son los principales encargados de realizar la encriptación y la
     * desencriptación
     */
    private static final String key =  "1NGjlfas@*?0a1_@rq!SoFTa?*+vc3a5b4";
    private static final String salt = "ao9(=S>kD3L-{sq@z<=%#*793W4RE:mck;";
    private SecretKey secretKeyTemp;

    /**
     * Metodo encargado de realizar la encriptación a traves de comandos
     * especiales
     */
    public Encriptar() {
        SecretKeyFactory secretKeyFactory;
        KeySpec keySpec;
        try {
            secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
            keySpec = new PBEKeySpec(key.toCharArray(), salt.getBytes(), 65536, 256);
            secretKeyTemp = secretKeyFactory.generateSecret(keySpec);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Realiza la encriptación con la metodología AES solicitada
     *
     * @param data contraseña a encriptar
     * @return devuelve un string con la contraseña encriptada
     */
    public String encriptar(String data) {

        byte[] iv = new byte[16];
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            SecretKeySpec secretKey = new SecretKeySpec(secretKeyTemp.getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec);
            return Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes("UTF-8")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * Metodo encargado de desencriptar una contraseña anteriormente encriptada
     *
     * @param data la contraseña encriptada
     * @return develve un string con la contraseña desencriptada
     */
    public String desencriptar(String data) {

        byte[] iv = new byte[16];

        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            SecretKeySpec secretKey = new SecretKeySpec(secretKeyTemp.getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(data)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    

    public void encriptarClaves() {
        for (Odontologo cadaOdontologo : Datos.getListaOdontologos()) {
            cadaOdontologo.setClave(encriptar(cadaOdontologo.getClave()));
        }
    }

    public void desencriptarClaves() {
        for (Odontologo cadaOdontologo : Datos.getListaOdontologos()) {
            cadaOdontologo.setClave(desencriptar(cadaOdontologo.getClave()));
        }
    }
}
