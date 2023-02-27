import javax.swing.*;
import java.awt.*;

public class ShowCategoriesMeals extends JFrame{
    private JList list1;
    private JList list2;
    private JTextPane επέλεξεΤηνΚατηγορίαΠουTextPane;
    private JPanel showCategoriesPanel;


    public ShowCategoriesMeals() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 400));
        setContentPane(showCategoriesPanel);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
