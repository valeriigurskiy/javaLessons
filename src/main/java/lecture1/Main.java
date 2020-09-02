package lecture1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {


//            Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC", "root", "root");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from actor");
        ResultSet resultSet = preparedStatement.executeQuery();

//            resultSet.next();
//            int actor_id = resultSet.getInt("actor_id");
//            String first_name = resultSet.getString(2);
//            String last_name = resultSet.getString(3);
//
//            System.out.println(actor_id);
//            System.out.println(first_name);
//            System.out.println(last_name);

        String[][] hello = null;

        List<Actor> actorList = new ArrayList<>();
        while (resultSet.next()) {
            int actor_id = resultSet.getInt(1);
            String first_name = resultSet.getString(2);
            String last_name = resultSet.getString(3);
//            System.out.println(actor_id + " " + first_name + " " + last_name);
            Actor actor = new Actor(actor_id,first_name,last_name);
        }

        ArrayList<Actor> beans = new ArrayList<Actor>();

        for (int i = 0; i < 30; i++) {
            beans.add(new Actor(i+1, "Размер " + i, "Описание " + i));
        }

        System.out.println(beans);

//        actorList.forEach(System.out::println);

//        PreparedStatement insert = connection.prepareStatement("insert into actor(first_name, last_name) VALUES ('asd','qwe')");

//        PreparedStatement insert = connection.prepareStatement("insert into actor(first_name, last_name) VALUES (?,?)");
//        insert.setString(1,"asd");
//        insert.setString(2,"qwe");
//        insert.executeUpdate();

//        PreparedStatement delete = connection.prepareStatement("delete from actor where actor_id=201");
//
//
//        List<Actor> actorList1 = new ArrayList<>();
//        while (resultSet.next()) {
//            int actor_id = resultSet.getInt(1);
//            String first_name = resultSet.getString(2);
//            String last_name = resultSet.getString(3);
//            System.out.println(actor_id + " " + first_name + " " + last_name);
//            Actor actor = new Actor(actor_id, first_name, last_name);
//            actorList.add(actor);
//        }


//        System.out.println("Succesfully deleted\n\n");
//
//        actorList1.forEach(System.out::println);
//        delete.executeUpdate();

//        DatabaseMetaData metaData = connection.getMetaData();

//        ResultSet tables = metaData.getTables(null, null, "%", null);

//        while(tables.next()){
//            System.out.println(tables.getString("TABLE_NAME"));
//        }



        connection.close();

    }

//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

}
