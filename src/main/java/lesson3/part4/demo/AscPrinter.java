package lesson3.part4.demo;

public class AscPrinter implements Printer {
    @Override
    public void print(int[] ints) {
        for(int s : ints){
            System.out.println(s);
        }
    }
}
