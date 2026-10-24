import java.awt.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame {
    JTextField t = new JTextField();
    double a;
    String op = "";

    SimpleCalculator() {
        setTitle("Calculator");
        Font font = new Font("Arial", Font.BOLD, 22);
        t.setFont(font);
        add(t, "North");

        JPanel p = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] k = {"7","8","9","/","4","5","6","*","1","2","3","-","C","0","=","+"};

        for (String s : k) {
            JButton b = new JButton(s);
            b.setFont(font);
            p.add(b);
            b.addActionListener(e -> {
                if (s.equals("C")) {
                    t.setText(""); a = 0; op = "";
                } else if (s.equals("=")) {
                    double b1 = Double.parseDouble(t.getText()), r = 0;
                    if (op.equals("+")) r = a + b1;
                    if (op.equals("-")) r = a - b1;
                    if (op.equals("*")) r = a * b1;
                    if (op.equals("/")) r = a / b1;
                    t.setText("" + r);
                } else if ("+-*/".contains(s)) {
                    a = Double.parseDouble(t.getText());
                    op = s;
                    t.setText("");
                } else t.setText(t.getText() + s);
            });
        }
        add(p, "Center");
        setSize(360, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}