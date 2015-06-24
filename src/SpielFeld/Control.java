/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpielFeld;

import Ereigniskarten.*;
import SchachFiguren.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Physik
 */
public class Control {

    public String[] abc;
    public boolean weisAmZug;
    Figur[][] Feld;
    public Figur Selected;
    public Frame window;
    public EFeld karte;

    public Control(Frame window) {
        abc = new String[8];
        abc[0] = "A";
        abc[1] = "B";
        abc[2] = "C";
        abc[3] = "D";
        abc[4] = "E";
        abc[5] = "F";
        abc[6] = "G";
        abc[7] = "H";
        weisAmZug = true;
        this.window = window;
        Feld = new Figur[8][8];
        for (int i = 0; i < 8; i++) {
            Feld[1][i] = new Bauer("B", false, this);
        }
        for (int i = 0; i < 8; i++) {
            Feld[6][i] = new Bauer("b", true, this);
        }
        for (int j = 2; j < 6; j++) {
            for (int i = 0; i < 8; i++) {
                if ((j != 3 && j != 4) || (i + j) % 2 != 0) {
                    Feld[j][i] = new Leer(this);
                } else {
                    Feld[j][i] = new EFeld(this);
                }
            }
        }
        Feld[0][0] = new Turm("T", false, this);
        Feld[0][7] = new Turm("T", false, this);
        Feld[7][0] = new Turm("t", true, this);
        Feld[7][7] = new Turm("t", true, this);
        Feld[0][1] = new Springer("S", false, this);
        Feld[0][6] = new Springer("S", false, this);
        Feld[7][1] = new Springer("s", true, this);
        Feld[7][6] = new Springer("s", true, this);
        Feld[0][2] = new Laeufer("L", false, this);
        Feld[0][5] = new Laeufer("L", false, this);
        Feld[7][2] = new Laeufer("l", true, this);
        Feld[7][5] = new Laeufer("l", true, this);
        Feld[0][3] = new Dame("D", false, this);
        Feld[0][4] = new Koenig("K", false, this);
        Feld[7][3] = new Dame("d", true, this);
        Feld[7][4] = new Koenig("k", true, this);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (Feld[i][j] == null) {
                    System.out.println(i + "\n" + j + "\n");
                }
                Feld[i][j].setzePosX(i);
                Feld[i][j].setzePosY(j);
            }
        }

    }

    String getPossibleMoves(int X, int Y) {
        return "";

    }

    void test() {
        Feld[7][7] = new Turm("T", true, this);
        Feld[0][1] = new Springer("T", false, this);
        Feld[0][6] = new Springer("T", false, this);
        Feld[7][1] = new Springer("T", true, this);
        Feld[7][6] = new Springer("T", true, this);
        Feld[0][2] = new Laeufer("T", false, this);
    }

    void move(String pText) {

        System.out.println(pText);
        if (pText.length() != 2) {
            return;
        }

        String a = pText.substring(0, 1).toUpperCase();
        String b = pText.substring(1);
        System.out.println(a + b);
        int o = 0;
        for (int p = 0; p < 8; p++) {
            if (abc[p].compareTo(a) == 0) {
                o = p;
            }
        }
        int p = Integer.parseInt(b);
        System.out.println(o + p);
        Figur f = Feld[p][o];

        if (Selected == null || Selected.toString().compareTo("") == 0) {
            Selected = f;
            window.getButton().setText(Selected.toString());
            return;
        }
        if (karte != null) {
            if (karte.gibKarte() instanceof ExtraZug) {
                karte = null;
            }
            if (karte.gibKarte() instanceof ExtraZugSelbeFigur) {
                Feld[Selected.gibPosX()][Selected.gibPosY()] = new Leer(this);
                Feld[Selected.gibPosX()][Selected.gibPosY()].setzePosX(Selected.gibPosX());
                Feld[Selected.gibPosX()][Selected.gibPosY()].setzePosY(Selected.gibPosY());
                Feld[f.gibPosX()][f.gibPosY()] = Selected;
                Selected.setzePosX(f.gibPosX());
                Selected.setzePosY(f.gibPosY());
                window.getButton().setText(" ");
                window.toTable();
                Selected = null;
                karte = null;
            }
            if (karte.gibKarte() instanceof GegnerBewegen) {
                Feld[Selected.gibPosX()][Selected.gibPosY()] = new Leer(this);
                Feld[Selected.gibPosX()][Selected.gibPosY()].setzePosX(Selected.gibPosX());
                Feld[Selected.gibPosX()][Selected.gibPosY()].setzePosY(Selected.gibPosY());
                Feld[f.gibPosX()][f.gibPosY()] = Selected;
                Selected.setzePosX(f.gibPosX());
                Selected.setzePosY(f.gibPosY());
                window.getButton().setText(" ");
                window.toTable();
                Selected = null;
                karte = null;
            }
            if (karte.gibKarte() instanceof TauscheFiguren) {
                int x, y;
                x = f.gibPosX();
                y = f.gibPosY();
                Feld[Selected.gibPosX()][Selected.gibPosY()] = f;
                f.setzePosX(Selected.gibPosX());
                f.setzePosY(Selected.gibPosY());
                Feld[x][y] = Selected;
                Selected.setzePosX(f.gibPosX());
                Selected.setzePosY(f.gibPosY());
                window.getButton().setText(" ");
                window.toTable();
                Selected = null;
                window.getButton().setText(" ");
                weisAmZug = !weisAmZug;
                karte = null;
            }
            if (karte.gibKarte() instanceof ZweiFelderVor) {
                System.out.println(Selected.gibPosX() + " " + Selected.gibPosY());
                Feld[Selected.gibPosX()][Selected.gibPosY()] = new Leer(this);
                Feld[Selected.gibPosX()][Selected.gibPosY()].setzePosX(Selected.gibPosX());
                Feld[Selected.gibPosX()][Selected.gibPosY()].setzePosY(Selected.gibPosY());
                Feld[f.gibPosX()][f.gibPosY()] = Selected;
                Selected.setzePosX(f.gibPosX());
                Selected.setzePosY(f.gibPosY());
                window.getButton().setText(" ");

                window.toTable();
                Selected = null;
                weisAmZug = !weisAmZug;
                karte = null;
            }
            if (karte.gibKarte() instanceof ZweiZur) {
                System.out.println(Selected.gibPosX() + " " + Selected.gibPosY());
                Feld[Selected.gibPosX()][Selected.gibPosY()] = new Leer(this);
                Feld[Selected.gibPosX()][Selected.gibPosY()].setzePosX(Selected.gibPosX());
                Feld[Selected.gibPosX()][Selected.gibPosY()].setzePosY(Selected.gibPosY());
                Feld[f.gibPosX()][f.gibPosY()] = Selected;
                Selected.setzePosX(f.gibPosX());
                Selected.setzePosY(f.gibPosY());
                window.getButton().setText(" ");

                window.toTable();
                Selected = null;
                weisAmZug = !weisAmZug;
                karte = null;
            }
            window.toTable();
            return;
        }
        if (f instanceof EFeld) {
            karte = (EFeld) f;
            Feld[Selected.gibPosX()][Selected.gibPosY()] = new Leer(this);
            Feld[Selected.gibPosX()][Selected.gibPosY()].setzePosX(Selected.gibPosX());
            Feld[Selected.gibPosX()][Selected.gibPosY()].setzePosY(Selected.gibPosY());
            Feld[f.gibPosX()][f.gibPosY()] = Selected;
            Selected.setzePosX(f.gibPosX());
            Selected.setzePosY(f.gibPosY());
            //window.getButton().setText(" ");   
            window.toTable();
            weisAmZug = !weisAmZug;
            karte.run();
            return;
            //Selected = null;
        }
        if (Selected.istSchwarz() == f.istSchwarz()&& !(f instanceof Leer)) {
            System.out.println(Selected.toString() + Selected.gibPosX() + Selected.gibPosY());
            System.out.println(f.toString() + f.gibPosX() + f.gibPosY());
            Selected = null;
            window.getButton().setText("");
            window.Alert("Gleiches Team");
            return;
        }
        if (!(f instanceof Leer) && Selected.istSchwarz() && weisAmZug || !Selected.istSchwarz() && !weisAmZug) {
            if (weisAmZug) {
                window.Alert("Weiss ist am Zug!");
            } else {
                window.Alert("Schwarz ist am Zug!");
            }
            Selected = null;
            return;
        }
        if (isValidmove(f, Selected)) {
            //Selected.bewegen();
            System.out.println(Selected.gibPosX() + " " + Selected.gibPosY());
            Feld[Selected.gibPosX()][Selected.gibPosY()] = new Leer(this);
            Feld[Selected.gibPosX()][Selected.gibPosY()].setzePosX(Selected.gibPosX());
            Feld[Selected.gibPosX()][Selected.gibPosY()].setzePosY(Selected.gibPosY());
            Feld[f.gibPosX()][f.gibPosY()] = Selected;
            Selected.setzePosX(f.gibPosX());
            Selected.setzePosY(f.gibPosY());
            window.getButton().setText(" ");

            window.toTable();
            Selected = null;
            weisAmZug = !weisAmZug;
        } else {
            window.Alert("Invalid move");
        }

    }

    public void setzePos(Figur pFigur) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (pFigur == Feld[i][j]) {
                    pFigur.setzePosX(i);
                    pFigur.setzePosY(j);
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        String ergebnis = "";
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 8; j++) {
                if (Feld[i][j] != null) {
                    ergebnis += Feld[i][j].toString();
                } else {
                    ergebnis += " ";
                }
            }
            ergebnis += "\n";
        }
        return ergebnis;
    }

    private boolean isValidmove(Figur f, Figur Selected) {
        return true;
    }
}
