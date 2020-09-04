package lesson2.part1;

public class Start {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.add(10,20);
        System.out.println(result);

        int minus = calculator.minus(10,20);
        System.out.println(minus);

//        Calculator2 calculator2 = new Calculator2(100,200);
//        int result2 = calculator2.add();
//        System.out.println(result2);

    }
}
