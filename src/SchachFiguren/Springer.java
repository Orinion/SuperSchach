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
public class Springer extends Figur{

        
    private final String name;
    private boolean istSchwarz;
    private int benutzteFelder;
    private int bewegungen;
    private int posX;
    private int posY;
    Control con;
    public Springer(String name, boolean schwarz,Control pCon) {
        pCon = con;
        this.name = name;
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
        return "-2,1\n-1,2\n1,2\2,1\n2,-1\n1,-2\n-1,-2\n-2,-1\n";
    }
}
