package lesson5.part1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Friend> friendHashMap = new TreeMap<>();
        friendHashMap.put("petya", new Friend("Sasha", "Petrov"));
        friendHashMap.put("baklan", new Friend("Anton", "Okladnikov"));
        friendHashMap.put("professor", new Friend("Roma", "Oganov"));

        System.out.println(friendHashMap);

        System.out.println(friendHashMap.containsKey("petya"));
        System.out.println(friendHashMap.containsValue(new Friend("Anton", "Okladnikov")));
        System.out.println(friendHashMap.isEmpty());
//        friendHashMap.remove("petya");
//        friendHashMap.remove("petya", new Friend("Sasha", "Petrov"));
        friendHashMap.replace("petya", new Friend());
        Collection<Friend> values = friendHashMap.values();
        System.out.println(values);
        System.out.println(friendHashMap.keySet());

        Set<Map.Entry<String, Friend>> entries = friendHashMap.entrySet();
        Iterator<Map.Entry<String, Friend>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Friend> next =  iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
            if(next.getKey().equals("petya")) {
                iterator.remove();
            }
        }
        System.out.println(friendHashMap);


    }
}
