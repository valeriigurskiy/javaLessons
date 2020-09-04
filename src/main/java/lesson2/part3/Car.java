package lesson2.part3;

public class Car {
    private int id;
    private String model;
    private Engile engine;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engile getEngine() {
        return engine;
    }

    public void setEngine(Engile engine) {
        this.engine = engine;
    }

    public Car() {
    }

    public Car(int id, String model, Engile engine) {
        this.id = id;
        this.model = model;
        this.engine = engine;
    }

    public void start(){
        this.engine.start();
    }

}
