import javax.swing.*;
import java.awt.*;

public class ShowCategoriesMeals extends JFrame{
    private JList list1;
    private JList list2;
    private JTextPane επέλεξεΤηνΚατηγορίαΠουTextPane;
    private JPanel showCategoriesPanel;

private static ShowCategoriesMeals instance = new ShowCategoriesMeals();

    private ShowCategoriesMeals() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 400));
        setContentPane(showCategoriesPanel);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static ShowCategoriesMeals getInstance(){
        return instance;
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