package br.com.fiap.CacheRedis.repository;

import br.com.fiap.CacheRedis.entity.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
