package lesson3.part4;

public class Student implements Singer{
    private int id;
    private String name;
    private String group;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    public Student(int id, String name, String group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public Student(){

    }

    @Override
    public void sing() {
        System.out.println("stuuuuuudent");
    }
}
