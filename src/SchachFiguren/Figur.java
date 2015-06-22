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
    @Override
    public abstract String toString();
    public abstract void setzeBenutzteFelder(int i);
    public abstract int gibBenutzteFelder();
    public abstract int gibBewegungen();
    public abstract void setzeBewegungen(int i);
    public abstract void bewegen();
    public abstract void schlagen();    
}
