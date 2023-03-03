import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowMealsScreen extends JFrame {
    private JList nameListMeals;
    private JTextArea textMealName;
    private JTextArea textCategoryName;
    private JTextArea textMealOrigin;
    private JTextArea textMealDescr;
    private JLabel titleShowMealsfrm;
    private JButton buttonSaveShowMeals;
    private JButton buttonEditShowMeals;
    private JPanel panelShowMeals;
    private JButton buttonDeleteFrmShowMeals;
    private static ShowMealsScreen instance = new ShowMealsScreen();

    private ShowMealsScreen() {
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setPreferredSize(new Dimension(600, 400));
        this.setContentPane(panelShowMeals);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        buttonSaveShowMeals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        });
        buttonEditShowMeals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        nameListMeals.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {



            }
        });
    }
    public static ShowMealsScreen getInstance(){
        return instance;
    }
}
















