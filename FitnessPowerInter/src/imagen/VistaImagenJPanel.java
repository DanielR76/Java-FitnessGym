package imagen;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

public class VistaImagenJPanel extends JPanel implements PropertyChangeListener {

    private Image fondo;
    private ImageIcon icono;

    public VistaImagenJPanel(JFileChooser chooser) {
        chooser.addPropertyChangeListener(this);
        this.setPreferredSize(new Dimension(250, 180));
    }

    /**
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (fondo != null) {
            g2.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), null);
        } else {
            g2.drawString("NO HAY IMAGEN", (getWidth() / 2) - 10, 0);
        }
    }

    public ImageIcon getIcon() {
        return icono;
    }

    public void setIcon(ImageIcon icono) {
        this.icono = icono;
        if (icono != null) {
            fondo = icono.getImage();
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String propertyChange = evt.getPropertyName();
        if (propertyChange.equals(JFileChooser.SELECTED_FILE_CHANGED_PROPERTY)) {
            File imagen = (File) evt.getNewValue();
            if (imagen != null) {
                this.setIcon(new ImageIcon(imagen.getPath()));
                this.updateUI();
            }
        }
    }
}