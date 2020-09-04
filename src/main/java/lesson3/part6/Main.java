package lesson3.part6;

public class Main {
    public static void main(String[] args) {

        class Inner{
            int x = 1000;
        }

        Inner inner = new Inner();
        System.out.println(inner.x);
    }
}
