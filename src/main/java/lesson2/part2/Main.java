package lesson2.part2;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Google", "Hello world from company", "eee");
        User user1 = new User(1,
                "Leanne Graham",
                "Bret",
                "123@.biz",
                "123-123",
                "google.com",
                company
        );

        User user2 = new User(2,
                "Leanne Graham2",
                "Bret2",
                "123@.gmail",
                "123-123",
                "google.com",
                new Company("Oracle", "Hello world from oracle", "Oracle waiting for you")
        );

        User user3 = new User(3,
                "Leanne Graham3",
                "Bret2",
                "123@.gmail",
                "123-123",
                "google.com",
                "Oracle",
                "Hello world",
                "123"
                );

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
