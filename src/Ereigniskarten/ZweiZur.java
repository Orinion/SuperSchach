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
public class ZweiZur extends Ereigniskarte{

    public ZweiZur(Control con) {
        super(con);
    }

    @Override
    public void run() {
        con.window.Alert("Gehe 2 Felder zurück");
        con.weisAmZug= !con.weisAmZug;
        //con.karte=null;
    }
    
}
