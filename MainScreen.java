import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame {

    private JPanel MainPanel;
    private JButton buttonExitMainScreen;
    private JButton buttonShowMealsMainScreen;
    private JButton buttonCategoriesMainScreen;
    private JButton buttonStatisticsMainScreen;
    private JTextPane notesMeals;
    private JLabel mealsLogo;
    private JLabel mealsTitle;

    private static MainScreen instance = new MainScreen(); //Singleton Pattern Design 1st Step
//Singleton Pattern Design 2nd Step
    private MainScreen(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600,400));
        setContentPane(MainPanel);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);


        buttonShowMealsMainScreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowMealsScreen.getInstance().setVisible(true);


            }
        });
        buttonCategoriesMainScreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowCategoriesMeals.getInstance().setVisible(true);
            }
        });
        buttonStatisticsMainScreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StatisticsMealsApp.getInstance().setVisible(true);

            }
        });

    }
    //Singleton Design Pattern 3rd Step
    public static MainScreen getInstance(){
        return instance;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
