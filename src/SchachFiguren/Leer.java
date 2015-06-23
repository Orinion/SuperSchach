/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchachFiguren;

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

    public Leer() {
        this.name = "";
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
    public void setzeBenutzteFelder(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int gibBenutzteFelder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int gibBewegungen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setzeBewegungen(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public void entfernen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Figur gibNaechste() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return name;
    }
    
}
