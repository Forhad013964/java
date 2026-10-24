import java.awt.*;
import javax.swing.*;

public class EnjoyFood {
    public static void main(String[] args) {
        // এক লাইনে পুরো অ্যাপের সব ফন্ট বড় (Font size: 22)
        
        Font font = new Font("Arial", Font.BOLD, 28);
        UIManager.put("Label.font", font);
        UIManager.put("Button.font", font);
        UIManager.put("CheckBox.font", font);
        UIManager.put("TextField.font", font);
        
       

        JFrame f = new JFrame("PUST JUNK FOOD");
        f.setLayout(new FlowLayout());

        JCheckBox c1 = new JCheckBox("Burger (150)");
        JTextField q1 = new JTextField("1", 2);

        JCheckBox c2 = new JCheckBox("Pizza (300)");
        JTextField q2 = new JTextField("1", 2);

        JButton btn = new JButton("Bill");

        btn.addActionListener(e -> {
            int total = 0;
            if (c1.isSelected()) total += 150 * Integer.parseInt(q1.getText());
            if (c2.isSelected()) total += 300 * Integer.parseInt(q2.getText());
            JOptionPane.showMessageDialog(f, "Total: " + total + " Tk");
        });

        f.add(c1); f.add(q1);
        f.add(c2); f.add(q2);
        f.add(btn);

        f.setSize(380, 220);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}