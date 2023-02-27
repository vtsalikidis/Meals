import javax.swing.*;
import java.awt.*;

public class StatisticsMealsApp extends JFrame {

    private JPanel statisticsMainPanel;
    private JButton buttonPrintPdfStatistics;
    private JTable table1;
private static StatisticsMealsApp instance = new StatisticsMealsApp();

    private StatisticsMealsApp() {
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setPreferredSize(new Dimension(600, 400));
        setContentPane(statisticsMainPanel);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static StatisticsMealsApp getInstance(){
        return instance;
    }
}