package lesson5.part1;

import java.util.Objects;

public class Friend implements Comparable<Friend>{
    private String name;
    private String surname;

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return Objects.equals(name, friend.name) &&
                Objects.equals(surname, friend.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Friend() {
    }

    public Friend(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int compareTo(Friend o) {
        return 0;
    }
}
