/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpielFeld;

import SchachFiguren.*;

/**
 *
 * @author Physik
 */
public class Control {
    Figur[][] Feld;

    public Control() {
        Feld=new Figur[8][8];
        for(int i=0;i<8;i++)
            Feld[1][i]=new Bauer("B", false);
        for(int i=0;i<8;i++)
            Feld[1][i]=new Bauer("B", true);
        Feld[0][0]= new Turm("T", false);
        Feld[0][7]= new Turm("T", false);
        Feld[7][0]= new Turm("T", true);
        Feld[7][7]= new Turm("T", true);
        Feld[0][1]=new Springer("S", false);
        Feld[0][6]=new Springer("S", false);
        Feld[7][1]=new Springer("S", true);
        Feld[7][6]=new Springer("S", true);
        Feld[0][2]=new Laeufer("L", false);
        Feld[0][5]=new Laeufer("L", false);
        Feld[7][2]=new Laeufer("L", true);
        Feld[7][5]=new Laeufer("L", true);
        Feld[0][3]=new Dame("D", false);
        Feld[0][4]=new Koenig("K", false);
        Feld[7][3]=new Dame("D", true);
        Feld[7][4]=new Koenig("K", true);
        
        
    }

    public String toString()
    {
        String ergebnis="";
        for(int i=7;i>=0;i--)
        {       
            for(int j=7;j>=0;j--)
                ergebnis+=Feld[i][j].toString();
            ergebnis+="\n";
        }
        return ergebnis;
    }
}
