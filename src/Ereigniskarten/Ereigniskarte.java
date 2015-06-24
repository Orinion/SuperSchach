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
public abstract class Ereigniskarte {
    Control con;
   public abstract void run();

    public Ereigniskarte(Control con) {
        this.con =con;
    }
  
}
