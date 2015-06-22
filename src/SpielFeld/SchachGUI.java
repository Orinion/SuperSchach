/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpielFeld;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
//import java.awt.List;
import javax.swing.JPanel;

/**
 *
 * @author Physik
 */
public class SchachGUI extends JPanel {

    Image imgBackground;
    List<Piece> pieces;

    private class Piece {

        public Image img;
        public int x;
        public int y;

        private Piece(Image img, int x, int y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    public SchachGUI() {
    }

    protected void paintComponent(Graphics g) {
        g.drawImage(this.imgBackground, 0, 0, null);
        for (Piece piece : this.pieces) {
            g.drawImage(piece.img, piece.x, piece.y, null);
        }
    }

    private Image getImageForPiece(int color, int type) {

        String filename = "";

        filename += (color == 1 ? "w" : "b");
        switch (type) {
            case 0:
                filename += "b";
                break;
            case 1:
                filename += "k";
                break;
            case 2:
                filename += "n";
                break;
            case 3:
                filename += "p";
                break;
            case 4:
                filename += "q";
                break;
            case 5:
                filename += "r";
                break;
        }
        filename += ".png";

        URL urlPieceImg = getClass().getResource("/ch01/img/" + filename);
        return new ImageIcon(urlPieceImg).getImage();
    }

    private void createAndAddPiece(int color, int type, int x, int y) {
        Image img = this.getImageForPiece(color, type);
        Piece piece = new Piece(img, x, y);
        this.pieces.add(piece);
    }
}
