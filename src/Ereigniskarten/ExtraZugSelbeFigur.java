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
public class ExtraZugSelbeFigur extends Ereigniskarte{

    public ExtraZugSelbeFigur(Control con) {
        super(con);
    }

    @Override
    public void run() {
        con.window.Alert("ExtraZug!\nDu darfst noch einmal mit der Selben Figur Ziehen!\n"
                + "ist dies nicht möglich such dir eine Figur aus");
        con.weisAmZug = !con.weisAmZug;
    }
    
}
