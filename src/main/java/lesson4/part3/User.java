package lesson4.part3;

import java.util.Objects;

public class User implements Comparable<User>{
    private int id;
    private String name;
    private boolean status;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                status == user.status &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status);
    }

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

    public User(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    @Override
    public int compareTo(User o) {
        int result = this.id - o.id;
        if(result == 0){
            return this.name.compareTo(o.name);
        }
        return result;
    }
}
