import javax.swing.*;
import java.awt.*;

public class FrameTest extends JFrame {

    public FrameTest() {


        JPanel jPanel = new JPanel();

        String[] students = {
                "Jan", "Sebastian", "Asia"
        };

        JComboBox<String> jComboBox = new JComboBox<>(students);
        jPanel.add(jComboBox);

        this.getContentPane().add(jPanel, BorderLayout.PAGE_END);

        this.setSize(300, 300);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                ()->new FrameTest()
        );
    }
}
