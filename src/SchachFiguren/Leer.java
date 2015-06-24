/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchachFiguren;

import SpielFeld.Control;

/**
 *
 * @author Physik
 */
public class Leer extends Figur{
    private final String name;
    private boolean istSchwarz;
    private int benutzteFelder;
    private int bewegungen;
    private int posX;
    private int posY;
    Control con;
    public Leer(Control pCon) {
        con = pCon;
        this.name = " ";
    }
    public void updatePos(){
        con.setzePos(this);
    }
    
    @Override
    public boolean istSchwarz() {
        return false;
    }

    @Override
    public void machSchwarz(boolean s) {
    }

    @Override
    public int gibPosX() {
        return  posX;
        }

    @Override
    public int gibPosY() {
        return  posY;
    
    }

    @Override
    public void setzePosX(int i) {
        posX=i;
    }

    @Override
    public void setzePosY(int i) {
        posY=i;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public String gibBewegungen() {
        return "\n";
    }
    
}
