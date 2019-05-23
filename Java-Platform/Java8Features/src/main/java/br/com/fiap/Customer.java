package br.com.fiap;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Customer implements Comparator<Customer> {
    private int id;
    private String nome;

    @Override
    public int compare(Customer o1, Customer o2) {
        return 0;
    }

    @Override
    public Comparator<Customer> reversed() {
        return null;
    }

    @Override
    public Comparator<Customer> thenComparing(Comparator<? super Customer> other) {
        return null;
    }

    @Override
    public <U> Comparator<Customer> thenComparing(Function<? super Customer, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Customer> thenComparing(Function<? super Customer, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Customer> thenComparingInt(ToIntFunction<? super Customer> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Customer> thenComparingLong(ToLongFunction<? super Customer> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Customer> thenComparingDouble(ToDoubleFunction<? super Customer> keyExtractor) {
        return null;
    }
}
