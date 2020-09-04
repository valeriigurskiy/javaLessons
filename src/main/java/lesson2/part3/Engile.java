package lesson2.part3;

public class Engile {
    private int id;
    private int volume;

    public Engile(int id, int volume) {
        this.id = id;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engile{" +
                "id=" + id +
                ", volume=" + volume +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Engile() {
    }

    public void start(){
        System.out.println(this.toString() + " started");
    }

}
