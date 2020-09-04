package lesson3.part3;

public class User {
//    static int id = 100;
    int id = 100;

    public User() {
    }

    public User(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }

    public static void greeting(){
//        System.out.println("helli i'm user with id" + new User(100).id);
        System.out.println("helli i'm user with id" + new User(100).id);
    }

}
