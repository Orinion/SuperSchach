/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ereigniskarten;

import SchachFiguren.Figur;
import SpielFeld.Control;

/**
 *
 * @author Markus
 */
public class TauscheFiguren extends Ereigniskarte{

    public TauscheFiguren(Control con) {
        super(con);
    }

    @Override
    public void run() {
        con.window.Alert("Tausche die Figur mit einer deiner Eigenen");
        
        //Position der Figur an Position von anderer Figur
    }
    
}
