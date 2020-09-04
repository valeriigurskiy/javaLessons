package lesson2.part3;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car(1,"legacy", new Engile(1,3));
//        car.start();
//
//        Engile engine = car.getEngine();
//        engine.setVolume(engine.getVolume() + 2);
//        System.out.println(car);

        SuperCar superCar = new SuperCar(1,"asdf", new Engile(1,3), true);
        superCar.start();
        superCar.start("123");

        Car car = new SuperCar();

    }
}
