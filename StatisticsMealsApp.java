import javax.swing.*;
import java.awt.*;

public class StatisticsMealsApp extends JFrame {

    private JPanel statisticsMainPanel;

    public StatisticsMealsApp() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 400));
        setContentPane(statisticsMainPanel);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
