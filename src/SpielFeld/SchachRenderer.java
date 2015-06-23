/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpielFeld;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Physik
 */
public class SchachRenderer extends DefaultTableCellRenderer {

    public SchachRenderer() {
        super();
    }

//    public void setValue(Object value) {
//        if (value == null) {
//            setText("");
//        } else {
//            if (value != null) {
//
//            }
//        }
//    }

    protected ImageIcon createImageIcon(String path,
            String description) {
        java.net.URL imgURL = this.getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        this.setHorizontalAlignment(JLabel.CENTER);
        try {
            Graphics g = c.getGraphics();
            g.drawImage(ImageIO.read(new File(System.getProperty("user.dir")
                    + System.getProperty("file.separator")
                    + "src"
                    + System.getProperty("file.separator")
                    + value + "_s.png")), 2, 2, null);
        } catch (IOException ex) {
            Logger.getLogger(SchachRenderer.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (hasFocus) {
            c.setForeground(Color.BLACK);
            c.setBackground(Color.GREEN);
        } else if ((row + column) % 2 != 0) {
            c.setForeground(Color.BLACK);
            c.setBackground(Color.WHITE);
        } else {
            c.setForeground(Color.WHITE);
            c.setBackground(Color.BLACK);
        }
        return c;
    }

}
