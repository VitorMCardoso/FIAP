package br.com.fiap;

import java.util.ArrayList;

public class FunctionalLambda {

    public static void main(String[] args) {
//        Runnable r = () -> {
//            for (int i =0; i < 1000;i++){
//                System.out.println(i);
//            }
//        };
//        new Thread(r).start();

        new Thread(() -> {
            ArrayList<Integer> cont = new ArrayList<>();
            cont.add(1);
            cont.add(2);
            cont.add(3);
            cont.add(4);
            cont.forEach(u -> System.out.println(u.intValue()));
        }).start();

    }
}
