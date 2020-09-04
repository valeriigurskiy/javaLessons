package lesson7;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActorStorage {

    private List<Actor> actors;

    public List<Actor> getActors() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC";
        Connection connection = DriverManager.getConnection(url, "root", "root");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from actor");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int actor_id = resultSet.getInt(1);
            String first_name = resultSet.getString(2);
            String last_name = resultSet.getString(3);
            actors.add(new Actor(actor_id, first_name, last_name));
        }
        return actors;
    }

    public ActorStorage() {
        this.actors = new ArrayList<Actor>();
    }

}
