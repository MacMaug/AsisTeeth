/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author jdfer
 */
public class COdontograma {
    
    public void esconderMarcas(JLabel labelExtraccion, JLabel labelAusente, JLabel labelEmpaquetamiento, JLabel labelCG, 
                                JLabel labelCaries, JLabel labelCariesD, JLabel labelSurco, JLabel labelMovilidad){
        labelExtraccion.setVisible(false);
        labelAusente.setVisible(false);
        labelEmpaquetamiento.setVisible(false);
        labelCG.setVisible(false);
        labelCaries.setVisible(false);
        labelCariesD.setVisible(false);
        labelSurco.setVisible(false);
        labelMovilidad.setVisible(false);
    }
    
    
    public void marcaUnica(JLabel labelUnico, JLabel labelSec, JLabel labelEmpaquetamiento, JLabel labelCG, JLabel labelCaries, JLabel labelSurco, 
                                JLabel labelMovilidad){
        
        labelUnico.setVisible(true);
        labelSec.setVisible(false);
        labelEmpaquetamiento.setVisible(false);
        labelCG.setVisible(false);
        labelCaries.setVisible(false);
        labelSurco.setVisible(false);
        labelMovilidad.setVisible(false);   
    }
    
    public void marcaDesmarca(JLabel label, JLabel labelExtraccion, JLabel labelAusente, JButton boton){
        
        if(boton.isSelected()){
            label.setVisible(!label.isVisible());
            labelExtraccion.setVisible(false);
            labelAusente.setVisible(false);
        }
        
    }
    
   public void marcaDesmarcaCaries(JLabel label1, JLabel label2, JLabel labelExtraccion, JLabel labelAusente, JButton boton1, JButton boton2){
        
        if(boton1.isSelected()){
            label1.setVisible(!label1.isVisible());
            if(label1.isVisible())
                label2.setVisible(false);
            labelExtraccion.setVisible(false);
            labelAusente.setVisible(false);
        }
        
    }
    
    public void marcaDesmarcaMovilidad(JLabel label, JLabel labelExtraccion, JLabel labelAusente, JButton boton){
        
        if(boton.isSelected()){
            if(label.getText().equals(boton.getText())){
                label.setVisible(false);
            }
            else{
                label.setVisible(true);
                label.setText(boton.getText());
            }
            labelExtraccion.setVisible(false);
            labelAusente.setVisible(false);
        } 
    }
    
    public void resetearBotones(JButton botonExtraccion, JButton botonAusente, JButton botonEmpaquetamiento,
                                JButton botonCG, JButton botonCaries, JButton botonCariesD, JButton botonSurco, JButton botonMovilidadI, JButton botonMovilidadII,
                                JButton botonMovilidadIII, JButton botonMovilidadIV){
        
        botonExtraccion.setSelected(false);
        botonAusente.setSelected(false);
        botonEmpaquetamiento.setSelected(false);
        botonCG.setSelected(false);
        botonCaries.setSelected(false);
        botonCariesD.setSelected(false);
        botonSurco.setSelected(false);
        botonMovilidadI.setSelected(false);
        botonMovilidadII.setSelected(false);
        botonMovilidadIII.setSelected(false);
        botonMovilidadIV.setSelected(false);
    }
    
    
    public void seleccionDiente(JLabel labelExtraccion, JLabel labelAusente, JLabel labelEmpaquetamiento, JLabel labelCG, JLabel labelCaries, 
                                JLabel labelCariesD, JLabel labelSurco, JLabel labelMovilidad, JButton botonExtraccion, JButton botonAusente, JButton botonEmpaquetamiento,
                                JButton botonCG, JButton botonCaries, JButton botonCariesD, JButton botonSurco, JButton botonMovilidadI, 
                                JButton botonMovilidadII, JButton botonMovilidadIII, JButton botonMovilidadIV){
        
        if(botonAusente.isSelected() && !labelAusente.isVisible())
            marcaUnica(labelAusente,labelExtraccion,labelEmpaquetamiento,labelCG,labelCaries,labelSurco,labelMovilidad);
        else if(botonAusente.isSelected() && labelAusente.isVisible())
            labelAusente.setVisible(false); 
        else if(botonExtraccion.isSelected() && !labelExtraccion.isVisible())
            marcaUnica(labelExtraccion,labelAusente,labelEmpaquetamiento,labelCG,labelCaries,labelSurco,labelMovilidad);
        else if(botonExtraccion.isSelected() && labelExtraccion.isVisible())
            labelExtraccion.setVisible(false);
        
        marcaDesmarca(labelEmpaquetamiento,labelExtraccion,labelAusente,botonEmpaquetamiento);
        marcaDesmarca(labelCG,labelExtraccion,labelAusente,botonCG);
        
        marcaDesmarcaCaries(labelCaries,labelCariesD,labelExtraccion,labelAusente,botonCaries,botonCariesD);
        marcaDesmarcaCaries(labelCariesD,labelCaries,labelExtraccion,labelAusente,botonCariesD,botonCaries);
        
        marcaDesmarca(labelSurco,labelExtraccion,labelAusente,botonSurco);
        marcaDesmarcaMovilidad(labelMovilidad,labelExtraccion,labelAusente,botonMovilidadI);
        marcaDesmarcaMovilidad(labelMovilidad,labelExtraccion,labelAusente,botonMovilidadII);
        marcaDesmarcaMovilidad(labelMovilidad,labelExtraccion,labelAusente,botonMovilidadIII);
        marcaDesmarcaMovilidad(labelMovilidad,labelExtraccion,labelAusente,botonMovilidadIV);
        
        resetearBotones(botonExtraccion,botonAusente,botonEmpaquetamiento,botonCG,botonCaries,botonCariesD,botonSurco,botonMovilidadI,botonMovilidadII,
                        botonMovilidadIII,botonMovilidadIV);
    }
    
}
