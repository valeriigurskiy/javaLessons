package com.oktenweb;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserServlet extends HttpServlet {

    private UserStorage userStorage = new UserStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = userStorage.getUsers();
        JSONArray jsonArray = new JSONArray(users);
        resp.setContentType("application/json");
        resp.getOutputStream().print(jsonArray.toString());
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
