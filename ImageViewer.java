import java.awt.Image;
import javax.swing.*;

public class ImageViewer {
    public static void main(String[] args) {
        JFrame f = new JFrame("Image Viewer - PUST");

        Image img = new ImageIcon("pustview.jpeg").getImage().getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
        f.add(new JLabel(new ImageIcon(img)));

        f.setSize(1200, 700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
