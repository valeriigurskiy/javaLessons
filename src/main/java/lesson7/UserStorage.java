package lesson7;

import java.util.ArrayList;
import java.util.List;

public class UserStorage {

    private List<User> users;

    public List<User> getUsers() {
        if(users.isEmpty()){
            users.add(new User(1, "Ivan"));
            users.add(new User(2, "Taras"));
            users.add(new User(3, "Mykola"));
        }
        return users;
    }

    public UserStorage() {
        this.users = new ArrayList<User>();
    }
}
