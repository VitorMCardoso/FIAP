package br.com.fiap.CacheRedis.service;

import br.com.fiap.CacheRedis.entity.Produto;

import java.util.List;

public interface IProdutoService {
    List<Produto> getAllProdutos();

    Produto getProdutoById(long id);

    Produto addProduto(Produto produto);

    Produto updateProduto(Produto produto);

    void deleteProduto(long id);
}
