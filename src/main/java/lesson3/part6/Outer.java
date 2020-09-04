package lesson3.part6;

public class Outer {
    int x = 200;

    class Inner{
        int x = 100;

        public void foo(){
            System.out.println(x);
            System.out.println(x);
        }
    }

}
