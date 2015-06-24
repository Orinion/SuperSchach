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
public class ExtraZug extends Ereigniskarte{
    //Control con;
    public ExtraZug(Control con) {
        super(con);
    }

    @Override
    public void run() {
        con.window.Alert("ExtraZug!\nDu darfst noch einmal Ziehen!");
        con.weisAmZug = !con.weisAmZug;
        con.Selected=null;
        con.window.getButton().setText(" ");
        //Beliebige Figur kann sich bewegen o_O
    }
    
}
