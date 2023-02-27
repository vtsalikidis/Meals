import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowCategoriesMeals extends JFrame{
    private JList showCategoryOfMeals;
    private JList showMealsPerCategory;
    private JTextPane επέλεξεΤηνΚατηγορίαΠουTextPane;
    private JPanel showCategoriesPanel;
    private JButton btnShowMealsAgain;

    private static ShowCategoriesMeals instance = new ShowCategoriesMeals();

    private ShowCategoriesMeals() {
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setPreferredSize(new Dimension(600, 400));
        setContentPane(showCategoriesPanel);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);

        btnShowMealsAgain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowMealsScreen.getInstance().setVisible(true);
            }
        });
    }

    public static ShowCategoriesMeals getInstance(){
        return instance;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
/*
public class SingleObject {

   //create an object of SingleObject
   private static SingleObject instance = new SingleObject();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingleObject(){}

   //Get the only object available
   public static SingleObject getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}
 */