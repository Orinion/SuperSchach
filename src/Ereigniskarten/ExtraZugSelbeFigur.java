/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ereigniskarten;

import SchachFiguren.Figur;

/**
 *
 * @author Markus
 */
public class ExtraZugSelbeFigur extends Ereigniskarte{

    @Override
    public void run(Figur pFigur) {
        pFigur.bewegen();
    }
    
}