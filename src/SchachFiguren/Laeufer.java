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
public class Laeufer extends Figur{
    
    private final String name;
    private boolean istSchwarz;
    private int benutzteFelder;
    private int bewegungen;
    private int posX;
    private int posY;

    public Laeufer(String name, boolean schwarz) {
        this.name = name;
        istSchwarz = schwarz;
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

    @Override
    public int gibBewegungen() {
        return bewegungen;
    }

    @Override
    public void setzeBewegungen(int i) {
        bewegungen = i;
    }

    @Override
    public boolean istSchwarz() {
        return istSchwarz;
    }

    @Override
    public void entfernen() {
        //Figur weg undso....
    }

    @Override
    public Figur gibNaechste() {
        //Ernie prüft wo der nächste ist und returnt den
        return null;
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
}
