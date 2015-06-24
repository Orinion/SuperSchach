/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchachFiguren;

import SpielFeld.Control;

/**
 *
 * @author Markus
 */
public class Bauer extends Figur{
    
    private final String name;
    private boolean istSchwarz;
    private int benutzteFelder;
    private int posX;
    private int posY;
    Control con;
    public Bauer(String pName, boolean schwarz, Control pCon) {
        con = pCon;
        name = pName;
        istSchwarz = schwarz;
        
    }

     public void updatePos(){
        con.setzePos(this);
    }

    @Override
    public String toString() {
        return name;
    }

   



    @Override
    public boolean istSchwarz() {
        return istSchwarz;
    }

 



    @Override
    public int gibPosX() {
        return posX;
    }

    @Override
    public int gibPosY() {
        return posY;
    }

    @Override
    public void setzePosX(int i) {
        posX = i;
    }

    @Override
    public void setzePosY(int i) {
        posY = i;
    }

    @Override
    public void machSchwarz(boolean s) {
        istSchwarz = s;
    }

    @Override
    public String gibBewegungen() {
        String e;
        if(this.posX==1||posX==7)
        e= "0,1\n0,2";
        else
            e="0,1";
        return e;
    }

   
}
