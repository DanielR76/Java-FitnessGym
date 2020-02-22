package fitnesspowerinter;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class RenderCheckBox extends JCheckBox implements TableCellRenderer {

    private JComponent component = new JCheckBox();

    public RenderCheckBox() {
        setOpaque(true);
    }

    /**
     *
     * @param table
     * @param value
     * @param isSelected
     * @param hasFocus
     * @param row
     * @param column
     * @return
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        ((JCheckBox) component).setBackground(new Color(0, 200, 0));
        boolean b = ((Boolean) value);
        ((JCheckBox) component).setSelected(b);
        return ((JCheckBox) component);
    }
}
