package br.com.fiap.neo4j.repository;

import br.com.fiap.neo4j.entity.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

    Pessoa findByNome(String nome);
}
