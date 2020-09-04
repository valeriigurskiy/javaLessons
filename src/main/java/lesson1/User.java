package lesson1;

import java.util.Arrays;

public class User {
    private int id = 100;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int[] getWallet() {
        return wallet;
    }

    public void setWallet(int[] wallet) {
        this.wallet = wallet;
    }

    private String name = "Vasya";
    private boolean status;
    private String[] skills = {"java" ,"js"};
    private double weight = 87.7;
    private int [] wallet = {100,200,500};

    public User() {
        System.out.println("object created");
    }


    public User(int id, String name, boolean status, String[] skills, double weight, int[] wallet) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.skills = skills;
        this.weight = weight;
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", status=" + this.status +
                ", skills=" + Arrays.toString(this.skills) +
                ", weight=" + this.weight +
                ", wallet=" + Arrays.toString(this.wallet) +
                '}';
    }



}
