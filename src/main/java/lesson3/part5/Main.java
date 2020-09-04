package lesson3.part5;

public class Main {
    public static void main(String[] args) {
        Tablet[] tablets ={
                new Ipad(),
                new SamsungTablet()
        };

        Tablet tablet = new Tablet() {
            @Override
            public void startScreen() {

            }
        };

    }
}
