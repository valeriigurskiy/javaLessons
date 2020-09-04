package lesson1;

public class Start {
    public static void main(String[] args){
//        System.out.println("okten");

        User user1 = new User();
        user1.setId(200);
//        user1.name = "kokos";
        User user2 = new User();
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1.getId());
        String[] skills = {"asd","dfa"};

        int[] wallet = new int[3];
        wallet[0] = 100;
        wallet[1] = 500;
        wallet[2] = 1000;
        User user3 = new User(1,"Max",false, skills, 100.5, wallet);
        System.out.println(user3);

//        int i = 1;
//        while (i < 10){
//            System.out.println(i);
//            i++;
//        }
        for(String skill : user1.getSkills()){
            System.out.println(skill);
        }

    }
}
