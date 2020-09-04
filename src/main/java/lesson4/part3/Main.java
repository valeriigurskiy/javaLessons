package lesson4.part3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String [] args){
        Set<User> users = new TreeSet<>();
//        Set<User> users = new HashSet<>();
        users.add(new User(1,"kokos", true));
        users.add(new User(1,"!kokos", true));
        users.add(new User(2,"ivan", true));
        users.add(new User(3,"banan", true));

//        Set<User> users = new HashSet<>();
//        users.add(new User(1,"kokos", true));
//        users.add(new User(1,"kokos", true));
//        users.add(new User(2,"ivan", true));
//        users.add(new User(3,"banan", true));

        User u = null;
        for(User user : users){
            if(user.getId() == 2){
                u = user;
            }
        }
        System.out.println(u);

    }
}

