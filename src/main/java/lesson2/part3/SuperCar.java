package lesson2.part3;

public class SuperCar extends Car {
    private boolean turbo;

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public SuperCar(int id, String model, Engile engine, boolean turbo) {
        super(id, model, engine);
        this.turbo = turbo;
    }

    public SuperCar() {
    }

    @Override
    public void start() {
        System.out.println("cmon!!! drive!!!");
    }

    public void start(String msg){
        System.out.println(msg);
    }

}
