package br.com.fiap;

import java.util.IdentityHashMap;

public class MyMap {

    public static void main(String[] args) {

    }

    static void identityHashMap(){
        IdentityHashMap<Long,String> nomes = new IdentityHashMap<>();
        nomes.put(1L,"Vitor");
        nomes.put(2L,"Vitor");
        nomes.put(3L,"Vitor");
        nomes.put(4L,"Vitor");
        System.out.println(nomes.get(2L).equals("Vitor"));
    }
}
