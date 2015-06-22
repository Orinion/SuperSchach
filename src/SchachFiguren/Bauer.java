/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchachFiguren;

/**
 *
 * @author Markus
 */
public class Bauer extends Figur{
    
    private final String name;
    private int benutzteFelder;

    public Bauer(String pName) {
        name = pName;
    }

    @Override
    public void setzeBenutzteFelder(int i) {
        benutzteFelder = i;
    }

    @Override
    public int gibBenutzteFelder() {
        return benutzteFelder;
    }

    @Override
    public void bewegen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void schlagen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return name;
    }
}
