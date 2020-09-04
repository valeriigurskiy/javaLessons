package lesson3.part4;

public class Worker implements Singer{
    private String name;
    private String company;
    private int exp;

    public Worker() {
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", exp=" + exp +
                '}';
    }

    public Worker(String name, String company, int exp) {
        this.name = name;
        this.company = company;
        this.exp = exp;
    }


    @Override
    public void sing() {
        System.out.println("work hard");
    }
}
