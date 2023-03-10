
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
//import org.apache.derby.impl.sql.catalog.SYSCOLUMNSRowFactory;

import java.io.IOException;
import java.util.*;
import java.sql.*;



public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("another hello!!");
    System.out.println("Connected");

        //createTableAndData();
        MainScreen.getInstance();
    }


        ///TEST API
        // FIND MEAL
//        List<Meal> result = Api.findMeal("Saganaki");
//        System.out.println("Όνομα γεύματος = "+result.get(0).strMeal);
//        System.out.println("Κατηγορία γεύματος = "+result.get(0).strCategory);
//        System.out.println("Περιοχή = "+result.get(0).strArea);
//        System.out.println("Οδηγίες = "+result.get(0).strInstructions);

        //MEAL CATEGORIES
//        List<Category> result= Api.findMealsCategories();
//        for(int i = 0; i < result.size(); i++) {
//            System.out.println("Id = "+result.get(i).idCategory);
//            System.out.println("Όνομα κατηγορίας = "+result.get(i).strCategory);
//            System.out.println("Εικόνα κατηγορίας = "+result.get(i).strCategoryThumb);
//            System.out.println("Περιγραφή κατηγορίας = "+result.get(i).strCategoryDescription);
//        }
        //MEAL BY CATEGORY TEST
//        List<MealByCategory> result= Api.findMealsByCategory("Seafood");
//        for(int i = 0; i < result.size(); i++) {
//            System.out.println("Id = "+result.get(i).idMeal);
//            System.out.println("Όνομα γεύματος = "+result.get(i).strMeal);
//            System.out.println("Εικόνα γεύματος = "+result.get(i).strMealThumb);
//        }

       //DATABASE CONNECTION

            private static Connection connect(){

            String connectionString = "jdbc:derby:MealsDB;create=true";
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(connectionString);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return connection;
        }
  //  /Users/basilt/Documents/GitHub/Meals
//END DATABASE CONNECTION

        //CREATE TABLE
        private static void createTableAndData() {

            try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            String createSQL = "CREATE TABLE MEALS_TABLE (MEALSID INTEGER NOT NULL PRIMARY KEY," +
                    "strMEAL VARCHAR(40),strCATEGORY VARCHAR(40)," +
                    "strAREA VARCHAR(40), strINSTRUCTIONS VARCHAR(1500)";
            //String createSQL2 = "CREATE TABLE MEALST";

            statement.executeUpdate(createSQL);
            String insertSQLv1 = "INSERT INTO MEALS_TABLE VALUES(1,'FASOLAKIA','LADERA','ELLADA','DADASDSDAS')";
        //    statement.executeUpdate(insertSQLv1.toString());
            statement.close();
            connection.close();
            System.out.println("Done");
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
        }
    }


    }