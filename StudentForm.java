import java.awt.*;
import javax.swing.*;

public class StudentForm {
    public static void main(String[] args) {
        // Shob component-er font ekebare boro korar jonno
        Font font = new Font("Arial", Font.BOLD, 18);
        UIManager.put("Label.font", font);
        UIManager.put("TextField.font", font);
        UIManager.put("ComboBox.font", font);
        UIManager.put("Button.font", font);

        JFrame f = new JFrame("Student Registration Form");
        f.setLayout(new GridLayout(5, 2, 10, 10));

        JTextField tName = new JTextField();
        JTextField tRoll = new JTextField();
        JComboBox<String> dept = new JComboBox<>(new String[]{"ICE", "CSE", "EEE"});
        JButton btn = new JButton("Submit Form");
        JLabel out = new JLabel("Status: Waiting...");

        f.add(new JLabel(" Student Name:")); f.add(tName);
        f.add(new JLabel(" Roll Number:"));  f.add(tRoll);
        f.add(new JLabel(" Department:"));   f.add(dept);
        f.add(btn); f.add(out);

        btn.addActionListener(e -> {
            out.setText("Saved: " + tName.getText() + " (" + dept.getSelectedItem() + ")");
        });

        // Boro font-er sathe window-er size boro kora holo
        f.setSize(550, 320);
        f.setLocationRelativeTo(null); // Screen-er majhe ashbe
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}