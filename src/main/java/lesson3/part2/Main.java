package lesson3.part2;

public class Main {
    public static void main(String[] args) {
//        SuperUser superUser = new SuperUser();
//        superUser

        SuperUser superUser = new SuperUser(1, "2");
        superUser.greeting();

        CustomArrayList strings = new CustomArrayList();
        strings.add("adfadf");
        System.out.println(strings);
        strings.reverseIterator();
    }

    public static void saySome (User user){
        user.greeting();
    }
}
