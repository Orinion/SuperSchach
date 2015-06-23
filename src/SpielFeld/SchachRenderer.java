/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpielFeld;

import java.awt.Color;
import java.awt.Component;
import javafx.scene.control.Cell;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Physik
 */
public class SchachRenderer extends DefaultTableCellRenderer {

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        //Cell x = (Cell)c;
        this.setHorizontalAlignment(JLabel.CENTER);
       if(hasFocus)
        {
            c.setForeground(Color.BLACK);
            c.setBackground(Color.GREEN);
            
        }
       else
            if ((row + column)%2!=0) {
            c.setForeground(Color.BLACK);
            c.setBackground(Color.WHITE);
        }
        else
        {
            c.setForeground(Color.WHITE);
            c.setBackground(Color.BLACK);
        }
        return c;
    }

}
