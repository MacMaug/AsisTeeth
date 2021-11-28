package control;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class CVentana {
    
    public void iniciarVentana(JFrame ventana/*, String ruta*/){
       ventana.setLocationRelativeTo(null);
       //ventana.setIconImage(new ImageIcon(ruta).getImage()); 
       //ventana.setResizable(false); 
       ventana.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
    
    public void esconderAsteriscosDP(JLabel asteriscoCedula, JLabel asteriscoNombre, JLabel asteriscoTelf, JLabel asteriscoEdad){
        asteriscoCedula.setVisible(false);
        asteriscoNombre.setVisible(false);
        asteriscoEdad.setVisible(false);
        asteriscoTelf.setVisible(false);
    }
    
    public void esconderAsteriscosES(JLabel asteriscoMotivo, JLabel asteriscoMedicamento){
        asteriscoMotivo.setVisible(false);
        asteriscoMedicamento.setVisible(false);
    }
    
    public void esconderAsteriscosAntecedentes(JLabel asteriscoInfarto, JLabel asteriscoAlergico, JLabel asteriscoHemorragia){
        asteriscoInfarto.setVisible(false);
        asteriscoAlergico.setVisible(false);
        asteriscoHemorragia.setVisible(false);
    }
    
    public void esconderAsteriscosExC(JLabel asteriscoExamenCB, JLabel asteriscoMaxima, JLabel asteriscoMinima, JLabel asteriscoLocalizacion, JLabel asteriscoCaracteristicas){
        asteriscoExamenCB.setVisible(false);
        asteriscoMaxima.setVisible(false);
        asteriscoMinima.setVisible(false);
        asteriscoLocalizacion.setVisible(false);
        asteriscoCaracteristicas.setVisible(false);
    }
    
    public void esconderAsteriscoDiagnostico(JLabel asteriscoDiagnostico){
        asteriscoDiagnostico.setVisible(false);
    }
    
    
}