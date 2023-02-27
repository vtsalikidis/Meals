import javax.swing.*;
import java.awt.*;

public class ShowMealsScreen extends JFrame {
    private JList list1;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JTextArea textArea4;
    private JLabel titleShowMealsfrm;
    private JButton buttonSaveShowMeals;
    private JButton buttonEditShowMeals;
    private JPanel panelShowMeals;
    private JButton buttonDeleteFrmShowMeals;


    public ShowMealsScreen() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 400));
        setContentPane(panelShowMeals);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
