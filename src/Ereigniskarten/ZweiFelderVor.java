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
public class ZweiFelderVor extends Ereigniskarte {
    
    public ZweiFelderVor(Control con) {
        super(con);
    }

    @Override
    public void run()
    {
       con.window.Alert("Rücke mit der Figur 2 Felder nach vorne.\n Befindet Sich dort eine Figur, wird sie geschlagen!");
       con.weisAmZug= !con.weisAmZug;
    }
}
