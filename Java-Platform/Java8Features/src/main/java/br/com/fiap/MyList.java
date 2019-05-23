package br.com.fiap;

import java.util.*;

public class MyList {

    public static void main(String[] args) {
        //hashVoidSet();
        stackVoidSet();
        //linkedHashVoidSet();
        //arrayListVoidSet();
    }

    static void hashVoidSet(){
        Set<String> nomes = new HashSet<String>();
        nomes.add("Vitor");
        nomes.add("Vitor");
        nomes.add("Vitor3");
        nomes.add("Vitor4");
        System.out.println(nomes);
        System.out.println(nomes.contains("Vitor"));
    }

    static void stackVoidSet(){
        Stack<String> nomes = new Stack<String>();
        nomes.add("A");
        nomes.add("B");
        nomes.add("C");
        //nomes.remove(2);
        System.out.println(nomes);
    }

    static void linkedHashVoidSet(){
        LinkedHashSet<String> nomes = new LinkedHashSet<>();
        nomes.add("A");
        nomes.add("B");
        nomes.add("C");
        System.out.println(nomes);
    }

    static void arrayListVoidSet(){
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("A");
        nomes.add("B");
        nomes.add("C");
        System.out.println(nomes);
    }

}
