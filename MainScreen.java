import javax.swing.*;
import java.awt.*;

public class MainScreen extends JFrame {
    private JPanel MainPanel;
    private JButton StatisticsBtn;
    private JButton CatBtn;
    private JButton showBtn;

    public MainScreen() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600,400));
        setContentPane(MainPanel);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
