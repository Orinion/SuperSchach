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
public class Laeufer extends Figur{
    
    private final String name;
    private boolean istSchwarz;
    private int benutzteFelder;
    private int bewegungen;
    private int posX;
    private int posY;
    Control con;
    public Laeufer(String pName, boolean schwarz, Control pCon) {
        con = pCon;
        this.name = pName;
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
        return "8,8\n7,7\n6,6\n5,5\n4,4\n3,3\n2,2\n1,1\n-8,-8\n-7,-7\n-6,-6\n-5,-5\n-4,-4\n-3,-3\n-2,-2\n-1,-1\n";
    }
}
