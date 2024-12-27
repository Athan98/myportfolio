package config_tables;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RenderProductosSueltosBuscadosVentas extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof JButton) {
            JButton boton = (JButton) value;
            return boton;
        }
        if (value instanceof JCheckBox) {
            JCheckBox jcb = (JCheckBox) value;
            return jcb;
        }

        if (table.getValueAt(row, 4).toString().equals("DISPONIBLE")) {
            setBackground(Color.GREEN);
        } else if (table.getValueAt(row, 4).toString().equals("NO DISPONIBLE")) {
            setBackground(Color.RED);
        } else if (table.getValueAt(row, 4).toString().equals("SIN STOCK")) {
            setBackground(Color.YELLOW);
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
