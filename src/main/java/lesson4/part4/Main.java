package lesson4.part4;

import lesson4.part1.User;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Map<Integer,String> map = new HashMap<>();

        map.put(0,"zero");
        map.put(1,"one");
        map.put(2,"two");
        System.out.println(map);


        String zero = map.get(0);
        System.out.println(zero);

        Map<String, User> userMap = new HashMap<>();
        userMap.put("petya", new User(1,"Sasha"));
        userMap.put("baklan", new User(1,"Anton"));

        User user = userMap.get("petya");
        System.out.println(user);

    }
}
