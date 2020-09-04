package lesson3.part4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Singer> singers = new ArrayList<>();
        singers.add(new Student());
        singers.add(new Worker());

        Singer singerStudent = singers.get(0);
        Singer singerWorker = singers.get(1);
        singerStudent.sing();
        singerWorker.sing();

//        Singer singer = new Singer() {
//            @Override
//            public void sing() {
//                System.out.println("adfafaf");
//            }
//        };
//        singer.sing();
//
//
//        Singer singer2 = () -> {System.out.println("qweqweqwe");};
//        singer2.sing();
//    }
    }
}
