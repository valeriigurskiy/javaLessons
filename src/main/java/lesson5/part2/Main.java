package lesson5.part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Calculate calculate = new Calculate() {
//            @Override
//            public void compute(int a, int b) {
//                System.out.println(a + b);            }
//        };
//
//        Calculate calculate1 = new Calculate() {
//            @Override
//            public void compute(int a, int b) {
//                System.out.println(a - b);
//            }
//        };
//
//        Calculate calculate2 = (int a, int b) -> System.out.println((a + b) * a);
//        calculate2.compute(10,20);

        List<User> users = new ArrayList<>();
        users.add(new User(1,"kokos", true));
        users.add(new User(1,"kokos", true));
        users.add(new User(2,"banan", false));
        users.add(new User(3,"ananas", true));
        users.add(new User(4,"tomat", false));
        users.add(new User(5,"kokos", true));
        users.add(new User(5,"kokos", true));
        users.add(new User(6,"tomat", false));
        users.add(new User(7,"banan", true));
        users.add(new User(8,"mango", false));
        users.add(new User(8,"mango", false));

//        Collections.sort(users, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o2.getId() - o1.getId();
//            }
//        });

//        Comparator<User> c = (o1, o2)-> o2.getId() - o1.getId();
//        Collections.sort(users, c);

//        Collections.sort(users, (o1,o2)->o2.getId()-o1.getId());
//        System.out.println(users.toString());

//        users.sort((o1,o2)->o2.getId() - o1.getId());

//        users.forEach(user -> System.out.println(user));
//
//        List<User> userList = users.stream().filter(user-> user.getId() == 1 || user.getId() == 3).distinct()
//                .collect(Collectors.toList());
//        System.out.println(userList);

//        List<User> collect = users.stream().distinct().sorted((a,b) -> b.getId() - a.getId()).collect(Collectors.toList());
//
//        System.out.println(collect);

//        boolean b = users.stream().allMatch(user -> user.getName().length() > 4);
//        System.out.println(b);

//        boolean b = users.stream().anyMatch(user -> user.getName().length() > 4);
//        System.out.println(b);

        List<Integer> collect = users.stream().distinct().map(user -> user.getId()).collect(Collectors.toList());
        System.out.println(collect);
//
//        User user = users.get(0);
//        int id = user.getId();

    }
}
