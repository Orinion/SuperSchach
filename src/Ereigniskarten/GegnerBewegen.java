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
 * @author Physik
 */
public class GegnerBewegen extends Ereigniskarte {

    public GegnerBewegen(Control con) {
        super(con);
    }

    @Override
    public void run() {
        con.window.Alert("bewege eine Gegnerische Figur");
        con.Selected=null;
        con.window.getButton().setText(" ");
          }
    
}
