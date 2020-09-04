package lesson2.part4;
import java.util.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("123123");
        strings.add("12312341");
        strings.add("123123");

        System.out.println(strings);
        System.out.println(strings.get(0));
        strings.remove(2);
        System.out.println(strings);

        for(int i = 0; i < strings.size(); i++){
            String arg = strings.get(i);

            System.out.println(arg);
        }

        for(String string : strings){
            System.out.println(string);
        }

    }
}
