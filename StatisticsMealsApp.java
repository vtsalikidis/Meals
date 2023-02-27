import javax.swing.*;
import java.awt.*;

public class StatisticsMealsApp extends JFrame {

    private JPanel statisticsMainPanel;
    private JButton buttonPrintPdfStatistics;
    private JTable table1;

    public StatisticsMealsApp() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 400));
        setContentPane(statisticsMainPanel);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
