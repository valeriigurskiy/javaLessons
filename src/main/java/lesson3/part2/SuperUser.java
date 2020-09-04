package lesson3.part2;

public class SuperUser extends User{

    private String role;

    @Override
    public String toString() {
        return "SuperUser{" +
                "role='" + role + '\'' +
                '}';
    }

    public void greeting(){
        System.out.println("greeting");
    }

    public SuperUser(int id, String name) {
        super(id, name);
    }
}
