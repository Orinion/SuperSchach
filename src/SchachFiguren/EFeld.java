/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchachFiguren;

import Ereigniskarten.*;
import SpielFeld.Control;

/**
 *
 * @author Physik
 */
public class EFeld extends Figur{
    Control con;
    String name;
    private int posX;
    private int posY;
    private boolean istSchwarz;
    private Ereigniskarte karte;
    public EFeld(Control pCon) {
        con=pCon;
        int x= (int) (Math.random()*5);
        switch(x)
        {
            case 0:
                karte=new ExtraZug(con);
                break;
            case 1:
                karte=new ExtraZugSelbeFigur(con);
                break;
            case 2:
                karte=new ZweiZur(con);
                break;
            case 3:
                karte=new TauscheFiguren(con);
                break;
            case 4:
                karte=new ZweiFelderVor(con);
                break;
            case 5:
                karte=new GegnerBewegen(con);
                break;
        }
       
        con = pCon;
        this.name = "?";
        istSchwarz = false;
    }
    public Ereigniskarte gibKarte()
    {
        return karte;
    }
    @Override
    public boolean istSchwarz() {
        return istSchwarz;
    }

    @Override
    public void machSchwarz(boolean s) {
        
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
        posX=i;
    }

    @Override
    public void setzePosY(int i) {
        posY=i;
    }

    @Override
    public String gibBewegungen() {
        return "\n";
    }

    @Override
    public void updatePos() {
        con.setzePos(this);
    }

    @Override
    public String toString() {
        return name;
    }
    
    public void run()
    {
        karte.run();
    }
}
