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
    public abstract String gibBewegungen();
    public abstract void updatePos();
    @Override
    public abstract String toString();
}
