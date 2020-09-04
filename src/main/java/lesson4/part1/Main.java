package lesson4.part1;

public class Main {
    public static void main(String[] args) {
        String s1 = "okten";
        String s2 = "okten";
        System.out.println(s1 == s2);

        String s3 = new String("okten");
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

        System.out.println(s1.equals(s3));

        User user1 = new User(1,"Vasya");
        User user2 = new User(2,"Vasya");

        System.out.println(user1.equals(user2));
    }
}
