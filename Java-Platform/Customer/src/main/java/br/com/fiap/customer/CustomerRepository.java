package br.com.fiap.customer;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Override
    List<Customer> findAll();

    @Override
    List<Customer> findAll(Sort sort);

    @Override
    List<Customer> findAllById(Iterable<Integer> integers);

    @Override
    <S extends Customer> List<S> saveAll(Iterable<S> entities);

    @Override
    void flush();

    @Override
    <S extends Customer> S saveAndFlush(S entity);

    @Override
    void deleteInBatch(Iterable<Customer> entities);

    @Override
    void deleteAllInBatch();

    @Override
    Customer getOne(Integer integer);

    @Override
    <S extends Customer> List<S> findAll(Example<S> example);

    @Override
    <S extends Customer> List<S> findAll(Example<S> example, Sort sort);
}
