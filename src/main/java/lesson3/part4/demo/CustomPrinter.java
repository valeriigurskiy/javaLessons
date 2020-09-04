package lesson3.part4.demo;

public class CustomPrinter {
    int[] ints = {1,2,3,4,5};

    public CustomPrinter(Printer printer){
        printer.print(ints);
    }

}
