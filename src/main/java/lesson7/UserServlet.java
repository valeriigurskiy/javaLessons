package lesson7;

import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserServlet extends HttpServlet {

    private UserStorage userStorage = new UserStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = userStorage.getUsers();
        ActorStorage as = new ActorStorage();
        try {
            System.out.println(as.getActors());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(users);
        resp.setContentType("text/html");
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getId() == 2){
                resp.getOutputStream().println("Hello");
            }
            else{
                resp.getOutputStream().println("user id " + users.get(i).getId());
                resp.getOutputStream().println("\n");
                resp.getOutputStream().println(" user name " + users.get(i).getName());
                resp.getOutputStream().println("\n");
            }
        }

//        ActorStorage as = new ActorStorage();
//        try {
//            List<Actor> actors = as.getActors();
//            System.out.println(actors.toString());
//            for(int i = 0; i < actors.size(); i++){
//                if(actors.get(i).getId() == 2){
//                    resp.getOutputStream().println("Hello");
//                }
//                else{
//                    resp.getOutputStream().println("user id " + actors.get(i).getId());
//                    resp.getOutputStream().println(" user name " + actors.get(i).getFirstName());
//                }
//            }
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
    }

    public void getResult(String existId, HttpServletResponse resp) throws SQLException, SerialException, IOException {
        ActorStorage as = new ActorStorage();
        List<Actor> actors = as.getActors();

        actors.stream().forEach(i -> {
            if (i.getId() == Integer.parseInt(existId)) {
                try {
                    resp.getOutputStream().println("Hello");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    resp.getOutputStream().println("Actor successfuly added");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");

        User user = new User(id,name);
        userStorage.getUsers().add(user);

        JSONObject jsonObject = new JSONObject(user);
        resp.setContentType("application/json");
        resp.getOutputStream().print(jsonObject.toString());
    }
}
