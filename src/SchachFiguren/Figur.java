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
public abstract class  Figur {
    public abstract boolean istSchwarz();
    public abstract void machSchwarz(boolean s);
    public abstract int gibPosX();
    public abstract int gibPosY();
    public abstract void setzePosX(int i);
    public abstract void setzePosY(int i);
    public abstract void setzeBenutzteFelder(int i);
    public abstract int gibBenutzteFelder();
    public abstract int gibBewegungen();
    public abstract void setzeBewegungen(int i);
    public abstract void bewegen();
    public abstract void schlagen();
    public abstract void entfernen();
    public abstract Figur gibNaechste();
    @Override
    public abstract String toString();
}
